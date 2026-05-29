package Fpoly_servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/login")
public class login extends HttpServlet {

    private UserDAO userDAO = new UserDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        String username = req.getParameter("txt_username");
        String password = req.getParameter("txt_password");

        String message = "";
        String target = "/login.jsp";

        // Kiểm tra null/trống
        if (username == null || password == null
                || username.trim().isEmpty()
                || password.trim().isEmpty()) {
            message = "Vui lòng nhập đầy đủ thông tin!";
        } else {
            username = username.trim();
            password = password.trim();

            User user = userDAO.checkLogin(username, password);

            if (user != null) {
                // Đăng nhập thành công
                req.setAttribute("user", user);
                message = "Chúc mừng " + user.getFullname() + " đăng nhập thành công!";
                // Ở MVC thực tế, thường sẽ redirect sang trang index hoặc dashboard
                // target = "/index.jsp"; 
            } else {
                // Thất bại: Kiểm tra cụ thể do sai pass hay sai user
                if (!userDAO.exists(username)) {
                    message = "Tài khoản " + username + " không tồn tại!";
                } else {
                    message = "Sai mật khẩu!";
                }
            }
        }

        req.setAttribute("message", message);
        req.getRequestDispatcher(target).forward(req, resp);
    }
}
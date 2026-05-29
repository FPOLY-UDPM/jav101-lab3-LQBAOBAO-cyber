package Lab2.Bai4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/form4/update")
public class FormmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        UserBean bean = new UserBean();

        bean.setFullname("Nguyễn Văn Tèo");
        bean.setGender(true);
        bean.setCountry("VN");

        req.setAttribute("user", bean);

        req.setAttribute("editabled", true);

        req.getRequestDispatcher("/Bai4/page.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String fullname = req.getParameter("fullname");

        System.out.println(fullname);

        req.getRequestDispatcher("/Bai4/page.jsp")
                .forward(req, resp);
    }
}
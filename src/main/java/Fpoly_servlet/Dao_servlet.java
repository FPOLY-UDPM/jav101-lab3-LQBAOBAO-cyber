package Fpoly_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// Đường dẫn để truy cập servlet này trên trình duyệt
@WebServlet("/xin-chao")
public class Dao_servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
// Thiết lập kiểu nội dung và bảng mã tiếng Việt
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>Welcome Servlet</title></head>");
            out.println("<body>");
            out.println("<h1>Chào mừng các bạn sinh viên đến với môn Java 4!</h1>");
            out.println("<p>Dự án này đang chạy trên IntelliJ Community với Smart Tomcat.</p>");
            out.println("<p>Thời gian hiện tại trên hệ thống: " + new java.util.Date() + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
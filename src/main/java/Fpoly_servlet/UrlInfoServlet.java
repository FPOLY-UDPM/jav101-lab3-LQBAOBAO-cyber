package Fpoly_servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/url-info")
public class UrlInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        // 1. Thông tin URL
        String url = req.getRequestURL().toString();
        String uri = req.getRequestURI();
        String query = req.getQueryString();
        String servletPath = req.getServletPath();
        String contextPath = req.getContextPath();
        String pathInfo = req.getPathInfo();
        String method = req.getMethod();

        resp.getWriter().println("<h2>Thông tin URL</h2>");
        resp.getWriter().println("URL: " + url + "<br>");
        resp.getWriter().println("URI: " + uri + "<br>");
        resp.getWriter().println("QueryString: " + query + "<br>");
        resp.getWriter().println("ServletPath: " + servletPath + "<br>");
        resp.getWriter().println("ContextPath: " + contextPath + "<br>");
        resp.getWriter().println("PathInfo: " + pathInfo + "<br>");
        resp.getWriter().println("Method: " + method + "<br><br>");

    }
}

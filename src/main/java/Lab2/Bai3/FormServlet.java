package Lab2.Bai3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/form")
public class FormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        Map<String, Object> map = new HashMap<>();

        map.put("fullname", "Nguyễn Văn Tèo");
        map.put("gender", true);
        map.put("country", "VN");

        req.setAttribute("user", map);
        req.setAttribute("editabled", true);

        req.getRequestDispatcher("/Bai3/form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String fullname = req.getParameter("fullname");

        System.out.println(fullname);

        req.getRequestDispatcher("/Bai3/form.jsp").forward(req, resp);
    }
}
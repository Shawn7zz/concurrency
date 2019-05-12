package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Xiang Lan
 * Created on 2019-05-10 01:25
 */
public class MyFirstServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("处理Get");

        PrintWriter printWriter = resp.getWriter();
        resp.setContentType("text/html;charset=utf-8");

        printWriter.println("<strong>Hello s!</strong><br>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("处理Post");

        PrintWriter printWriter = resp.getWriter();
        resp.setContentType("text/html;charset=utf-8");

        printWriter.println("<strong>Hello s!</strong><br>");
    }
}

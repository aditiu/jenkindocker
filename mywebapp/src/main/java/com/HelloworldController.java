package com;
import myapp.App;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloworldController extends HttpServlet{
    private static final long serialVersionUID = 1L;
    public HelloworldController(){
        super();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        App app = new App();
        String s= app.web();
        String name=req.getParameter("name");

        PrintWriter pw =resp.getWriter();
        pw.println("<html>");
        pw.println("<body>");
        pw.println("<h1>");
        pw.println("your name is post: "+name);
        pw.println(s);

        pw.println("</h1>");

        pw.println("</body>");
        pw.println("</html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        App app = new App();
        String s= app.web();
        String name=req.getParameter("name");

        PrintWriter pw =resp.getWriter();
        pw.println("<html>");
        pw.println("<body>");
        pw.println("<h1>");
        pw.println("your name is get: "+name);
        pw.println(s);

        pw.println("</h1>");

        pw.println("</body>");
        pw.println("</html>");
    }

}

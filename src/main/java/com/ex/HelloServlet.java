package com.ex;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println("<h2>Hello from HelloServlet</h2>");
        resp.getWriter().println("<a href=\"index.jsp\">back</a>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // example: read form parameter "name"
        String name = req.getParameter("name");
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println("<h2>Hi, " + (name==null? "guest" : name) + "</h2>");
        resp.getWriter().println("<a href=\"index.jsp\">back</a>");
    }
}

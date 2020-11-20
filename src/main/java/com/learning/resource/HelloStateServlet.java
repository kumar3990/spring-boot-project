package com.learning.resource;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloStateServlet extends HttpServlet   {
    private static final long serialVersionUID = 1L;
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        doGet(request,response);
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        request.getSession();
        PrintWriter out = response.getWriter();
        out.println("<h3>Hello Kumar Kadirvel!</h3>");
        out.println("<body style='background-color: #d6e3b1;'>");


        out.println("Admin: " + request.getParameter("name"));
        out.println("Age: " + request.getServletContext().getAttribute("age"));

        out.println("<br/>Total Active Session: "+ request.getServletContext().getAttribute("activeSessions"));
    }
}

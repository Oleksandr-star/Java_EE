package com.example.demo;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "GreetingServlet", value = "/greeting-servlet")
public class GreetingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        resp.setContentType("text/html");
        resp.getWriter().write("<h1>Hello, " + (name != null ? name : "Guest") + "!</h1>" +
                "<form action='/greeting-servlet' method='POST'>" +
                "Enter your name: <input type='text' name='name'>" +
                "<button type='submit'>Submit</button></form>" +
                "<a href='/index.jsp'>Back to Main Page</a>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        resp.setContentType("text/html");
        resp.getWriter().write("<h1>Welcome, " + (name != null ? name : "Guest") + "!</h1>" +
                "<a href='/index.jsp'>Back to Main Page</a>");
    }
}

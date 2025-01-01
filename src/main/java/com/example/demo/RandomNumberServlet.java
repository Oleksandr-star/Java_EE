package com.example.demo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "RandomNumberServlet", value = "/random-number-servlet")
public class RandomNumberServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.getWriter().write("<h1>Random Number Generator</h1>" +
                "<form action='/demo-1.0-SNAPSHOT/random-number-servlet' method='POST'>" +
                "Min: <input type='number' name='min'><br>" +
                "Max: <input type='number' name='max'><br>" +
                "<button type='submit'>Generate</button></form>" +
                "<a href='/demo-1.0-SNAPSHOT/index.jsp'>Back to index Page</a>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int min = Integer.parseInt(req.getParameter("min"));
        int max = Integer.parseInt(req.getParameter("max"));
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));

        resp.setContentType("text/html");
        resp.getWriter().write("<h1>Random Number: " + randomNum + "</h1>" +
                "<a href='/demo-1.0-SNAPSHOT/random-number-servlet'>Generate Again</a><br>" +
                "<a href='/demo-1.0-SNAPSHOT/index.jsp'>Back to index Page</a>");
    }
}

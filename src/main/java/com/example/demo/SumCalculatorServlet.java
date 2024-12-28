package com.example.demo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "SumCalculatorServlet", value = "/sum-calculator-servlet")
public class SumCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.getWriter().write("<h1>Sum Calculator</h1>" +
                "<form action='/sum-calculator-servlet' method='POST'>" +
                "Number 1: <input type='number' name='num1'><br>" +
                "Number 2: <input type='number' name='num2'><br>" +
                "<button type='submit'>Calculate</button></form>" +
                "<a href='/index.jsp'>Back to index Page</a>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int sum = num1 + num2;

        resp.setContentType("text/html");
        resp.getWriter().write("<h1>Result: " + num1 + " + " + num2 + " = " + sum + "</h1>" +
                "<a href='/sum-calculator-servlet'>Calculate Again</a><br>" +
                "<a href='/index.jsp'>Back to index Page</a>");
    }
}

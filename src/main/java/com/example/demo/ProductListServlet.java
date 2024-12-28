package com.example.demo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductListServlet", value = "/product-list-servlet")
public class ProductListServlet extends HttpServlet {
    private final List<String> products = new ArrayList<>(List.of("Apple", "Banana", "Orange"));

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.getWriter().write("<h1>Product List</h1><ul>");
        for (String product : products) {
            resp.getWriter().write("<li>" + product + "</li>");
        }
        resp.getWriter().write("</ul>" +
                "<form action='/product-list-servlet' method='POST'>" +
                "Add Product: <input type='text' name='product'>" +
                "<button type='submit'>Add</button></form>" +
                "<a href='/index.jsp'>Back to index Page</a>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String product = req.getParameter("product");
        if (product != null && !product.isBlank()) {
            products.add(product);
        }
        resp.sendRedirect("/product-list-servlet");
    }
}

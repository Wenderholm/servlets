package com.example.servlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

//@WebServlet(urlPatterns = {"/hello","/welcome"})
@WebServlet("/hello")
public class HelloController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Hello Servlet!");
    }
}


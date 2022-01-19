package com.example.params;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;

@WebServlet("/browser")
public class BrowserCheckController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        printUserAgent(request);
        System.out.println("--------");
        printAllHeders(request);
    }

    private void printAllHeders(HttpServletRequest request) {
        System.out.println("wszystkie nagłówki: ");
        Enumeration<String> headerNames = request.getHeaderNames();
//        STARSZY SPOSÓB Z PĘTLĄ
//        while(headerNames.hasMoreElements()){
//            String nextHeaderName = headerNames.nextElement();
//            System.out.println(nextHeaderName + " " + request.getHeader(nextHeaderName));
//        }

//       NOWSZY SPOSÓB Z COLLECTION
        Collections.list(headerNames).stream()
                .map( name -> name + " "+ request.getHeader(name))
                .forEach(System.out::println);
    }

    private void printUserAgent(HttpServletRequest request) {
        String userAgent = request.getHeader("user-agent");
        System.out.println("przeglądarka klienta: "+ userAgent);
    }
}

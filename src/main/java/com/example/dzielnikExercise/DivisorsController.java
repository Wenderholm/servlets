package com.example.dzielnikExercise;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet("/divisors")
public class DivisorsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int number = Integer.parseInt(request.getParameter("n"));
        String responseBody = createHtmlResponse(number);
        response.setContentType("text/html");
        response.getWriter().println(responseBody);
    }

    private String createHtmlResponse(int number) {
        List<Integer> divisors = DivisorsFinder.getDivisors(number);
        String divisorsList = null;
        if (number == 0)
            divisorsList = "<li>Liczba 0 ma nieskończenie wiele dzielników</li>";
        else {
            divisorsList = divisors.stream()
                    .map(divisor -> "<li>" + divisor + "</li>")
                    .collect(Collectors.joining());
        }
        String htmlTemplate =
                """
                <html>
                    <body>
                        <h1>Podzieliniki liczby %d</h1>
                        <ul>
                            %s
                        </ul>
                    </body>
                </html>
                """;
        return String.format(htmlTemplate, number, divisorsList);
    }
}

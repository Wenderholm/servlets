package com.example.params;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet("/witaj")
public class HelloController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
//       dodano sposób w jakim jest zawartość oraz typ kodowania
        setContentType(response);
        setHtmlResponse(request,response);
    }

    private void setContentType(HttpServletResponse response) {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
    }
    private void setHtmlResponse(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String, String[]> parameterMap = request.getParameterMap();
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<head></head>");
        writer.println("<body>");
        writer.println("<ol>");
//        pobieranie kluczy
        for(String key:parameterMap.keySet()){
            writer.printf("<li>%s</li>\n",key);
//            pobieranie wartości dla kluczy
            for(String value:parameterMap.get(key)){
                writer.println("<ul>");
                writer.printf("<li>%s</li>\n",value);
                writer.println("</ul>");
            }
        }
        writer.println("</ol>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
//zapytanie do tego zadania
//http://localhost:8080/aplikacja/witaj?imie=Jan&wiek=25&wiek=33&hobby=rowery&hobby=programowanie%20w%20przegl%C4%85darce%20otrzymamy
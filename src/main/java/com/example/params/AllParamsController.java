package com.example.params;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Map;

@WebServlet("/allParams")
public class AllParamsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> parameterMap = request.getParameterMap();
        for (String key: parameterMap.keySet()){
            System.out.println(key);
            for(String value:parameterMap.get(key)){
                System.out.println(" -" + value);
            }
        }

    }


}
//zapytania
//bez rozdzielonej nazwy
//http://localhost:8080/aplikacja/allParams?Imie=Janek&wiek=25&hobby=rower&hobby=programowanie
//z nazwami podójnymi
//http://localhost:8080/aplikacja/allParams?Name=Janek%20Kowalski&wiek=25&hobby=rower&hobby=programowanie
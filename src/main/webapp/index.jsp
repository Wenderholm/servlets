<%--
  Created by IntelliJ IDEA.
  User: pwend
  Date: 23.01.2022
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP test</title>
    <!--Deklaracja HTML -->
    <%--deklaracja JSP    --%>
    <%! String name;%>

<%--    Inicjalizacja --%>
    <%name = "Jan Kowalski"; %>

    <h1>Witaj <%= name %></h1>

    <% for(int i=0; i<5; i++){ %>
        <p>Paragraf numer <%= i%></p>
    <%}%>
</head>
<body>

</body>
</html>

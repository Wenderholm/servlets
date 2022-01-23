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

    <link rel="stylesheet" href="style.css">
</head>
<body>


<!--Deklaracja HTML -->
<%--deklaracja JSP    --%>
<%--    <%! String name;%>--%>

<%--&lt;%&ndash;    Inicjalizacja &ndash;%&gt;--%>
<%--    <%name = "Jan Kowalski"; %>--%>

<%--    <h1>Witaj <%= name %></h1>--%>

<%--    <% for(int i=0; i<5; i++){ %>--%>
<%--        <p>Paragraf numer <%= i%></p>--%>
<%--    <%}%>--%>
<%
    String[] videos = request.getParameterValues("video");
    if (videos == null)
        out.println("<h2>Brak parametru video w adresie URL</h2>");
    else {
        for (String videoId: videos) {
%>

<iframe id="ytplayer" type="text/html" width="640" height="360"
        src="http://www.youtube.com/embed/<%=videoId%>" frameborder="0"></iframe>

<%
        }
    }
%>

<%--zapytanie do zadania
http://localhost:8080/aplikacja/?video=tAGnKpE4NCI&video=e80qhyovOnA&video=J-zkoDQ9Bc0
--%>
</body>
</html>

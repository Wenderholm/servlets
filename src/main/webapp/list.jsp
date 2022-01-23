<%--
  Created by IntelliJ IDEA.
  User: pwend
  Date: 23.01.2022
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP with Scriptlets</title>
</head>
<body>
    <h1>JSP java code</h1>
    <%! int iteration =10;%>
    <ul>
<%--       po dodaniu w pom.xml zależności jakarta.servlet.jsp-api możemy korzytsać z plików tomcat danego projektu link do projektu--%>
<%--        --%>
        <%
            for (int i = 0; i < iteration; i++)
                out.println("<li> Element no " + i + "</li>");
        %>
    </ul>
</body>
</html>

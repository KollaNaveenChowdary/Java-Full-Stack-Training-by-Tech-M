<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>JSP Page!</title>
</head>
<body>
<%
    Integer count = (Integer) application.getAttribute("accesses");
    if (count == null) {
        count = 0;
    }
    count++;
    application.setAttribute("accesses", count);
%>
<h1>JSP Example (jspcount.jsp)</h1>
<p>Number of times this JSP has been accessed: <%= count %></p>
</body>
</html>


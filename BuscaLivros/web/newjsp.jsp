<%-- 
    Document   : newjsp
    Created on : 16/10/2017, 20:35:06
    Author     : ra21067003
--%>

<%@page import="model.Livro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            Livro l = (Livro)request.getAttribute("livro");
            if (l != null){
        %>
            <p>ID: <%= l.getId() %></p>
            <p>Nome: <%= l.getNome()%></p>
            <p>Autor: <%= l.getAutor()%></p>
        <%} else {%>
            <p>Livro não encontrado</p>
        <%}%>
    </body>
</html>
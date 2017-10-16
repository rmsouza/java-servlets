<%-- 
    Document   : index.jsp
    Created on : 16/10/2017, 20:31:26
    Author     : ra21067003
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <form action="Controller" method="POST">
                <div class="form-group">
                    <label for="">RA</label>
                    <input type="text" name="id" placeholder="ID do livro">
                </div>
                <div class="form-group">
                    <input type="submit" value="Pesquizar" class="btn btn-primary">
                </div>
            </form>
        </div>
    </body>
</html>

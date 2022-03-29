<%--
  Created by IntelliJ IDEA.
  User: 33011-18-18
  Date: 29/03/2022
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action=operation-servlet>
    <h1>Quelle opération souhaitez vous effectuer ?</h1><br/>
    <input type="radio" name= "operation" value="surface" >Calculer la surface<br/>
    <input type="radio" name= "operation" value="perimetre">Calculer le périmètre<br/>
    <input type="hidden" name="operation" value="ask-operation">
    <input type="submit" value="Valider">
</form>
</body>
</html>

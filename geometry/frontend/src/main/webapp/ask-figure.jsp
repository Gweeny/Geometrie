<%--
  Created by IntelliJ IDEA.
  User: 33011-18-18
  Date: 29/03/2022
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Figure</title>
</head>
<body>
<form action=main-controller>

    <h1>Choisissez une figure géométrique</h1><br/>
    <input type="radio" name= "figure" value="carre" >Carré<br/>
    <input type="radio" name= "figure" value="rectangle">Rectangle<br/>
    <input type="radio" name= "figure" value="cercle">Cercle<br/><br/>



    <input type="hidden" name="figure" value="ask-figure">
    <input type="submit" value="Valider">

</form>

</body>
</html>

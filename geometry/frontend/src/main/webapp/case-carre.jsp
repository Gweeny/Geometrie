<%--
  Created by IntelliJ IDEA.
  User: 33011-18-18
  Date: 29/03/2022
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Carre coté</title>
</head>
<body>
<form action=case-carre-controller>
    Côté : <input type="text" name="cote"/>

    <input type="hidden" name="parametres" value="cote">
    <input type="submit" value="Valider">
</form>
</body>
</html>

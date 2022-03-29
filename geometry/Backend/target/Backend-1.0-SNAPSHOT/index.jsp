<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World from Backend</title>
</head>
<body>
<form action=main-servlet>
    <h1>Choisissez une figure géométrique</h1><br/>
    <input type="radio" name= "forme" value="Carre" CHECKED>Carré<br/>
    <input type="radio" name= "forme" value="TriangleRectangle">Triangle-Rectangle<br/>
    <input type="radio" name= "forme" value="Cercle">Cercle<br/>
    <input type="radio" name= "forme" value="Rectangle">Rectangle<br/>

    <h1>Quelle opération souhaitez vous effectuer ?</h1><br/>
    <input type="radio" name= "operation" value="aire" CHECKED>Calculer l'aire<br/>
    <input type="radio" name= "operation" value="perimetre">Calculer le périmètre<br/>
    <input type="radio" name= "operation" value="hypotenuse">Calculer l'hypoténuse<br/>


    Côté : <input type="text" name="cote"/>    Longueur : <input type="text" name="longueur"/>
    Largeur : <input type="text" name="largeur"/>    Base : <input type="text" name="base"/>
    Hauteur : <input type="text" name="hauteur"/><br/><br/>

    <input type=submit value=Valider>

</form>
</body>
</html>
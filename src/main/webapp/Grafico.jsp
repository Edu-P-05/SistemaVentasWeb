<%-- 
    Document   : Grafico
    Created on : 14/07/2024, 11:47:28 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>GRAFICO DE VENTAS MENSUAL</h1>
        <form action="Grafico1.jsp">
            ingrese año: <input name="tan">
            <br><input type="radio" name="opc" value="bar">Barra
            <input type="radio" name="opc" value="pie">Circulo
            <input type="radio" name="opc" value="line">Lineal
            <input type="submit" >
            
            <iframe name="myFrame" style="height: 100%; width: 97%" frameborder=0></iframe>
        </form>
    </center>
</body>
</html>

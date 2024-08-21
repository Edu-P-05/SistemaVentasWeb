<%-- 
    Document   : Principal
    Created on : 24/06/2024, 08:35:29 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-dark">
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a style="margin-left:10px; border:none; font-weight: bold" class="btn btn-outline-light" href="Grafico.jsp" target="myFrame">RAIFON</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left:10px; border:none" class="btn btn-outline-light" href="Controlador?menu=Producto&accion=Listar" target="myFrame">Producto</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a style="margin-left:10px; border:none" class="btn btn-outline-light" href="Controlador?menu=Empleado&accion=Listar" target="myFrame">Empleado</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left:10px; border:none" class="btn btn-outline-light" href="Controlador?menu=Cliente&accion=Listar" target="myFrame">Clientes</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left:10px; border:none" class="btn btn-outline-light" href="Controlador?menu=NuevaVenta&accion=default" target="myFrame">Nueva Venta</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left:10px; border:none" class="btn btn-outline-light" href="Ventas.xhtml" target="myFrame">TABLA JSF 1</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left:10px; border:none" class="btn btn-outline-light" href="Venta_Emp.xhtml" target="myFrame">TABLA JSF 2</a>
                    </li>
                </ul>
                <div class="dropdown">
                    <button class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        ${usuario.getNom()}
                    </button>
                    <div class="dropdown-menu text-center" style="background-color: #414358">
                        <a class="dropdown-item" href="#"><img src="imagenes/inicio.png" alt="60" width="60"/></a>
                        <a class="dropdown-item" href="#" style="color: white">${usuario.getUser()}</a>
                        <a class="dropdown-item" href="#" style="color: white">${usuario.getDni()}</a>
                        <form action="Validar" method="POST" style="border-top-color: whitesmoke">
                            <button name="accion" value="salir" class="dropdown-item" href="#" style="color: white">salir</button>
                        </form>
                    </div>
                </div>
            </div>
        </nav>
                        
    
                        
                        <div class="m-4" style="height: 800px">
            <iframe name="myFrame" style="height: 100%; width: 97%" frameborder=0></iframe>
        </div>  
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>

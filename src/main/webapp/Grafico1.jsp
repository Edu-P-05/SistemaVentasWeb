<%-- 
    Document   : Grafico1
    Created on : 14/07/2024, 04:26:44 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Modelo.*,ModeloDAO.*" %>
<!DOCTYPE html>
<html>
    <head>
        <script src=
        "https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.2.2/Chart.min.js"></script>
        <style>
            .container {
                width: 70%;
                margin: 15px auto;
            }
            body {
                text-align: center;
                color: green;
            }
            h2 {
                text-align: center;
                font-family: "Verdana", sans-serif;
                font-size: 30px;
            }
        </style>
    </head>
    <body>
        
        <%
            Ventas2DAO obj=new Ventas2DAO();
            String label="",data="";
            int an=Integer.parseInt(request.getParameter("tan"));
            String tipo=request.getParameter("opc");
            for(Ventas2 x:obj.LisMes(an)){
            label=label+"'"+x.Lmes()+"',";
            data=data+x.getMonto()+",";
            }
            if(data.length()>0)
            data=data.substring(0, data.length()-1);
        %>

        <div class="container">
            <h2>Grafico de ventas x año <%=an%> </h2>
            <div>
                <canvas id="myChart"></canvas>
            </div>
        </div>
    </body>
    <script>
        var ctx = document.getElementById("myChart").getContext("2d");
        var myChart = new Chart(ctx, {
            type: "<%=tipo%>",
            data: {
                labels: [<%=label%> ],
                datasets: [
                    {
                        label: "ventas",
                        data: [<%=data%>],
                        backgroundColor: "rgba(153,205,1,0.6)",
                    },
                ],
            },
        });
    </script>
</html>

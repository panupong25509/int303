<%-- 
    Document   : ProductList
    Created on : Aug 8, 2018, 3:23:14 PM
    Author     : INT303
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">-->
        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
        <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
        <link href="https://fonts.googleapis.com/css?family=Hanalei+Fill" rel="stylesheet">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap.min.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        body {
            background-color: #ea9696;
            font-family: 'Hanalei Fill', cursive;
        }
    </style>
    <body>
        <table style="width: 70vw; margin: auto;margin-top: 10px;">
            <tr>
                <td style="text-align: center;">
                    <div style="display: inline-block"><h1>Product List</h1></div>
                    <a href="ShowCart"><div style="font-size: 38px;float: right;display: inline-block"><span class="glyphicon glyphicon-shopping-cart"></span>(${cart.totalQuantity})</div></a>
                </td>
                <td ></td>
            </tr>
        </table>
        <div style="width: 70vw; margin: auto;">
            <table id="example" class="table table-bordered text-center" style="width: 100%; background-color: white;border-radius: 8px; ">
                <thead>
                    <!--<th/>-->
                <th>#</th>
                <th>No</th>
                <th>Product Code</th>
                <th>Product Name</th>
                <th>Product Line</th>
                <th>Scale</th>
                <th>Price</th>
                <th>Add to Cart</th>
                </thead>
                <tbody>
                    <c:forEach items="${products}" var="p" varStatus="vs">
                        <tr>
                            <td><img src="model-images/${p.productCode}.jpg" width="120"/></td>
                            <td>${vs.count}</td>
                            <td>${p.productCode}</td>
                            <td>${p.productName}</td>
                            <td>${p.productLine}</td> 
                            <td>${p.productScale}</td> 
                            <td>${p.msrp}</td>
                            <!--<td><a href="AddItemToCart?productCode=${p.productCode}"><img style="width: 50px;" src="img/cart.png"/></a></td>-->
                            <td>
                                <form action="AddItemToCart" method="post">
                                    <input type="hidden" value="${p.productCode}" name="productCode"/>
                                    <input type="submit" value="Add To Cart"/>
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <script>
            $(document).ready(function () {
                $('#example').DataTable();
            });
        </script>
    </body>
</html>

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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="col-8 mx-auto text-center">
        <h1>Product List</h1>
        <table class="table table-striped table-dark">
            <thead>
            <th>#</th>
            <th>No</th>
            <th>Product Code</th>
            <th>Product Name</th>
            <th>Product Line</th>
            <th>Scale</th>
            <th>Price</th>
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
                </tr>
            </c:forEach>
        </tbody>
    </table>
        </div>
</body>
</html>

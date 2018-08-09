<%-- 
    Document   : ShowCart
    Created on : Aug 9, 2018, 4:15:42 PM
    Author     : INT303
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table id="example" class="table table-bordered text-center" style="width: 100%; background-color: white;border-radius: 8px; ">
                <thead>
                    <!--<th/>-->
                <th>#</th>
                <th>No</th>
                <th>Product Code</th>
                <th>Product Name</th>
                <th>Product Line</th>
                <th>Quantity</th>
                <th>All Price</th>
                <th>Add to Cart</th>
                </thead>
                <tbody>
                    <c:forEach items="${cart.lineItems}" var="lineItem" varStatus="vs">
                        <tr>
                            <td><img src="model-images/${lineItem.product.productCode}.jpg" width="120"/></td>
                            <td>${vs.count}</td>
                            <td>${lineItem.product.productCode}</td>
                            <td>${lineItem.product.productName}</td>
                            <td>${lineItem.product.productLine}</td> 
                            <td>${lineItem.quantity}</td> 
                            <td>${lineItem.totalPrice}</td>
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
    </body>
</html>

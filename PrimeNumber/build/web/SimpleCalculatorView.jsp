<%-- 
    Document   : SimpleCalculatorView
    Created on : Aug 6, 2018, 4:10:22 PM
    Author     : INT303
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        body {
            background-color: #ea9696;
            text-align: center;
            font-family: 'Hanalei Fill', cursive;
        }
/*        div {
            border: 1px solid black;
            border-radius: 8px;
            background-color: white;
        }
        form {
            display: inline-block;
        }
        input {
            text-align: center;
            border: 1px solid black;
            border-radius: 8px;
        }
        p{
            display: inline-block;
        }
        .result {
            color: cadetblue;
        }*/
    </style>
    <body>
        <h1>Result ::</h1><hr>
        <table>
            <tr>
                <td> x </td>
                <td> = </td>
                <td> ${calculator.x} </td>
            </tr>
            <tr>
                <td> y </td>
                <td> = </td>
                <td> ${calculator.y} </td>
            </tr>
            <tr>
                <td> operator </td>
                <td> = </td>
                <td> ${calculator.operator} </td>
            </tr>
            <tr>
                <td> Result </td>
                <td> = </td>
                <td> ${calculator.result} </td>
            </tr>
        </table>
        <hr>
    </body>
</html>

<%-- 
    Document   : PrimeNumberView
    Created on : Aug 8, 2018, 9:21:41 AM
    Author     : INT303
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>:: Prime Site ::</title>
    </head>
    <style>
        body {
            background-color: blanchedalmond; 
            text-align: center;
        }
        div {
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
        }
    </style>
    <body>
        <div><h1>Check Prime Number</h1></div><hr>
        <p>Enter number : </p>
        <form action="PrimeNumberServlet" method="post">
            <input type="text" name="number"/>
            <input type="submit"/>
        </form>
        <hr>
        <h1> :: Result :: </h1><h1 class="result"> ${primenumber.number} ${primenumber.check}</h1> 
    </body>
</html>

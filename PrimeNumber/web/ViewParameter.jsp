<%-- 
    Document   : ViewParameter
    Created on : Aug 8, 2018, 1:58:36 PM
    Author     : INT303
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Concert+One" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <style>
        body {
            background-color: #ea9696;
            font-family: 'Concert One', cursive;
        }
        .btn span.glyphicon {    			
	opacity: 0;				
        }
        .btn.active span.glyphicon {				
                opacity: 1;				
        }
        
    </style>
    <body>
        <div class="col-6 mx-auto bg-light rounded-100 mt-5 p-5">
            <h1 class="text-center">:: Favorite subject ::</h1>
            <form action="TestRequestParam" method="post">
                <div class="col-12">
                    <div class="row">
                        <div class="col-6 input-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text">Student ID:</span>
                            </div>
                            <input class="col form-control" type="text" name="id"/>
                        </div>
                        <div class="col-6 input-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text">Name:</span>
                            </div>
                            <input class="col form-control" type="text" name="name"/>
                        </div>
                    </div>
                </div>
                <div class="m-3">
                    Favorite subject:<br>
                    <input type="checkbox" name="subjects" value="Web Programming"/>Web Programming<br>
                    <input type="checkbox" name="subjects" value="Computer Network"/>Computer Network<br>
                    <input type="checkbox" name="subjects" value="Network Programming"/>Network Programming<br>
                    <input type="checkbox" name="subjects" value="Database Administrator"/>Database Administrator<br>
                    <input type="checkbox" name="subjects" value="Computer Security"/>Computer Security<br>
                    <input type="checkbox" name="subjects" value="Software Process"/>Software Process<br>
                    <input type="submit"/>
            </form>
            <br>
            <table class="table">
                <thead>
                    <tr>
                        <td>Student ID :</td>
                        <td>${param.id}</td>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Student Name :</td>
                        <td>${param.name}</td>
                    </tr>
                    <tr>
                        <td>Your Favorite subject :</td>
                        <td>
                            <c:forEach items="${subjectList}" var="str">
                                ${str}<br>
                            </c:forEach>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>

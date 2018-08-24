<%-- 
    Document   : ChooseBackground
    Created on : Aug 24, 2018, 9:52:11 AM
    Author     : INT303
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="/Header.jsp?title=Your Background" />
        <form action="ChooseBackground" method="post">
            <input type="radio" name="bgColor" value="dark">Dark
            <input type="text" size="3" disabled="" style="background-color: slategray"><br>
            <input type="radio" name="bgColor" value="navy">Navy Blue
            <input type="text" size="3" disabled="" style="background-color: navy"><br>
            <input type="radio" name="bgColor" value="silver">Silver
            <input type="text" size="3" disabled="" style="background-color: silver"><br>
            <input type="submit" value="Send">
        </form>
    </body>
</html>

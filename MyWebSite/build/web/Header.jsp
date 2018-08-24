<%-- 
    Document   : newjspHeader
    Created on : Aug 10, 2018, 3:19:25 PM
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
        <table style="background-color: ${cookie.bgColor.value}" class="table">
            <tr>
                <td><h1>${param.title}</h1></td>
                <td>
                    <c:if test="${cart!=null}">
                        <a href="index.jsp">Back to HOME</a>
                    </c:if>
                    &nbsp;&nbsp;&nbsp;
                    <c:choose>
                        <c:when test="${sessionScope.user!=null}">
                            Hello ${sessionScope.user.name}
                        </c:when>
                        <c:otherwise>
                            Hello
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
        </table>
                <h1>${cookie.JSESSIONID.value}</h1>
    </body>
</html>

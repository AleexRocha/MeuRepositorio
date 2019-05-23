<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Area Logada</title>
    </head>
    <body>
        <h1>Area Restrita!!</h1>
        <p>
            <c:if test="${usuario != null}">
                Olá <c:out value="${usuario}"></c:out>!
            </c:if>
        </p>
    </body>
</html>

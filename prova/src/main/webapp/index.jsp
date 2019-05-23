<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Prova</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form action ="login" method="post">
            <div>
                <h1 class=""> Login! </h1>
            </div>

            <c:if test="${varMsg == true}">
                <div class="">
                    <c:out value="${msg}"/>
                </div>
            </c:if>

            <label for="email">E-mail</label>
            <input name="email" type="email" id="email" class="" placeholder="Digite seu e-mail">

            <label for="senha">Senha</label>
            <input name="senha" type="password" id="senha" class="" placeholder="Digite sua senha">

            <button class="" type="submit">Sign in</button>
        </form>
    </body>
</html>

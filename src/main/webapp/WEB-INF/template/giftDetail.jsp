<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Подробности о подарке</title>
</head>
<body>
    <h1>Подробности о подарке</h1>
    <c:choose>
        <c:when test="${not empty gift}">
            <p>Название: ${gift.title}</p>
            <p>От кого: ${gift.giver}</p>
            <p>Кому: ${gift.receiver}</p>
            <p>Дата доставки: ${gift.date}</p>
        </c:when>
        <c:otherwise>
            <p>Подарок не найден</p>
        </c:otherwise>
    </c:choose>
    <a href="/">Назад к списку подарков</a>
</body>
</html>


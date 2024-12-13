<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Список подарков</title>
</head>
<body>
<h1>Список подарков</h1>
<ul>
    <c:forEach var="gift" items="${gifts}">
        <li><a href="gift?id=${gift.id}">${gift.title}</a> от ${gift.giver} для ${gift.receiver}</li>
    </c:forEach>
</ul>
</body>
</html>
<!DOCTYPE html>
<html>
<head>
    <title>Подробности о подарке</title>
</head>
<body>
    <h1>Подробности о подарке</h1>
    <#if gift??>
        <p>Название: ${gift.title}</p>
        <p>От кого: ${gift.giverName}</p>
        <p>Кому: ${gift.receiverName}</p>
        <p>Дата доставки: ${gift.deliveryDate?string}</p>
    <#else>
        <p>Подарок не найден</p>
    </#if>
    <a href="/">Назад к списку подарков</a>
</body>
</html>

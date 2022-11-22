<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>New Person</title>
</head>
<body>

<form method="post" action="/people">
    <label for="name">Enter name: </label>
    <input name="name" placeholder="Имя">
    <br/>
    <label for="age">Enter age: </label>
    <input name="age" placeholder="Год">
    <br/>
    <input type="submit" value="Create!"/>
</form>

</body>
</html>
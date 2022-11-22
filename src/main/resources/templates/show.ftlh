<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Show person</title>
</head>
<body>
<h3>Name - ${persons.name}, Age - ${persons.age}</h3>

<br>
<hr/>

<form method="post" action="/people/${persons.id}/update">
    <label for="name">Enter name: </label>
    <input name="name" placeholder="${persons.name}">
    <br/>
    <label for="age">Enter age: </label>
    <input name="age" placeholder="${persons.age}">
    <br/>
    <input type="submit" value="Save"/>
</form>

<br>

<form method="post" action="/people/${persons.id}/delete">
    <input type="submit" value="Удалить">
</form>

</body>
</html>
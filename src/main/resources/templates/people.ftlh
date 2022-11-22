<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>People</title>
</head>
<body>



<#list persons as people>
    <tr>
        <a href="/people/${people.id}">
            <td>${people.id}</td>
            <td>${people.name}</td>
            <td>${people.age}</td>
            <td>
        </a>
        <br/>
        </td>
    </tr>
</#list>

<br/>
<hr/>

<a href="/people/new">Create new person</a>

</body>
</html>
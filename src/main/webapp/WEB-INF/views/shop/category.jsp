<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<div>
    <h2>Add</h2>
    <form action="/shop/category/add" method="post">
        ID: <input type="text" name="id">
        <br>
        Name: <input type="text" name="name">
        <br>
        <button type="submit">Save</button>
    </form>
</div>
<h2>Table</h2>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${list}">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>
                <a href="/shop/category/detail/${list.id}">Detail</a>
                <a href="/shop/category/update/${list.id}">Update</a>
                <a href="/shop/category/delete?id=${list.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Teacher List</title>
</head>
<body>
<h2>Teacher List</h2>
<form action="/teacher/search" method="post">
    Name: <input type="text" name="nameSearch"> <input type="submit">
</form>

<br>
<a href="/teacher/female">Female teacher</a>
<br>
<a href="/teacher">Refresh</a>
<br>
<a href="/teacher/form">Add New Teacher</a>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Code</th>
        <th>Name</th>
        <th>Age</th>
        <th>Gender</th>
        <th>Address</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="teacher" items="${list}">
        <tr>
            <td>${teacher.id}</td>
            <td>${teacher.code}</td>
            <td>${teacher.name}</td>
            <td>${teacher.age}</td>
            <td>${teacher.gender ? 'Male' : 'Female'}</td>
            <td>${teacher.address}</td>
            <td>
                <a href="/teacher/updateForm?id=${teacher.id}">Edit</a>
                <a href="/teacher/delete?id=${teacher.id}">Delete</a>
                <a href="/teacher/detail?id=${teacher.id}">Detail</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

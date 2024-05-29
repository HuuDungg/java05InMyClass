<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Teacher Detail</title>
</head>
<body>
<h2>Teacher Detail</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <td>${teacherDetail.id}</td>
    </tr>
    <tr>
        <th>Code</th>
        <td>${teacherDetail.code}</td>
    </tr>
    <tr>
        <th>Name</th>
        <td>${teacherDetail.name}</td>
    </tr>
    <tr>
        <th>Age</th>
        <td>${teacherDetail.age}</td>
    </tr>
    <tr>
        <th>Gender</th>
        <td>${teacherDetail.gender ? 'Male' : 'Female'}</td>
    </tr>
    <tr>
        <th>Address</th>
        <td>${teacherDetail.address}</td>
    </tr>
</table>
<br>
<a href="/teacher">Back to List</a>
</body>
</html>

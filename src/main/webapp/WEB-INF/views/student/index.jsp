<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Dashboard</title>
</head>
<body>

<table>
    <form action="/student/detail">
        MSSV: <input name="id"/>
        <button type="submit">Search</button>
    </form>
    <br/>
    <button><a href="/student/form">Add Student</a></button>
    <tr>
        <th>STT</th>
        <th>MSSV</th>
        <th>Tên</th>
        <th>Tuổi</th>
        <th>Địa chỉ</th>
        <th>Giới tính</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${list}" var="l" varStatus="countSTT">
            <tr>
                <td>${countSTT.index + 1}</td>
                <td>${l.id}</td>
                <td>${l.name}</td>
                <td>${l.age}</td>
                <td>${l.address}</td>
                <td>${l.gender ? "male": "female"}</td>
                <td>
                    <a href="/student/delete?id=${l.id}">Delete</a>
                    <a href="/student/updateForm?id=${l.id}">Detail</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>

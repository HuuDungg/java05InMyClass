<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Update Teacher</title>
</head>
<body>
<h2>Update Teacher</h2>
<form:form action="/teacher/update" method="post" modelAttribute="teacher">
    <form:hidden path="id"/>
    Code: <form:input path="code"/><form:errors path="code"/><br>
    Name: <form:input path="name"/><form:errors path="name"/><br>
    Age: <form:input path="age" type="number"/><form:errors path="age"/><br>
    Gender:
    <form:radiobutton path="gender" value="true"/> Male
    <form:radiobutton path="gender" value="false"/> Female
    <br>
    Address: <form:input path="address"/><form:errors path="address"/><br>
    <button type="submit">Update</button>
</form:form>
</body>
</html>

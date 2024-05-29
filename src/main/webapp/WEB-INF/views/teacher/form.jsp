<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add New Teacher</title>
</head>
<body>
<h2>Add New Teacher</h2>
<form:form action="/teacher/save" method="post" modelAttribute="teacher">
    ID: <form:input path="id"/><form:errors path="id"/><br>
    Code: <form:input path="code"/><form:errors path="code"/><br>
    Name: <form:input path="name"/><form:errors path="name"/><br>
    Age: <form:input path="age" type="number"/><form:errors path="age"/><br>
    Gender:
    <form:radiobutton path="gender" value="true"/> Male
    <form:radiobutton path="gender" value="false"/> Female
    <br>
    Address: <form:input path="address"/><form:errors path="address"/><br>
    <button type="submit">Save</button>
</form:form>
</body>
</html>

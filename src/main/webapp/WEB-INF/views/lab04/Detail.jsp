<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JSP - Employee Update</title>
    <%@ page contentType="text/html; charset=UTF-8" %>
    <!-- Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1 class="mt-4">Update Employee</h1>
    <form:form action="/lab04/update" method="post" modelAttribute="employee" class="mt-4">
        <div class="form-group">
            <form:label path="id">ID</form:label>
            <form:input path="id" cssClass="form-control" readonly="true" />
        </div>
        <div class="form-group">
            <form:label path="name">Name</form:label>
            <form:input path="name" cssClass="form-control" />
            <form:errors path="name" cssClass="text-danger" />
        </div>
        <div class="form-group">
            <form:label path="age">Age</form:label>
            <form:input path="age" cssClass="form-control" />
            <form:errors path="age" cssClass="text-danger" />
        </div>
        <button type="submit" class="btn btn-primary">Update</button>
    </form:form>
</div>

<!-- Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>

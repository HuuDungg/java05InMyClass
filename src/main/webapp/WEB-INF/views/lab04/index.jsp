<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Employee Management</title>
  <%@ page contentType="text/html; charset=UTF-8" %>
  <!-- Bootstrap CSS -->
  <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
  <h1 class="mt-4">Employee List</h1>

  <!-- Form to create a new Employee -->
  <form action="/lab04/add" method="post" class="mt-4">
    <div class="form-group">
      <label for="name">Name:</label>
      <input type="text" class="form-control" id="name" name="name" required>
    </div>
    <div class="form-group">
      <label for="age">Age:</label>
      <input type="number" class="form-control" id="age" name="age" required>
    </div>
    <button type="submit" class="btn btn-primary">Create Employee</button>
  </form>

  <!-- Employee Table -->
  <table class="table table-bordered table-striped mt-4">
    <thead class="thead-dark">
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Age</th>
      <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${page.content}" var="l">
      <tr>
        <td>${l.id}</td>
        <td>${l.name}</td>
        <td>${l.age}</td>
        <td>
          <a href="/lab04/detail/${l.id}" class="btn btn-info btn-sm">Detail</a>
          <a href="/lab04/delete/${l.id}" class="btn btn-danger btn-sm">Delete</a>
        </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  <a href="/lab04/list">First</a>
  <a href="/lab04/list?page=${page.first? 0 : page.number -1}">previous</a>
  <a href="/lab04/list?page=${page.last? page.totalPages - 1 :page.number +1}">Next</a>
  <a href="/lab04/list?page=${page.totalPages -1}">last</a>
</div>

<!-- Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>

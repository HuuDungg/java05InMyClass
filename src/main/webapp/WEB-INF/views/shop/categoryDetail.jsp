<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<head>
    <title>JSP - Hello World</title>
    <%@ page contentType="text/html; charset=UTF-8" %>
</head>
<body>
  <form:form method="post" modelAttribute="category" action="/shop/category/update">
      ID<form:input path="id" readonly="true"></form:input> <br>
      Name<form:input path="name"></form:input>
      <button type="submit">Update</button>
  </form:form>
</body>
</html>
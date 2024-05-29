<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>JSP - Hello World</title>
    <%@ page contentType="text/html; charset=UTF-8" %>
</head>
<body>
<c:forEach items="${list}" var="l">
    <tr>
        <td>${l.name}</td>
    </tr>
    <br>
</c:forEach>
</body>
</html>
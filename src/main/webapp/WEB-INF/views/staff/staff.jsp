<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>JSP - Hello World</title>
    <%@ page contentType="text/html; charset=UTF-8" %>
</head>
<body>

    <form:form action="/staff/form" method="post" modelAttribute="staff">
        ten <form:input path="name"></form:input> <br>
        <form:errors path="name"></form:errors><br>
        tuoi <form:input path="age"></form:input> <br>
        <form:errors path="age"></form:errors><br>
        dia chi<form:input path="address"></form:input> <br>
        <form:errors path="address"></form:errors><br>
        vi tri<form:radiobuttons path="position" items="${positions}"></form:radiobuttons> <br>
        <form:errors path="position"></form:errors><br>
        so thich<form:checkboxes path="hobbies" items="${hobbies}" delimiter="  "></form:checkboxes>
        <form:errors path="hobbies"></form:errors><br><br>
        quoc gia
        <form:select path="country.id">
            <form:options items="${countries}" itemLabel="name" itemValue="id"></form:options>
        </form:select> <br>
        
        <form:errors path="country"></form:errors><br>
        <button>Submit</button>
    </form:form>

</body>
</html>
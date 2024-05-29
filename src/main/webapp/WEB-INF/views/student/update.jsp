<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sửa thông tin</title>
</head>
<body>

<form action="/student/update" method="post">
    MSSV: <input type="text" name="id" value="${studentDetail.id}" readonly/>
    <br/>
    Tên: <input type="text" name="name" value="${studentDetail.name}"/>
    <br/>
    Tuổi: <input type="number
" name="age" value="${studentDetail.age}"/>
    <br/>
    Địa chỉ: <input type="text" name="address" value="${studentDetail.address}"/>
    <br/>
    Giới tính:
    <input type="radio" name="gender" value="true" <c:if test="${studentDetail.gender}">checked</c:if>/>Nam
    <input type="radio" name="gender" value="false" <c:if test="${!studentDetail.gender}">checked</c:if>/>Nữ
    <br/>
    <button type="submit">Update</button>
</form>

</body>
</html>

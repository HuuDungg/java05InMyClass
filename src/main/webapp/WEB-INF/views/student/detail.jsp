
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chi tiết sinh viên</title>
</head>
<body>
    MSSV: ${studentDetail.id}
    <br/>
    Ten: ${studentDetail.name}
    <br/>
    Tuoi: ${studentDetail.age}
    <br/>
    Dia chi: ${studentDetail.address}
    <br/>
    Gioi tinh: ${studentDetail.gender ? "male" : "female"}
</body>
</html>

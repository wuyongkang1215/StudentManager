<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/5/22
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<style>
    body{
        background-image: url("./bgc.jpg");
    }
    #table{
        margin-left: 30%;
        margin-top: 30px;
    }
    td{
        text-align: center;
        height: 20px;
        width: 150px;
        border: black 1px solid;
        padding:1px;

    }

</style>
<body>
<table id="table">
<tr>
    <c:forEach items="${arr}" var="item">
        <tr>
             <td>科目：${item.getA()}&nbsp;&nbsp;&nbsp;<br></td>
                <td>成绩：${item.getB()}<br></td>
        <tr>
    </c:forEach>
</table>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/5/22
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <style>
        body{
            background-image: url("./bgc.jpg");
        }
        #a{
            width: 70%;
            height: 600px;
            margin-left: 240px;
            margin-top: 50px;
            position: absolute;
        }
        #b{
            margin-left: 300px;
            margin-top: 100px;
        }
        input{
            margin-top: 15px;
            margin-left: 70px;
            font-size: 30px;
            color:red;
            font-family: 华文新魏;
            margin-left: 10px;
        }
        button{
            background-color: azure;
            width: 100px;
            height: 25px;
            font-family: 华文新魏;
            margin-left: 110px;
        }
        span {
            margin-left: 100px;
            color: red;
        }
    </style>
    <script>
        function goMainPage(){
            window.location.href="goMainPage?admId=${admId}"
        }
        function sureUp(){
            let a=document.getElementById('a1').value;
            let b=document.getElementById('a2').value;
            let c=document.getElementById('a3').value;
            window.location.href="upStu?admId=${admId}&stuId=${stuId}&a="+a+"&b="+b+"&c="+c;

        }
    </script>
</head>
<body>
    <div id="a">
        <div style="font-size: 40px;margin-top: 40px;margin-left: 70px">成绩修改界面</div>
        <span>学生：&nbsp;${stuId}</span><br>
        <span>管理员：&nbsp;${admId}</span>
        <div id="b">
            数据结构：&nbsp;&nbsp;<input type="text" id="a1"><br>
            <br>
            路由交换：&nbsp;&nbsp;<input type="text" id="a2"><br>
            <br>
            javaweb：&nbsp;&nbsp;<input type="text" id="a3"><br>
            <br>

            <button onclick="goMainPage()">回主界面</button>
            <button onclick="sureUp()">确认修改</button>

        </div>

    </div>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/5/19
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
    <link rel="stylesheet" href="./style.css">
    <title>学生管理系统</title>

</head>
<body>
<div class="container right-panel-active">
    <!-- Sign Up -->
    <div class="container__form container--signup">
        <form action="#" class="form" id="form1">
            <h2 class="form__title">Sign Up</h2>
            <input type="text" placeholder="User" class="input" />
            <input type="email" placeholder="Email" class="input" />
            <input type="password" placeholder="Password" class="input" />
            <button class="btn">Sign Up</button>
        </form>
    </div>

    <!-- Sign In -->
    <div class="container__form container--signin">
        <form action="#" class="form" id="form2">
            <h2 class="form__title">Sign In</h2>
            <input type="email" placeholder="账号" class="input" id="u_id" />
            <input type="password" placeholder="密码" class="input" id="u_pwd" />
            <a href="#" class="link">Forgot your password?</a>
            <button class="btn" id="btn02">Sign In</button>
            <span id="error">${error}</span>
        </form>
    </div>

    <!-- Overlay -->
    <div class="container__overlay">
        <div class="overlay">
            <div class="overlay__panel overlay--left">
                <button class="btn" id="signIn">Sign In</button>
            </div>
            <div class="overlay__panel overlay--right">
                <button class="btn" id="signUp">Sign Up</button>
            </div>
        </div>
    </div>
</div>
<!-- partial -->
<script src="./script.js"></script>
<script>
    let btn001=document.getElementById("btn02")
    btn001.onclick=function (){
        let id_str = document.getElementById("u_id").value
        if(id_str==null||id_str==""){
            document.getElementById("error").innerHTML="账户不能为空"
            return;
        }
        let pwd_str = document.getElementById("u_pwd").value
        if(pwd_str==null||pwd_str==""){
            document.getElementById("error").innerHTML="密码不能为空"
            return
        }
        //    开始访问服务器
        window.location.href="login?u_id="+id_str+"&u_pwd="+pwd_str
    }
</script>
</body>
</html>

package com.studentmanager.servlet;

import com.studentmanager.bean.User;
import com.studentmanager.service.FileService;
import com.studentmanager.service.FileServiceImpl;
import com.studentmanager.service.loginService;
import com.studentmanager.service.loginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

//注解即我们起的一个名字，为了让前端来找到它
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String u_id=req.getParameter("u_id");
        String u_pwd=req.getParameter("u_pwd");
        User u = new User();
        u.setU_id(Integer.valueOf(u_id));
        u.setU_pwd(u_pwd);
        //实现登录服务器的业务逻辑层
        loginService l =new loginServiceImpl();
        User user=l.loginService(u);
//        if(flag=true){
//    //进入登录界面
//        }else{
//    //            重新登录
//        }
        if(user!=null){
            //获取Arr对象
            FileService fs = new FileServiceImpl();
            ArrayList<User> arr = fs.getAllStudent();
            req.setAttribute("user",user);
            req.setAttribute("arr",arr);
            req.getRequestDispatcher("mainPage.jsp").forward(req,resp);

        }else{
            req.setAttribute("error","账户和密码不一致！");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
        System.out.println("账户："+u.getU_id()+"密码："+u.getU_pwd());


    }
}

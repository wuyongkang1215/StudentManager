package com.studentmanager.servlet;

import com.studentmanager.bean.User;
import com.studentmanager.service.FileService;
import com.studentmanager.service.FileServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/del")
public class Delete extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String adm = req.getParameter("id");
        String stu = req.getParameter("v");
        FileService fs = new FileServiceImpl();
        fs.del(stu);
        //获取管理员信息
        User admUser = fs.getAdmine(adm);
//        所有学生对象
        ArrayList<User> arr = fs.getAllStudent();
        req.setAttribute("user",admUser);
        req.setAttribute("arr",arr);
        req.getRequestDispatcher("mainPage.jsp").forward(req,resp);



    }
}

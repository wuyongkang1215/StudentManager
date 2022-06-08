package com.studentmanager.servlet;

import com.studentmanager.bean.User;
import com.studentmanager.service.FileService;
import com.studentmanager.service.FileServiceImpl;
import com.sun.jnlp.FileOpenServiceNSBImpl;

import javax.jnlp.FileOpenService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/upStu")
public class upPage extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String admId= req.getParameter("admId");
        String stuId= req.getParameter("stuId");
        String a = req.getParameter("a");
        String b = req.getParameter("b");
        String c= req.getParameter("c");
        FileService fs = new FileServiceImpl();
        fs.upScore(stuId,a,b,c);

        User user = fs.getAdmine(admId);
        ArrayList<User> arr = fs.getAllStudent();
        req.setAttribute("user",user);
        req.setAttribute("arr",arr);
        req.getRequestDispatcher("mainPage.jsp").forward(req,resp);


    }
}

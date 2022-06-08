package com.studentmanager.servlet;

import com.studentmanager.bean.User;
import com.studentmanager.service.FileService;
import com.studentmanager.service.FileServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/mainServlet")
public class MainServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String v = req.getParameter("v");
        FileService fs = new FileServiceImpl();
        User u = fs.getFileByNameOrId(v);
        ArrayList<User> arr= new ArrayList<>();
        arr.add(u);
        String id= req.getParameter("id");
        FileService fs2 = new FileServiceImpl();
        User admineU =fs2.getAdmine(id);
        req.setAttribute("user",admineU);
        if(u!=null){
            req.setAttribute("arr",arr);
            req.getRequestDispatcher("mainPage.jsp").forward(req,resp);
        }else {
            FileService f = new FileServiceImpl();
            ArrayList<User> arr2 = f.getAllStudent();
            req.setAttribute("arr",arr2);
            req.getRequestDispatcher("mainPage.jsp").forward(req,resp);
        }
    }
}

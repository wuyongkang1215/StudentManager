package com.studentmanager.servlet;

import com.studentmanager.bean.Major;
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

@WebServlet("/show")
public class ShowServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String studentId=req.getParameter("v");
    FileService fs=new FileServiceImpl();
    ArrayList studentUser = fs.getPersonFile(studentId);
    req.setAttribute("arr",studentUser);
    req.getRequestDispatcher("scorePage.jsp").forward(req,resp);
    }
}

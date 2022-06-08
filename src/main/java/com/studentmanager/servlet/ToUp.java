package com.studentmanager.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/upTo")
public class ToUp extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String admId = req.getParameter("admId");
        String stuId = req.getParameter("stuId");

        req.setAttribute("admId",admId);
        req.setAttribute("stuId",stuId);

        req.getRequestDispatcher("upPage.jsp").forward(req,resp);
    }
}

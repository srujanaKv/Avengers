package com.java.jsp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/Feedback")
public class Feedback extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service is running");

        String text=servletRequest.getParameter("Name");
        String email=servletRequest.getParameter("Email");
        String tel=servletRequest.getParameter("PhoneNumber");
        long phone=0;
        if(tel!=null){
            phone=Long.parseLong(tel);
        }
        String Feedback=servletRequest.getParameter("Feedback");
        System.out.println("forwarding the feeedback to jsp");



        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("Response.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);

    }
}

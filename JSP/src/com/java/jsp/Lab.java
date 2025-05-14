package com.java.jsp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/Lab")
public class Lab extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service is running");

        String text=servletRequest.getParameter("Name");
        String labtype=servletRequest.getParameter("LabType");
        String location=servletRequest.getParameter("Location");
        String number=servletRequest.getParameter("NumberOfTechnicians");
        int tech=0;
        if(number!=null){
            tech=Integer.parseInt(number);
        }

        System.out.println("forwarding the lab to jsp");

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("Response.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);


    }
}

package com.java.jsp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/License")

public class License extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service is running");

        String text=servletRequest.getParameter("Name");
        String age=servletRequest.getParameter("Age");
        int num=0;
        if(age!=null){
            num=Integer.parseInt(age);
        }
        String tel=servletRequest.getParameter("PhoneNumber");
        long phone=0;
        if(tel!=null){
            phone=Long.parseLong(tel);
        }
        String LicenseType=servletRequest.getParameter("LicenseType");
        String Address=servletRequest.getParameter("Address");

        System.out.println("forwarding the license to jsp");

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("Response.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);

    }
}

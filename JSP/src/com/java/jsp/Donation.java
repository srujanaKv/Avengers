package com.java.jsp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/donation")
public class Donation extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service is running");

        String text=servletRequest.getParameter("Name");
        String number=servletRequest.getParameter("Amount");
        long num=0;
        if(number!=null){
            num=Long.parseLong(number);
        }
        String cause=servletRequest.getParameter("Cause");
        String tel=servletRequest.getParameter("phoneNumber");
        long  phne=0;
        if(tel!=null){
            phne=Long.parseLong(tel);
        }
        System.out.println("forwarding the donation to jsp");

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("Response.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);


    }
}

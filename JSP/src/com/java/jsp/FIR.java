package com.java.jsp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/FIR")
public class FIR extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service is running");

        String text=servletRequest.getParameter("Name");
        String age=servletRequest.getParameter("Age");
        int num=0;
        if(age!=null){
            num=Integer.parseInt(age);
        }
        String Crimedetails=servletRequest.getParameter("CrimeDetails");
        String location=servletRequest.getParameter("Location");

        System.out.println("forwarding the FIR to jsp");

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("Response.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}

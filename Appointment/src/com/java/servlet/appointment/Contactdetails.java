package com.java.servlet.appointment;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/contact")
public class Contactdetails extends GenericServlet {
    public Contactdetails(){
        System.out.println("no-args const");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service is running");

        String text=servletRequest.getParameter("firstname");
        String lastname=servletRequest.getParameter("lastname");
        String email=servletRequest.getParameter("email");
        String tel=servletRequest.getParameter("phoneNumber");
        long number=0;
        if(tel!=null){
            number=Long.parseLong(tel);
        }
        String message=servletRequest.getParameter("Message");
        String Address=servletRequest.getParameter("Address");

        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();
        writer.println("<h2>Thank you for contacting</h2>");
        writer.println("<h3>firstname</h3>"+text);
        writer.println("<h3>lastname</h3>"+lastname);
        writer.println("<h3>email</h3>"+email);
        writer.println("<h3>phonenumber</h3>"+tel);
        writer.println("<h3>message</h3>"+message);
        writer.println("<h3>Address</h3>"+Address);


    }
}

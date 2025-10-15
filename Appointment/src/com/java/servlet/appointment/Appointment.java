package com.java.servlet.appointment;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/appointment")
public class Appointment extends GenericServlet {
    public Appointment(){
        System.out.println("no args constructor");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service is running");

        String text=servletRequest.getParameter("firstname");
        String lastname=servletRequest.getParameter("lastname");
        String email =servletRequest.getParameter("email");
        String tel=servletRequest.getParameter("phoneNumber");
        long phoneNumber=0;
        if(tel!=null) {
            phoneNumber = Long.parseLong(tel);
        }
        String number= servletRequest.getParameter("Age");
        int age=0;
        if(number!=null){
            age=Integer.parseInt(number);
        }
        String Address=servletRequest.getParameter("Address");
        String Gender=servletRequest.getParameter("Gender");
        String Sickness=servletRequest.getParameter("Sickness");

        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();

        writer.println("<h1>Thank you for appointing</h1>");
        writer.println("<h3>firstname</h3>"+text);
        writer.println("<h3>lastname</h3>"+lastname);
        writer.println("<h3>email</h3>"+email);
        writer.println("<h3>phonenumber</h3>"+tel);
        writer.println("<h3>Age</h3>"+age);
        writer.println("<h3>Gender</h3>"+Gender);
        writer.println("<h3>Sickness</h3>"+Sickness);

    }
}

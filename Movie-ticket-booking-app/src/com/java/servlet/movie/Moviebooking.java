package com.java.servlet.movie;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/book")

public class Moviebooking extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Moviebooking is running");

        String text=servletRequest.getParameter("name");
        String email=servletRequest.getParameter("email");
        String tel=servletRequest.getParameter("Contactnumber");
        long contact=0;
        if(tel!=null) {
            contact = Long.parseLong(tel);
        }
        String moviename=servletRequest.getParameter("moviename");
        String number=servletRequest.getParameter("numberticket");
        int numberticket=0;
        if(number!=null) {
            numberticket = Integer.parseInt(number);
        }
            String location=servletRequest.getParameter("location");
            String ticketprice=servletRequest.getParameter("ticketprice");
            int price=0;
            if(ticketprice!=null) {
                price = Integer.parseInt(ticketprice);

            }
            int payableamount=numberticket*price;

                servletResponse.setContentType("text/html");
                PrintWriter writer=servletResponse.getWriter();
                writer.println("<h1>Thank you for booking</h1>");
                writer.println("<h2>Name</h2>"+text);
                writer.println("<h2>Moviename</h2>"+moviename);
                writer.println("<h2>Total amount </h2>"+payableamount);
            }
        }



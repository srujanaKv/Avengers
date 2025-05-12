package com.java.servlet.order;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/Order")
public class Order extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service is running");

        String text=servletRequest.getParameter("name");
        String tel=servletRequest.getParameter("Contactnumber");
        long number=0;
        if(tel!=null){
            number=Long.parseLong(tel);
        }
        String name=servletRequest.getParameter("Itemname");
        String items=servletRequest.getParameter("Numberofitem");
        int item=0;
        if(items!=null) {
            item = Integer.parseInt(items);
        }
            String cost=servletRequest.getParameter("itemcost");
            int price=0;
            if(cost!=null) {
                price = Integer.parseInt(cost);
            }

               servletResponse.setContentType("text/html");
                PrintWriter writer=servletResponse.getWriter();
                writer.println("<h1>welcome to shopping</h1>");
                writer.println("<h2>Thank you for shopping mr</h2>"+text);
                writer.println("<h2>your order is</h2>"+text);
                writer.println("<h2>item cost<h2>"+number);
            }

        }



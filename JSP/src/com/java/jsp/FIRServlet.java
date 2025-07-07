/*package com.java.jsp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/FIR")

public class FIRServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        System.out.println("doPost is running");
        String text=req.getParameter("Name");
        String email=req.getParameter("Email");
        String tel=req.getParameter("PhoneNumber");
        long phone=0;
        if(tel!=null){
            phone=Long.parseLong(tel);
        }
        String Feedback=req.getParameter("Feedback");


        System.out.println("forwarding the crimedetails to jsp");
        req.setAttribute("message","Save Success");
        req.setAttribute("name",exampleInputName);
        req.setAttribute("Age",agel);
        req.setAttribute("Crimedetails",Crimedetails);
        req.setAttribute("Location",location);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("response.jsp");
        requestDispatcher.forward(req,resp);
    }
}  */




package com.java.jsp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Donation")

public class DonationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);

        String text=req.getParameter("Name");
        String number=req.getParameter("Amount");
        long num=0;
        if(number!=null){
            num=Long.parseLong(number);
        }
        String cause=req.getParameter("Cause");
        String tel=req.getParameter("phoneNumber");
        long  phne=0;
        if(tel!=null){
            phne=Long.parseLong(tel);
        }
        System.out.println("forwarding the donation to jsp");


        System.out.println("forwarding the crimedetails to jsp");
        req.setAttribute("message","Save Success");
        req.setAttribute("name",exampleInputName);
        req.setAttribute("Amount",amount);
        req.setAttribute("Cause",cause);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("response.jsp");
        requestDispatcher.forward(req,resp);
    }
}

    }
}

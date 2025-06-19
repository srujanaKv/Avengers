package com.xworkz.marriage.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Marriage",loadOnStartup = 1)

public class MarriageAnniversery extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost is running");

        String couplesName=req.getParameter("CouplesName");
        String yearOfTogetherness=req.getParameter("YearOfTogetherness");
        int n_YearOfTogetherness=0;
        if(yearOfTogetherness!=null){
            n_YearOfTogetherness=Integer.parseInt(yearOfTogetherness);
        }
        String venue=req.getParameter("Venue");
        String numberOfGuests=req.getParameter("NumberOfGuests");
        int n_NumberOfGuests=0;
        if (numberOfGuests!=null){
           n_NumberOfGuests=Integer.parseInt(numberOfGuests);
        }
        String contactNumber=req.getParameter("ContactNumber");
        long n_ContactNumber=0;
        if(contactNumber!=null){
            n_ContactNumber=Integer.parseInt(contactNumber);
        }

    }
}

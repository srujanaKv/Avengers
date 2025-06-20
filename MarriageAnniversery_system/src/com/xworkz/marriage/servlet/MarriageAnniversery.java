package com.xworkz.marriage.servlet;

import com.xworkz.marriage.constant.MAProperties;
import com.xworkz.marriage.dto.AnniverseryDto;
import com.xworkz.marriage.service.AnniverseryService;
import com.xworkz.marriage.service.AnniverseryServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

@WebServlet(urlPatterns = {"/Marriage","/search"},loadOnStartup = 1)

public class MarriageAnniversery extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost is running");

        String couplesName = req.getParameter("CouplesName");
        String yearOfTogetherness = req.getParameter("YearOfTogetherness");
        int nYearOfTogetherness = 0;
        if (yearOfTogetherness != null) {
            nYearOfTogetherness = Integer.parseInt(yearOfTogetherness);
        }
        String venue = req.getParameter("Venue");
        String numberOfGuests = req.getParameter("NumberOfGuests");
        int nNumberOfGuests = 0;
        if (numberOfGuests != null) {
            nNumberOfGuests = Integer.parseInt(numberOfGuests);
        }
        String contactNumber = req.getParameter("ContactNumber");
        long nContactNumber = 0;
        if (contactNumber != null) {
            nContactNumber = Long.parseLong(contactNumber);
        }
        String createdBy = MAProperties.SRUJANA.toString();
         Timestamp createdTime = Timestamp.valueOf(LocalDateTime.now());
AnniverseryDto anniverseryDto=new AnniverseryDto(couplesName,nYearOfTogetherness,venue,nNumberOfGuests,nContactNumber,createdBy,createdTime);
        AnniverseryService anniverseryService= new AnniverseryServiceImpl();
        boolean saved=anniverseryService.save(anniverseryDto);

        if(saved){
            System.out.println("service done successfully");
            req.setAttribute("success","anniversery Details Saved Successfully");
        }
        else{
            System.out.println("not saved");
            req.setAttribute("dto",anniverseryDto);
            req.setAttribute("failure","annivery Details not saved Successfully");
        }
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("Anniversery.jsp");
        requestDispatcher.forward(req,resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running get in MarriageAnniversery..");
        String marriageId = req.getParameter("marriageId");
        if (marriageId != null) {
            int id = Integer.parseInt(marriageId);
            System.out.println("search id :" + id);
            AnniverseryService anniverseryService = new AnniverseryServiceImpl();
            Optional<AnniverseryDto> optionalAnniverseryDto = anniverseryService.findById(id);
            if (optionalAnniverseryDto.isPresent()) {
                AnniverseryDto anniverseryDto = optionalAnniverseryDto.get();
                System.out.println("marriage data is found :" + anniverseryDto);
                req.setAttribute("dto", anniverseryDto);

            } else {
                System.out.println("marriage data is not found for id :" + id);
                req.setAttribute("failure", "marriage data not found for ID: " + id);
            }
         RequestDispatcher dispatcher = req.getRequestDispatcher("/AnniverseryViewer.jsp");
            dispatcher.forward(req, resp);
        }
    }
}




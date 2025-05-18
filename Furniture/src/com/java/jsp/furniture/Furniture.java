package com.java.jsp.furniture;

import com.java.furniture.dto.FurnitureDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Furniture",loadOnStartup = 1)

public class Furniture extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       /* super.doPost(req,resp); */
        System.out.println("doPost is running");

        String brand=req.getParameter("Brand");
        String size=req.getParameter("Size");
        String Modelname=req.getParameter("ModelName");
        String productdetails=req.getParameter("ProductBenefits");


        FurnitureDto furnitureDto=new FurnitureDto();
        furnitureDto.setBrand(brand);
        furnitureDto.setSize(size);
        furnitureDto.setModelname(Modelname);
        furnitureDto.setProductdetails(productdetails);


        RequestDispatcher requestDispatcher=req.getRequestDispatcher("FurnitureSuccess.jsp");
        req.setAttribute("furnitureDto",furnitureDto);
        requestDispatcher.forward(req,resp);

    }
}

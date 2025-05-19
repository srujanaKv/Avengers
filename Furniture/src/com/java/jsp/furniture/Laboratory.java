package com.java.jsp.furniture;

import com.java.furniture.dto.LaboratoryDto;
import com.java.jsp.furniture.Laboratory;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/Laboratory", loadOnStartup = 1)
public class Laboratory extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String labName = req.getParameter("LabName");
        String location = req.getParameter("Location");
        String specialization = req.getParameter("Specialization");
        String headScientist = req.getParameter("HeadScientist");

        LaboratoryDto dto = new LaboratoryDto();
        dto.setLabName(labName);
        dto.setLocation(location);
        dto.setSpecialization(specialization);
        dto.setHeadScientist(headScientist);

        req.setAttribute("labDto", dto);
        RequestDispatcher dispatcher = req.getRequestDispatcher("LaboratorySuccess.jsp.jsp");
        dispatcher.forward(req, resp);
    }
}

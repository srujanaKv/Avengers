package com.java.jsp.furniture;

import com.java.furniture.dto.LicenseDto;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/License", loadOnStartup = 1)
public class License extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String holderName = req.getParameter("HolderName");
        String licenseNumber = req.getParameter("LicenseNumber");
        String vehicleType = req.getParameter("VehicleType");
        String expiryDate = req.getParameter("ExpiryDate");

        LicenseDto dto = new LicenseDto();
        dto.setHolderName(holderName);
        dto.setLicenseNumber(licenseNumber);
        dto.setVehicleType(vehicleType);
        dto.setExpiryDate(expiryDate);

        req.setAttribute("licenseDto", dto);
        RequestDispatcher dispatcher = req.getRequestDispatcher("LicenseSuccess.jsp");
        dispatcher.forward(req, resp);
    }
}


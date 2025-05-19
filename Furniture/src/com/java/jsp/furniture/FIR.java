package com.java.jsp.furniture;

import com.java.furniture.dto.FirDto;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/FIR", loadOnStartup = 1)
public class FIR extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String complainantName = req.getParameter("ComplainantName");
        String firNumber = req.getParameter("FIRNumber");
        String crimeType = req.getParameter("CrimeType");
        String policeStation = req.getParameter("PoliceStation");

        FirDto firDto = new FirDto();
        firDto.setComplainantName(complainantName);
        firDto.setFirNumber(firNumber);
        firDto.setCrimeType(crimeType);
        firDto.setPoliceStation(policeStation);

        req.setAttribute("firDto", firDto);
        RequestDispatcher dispatcher = req.getRequestDispatcher("FIRSuccess.jsp");
        dispatcher.forward(req, resp);
    }
}


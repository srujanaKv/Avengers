package com.xworkz.earthworm.servlet;

import com.xworkz.earthworm.dto.EarthWormDto;
import com.xworkz.earthworm.service.EarthWormService;
import com.xworkz.earthworm.service.EarthWormServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/EarthWorm", loadOnStartup = 1)

public class EarthwormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String ScientificName = req.getParameter("ScientificName");
        String BodyShape = req.getParameter("BodyShape");
        String Color = req.getParameter("Color");
        String Female = req.getParameter("Female");
        boolean n_female = false;
        if (Female != null) {
            n_female = Boolean.parseBoolean(Female);
        }
        String lifespan = req.getParameter("LifeSpan");
        int n_lifespan = 0;
        if (lifespan != null) {
            n_lifespan = Integer.parseInt(lifespan);
        }
        String Food = req.getParameter("Food");


        EarthWormDto earthWormDto = new EarthWormDto();
        earthWormDto.setScientificName(ScientificName);
        earthWormDto.setBodyShape(BodyShape);
        earthWormDto.setColor(Color);
        earthWormDto.setN_female(n_female);
        earthWormDto.setN_lifespan(n_lifespan);
        earthWormDto.setFood(Food);


        EarthWormService earthWormService = new EarthWormServiceImpl();

        boolean saved = earthWormService.save(earthWormDto);
        RequestDispatcher requestDispatcher;

        if (saved) {
            req.setAttribute("message", "Report");
            req.setAttribute("earthWormdto", earthWormDto);
            requestDispatcher = req.getRequestDispatcher("EarthWormSuccess.jsp");
        } else {
            req.setAttribute("message", "Details not incorrect");
            requestDispatcher = req.getRequestDispatcher("EarthWorm.jsp");
        }

        // Make sure this is the only output method
        requestDispatcher.forward(req, resp);
    }


    }


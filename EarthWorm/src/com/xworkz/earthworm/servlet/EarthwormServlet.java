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
import java.util.Optional;

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
        String lifespan = req.getParameter("lifespan");
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
        boolean valid = earthWormService.save(earthWormDto);
        /*RequestDispatcher requestDispatcher;
        if(saved) {
            requestDispatcher= req.getRequestDispatcher("EarthWormSuccess.jsp");
            req.setAttribute("message", "Report");
            req.setAttribute("earthWormDto", earthWormDto);
        }
        else {
            requestDispatcher= req.getRequestDispatcher("EarthWorm.jsp");
            req.setAttribute("message", "Details not incorrect");
        }
        requestDispatcher.forward(req,resp);
    }


    }  */
        if(valid){
            System.out.println("done successfully");
            req.setAttribute("success", "earthworm Details saved successfully");
        } else {
            System.out.println("not saved");
            req.setAttribute("dto",earthWormDto);
            req.setAttribute("failure", "earthworm not saved");
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/EarthWorm.jsp");
        requestDispatcher.forward(req, resp);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet is running succesfully");
        String EarthWormId=req.getParameter("EarthWormId");

        if(EarthWormId!=null)
        {
            int id=Integer.parseInt(EarthWormId);
            System.out.println("search id :"+id);
            EarthWormService earthWormService=new EarthWormServiceImpl();
            Optional<EarthWormDto> optionalEarthWormDto= earthWormService.findById(id);
            if(optionalEarthWormDto.isPresent())
            {
                System.out.println("duster data is found");
            }
            else{
                System.out.println("duster data is not found for id :"+id);
            }
        }
    }


}




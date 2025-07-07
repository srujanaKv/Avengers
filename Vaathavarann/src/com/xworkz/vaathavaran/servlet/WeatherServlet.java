package com.xworkz.vaathavaran.servlet;

import com.xworkz.vaathavaran.dto.WeatherDto;
import com.xworkz.vaathavaran.service.WeatherService;
import com.xworkz.vaathavaran.service.WeatherServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/weather", loadOnStartup = 1)
public class WeatherServlet extends HttpServlet {
    private WeatherService weatherService = new WeatherServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        WeatherDto dto = new WeatherDto(
                req.getParameter("place"),
                req.getParameter("weather"),
                Integer.parseInt(req.getParameter("minTemp")),
                Integer.parseInt(req.getParameter("maxTemp")),
                req.getParameter("cloudy"),
                req.getParameter("raining"),
                Integer.parseInt(req.getParameter("rainMM")),
                Integer.parseInt(req.getParameter("humidity")),
                Integer.parseInt(req.getParameter("windSpeed")),
                req.getParameter("sunrise"),
                req.getParameter("sunset"),
                req.getParameter("moonrise"),
                req.getParameter("moonset"),
                req.getParameter("rainStart"),
                req.getParameter("rainEnd"),
                Integer.parseInt(req.getParameter("precipitation"))
        );

        String result = weatherService.save(dto);
        req.setAttribute("result", result);
        req.setAttribute("weatherDTO", dto);
        req.getRequestDispatcher("WeatherSuccess.jsp").forward(req, resp);    }
}

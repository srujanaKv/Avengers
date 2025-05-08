package com.java.servlet.ipl;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/ipl")
public class IPL extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // Retrieve form parameters
        String teamName = req.getParameter("teamname");
        String owner = req.getParameter("owner");
        String playersStr = req.getParameter("players");
        String location = req.getParameter("location");
        String budgetStr = req.getParameter("budget");

        int players = 0;
        int budget = 0;

        if (playersStr != null && !playersStr.isEmpty()) {
            players = Integer.parseInt(playersStr);
        }

        if (budgetStr != null && !budgetStr.isEmpty()) {
            budget = Integer.parseInt(budgetStr);
        }


        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();


        writer.println("<html><body style='font-family: Arial;'>");
        writer.println("<h1>Team Registration Successful</h1>");
        writer.println("<h2>Team Name: " + teamName + "</h2>");
        writer.println("<h2>Owner: " + owner + "</h2>");
        writer.println("<h2>Players: " + players + "</h2>");
        writer.println("<h2>Home Ground: " + location + "</h2>");
        writer.println("<p style='color:green;'>Thank you for registering your IPL team!</p>");
        writer.println("</body></html>");
    }
}

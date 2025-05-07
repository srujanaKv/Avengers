package com.java.servlet.games;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/badminton",loadOnStartup = 1)

public class Badminton extends GenericServlet {
    public Badminton(){
        System.out.println("Badminton is running");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service is runningf");
    }
}

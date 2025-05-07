package com.java.servlet.games;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/volleyball",loadOnStartup = 1)

public class Volleyball extends GenericServlet {
    public Volleyball(){
        System.out.println("Volleyball is running");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
      System.out.println("Service is running");
    }
}

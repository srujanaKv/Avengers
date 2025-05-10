package com.java.servlet.games;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/kabbadi",loadOnStartup = 1)

public class Kabbadi extends GenericServlet {
    public Kabbadi(){
        System.out.println("Kabbadi is running");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
       System.out.println("service is running");
    }
}

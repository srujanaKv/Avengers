package com.java.servlet.games;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/khokho",loadOnStartup = 1)

public class KhoKho extends GenericServlet {
    public KhoKho(){
        System.out.println("KhoKho is running");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
     System.out.println("Service is running");
    }
}

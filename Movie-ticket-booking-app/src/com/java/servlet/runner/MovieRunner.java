package com.java.servlet.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class MovieRunner {
        public static void main(String[] args) throws ClassNotFoundException, SQLException {

            String username="root";
            String password="Srujana22";
            String url="jdbc:mysql://localhost:3306/banks";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url,username,password);
            System.out.println("Connection success: "+connection);


}
    }


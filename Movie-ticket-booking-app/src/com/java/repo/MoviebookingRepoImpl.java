package com.java.repo;

import com.java.movie.dto.MoviebookingDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MoviebookingRepoImpl
{

    @Override
    public String persist(MoviebookingDto moviebookingDto) {
        System.out.println("running persist in MoviebookingDto");
        System.out.println("should save into DB...");
        if (MoviebookingDto != null) {
            String url = "jdbc:mysql://localhost:3306/xworkz";
            String username = "root";
            String password = "Srujana22";
            //4 steps
            //Step1 : Load the Driver
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                //Step 2 : Create the Connection
                Connection connection = DriverManager.getConnection(url, username, password);
                //Step 3 : Prepare the Statement
                String sql = "insert into stampede_case values(0,'" + MoviebookingDto.getEvent() + "','" + MoviebookingDto.getLocation() + "'," + stampedeCaseDTO.getDeaths() + "," + stampedeCaseDTO.getInjuries() + ")";
                Statement statement = connection.createStatement();
                //step 4 : execute the statement
                statement.executeUpdate(sql);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }

            return "Success";
        }
        return "failed";
    }
}

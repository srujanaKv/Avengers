package com.xworkz.earthworm.repo;

import com.xworkz.earthworm.dto.EarthWormDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EarthWormRepoImpl implements EarthWormRepo{
    @Override
    public boolean persist(EarthWormDto earthWormDto) {
        System.out.println("running the earthWormDto");
        if(earthWormDto!=null){
            String url="jdbc:mysql://localhost:3306/EarthWorm";
            String username="root";
            String password="Srujana#2001";

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                //Step 2 : Create the Connection
                Connection connection= DriverManager.getConnection(url,username,password);

                //Step 3 : Prepare the Statement(for string '"++"'
                String sql="insert into earthworm values(0,'"+earthWormDto.getScientificName()+"','"+earthWormDto.getBodyShape()+"',"+earthWormDto.getColor()+","+earthWormDto.getN_female()+",'"+earthWormDto.getN_lifespan()+"','"+earthWormDto.getFood()+"')";
                Statement statement=connection.createStatement();
                //step 4 : execute the statement
                statement.executeUpdate(sql);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }

            return true;
        }
        return false;
    }
}


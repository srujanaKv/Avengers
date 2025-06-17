package com.xworkz.earthworm.repo;

import com.xworkz.earthworm.constant.EWProperties;
import com.xworkz.earthworm.dto.EarthWormDto;

import java.sql.*;
import java.time.LocalDate;
import java.util.Optional;

public class EarthWormRepoImpl implements EarthWormRepo {
    @Override
    public boolean persist(EarthWormDto earthWormDto) {
        System.out.println("running the earthWormDto");
        if (earthWormDto != null) {
            String url = "jdbc:mysql://localhost:3306/earthworm";
            String username = "root";
            String password = "Srujana#2001";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                //Step 2 : Create the Connection
                Connection connection = DriverManager.getConnection(url, username, password);

                //Step 3 : Prepare the Statement(for string '"++"'
                String sql = "insert into earthworm values(0,'" + earthWormDto.getScientificName() + "','" + earthWormDto.getBodyShape() + "','" + earthWormDto.getColor() + "'," + earthWormDto.getN_female() + "," + earthWormDto.getN_lifespan() + ",'" + earthWormDto.getFood() + "')";
                Statement statement = connection.createStatement();
                //step 4 : execute the statement
                statement.executeUpdate(sql);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }

            return true;
        }
        return false;
    }

    @Override
    public Optional<EarthWormDto> findById(int id) {
        System.out.println("running findById in EarthWormRepoImpl...");

        //JDBC
        // Load & register , Create the Connection , Preppare the Statemtne , Execute the statement
        //URL,UN,PWD
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(EWProperties.URL.getProp(), EWProperties.USER_NAME.getProp(), EWProperties.SECRET.getProp());
            String findByIdSQL = "select * from earthworm worm where worm.id=" + id + " ";
            System.out.println("findById :" + findByIdSQL);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(findByIdSQL);
            System.out.println("resultSet :" + resultSet);
            while (resultSet.next()) {
                int pk = resultSet.getInt("id");
                String scientificName = resultSet.getString("ScientificName");
                String bodyShape = resultSet.getString("BodyShape");
                String color = resultSet.getString("Color");
                Boolean n_female = resultSet.getBoolean("n_female");
                int n_lifespan = resultSet.getInt("n_lifespan");
                String food = resultSet.getString("Food");

                EarthWormDto earthWormDto = new EarthWormDto(scientificName, bodyShape, color, n_female, n_lifespan, food);
                return Optional.of(earthWormDto);
            }

        } catch (SQLException | ClassNotFoundException exception) {
            System.err.println(" SQLException in findById " + exception.getMessage());
        }
        return Optional.empty();
    }
}


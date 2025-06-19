package com.xworkz.earthworm.repo;

import com.xworkz.earthworm.utils.JdbcUtils;
import com.xworkz.earthworm.dto.EarthWormDto;
import com.xworkz.earthworm.utils.JdbcUtils;

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
                Class.forName(JdbcUtils.jdbcDriver);
                //get connection
                Connection connection = DriverManager.getConnection(JdbcUtils.jdbcUrl, JdbcUtils.jdbcUserName, JdbcUtils.jdbcPassword);
                String query = "insert into earthworm values(Scientific_Name,Body_Shape,Color,n_female,n_lifespan,Food) values(?,?,?,?,?,?)";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, earthWormDto.getScientificName());
                statement.setString(2, earthWormDto.getBodyShape());
                statement.setString(3, earthWormDto.getColor());
                statement.setBoolean(4, earthWormDto.getN_female());
                statement.setInt(5, earthWormDto.getN_lifespan());
                statement.setString(6, earthWormDto.getFood());
                int result = statement.executeUpdate();
                if (result > 0) {
                    return true;
                }
            } catch (ClassNotFoundException | SQLException exception) {
                exception.printStackTrace();
            }

            return false;
        }

        @Override
        public EarthWormDto[] findAll() {
            int index = 0;
            int arraySize = 1;
            EarthWormDto[] earthWormDtos = null;

            try {
                Class.forName(JdbcUtils.jdbcDriver);
                //get connection
                Connection connection = DriverManager.getConnection(JdbcUtils.jdbcUrl, JdbcUtils.jdbcUserName, JdbcUtils.jdbcPassword);
                String fetchAll = "select * from earthworm";
                PreparedStatement statement = connection.prepareStatement(fetchAll);
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    earthWormDtos = new EarthWormDto[][arraySize];
                    System.out.println(resultSet.getInt(1));
                    System.out.println(resultSet.getString(2));
                    System.out.println(resultSet.getString(3));
                    System.out.println(resultSet.getString(4));
                    System.out.println(resultSet.getBoolean(5));
                    System.out.println(resultSet.getInt(6));
                    System.out.println(resultSet.getString(7));
                    System.out.println("==========================================");
                    EarthWormDto earthWormDto1 = new EarthWormDto();
                    earthWormDto1.setEarthId(resultSet.getInt(1));
                    earthWormDto1.setScientificName(resultSet.getString(2));
                    earthWormDto1.setBodyShape(resultSet.getString(3));
                    earthWormDto1.setColor(resultSet.getString(4));
                    earthWormDto1.setN_female(resultSet.getBoolean(5));
                    earthWormDto1.setN_lifespan(resultSet.getInt(6));
                    earthWormDto1.setFood(resultSet.getString(7));

                    earthWormDtos[index] = earthWormDto;
                    arraySize++;
                    index++;


                }

            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }

            return earthWormDtos;
        }
    }
}


              /*  Class.forName("com.mysql.cj.jdbc.Driver");
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
    }  */

   /* @Override
    public Optional<EarthWormDto> findById(int id) {
        System.out.println("running findById in EarthWormRepoImpl...");

        //JDBC
        // Load & register , Create the Connection , Preppare the Statemtne , Execute the statement
        //URL,UN,PWD
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(EWProperties.URL.getProp(), EWProperties.USER_NAME.getProp(), EWProperties.SECRET.getProp());
            String findByIdSQL = "select * from earthworm EarthWorm where EarthWorm.id=" + id + " ";
            System.out.println("findById :" + findByIdSQL);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(findByIdSQL);
            System.out.println("resultSet :" + resultSet);
            while (resultSet.next()) {
                int pk = resultSet.getInt("id");
                String scientificName = resultSet.getString("Scientific_Name");
                String bodyShape = resultSet.getString("Body_Shape");
                String color = resultSet.getString("Color");
                Boolean n_female = resultSet.getBoolean("n_female");
                int n_lifespan = resultSet.getInt("n_lifespan");
                String food = resultSet.getString("Food");
               // Timestamp createdTime=resultSet.getTimestamp("createdTime");

                EarthWormDto earthWormDto = new EarthWormDto(scientificName, bodyShape, color, n_female, n_lifespan, food);
                return Optional.of(earthWormDto);
            }

        } catch (SQLException | ClassNotFoundException exception) {
            System.err.println(" SQLException in findById " + exception.getMessage());
        }
        return Optional.empty();
    }
} */


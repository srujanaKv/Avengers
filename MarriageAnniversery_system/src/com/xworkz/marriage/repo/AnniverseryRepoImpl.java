package com.xworkz.marriage.repo;

import com.xworkz.marriage.constant.MAProperties;
import com.xworkz.marriage.dto.AnniverseryDto;
import lombok.SneakyThrows;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.Optional;

public class AnniverseryRepoImpl implements AnniverseryRepo{
    @Override
    public boolean persist(AnniverseryDto anniverseryDto) {
        System.out.println("Running anniverseryDto in AnniverseryImpl");
        if(anniverseryDto!=null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection connection= DriverManager.getConnection(MAProperties.URL.getProp(),MAProperties.USER_NAME.getProp(), MAProperties.SECRET.getProp());

                String preSql="insert into marriage values(?,?,?,?,?,?,?,?)";
                PreparedStatement preparedStatement=
                        connection.prepareStatement(preSql);//pre-compile

                //below should go inside for , incase of many rows!
                preparedStatement.setInt(1,0);
                preparedStatement.setString(2,anniverseryDto.getCouplesName());
                preparedStatement.setInt(3, anniverseryDto.getNYearOfTogetherness());
                preparedStatement.setString(4,anniverseryDto.getVenue());
                preparedStatement.setInt(5, anniverseryDto.getNNumberOfGuests());
                preparedStatement.setLong(6,anniverseryDto.getNContactNumber());
                preparedStatement.setString(7,anniverseryDto.getCreatedBy());
                preparedStatement.setTimestamp(8,anniverseryDto.getCreatedTime());
                preparedStatement.executeUpdate();
            }
            catch (ClassNotFoundException | SQLException e) {
                System.err.println(e.getMessage());
            }
            return true;
        }
        return false;
    }

    @SneakyThrows
    @Override
    public Optional<AnniverseryDto> findById(int id) {
        System.out.println("running findById in AnniverseryRepositoryImpl...");
        //JDBC
        // Load & register , Create the Connection , Preppare the Statemtne , Execute the statement
        //URL,UN,PWD
        Class.forName("com.mysql.cj.jdbc.Driver");//optional
        String findByIdSQL="select * from marriage m where m.id=?";
        try(Connection connection
                    = DriverManager.getConnection(MAProperties.URL.getProp(), MAProperties.USER_NAME.getProp(), MAProperties.SECRET.getProp());
            PreparedStatement preparedStatement=connection.prepareStatement(findByIdSQL);) {


            System.out.println("findById :"+findByIdSQL);
            // Statement statement=connection.createStatement();

            preparedStatement.setInt(1,id);

            ResultSet resultSet= preparedStatement.executeQuery();
            System.out.println("resultSet :"+resultSet);
            while(resultSet.next())
            {
                int pk= resultSet.getInt("Id");
                String CouplesName=resultSet.getString("Couples_Name");
                int YearOfTogetherness=resultSet.getInt("Year_Of_Togetherness");
                String Venue=resultSet.getString("Venue");
                int NumberOfGuests=resultSet.getInt("Number_Of_Guests");
                long ContactNumber=resultSet.getLong("Contact_Number");
                 String createdBy = MAProperties.SRUJANA.toString();
                Timestamp createdTime = Timestamp.valueOf(LocalDateTime.now());
                AnniverseryDto  anniverseryDto=new AnniverseryDto(CouplesName,YearOfTogetherness,Venue,NumberOfGuests,ContactNumber,createdBy,createdTime);
                return  Optional.of(anniverseryDto);
            }

        }
        catch (SQLException  exception)
        {
            System.err.println("SQLException in findById "+exception.getMessage());
        }
        return Optional.empty();
    }
}


package com.xworkz.vaathavaran.repository;

import com.xworkz.vaathavaran.dto.WeatherDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class WeatherRepositoryImpl implements WeatherRepository {

    @Override
    public String save(WeatherDto dto) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/weather", "root", "Srujana#2001");

            String query = String.format(
                    "INSERT INTO weather VALUES (0, '%s', '%s', %d, %d, '%s', '%s', %d, %d, %d, '%s', '%s', '%s', '%s', '%s', '%s', %d, now())",
                    dto.getPlace(), dto.getWeather(), dto.getMinTemp(), dto.getMaxTemp(), dto.getCloudy(),
                    dto.getRaining(), dto.getRainMM(), dto.getHumidity(), dto.getWindSpeed(), dto.getSunrise(),
                    dto.getSunset(), dto.getMoonrise(), dto.getMoonset(), dto.getRainStart(), dto.getRainEnd(),
                    dto.getPrecipitation()
            );

            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
            return "Success";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Failed";
    }
}

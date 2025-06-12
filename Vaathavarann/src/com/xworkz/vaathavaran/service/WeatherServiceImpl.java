package com.xworkz.vaathavaran.service;

import com.xworkz.vaathavaran.dto.WeatherDto;
import com.xworkz.vaathavaran.repository.WeatherRepository;
import com.xworkz.vaathavaran.repository.WeatherRepositoryImpl;

public class WeatherServiceImpl implements WeatherService {
    private WeatherRepository repository = new WeatherRepositoryImpl();

    @Override
    public String save(WeatherDto dto) {
        if (dto != null && dto.getPlace().length() > 2 && dto.getWeather().length() > 2) {
            return repository.save(dto);
        }
        return "Validation Failed";
    }
}

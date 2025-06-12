package com.xworkz.vaathavaran.repository;

import com.xworkz.vaathavaran.dto.WeatherDto;

public interface WeatherRepository {
    String save(WeatherDto dto);
}


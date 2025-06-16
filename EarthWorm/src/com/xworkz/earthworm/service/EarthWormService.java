package com.xworkz.earthworm.service;

import com.xworkz.earthworm.dto.EarthWormDto;

import java.util.Optional;

public interface EarthWormService {
    boolean save(EarthWormDto earthWormDto);

    default Optional<EarthWormDto> findById(int id)
    {
        return  Optional.empty();
    }


}

package com.xworkz.earthworm.repo;

import com.xworkz.earthworm.dto.EarthWormDto;

import java.util.Optional;

public interface EarthWormRepo {
    boolean persist(EarthWormDto earthWormDto);

    default Optional<EarthWormDto> findAll (){
        return Optional.empty();
    }
}

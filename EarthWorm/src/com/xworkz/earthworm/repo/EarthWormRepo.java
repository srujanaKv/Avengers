package com.xworkz.earthworm.repo;

import com.xworkz.earthworm.dto.EarthWormDto;

public interface EarthWormRepo {
    boolean persist(EarthWormDto earthWormDto);
}

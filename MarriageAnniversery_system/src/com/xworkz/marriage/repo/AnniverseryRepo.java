package com.xworkz.marriage.repo;

import com.xworkz.marriage.dto.AnniverseryDto;

import java.util.Optional;

public interface AnniverseryRepo {
    boolean persist(AnniverseryDto anniverseryDto);

    default Optional<AnniverseryDto> findById(int id)
    {
        return  Optional.empty();
    }

}

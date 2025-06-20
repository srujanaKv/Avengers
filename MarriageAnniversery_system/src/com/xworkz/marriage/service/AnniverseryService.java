package com.xworkz.marriage.service;

import com.xworkz.marriage.dto.AnniverseryDto;

import java.util.Optional;

public interface AnniverseryService {
    boolean save(AnniverseryDto anniverseryDto);

    default Optional<AnniverseryDto> findById(int id)
    {
        return  Optional.empty();
    }
}

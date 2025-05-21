package com.java.serviceimpl;

import com.java.furniture.dto.LaboratoryDto;
import com.java.service.LaboratoryService;

public class LaboratoryImpl implements LaboratoryService {
    @Override
    public boolean save(LaboratoryDto laboratoryDto) {
        return true;
    }
}

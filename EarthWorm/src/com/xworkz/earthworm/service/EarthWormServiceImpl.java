package com.xworkz.earthworm.service;

import com.xworkz.earthworm.dto.EarthWormDto;
import com.xworkz.earthworm.repo.EarthWormRepo;
import com.xworkz.earthworm.repo.EarthWormRepoImpl;

import java.util.Optional;

public class EarthWormServiceImpl implements EarthWormService {

    public EarthWormServiceImpl() {
        System.out.println("No-args constructor of EarthWormServiceImpl");
    }

    @Override
    public boolean save(EarthWormDto earthWormDto) {
        if (earthWormDto != null) {
            String ScientificName = earthWormDto.getScientificName();
            String BodyShape = earthWormDto.getBodyShape();
            String Color = earthWormDto.getColor();
            boolean n_female = earthWormDto.getN_female();
            int n_lifespan = earthWormDto.getN_lifespan();
            String Food = earthWormDto.getFood();

            if (ScientificName != null && ScientificName.length() >= 3) {
                System.out.println("Scientific Name is valid: " + ScientificName);
            } else {
                System.out.println("Invalid Scientific Name");
                return false;
            }

            if (BodyShape != null && BodyShape.length() >= 3) {
                System.out.println("Body Shape is valid: " + BodyShape);
            } else {
                System.out.println("Invalid Body Shape");
                return false;
            }

            if (Color != null && Color.length() >= 3) {
                System.out.println("Color is valid: " + Color);
            } else {
                System.out.println("Invalid Color");
                return false;
            }


            if (n_female) {
                System.out.println("Gender: Female");
            } else {
                System.out.println("Gender: Male");
            }

            if (n_lifespan > 4) {
                System.out.println("Lifespan is invalid: " + n_lifespan);
            } else {
                System.out.println("valid Lifespan");
                return false;
            }


            if (Food != null && Food.length() >= 3) {
                System.out.println("Food is valid: " + Food);
            } else {
                System.out.println("Invalid Food");
                return false;
            }

            System.out.println("All data is valid. Proceeding to persist...");
            System.out.println("DTO to save: " + earthWormDto);

            EarthWormRepo repo = new EarthWormRepoImpl();
            return repo.persist(earthWormDto);
        }

        System.out.println("DTO is null, cannot save.");
        return false;
    }

    @Override
    public Optional<EarthWormDto> findById(int id) {
        System.out.println("Runnning findById in earthwormserviceimpl");

        if (id > 0) {
            System.out.println("id is valid:"+id);
            EarthWormRepo earthWormRepo = new EarthWormRepoImpl();
           return earthWormRepo.findById(id);
        }
        return EarthWormService.super.findById(id);
    }
}
package com.xworkz.marriage.service;

import com.xworkz.marriage.dto.AnniverseryDto;
import com.xworkz.marriage.repo.AnniverseryRepo;
import com.xworkz.marriage.repo.AnniverseryRepoImpl;

import java.util.Optional;

public class AnniverseryServiceImpl implements AnniverseryService {
   public AnniverseryServiceImpl() {
        System.out.println("no-args constructor");
    }

    @Override

public boolean save(AnniverseryDto anniverseryDto){


if(anniverseryDto!=null){
    String couplesName=anniverseryDto.getCouplesName();
    int YearOfTogetherness=anniverseryDto.getNYearOfTogetherness();
    String Venue=anniverseryDto.getVenue();
    int NumberOfGuests=anniverseryDto.getNNumberOfGuests();
    long ContactNumber=anniverseryDto.getNContactNumber();

       if (couplesName!= null && couplesName.length() >= 3) {
                System.out.println("CouplesName is valid: " + couplesName);
            } else {
                System.out.println("Invalid CouplesName");
                return false;
            }

            if (YearOfTogetherness!= 0) {
                System.out.println("valid: " + YearOfTogetherness);
            } else {
                System.out.println("Invalid");
                return false;
            }

            if (Venue!= null && Venue.length() >= 3) {
                System.out.println("valid: " + Venue);
            } else {
                System.out.println("Invalid");
                return false;
            }

            if (NumberOfGuests!=0) {
                System.out.println("valid: " + NumberOfGuests);
            } else {
                System.out.println("valid");
                return false;
            }

            if (ContactNumber != 0) {
                System.out.println("valid: " + ContactNumber);
            } else {
                System.out.println("Invalid");
                return false;
            }

            System.out.println("All data is valid. Proceeding to persist...");
            System.out.println("DTO to save: " + anniverseryDto);

            AnniverseryRepo repo = new AnniverseryRepoImpl();
            return repo.persist(anniverseryDto);
        }

        System.out.println("DTO is null, cannot save.");
        return false;
    }

    @Override
    public Optional<AnniverseryDto> findById(int id) {//>0
        System.out.println("running findById in AnniverseryImpl...");
        if(id>0)
        {
            System.out.println("id is valid :"+id);// call the repo
            AnniverseryRepo anniverseryRepo=new AnniverseryRepoImpl();
            return anniverseryRepo.findById(id);
        }

        return AnniverseryService.super.findById(id);
    }
}




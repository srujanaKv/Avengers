package com.xworkz.marriage.dto;


import com.xworkz.marriage.constant.MAProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class AnniverseryDto {


    private String couplesName;
    private int nYearOfTogetherness;
    private String venue;
    private int nNumberOfGuests;
    private long nContactNumber;
    private String createdBy = MAProperties.SRUJANA.toString();
    private Timestamp createdTime = Timestamp.valueOf(LocalDateTime.now());

}

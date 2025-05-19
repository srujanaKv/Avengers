package com.java.furniture.dto;

public class FirDto {
    private String complainantName;
    private String firNumber;
    private String crimeType;
    private String policeStation;

    public void setComplainantName(String complainantName) {
        this.complainantName = complainantName;
    }

    public void setFirNumber(String firNumber) {
        this.firNumber = firNumber;
    }

    public void setCrimeType(String crimeType) {
        this.crimeType = crimeType;
    }

    public void setPoliceStation(String policeStation) {
        this.policeStation = policeStation;
    }

    public String getComplainantName() {
        return complainantName;
    }

    public String getFirNumber() {
        return firNumber;
    }

    public String getCrimeType() {
        return crimeType;
    }

    public String getPoliceStation() {
        return policeStation;
    }

    @Override
    public String toString() {
        return "FirDto{" +
                "complainantName='" + complainantName + '\'' +
                ", firNumber='" + firNumber + '\'' +
                ", crimeType='" + crimeType + '\'' +
                ", policeStation='" + policeStation + '\'' +
                '}';
    }
}


package com.java.furniture.dto;

public class LaboratoryDto {
    private String labName;
    private String location;
    private String specialization;
    private String headScientist;

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getHeadScientist() {
        return headScientist;
    }

    public void setHeadScientist(String headScientist) {
        this.headScientist = headScientist;
    }

    @Override
    public String toString() {
        return "LaboratoryDto{" +
                "labName='" + labName + '\'' +
                ", location='" + location + '\'' +
                ", specialization='" + specialization + '\'' +
                ", headScientist='" + headScientist + '\'' +
                '}';
    }
}


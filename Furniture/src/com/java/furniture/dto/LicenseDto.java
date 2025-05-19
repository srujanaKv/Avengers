package com.java.furniture.dto;

public class LicenseDto {
    private String holderName;
    private String licenseNumber;
    private String vehicleType;
    private String expiryDate;

    public void setHolderName(String holderName) { this.holderName = holderName; }
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }
    public void setExpiryDate(String expiryDate) { this.expiryDate = expiryDate; }

    public String getHolderName() { return holderName; }
    public String getLicenseNumber() { return licenseNumber; }
    public String getVehicleType() { return vehicleType; }
    public String getExpiryDate() { return expiryDate; }

    @Override
    public String toString() {
        return "LicenseDto{" +
                "holderName='" + holderName + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }
}


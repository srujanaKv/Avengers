package com.java.furniture.dto;

public class DonationDto {
    private String donorName;
    private String amount;
    private String date;
    private String purpose;

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "DonationDto{" +
                "donorName='" + donorName + '\'' +
                ", amount='" + amount + '\'' +
                ", date='" + date + '\'' +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}


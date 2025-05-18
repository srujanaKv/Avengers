package com.java.furniture.dto;

public class FurnitureDto {
    String brand;
    String size;
    String Modelname;
    String productdetails;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setModelname(String modelname) {
        Modelname = modelname;
    }

    public void setProductdetails(String productdetails) {
        this.productdetails = productdetails;
    }


    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }
    public String getModelname() {
        return Modelname;
    }


    public String getProductdetails() {
        return productdetails;
    }

    @Override
    public String toString() {
        return "FurnitureDto{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", Modelname='" + Modelname + '\'' +
                ", productdetails='" + productdetails + '\'' +
                '}';
    }
}


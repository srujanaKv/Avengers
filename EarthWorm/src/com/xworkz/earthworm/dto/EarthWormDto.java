package com.xworkz.earthworm.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

public class EarthWormDto {
    private int earthId;
    private String ScientificName;
    private String BodyShape;
    private String Color;
    private Boolean n_female;
    private int n_lifespan;
    private String Food;
    //private String createdBy=LoginConstant.SYSTEM.toString();
   // private Timestamp CreatedTime=Timestamp.valueOf(LocalDateTime.now());

    public EarthWormDto(int earthId,String scientificName, String bodyShape, String color,
                   Boolean female, int lifespan, String food) {
        this.earthId=earthId;
        this.ScientificName = scientificName;
        this.BodyShape = bodyShape;
        this.Color = color;
        this.n_female = female;
        this.n_lifespan = lifespan;
        this.Food = food;
    }


    public int getEarthId() {
        return earthId;
    }
    public void setEarthId(int earthId){
        earthId=earthId;
    }

    public String getScientificName() {
        return ScientificName;
    }

    public void setScientificName(String scientificName) {
        ScientificName = scientificName;
    }

    public String getBodyShape() {
        return BodyShape;
    }

    public void setBodyShape(String bodyShape) {
        BodyShape = bodyShape;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Boolean getN_female() {
        return n_female;
    }

    public void setN_female(Boolean n_female) {
        this.n_female = n_female;
    }

    public int getN_lifespan() {
        return n_lifespan;
    }

    public void setN_lifespan(int n_lifespan) {
        this.n_lifespan = n_lifespan;
    }

    public String getFood() {
        return Food;
    }

    public void setFood(String food) {
        Food = food;
    }

    @Override
    public String toString() {
        return "EarthWormDto{" +
                "ScientificName='" + ScientificName + '\'' +
                ", BodyShape='" + BodyShape + '\'' +
                ", Color='" + Color + '\'' +
                ", n_female=" + n_female +
                ", n_lifespan=" + n_lifespan +
                ", Food='" + Food + '\'' +
                '}';
    }
}


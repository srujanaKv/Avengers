package com.xworkz.earthworm.dto;


import lombok.NoArgsConstructor;

public class EarthWormDto {
    private String ScientificName;
    private String BodyShape;
    private String Color;
    private Boolean n_female;
    private int n_lifespan;
    private String Food;

    @NoArgsConstructor
//    public EarthWormDto(String ScientificName, String BodyShape, String Color, Boolean Female, int LifeSpan, String Food) {
//        this.ScientificName = ScientificName;
//        this.BodyShape = BodyShape;
//        this.Color = Color;
//        this.Female = Female;
//        this.LifeSpan = LifeSpan;
//        this.Food = Food;
//    }



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


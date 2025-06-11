package com.java.movie.dto;

public class MoviebookingDto {

    private String name;
    private String email;
    private Long contactNumber;
    private  String moviename;
    private int numberticket;
    private String location;
    private int ticketprice;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;

    }
    public void setEmail(String email){

        this.email=email;
    }
    public Long getContactNumber(){

        return contactNumber;
    }
    public void setContactNumber(Long ContactNumber) {
        this.contactNumber=contactNumber;
    }
    public String getMoviename(){

        return moviename;
    }
    public void setMoviename(String Moviename){

        this.moviename=moviename;
    }
    public int getNumberticket(){
        return numberticket;
    }
    public void setNumberticket(int Numberticket){
        this.numberticket=numberticket;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(){
        this.location=location;
    }
    public int getTicketprice(){
        return ticketprice;
    }
    public void setTicketprice(int ticketprice){
        this.ticketprice=ticketprice;
    }
}


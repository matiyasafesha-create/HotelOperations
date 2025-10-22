package com.pluralsight;

public class Room {
    private int numberofbeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room (int numberofbeds, double price){
        this.numberofbeds = numberofbeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;


    }

    public int getnumberofbeds(){
        return numberofbeds;

    }

    public double getprice(){
        return price;
    }

    public boolean isoccupied(){
        return occupied;
    }

    public boolean isdirty (){
        return dirty;
    }

    public boolean isavailable(){
        return !isoccupied() && !isdirty();
    }


    public void checkIn(){
        this.occupied = true;
        this.dirty = true;
    }

    public void  checkOut(){
        this.occupied = false;
    }

    public void  cleanRoom(){
        this.dirty = false;
    }













}

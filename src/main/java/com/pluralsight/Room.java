package com.pluralsight;

public class Room {
    private int numberofbeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room (int numberofbeds, double price, boolean occupied, boolean dirty, boolean available ){
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

    public void checkIn (){
        if (!isavailable()) {
            System.out.println("Room not available to be checked-in");
        }else {
            occupied = true;
            dirty = true;
            System.out.println("Room is occupied by a guest and dirty");
        }
    }

    public void checkOut(){
        if(!isoccupied()){
            System.out.println("Guest has left checked-out");
        }else {
            occupied = false;
            System.out.println("guest left room needs cleaning");
        }
    }

    public void cleanRoom(){
        if(!dirty){
            System.out.println("Room is Available to the next guest ");
        }else {
            dirty = false;
            System.out.println("Room is cleaned");
        }
    }









}

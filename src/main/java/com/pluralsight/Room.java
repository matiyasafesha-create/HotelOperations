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

    public boolean setoccupied (){
        return occupied;
    }
public boolean setdirty(){
        return dirty;
}



}

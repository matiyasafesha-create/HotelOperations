package com.pluralsight;

public class Reservation {
    private String roomtype;
    private double price;
    private int numberofnights;
    private boolean weekend;


    public Reservation(String roomtype, double price, int numberofnights, boolean weekend) {
        this.roomtype = roomtype;
        this.price = price;
        this.numberofnights = numberofnights;
        this.weekend = weekend;

    }

    public String Roomtype() {
        if (roomtype.equals("King")) {
            price = 139.00;
        } else if (roomtype.equals("double")) {
            price = 124.00;
        } else {
            price = 0;
        }
return roomtype;
    }

    public boolean isWeekend(){
        if(isWeekend())

}

















}

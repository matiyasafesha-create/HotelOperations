package com.pluralsight;

public class Reservation {
//    private String roomtype;
//    private double price;
//    private int numberofnights;
//    private boolean weekend;


    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;




//    public Reservation(String roomtype, double price, int numberofnights, boolean weekend) {
//        this.roomtype = roomtype;
//        this.price = price;
//        this.numberofnights = numberofnights;
//        this.weekend = weekend;
//
//    }
//
//    public void setpricepernight() {
//        if (roomtype.equals("king")) {
//            price = 139.00;
//        } else if (roomtype.equals("double")) {
//            price = 124.00;
//        } else {
//            price = 0;
//        }
//        if (weekend){
//            price *= 1.10;
//    }
//}
public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
    this.roomType = roomType.trim(); //Either "King" or "Double"

    if (roomType.toLowerCase().equals("king")) {
        this.price = 139.00;
    } else {
        this.price = 124.00;
    }

    this.numberOfNights = numberOfNights;
    this.isWeekend = isWeekend;
}

public double getPrice() {
    return price;
}

public String getRoomType() {
    return roomType;
}

public void setRoomType(String roomType) {
    this.roomType = roomType;

    if (roomType.toLowerCase().equals("king")) {
        this.price = 139.00;
    } else  {
        this.price = 124.00;
    }
}

public int getNumberOfNights() {
    return numberOfNights;
}

public void setNumberOfNights(int numberOfNights) {
    this.numberOfNights = numberOfNights;
}

public boolean isWeekend() {
    return isWeekend;
}

public void setWeekend(boolean weekend) {
    isWeekend = weekend;
}

public double getReservationTotal() {
    double upCharge = this.price; //upCharge stays the same when it's not a weekend reservation

    if (this.isWeekend) {
        upCharge *= 1.1;
    }

    return this.numberOfNights * upCharge;
}
}

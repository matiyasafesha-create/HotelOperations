package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name, department;
    private double payRate, hoursWorked;
    private Double starttime, endtime;
    private boolean punchedIn;


    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked, double starttome, double endtime, boolean punchedIn) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.starttime = starttome;
        this.endtime = endtime;
        this.punchedIn = punchedIn;
    }

    public double getTotalPay() {
        double regularPay = this.payRate * this.getRegularHours();

        double overtimePay = (this.payRate * 1.5) * this.getOvertimeHours();

        return regularPay + overtimePay;
    }

    //Will return 40 or less, based on their hours worked
    public double getRegularHours() {
        if (this.hoursWorked <= 40) {
            return this.hoursWorked;
        } else {
            return 40;
        }
    }

    //Will hours worked over 40
    public double getOvertimeHours() {
        if (this.hoursWorked > 40) {
            return this.hoursWorked - 40;
        } else {
            return 0;
        }
    }

    public void punchedIn(double time){
        this.starttime = time;
        System.out.println(name + "Clocked-In At" + time);

    }

    public void punchedOut(double time){
        this.endtime = time;
        System.out.println(name + "Clocked-Out At" + time);

    }


    public void punchtimecard(double time){
        if (punchedIn )
            starttime = time;
        punchedIn = false;
        System.out.println(name + " Punched - In At" + time);
    }else {

    }















}

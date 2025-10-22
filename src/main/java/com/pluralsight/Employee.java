package com.pluralsight;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name, department;
    private double payRate, hoursWorked;
    private Double starttime, endtime;



    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked, double starttime, double endtime) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.starttime = starttime;
        this.endtime = endtime;

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

    public void punchedIn(double time) {
        this.starttime = time;

    }


    public void punchOut(double time){
        this.hoursWorked += (time - this.starttime);
        this.starttime = (double) 0;
    }


    public void punchTimeCard(double time) {

        if (this.starttime > 0) { //punch out
            this.hoursWorked += (time - this.starttime);
            this.starttime = (double) 0;
        } else {
            this.starttime = time;
        }
    }

    public void punchIn(){
        LocalTime now = LocalTime.now();
        double converttime = now.getHour() + (now.getMinute()/ 60.0);
        this.starttime = converttime;

    }

    public void punchOut (){
        LocalTime now = LocalTime.now();
        double converttime = now.getHour() + (now.getMinute()/ 60.0); // time we converted
        double workedhours = converttime - this.starttime;
        this.hoursWorked += workedhours;
        this.starttime = 0.0;   // set it back to 0 after punching out
    }

}

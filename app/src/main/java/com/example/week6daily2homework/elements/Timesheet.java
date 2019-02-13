package com.example.week6daily2homework.elements;

public class Timesheet {
    private double payrate;
    private boolean isHourly;
    private int hoursWorked;

    public Timesheet() {
    }

    public Timesheet(double payrate, boolean isHourly, int hoursWorked) {
        this.payrate = payrate;
        this.isHourly = isHourly;
        this.hoursWorked = hoursWorked;
    }

    public double getPayrate() {
        return payrate;
    }

    public void setPayrate(double payrate) {
        this.payrate = payrate;
    }

    public boolean isHourly() {
        return isHourly;
    }

    public void setHourly(boolean hourly) {
        isHourly = hourly;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}

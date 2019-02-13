package com.example.week6daily2homework.elements;

import java.util.HashMap;

public class CalculatePayroll {
    Employee employee;
    Name name;
    Address address;
    Timesheet timesheet;
    String nameData, addressData;
    int payData;
    public HashMap<String, String> map = new HashMap<>();

    public CalculatePayroll() {
    }

    public HashMap<String,String> calculatePayroll(Employee employee) {
        this.employee = employee;
        name = employee.getName();
        address = employee.getAddress();
        timesheet = employee.getTimesheet();
        String nameData = name.getFirst() + " " + name.getLast();
        String addressData = address.getCity() + " " + address.getState() + " " + address.getPostalCode();
        map.put("name", nameData);
        map.put("address", addressData);
        map.put("pay", Double.toString(timesheet.getHoursWorked() * timesheet.getPayrate()));
        return map;
    }




}

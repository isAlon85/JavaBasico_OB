package com.company;

public abstract class SmartDevice {

    String brand, model, colour;
    double screenWidth;
    int year;

    public SmartDevice(){

    }

    public SmartDevice(String brand, String model, String colour, double screenWidth, int year) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.screenWidth = screenWidth;
        this.year = year;
    }
}

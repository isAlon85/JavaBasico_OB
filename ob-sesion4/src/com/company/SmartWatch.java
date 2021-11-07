package com.company;

public class SmartWatch extends SmartDevice {

    boolean gps, heartRateMonitor, sportType;
    String bandType;

    public SmartWatch() {

    }

    public SmartWatch(String brand, String model, String colour, double screenWidth, int year, boolean gps, boolean heartRateMonitor, boolean sportType, String bandType) {
        super(brand, model, colour, screenWidth, year);
        this.gps = gps;
        this.heartRateMonitor = heartRateMonitor;
        this.sportType = sportType;
        this.bandType = bandType;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", screenWidth=" + screenWidth +
                ", year=" + year +
                ", gps=" + gps +
                ", heartRateMonitor=" + heartRateMonitor +
                ", sportType=" + sportType +
                ", bandType='" + bandType + '\'' +
                '}';
    }
}

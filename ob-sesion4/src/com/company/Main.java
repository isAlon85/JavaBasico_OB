package com.company;

public class Main {

    public static void main(String[] args) {

        SmartDevice device1 = new SmartPhone();
        device1.brand = "Brand1";
        device1.model = "Premium";
        device1.year = 2021;

        SmartDevice device2 = new SmartPhone("Brand2", "Basic", "Red", 5.5, 2020, true, true, 4, 2, 7.0);

        SmartDevice device3 = new SmartWatch();
        device3.brand = "Brand2";
        device3.model = "Premium";
        device3.year = 2019;
        device3.colour = "Black";

        SmartDevice device4 = new SmartWatch("Brand1", "Basic", "White", 1.0, 2021, false, false, false, "Rubber");

        System.out.println(device1);
        System.out.println(device2);
        System.out.println(device3);
        System.out.println(device4);

    }
}

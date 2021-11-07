package com.company;

public class SmartPhone extends SmartDevice {

    boolean headphonesPort, frontCamera;
    int keysNumber, cameraNumber;
    double cameraMP;

    public SmartPhone() {

    }

    public SmartPhone(String brand, String model, String colour, double screenWidth, int year, boolean headphonesPort, boolean frontCamera, int keysNumber, int cameraNumber, double cameraMP) {
        super(brand, model, colour, screenWidth, year);
        this.headphonesPort = headphonesPort;
        this.frontCamera = frontCamera;
        this.keysNumber = keysNumber;
        this.cameraNumber = cameraNumber;
        this.cameraMP = cameraMP;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", screenWidth=" + screenWidth +
                ", year=" + year +
                ", headphonesPort=" + headphonesPort +
                ", frontCamera=" + frontCamera +
                ", keysNumber=" + keysNumber +
                ", cameraNumber=" + cameraNumber +
                ", cameraMP=" + cameraMP +
                '}';
    }
}

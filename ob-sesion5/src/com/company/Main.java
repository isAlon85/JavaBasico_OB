package com.company;

public class Main {

    public static void main(String[] args) {

        CarCRUD carCrud = new CarCRUDImpl();

        carCrud.save();
        carCrud.findAll();
        carCrud.delete();

    }
}

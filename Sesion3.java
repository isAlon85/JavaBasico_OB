package com.company;

public class Sesion3 {

    public static void main(String[] args) {
        //Creamos un array de cadenas de texto con los nombres
        String[] names = {"Pedro", "Pablo", "Luis", "Juan", "Gemma"};

        //Creamos un bucle for para concatenar los nombres en la misma línea separados por espacios
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}

package com.company;

import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;

public class ProgramaEleccion {

    public static void main(String[] args) throws IOException {

        int arrayL = 0;
        boolean flagLenght = false;
        System.out.println("Indica la cantidad de números a meter en un array: ");
        try {
            Scanner scanner = new Scanner(System.in);
            arrayL = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("No has introducido un número entero");
            flagLenght = true;
        }

        if (!flagLenght) {
            PrintStream out = new PrintStream("array.txt");

            int[] array1 = new int[arrayL];
            System.out.println("Rellena el array con enteros: ");
            for (int i = 0; i < array1.length; i++) {
                try {
                    Scanner scanner1 = new Scanner(System.in);
                    array1[i] = scanner1.nextInt();
                    out.println(array1[i]);
                } catch (Exception e) {
                    System.out.println("No has introducido un número entero");
                    flagLenght = true;
                }
            }

            if (!flagLenght) {
                out.close();
                System.out.println("Los enteros del array se han exportado al fichero: array.txt");
                System.out.println("Mapea nombres a los enteros anteriores: ");
                HashMap<String, Integer> map = new HashMap<>();
                for (int i = 0; i < array1.length; i++) {
                    System.out.println("Introduce nombre a mapear en la posición " + i + ": ");
                    Scanner scanner2 = new Scanner(System.in);
                    String name = scanner2.nextLine();
                    int numberInt = array1[i];
                    map.put(name, numberInt);
                }
                System.out.println("El mapa que has creado es: ");
                System.out.println(map);
            }
        }
    }
}

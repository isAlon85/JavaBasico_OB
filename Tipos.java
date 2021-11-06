package com.company;

public class Tipos {

    /* En este método main vamos a declarar y printar los tipos de variables de la Sesión 1
    Hemos creado el proyecto desde cero, después el paquete "com.company" y la clase "Tipos.java"
     */
    public static void main(String[] args) {
        // 1 Numéricos

        // 1.1 Enteros
        byte variable1 = 5;
        short variable2 = 15;
        int variable3 = 687;
        long variable4 = 72034;
        System.out.println("El valor de la variable tipo byte es: " + variable1);
        System.out.println("El valor de la variable tipo short es: " + variable2);
        System.out.println("El valor de la variable tipo int es: " + variable3);
        System.out.println("El valor de la variable tipo long es: " + variable4);

        // 1.2 Decimales
        float variable5 = 5.7f;
        double variable6 = 1523.64d;
        System.out.println("El valor de la variable tipo float es: " + variable5);
        System.out.println("El valor de la variable tipo double es: " + variable6);

        // 2 Booleanos
        boolean variable7 = false;
        System.out.println("El valor de la variable tipo boolean es: " + variable7);

        // 3 Texto
        char variable8 = 'b';
        String variable9 = "OpenBootcamp";
        System.out.println("El valor de la variable tipo char es: " + variable8);
        System.out.println("El valor de la variable tipo String es: " + variable9);
    }
}

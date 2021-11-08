package com.company;

import java.util.Scanner;

public class Excepciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe dos números para que se dividan entre ellos: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            System.out.println(DividePorCero(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }

    private static int DividePorCero(int a, int b) throws ArithmeticException{
        return a / b;
    }
}

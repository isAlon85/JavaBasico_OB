package com.company;

import java.util.Scanner;

public class CadenaReves {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String texto;
        System.out.print("Introduzca texto: ");
        texto = sc.nextLine();
        System.out.println("La cadena al revés es: " + reverse(texto));
    }

    public static String reverse(String texto) {
        StringBuilder reverseTexto = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            reverseTexto.insert(0, texto.charAt(i));
        }
        return reverseTexto.toString();
    }
}

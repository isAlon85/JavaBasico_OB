package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListEx {

    public static void main(String[] args) {

        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("Word1");
        lista1.add("Word2");
        lista1.add("Word3");
        lista1.add("Word3");

        LinkedList<String> lista2 = new LinkedList<>(lista1);

        System.out.println("La lista del ArrayList de cadenas es:");
        for (String s : lista1) {
            System.out.println(s);
        }

        System.out.println("\nLa lista del LinkedList copiado del ArrayList anterior es:");
        for (String s : lista2) {
            System.out.println(s);
        }

        ArrayList<Integer> lista3 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista3.add(i+ 1);
        }
        System.out.println("\nEl ArrayList de enteros es: " + lista3);

        System.out.print("\nEl ArrayList de enteros con los números pares eliminados es: [ ");
        for (int i = 0; i < lista3.size(); i++) {
            int j = lista3.get(i);
            if (j % 2 == 0) {
                lista3.remove(i);
                i--;
            } else {
                System.out.print(j + " ");
            }
        }
        System.out.print("]");

    }
}

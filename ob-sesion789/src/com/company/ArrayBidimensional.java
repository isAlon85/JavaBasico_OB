package com.company;

public class ArrayBidimensional {

    public static void main(String[] args) {

        int[][] enteros = {
                { 0, 3, 2 ,7 ,9 },
                { 4, 7, 6, 5, 1 }
        };

        for (int i = 0; i < enteros.length; i++) {

            for (int j = 0; j < enteros[i].length; j++){
                System.out.println("La posición es: Fila-> " + i + " Columna-> " + j);
                System.out.println("El valor de esta posición es: " + enteros[i][j]);
            }

        }
    }
}

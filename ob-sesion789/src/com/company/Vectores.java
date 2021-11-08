package com.company;

import java.util.Vector;

public class Vectores {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector();
        vector.add(5);
        vector.add(1); // Elemento que se va a eliminar
        vector.add(8); // Elemento que se va a eliminar
        vector.add(8);
        vector.add(7);

        vector.remove(1);
        vector.remove(2);

        System.out.println(vector);

        /*
        Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos
        1000 elementos para ser añadidos al mismo

        El problema es el consumo de recursos ya que la capacidad por defecto es 10 y se amplia en 10 posiciones nuevas, cada vez que se llena
        el array subyacente se copia a otro con más capacidad, y cuando se vuelve a llenar, vuelve a copiarse a
        otro array con capacidad ampliada, con lo que consume bastantes recursos de copiarse
        una y otra vez hasta llegar a los elementos añadidos
         */

    }
}

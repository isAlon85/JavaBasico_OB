package com.company;

public class Sesion2 {

    public static void main(String[] args) {
        double precio = 44;
        double precioIva = getPrice(precio);
        double totalIva = precioIva - precio;
        System.out.println("El precio del producto sin IVA incluido es: " + precio + " €");
        System.out.println("El precio del producto con IVA incluido es: " + precioIva + " €");
        System.out.println("El total del IVA es: " + totalIva + " €");
    }

    private static double getPrice(double precio) {
        double iva = 1.21;
        return precio * iva;
    }
}

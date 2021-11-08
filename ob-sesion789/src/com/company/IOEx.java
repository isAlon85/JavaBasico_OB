package com.company;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class IOEx {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file to copy: ");
        String fileIn = scanner.nextLine(); // En este caso de prueba "fichero1.txt"
        System.out.println("Enter the new file's name: ");
        String fileOut = scanner.nextLine();
        copyFile(fileIn, fileOut);
        
    }

    private static void copyFile(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] data = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(data);
            out.close();
        } catch (Exception e) {
            System.out.println("Error al copiar el fichero: " + e.getMessage());
        }
    }
}

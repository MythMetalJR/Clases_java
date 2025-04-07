/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.clase_4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Clase_4 {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner e = new Scanner(System.in);
        System.out.println("Add the first number");
        a = e.nextInt();
        System.out.println("Add the second number");
        b = e.nextInt();
        // int suma= a+b;
        System.out.println("What operation do you realices?");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicar");
        c = e.nextInt();
        switch (c) {
            case 1:
                int suma = a + b;
                System.out.println("La suma de los dos numeros es: " + suma);
                break;
            case 2:
                int resta = a - b;
                System.out.println("La resta de los dos numeros es: " + resta);
                break;
            case 3:
                int multiplicacion = a * b;
                System.out.println("La multiplicacion de los dos numeros es: " + multiplicacion);
                break;
        }

    }
}

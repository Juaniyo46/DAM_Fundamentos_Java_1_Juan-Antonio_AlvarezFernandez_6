package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // Abrimos la variable escaner para la introducción de datos mediante teclado.
        Scanner sc = new Scanner(System.in);

        //Información para el usuario
        System.out.println("En este ejercicio el usuario introducirá dos números enteros y el programa dirá si son multipolos o no");

        //Pedimos al usuario que introduzca el primer número
        System.out.println("Introduzca el primer número entero");
        //Guardamos en la variable el primer valor
        int num1 = sc.nextInt();
        //Pedimos al usuario que introduzca el segundo número
        System.out.println("Introduzca el segundo número entero");
        // Guardamos en la variable num2 el valor introducido
        int num2 = sc.nextInt();

        //Se hacen las comparaciones para indicar si es multiplo o no
        if (num1%num2==0) {
            System.out.printf("El número %d es multiplo de %d",num1,num2);
        } else
            System.out.printf("El número %d no es multiplo de %d",num1,num2);
    }

}

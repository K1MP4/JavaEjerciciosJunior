package com.company;

import java.util.Scanner;

public class simulacroExamen610 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        //Prueba de Examen 6 de Octubre de 2023

        System.out.println("EJERCICIO 1");
        /*1Cree un programa que lea los siguientes datos (SOLO LOS SIGUIENTES) de un usuario:
    - Nombre
    - Año de nacimiento
    - Nombre de contacto 1
    - Nombre de contacto 2

        Imprímalos e imprima también su edad (será una estimación según su año de nacimiento).
        Indique por pantalla si el usuario es menor de edad con el siguiente formato:
        Menor de edad? true (o false en su caso).
         */


        System.out.print("Nombre: " );
        String nombre = scan.next();
        System.out.print("Año de nacimiento: " );
        int anoNac = scan.nextInt();
        System.out.print("Nombre de contacto 1: " );
        String contac1 = scan.next();
        System.out.print("Nombre de contacto 2: " );
        String contac2 = scan.next();
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su año de nacimiento es " + anoNac);
        System.out.println("Su edad es: " + (2023 - anoNac));
        boolean menor = (2023 - anoNac)<=18;
        System.out.println("Menor de edad? " + menor);
        System.out.println("El nombre de su primer contacto es: " + contac1);
        System.out.println("El nombre de su segundo contacto es: " + contac2);

        //2
        System.out.println("\nEJERCICIO 2");
        /*Cree un programa para que el usuario trate de adivinar un número entre 1 y 5.
        Para ello, cree una variable y guarde en ella un número entre 1 y 5 (elija usted
        el que quiera). A continuación, pida por teclado un número al usuario.
        Si el número que introduce el usuario coincide con el suyo, debe imprimir por pantalla:
        Victoria? true
        En caso contrario, debe imprimirse:
        Victoria? false
         */

        int numSecr = 4;
        System.out.print("Elija un número entero del 1 al 5: ");
        int numEleg = scan.nextInt();
        boolean victoria = (numSecr == numEleg);
        System.out.println("Victoria? " + victoria);



        //3
        System.out.println("\nEJERCICIO 3");
        /*Almacene en una variable del tipo adecuado la primera letra de su nombre. Dicha variable
        debe ser capaz de almacenar una letra únicamente.
        Pida al usuario un número entero, y sume dicho número a la letra almacenada.
        Imprima por pantalla:
        1- La letra resultante.
        2- El código de la letra resultante.
         */
        char letra = 'A';
        System.out.print("Deme un número entero: ");
        int numEnt = scan.nextInt();
        int codResul = letra + numEnt;
        char letResul = (char) codResul;
        System.out.println(letResul);
        System.out.println(codResul);



    }
}

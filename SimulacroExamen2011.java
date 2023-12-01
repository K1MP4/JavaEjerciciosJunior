package com.company;

import java.util.Scanner;

public class SimulacroExamen2011 {
    public static void main(String[] agrs) {
        Scanner scan = new Scanner(System.in);


        // Examen 20 de Noviembre de 2023

        //Ejercicio1
      
        System.out.println("\n Ejercicio 1");
        int genero = 0;
        int clase = 0;
        System.out.print("Género de tu PJ (1 hombre, 2 mujer): ");
        genero = scan.nextInt();
        if(genero == 1){
            System.out.println("Ha elegido hombre");
            System.out.print("Elija su clase 1 Buscavidas, 2 Guerrero, 3 Mago: ");
            clase = scan.nextInt();
            switch(clase){
                case 1:{
                    System.out.println("Ha elegido Buscavidas como clase!");
                    break;}
                case 2:{
                    System.out.println("Ha elegido Guerrero como clase");
                    break;
                }
                case 3:{
                    System.out.println("Ha elegido Mago como clase");
                    break;
                }
                default:{System.out.println("Ha elegido Buscavidas como clase!");
                    break;
                }
            }
        }
        else{
            System.out.println("Ha elegido Mujer!");
            System.out.print("Elija su clase 1 Asesina, 2 Druida, 3 Amazona: ");
            clase = scan.nextInt();
            switch(clase){
                case 1:{
                    System.out.println("Ha elegido Asesina como clase!");
                    break;}
                case 2:{
                    System.out.println("Ha elegido Druida como clase");
                    break;
                }
                case 3:{
                    System.out.println("Ha elegido Amazona como clase");
                    break;
                }
                default:{System.out.println("Ha elegido Asesina como clase!");
                    break;
                }
        }
    }


        System.out.println("\n Ejercicio 2");
       int respuesta;
        do{
            System.out.print("introduce un número entre 0 y 4: ");
            respuesta = scan.nextInt();
            switch(respuesta){
                case 0:{
                    System.out.println("Examen finalizado con éxito!");
                    break;
                }
                case 1:{
                    System.out.println("Ejercicio 1 finalizado");
                    break;
                }
                case 2:{
                    System.out.println("Ejercicio 2 finalizado");
                    break;
                }
                case 3:{
                    System.out.println("Ejercicio 3 finalizado");
                    break;
                }
                case 4:{
                    System.out.println("Ejercicio 4 finalizado");
                    break;
                }
                default{
                System.out.println("vuelva a intentarlo");
                }
            }
        }while(respuesta!=0);

         
        System.out.println("\n Ejercicio 3");
        System.out.print("Introduzca el tamaño del triángulo: ");
        int n = scan.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.println("");
            for (int j = 1; j <=i ; j++) {
                if (j==1 || j==i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("- ");
                }

            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.println("");
            for (int j = 1; j <= n - i; j++) {
                if (j==1 || j==n-i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("- ");
                }
            }
    }
    }}

package com.company;

import java.util.Scanner;

public class examen {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Examen Noviembre 2023 FOR WHILE IF SWITCH 

        System.out.println("\n Ejercicio 1");
        /*Crear dos variables de tipo entero, de nombres variable1 y variable2, y asignar a
        cada una un valor leído por teclado mediante un escáner. A continuación,
        modificarlas como sea necesario para que variable1 tenga almacenado el
        mayor de los valores, y variable2 el menor. Imprimir por pantalla el nombre y
        valor de ambas variables antes de terminar.
        */
        System.out.print("Introduzca la variable1: ");
        int variable1 = scan.nextInt();
        System.out.print("Introduzca la variable2: ");
        int variable2 = scan.nextInt();
        int guardado;
        if (variable1 < variable2) {
            guardado = variable1;
            variable1 = variable2;
            variable2 = guardado;
        }
        System.out.println("La variable 1, que es la mayor, es " + variable1);
        System.out.println("La variable 2, que es la menor, es " + variable2);


        System.out.println("\n Ejercicio 2");
        /*Desarrolla un programa en Java para gestionar las calificaciones de estudiantes
        en una materia. El programa debe permitir ingresar las calificaciones de varios
        estudiantes de manera interactiva, de manera que estas calificaciones no
        pueden ser inferiores a 0 o superiores a 10.
        Cada estudiante tiene asociados los siguientes datos: nombre, apellido y
        calificación. Si introduce una calificación fuera de los valores mencionados
        anteriormente (de 0 a 10), el programa debe pedir nuevamente la calificación del
        alumno que está introduciendo, hasta que introduzca un valor válido. Una vez
        introducido un valor válido, el programa debe mostrar el nombre del estudiante
        con su nota, con el formato “El estudiante nombre apellido tiene una
        calificación de nota”, sustituyendo las palabras en negrita por los valores
        introducidos. Tras mostrar el resultado, el programa debe preguntar al usuario si
        desea ingresar las calificaciones de otro estudiante. Si la respuesta es
        afirmativa, se debe repetir el proceso; de lo contrario, el programa debe imprimir
        un resumen con el número de alumnos que hay en la clase, así como el
        promedio de calificaciones de la clase.*/
        int nota;
        int continuar;
        int cont = 0;
        float media = 0;
        do {
            System.out.print("Introduzca el nombre del alumno: ");
            String nombre = scan.next();
            System.out.print("Introduzca el apellido del alumno: ");
            String apellido = scan.next();
            do {
                System.out.print("Introduce la calificación del alumno " + nombre + " " + apellido + ": ");
                nota = scan.nextInt();
            } while (nota < 0 || nota > 10);
            System.out.println("El estudiante " + nombre + " " + apellido + " " + "tiene una calificación de " + nota);
            System.out.println("Si desea introducir la calificación de otro estudiante introduzca 1");
            System.out.print("Si desea salir del programa introduzca cualquier otro valor: ");
            continuar = scan.nextInt();
            cont++;
            media = media + nota;
        } while (continuar == 1);
        System.out.println("El número de alumnos introducido es " + cont);
        System.out.println("El promedio de notas es " + media / cont);




        System.out.println("\n Ejercicio 3");
        /*Se quiere crear un calendario electrónico que lea por pantalla un número de mes
        e imprima como salida una representación visual de los días de dicho mes,
        repartidos entre semanas. Por ejemplo, si se lee el número 1, correspondiente al
        mes de enero (31 días), se visualizará lo siguiente:
        TAB TAB “Enero”
        Lu Ma Mi Ju Vi Sa Do
        01 02 03 04 05 06 07
        08 09 10 11 12 13 14
        15 16 17 18 19 20 21
        22 23 24 25 26 27 28
        29 30 31
        Los meses que tienen 31 días son: enero, marzo, mayo, julio, agosto, octubre,
        diciembre. Los meses que tienen 30 días son: abril, junio, septiembre,
        noviembre. El mes de febrero tiene 28 días. Las letras TAB representan una
        tabulación.
        */
        int mes;
        String nombreMes = "";
        int dias = 0;
        int semanas = 0;
        do {
            System.out.print("Introduzca el número del mes (del 1 al 12): ");
            mes = scan.nextInt();
        } while (mes < 1 || mes > 12);
        switch (mes) {
            case 1: {
                nombreMes = "Enero";
                dias = 31;
                semanas = 5;
                break;
            }
            case 2: {
                nombreMes = "Febrero";
                dias = 28;
                semanas = 4;
                break;
            }
            case 3: {
                nombreMes = "Marzo";
                dias = 31;
                semanas = 5;
                break;
            }
            case 4: {
                nombreMes = "Abril";
                dias = 30;
                semanas = 5;
                break;
            }
            case 5: {
                nombreMes = "Mayo";
                dias = 31;
                semanas = 5;
                break;
            }
            case 6: {
                nombreMes = "Junio";
                dias = 30;
                semanas = 5;
                break;
            }
            case 7: {
                nombreMes = "Julio";
                dias = 31;
                semanas = 5;
                break;
            }
            case 8: {
                nombreMes = "Agosto";
                dias = 31;
                semanas = 5;
                break;
            }
            case 9: {
                nombreMes = "Septiembre";
                dias = 30;
                semanas = 5;
                break;
            }
            case 10: {
                nombreMes = "Octubre";
                dias = 31;
                semanas = 5;
                break;
            }
            case 11: {
                nombreMes = "Noviembre";
                dias = 30;
                semanas = 5;
                break;
            }
            case 12: {
                nombreMes = "Diciembre";
                dias = 31;
                semanas = 5;
                break;
            }
            default: {
                nombreMes = "";
            }
        }

        System.out.println();
        int contDias = 1;
        System.out.println("        " + nombreMes);
        System.out.println();
        System.out.println("Lu Ma Mi Ju Vi Sa Do");
        for (int i = 0; i < semanas; i++) {
            System.out.println();
            for (int j = 0; j < 7; j++) {
                if (contDias < 10) {
                    System.out.print("O" + contDias + " ");
                } else if (contDias > dias) {
                    break;
                } else {
                    System.out.print(contDias + " ");
                }
                contDias++;
            }
        }
    }
}
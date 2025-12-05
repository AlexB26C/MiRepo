package ejerciciosprogramacionlibro.Tema5;

import java.util.Scanner;

public class EjercicioProfe {
    /*Declarar un array de 6 elementos de tipo int, crearlo e inicializarlo con los valores que 
    nos de el usuario. Una vez relleno mostrar su contenido en pantalla.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int array1[] = new int [6];
        
        System.out.println("****Introducion de valores****");
        /*Bucle para que pida segun la posicion del array el numero que quiera meter 
        dentro del array*/
        for (int i = 0; i < array1.length; i++){
            System.out.print("Dime un numero entero la posicion " + i + " del array: ");
            array1[i] = sc.nextInt();
        }
        
        System.out.println("");
        System.out.println("****Valores de las posiciones del array****");
        
        //Bucle para mostrar cada valor de las posiciones del array creado antes.
        for (int i = 0; i < array1.length; i++){
            System.out.println("El numero de la posicion " + i + " es: " + array1[i]);
        }
    }
}

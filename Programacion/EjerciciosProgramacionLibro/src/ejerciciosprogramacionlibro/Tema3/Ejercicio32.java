package ejerciciosprogramacionlibro.Tema3;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        double media;
        int edad, suma = 0, numAlu = 0, numAlu18 = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime la edad de un alumno: ");
        edad = sc.nextInt();
        
        while (edad >= 0){
            if (edad >= 18){
                numAlu18 = numAlu18 + 1;
            } 
            suma = suma + edad;
            numAlu = numAlu + 1;
            System.out.print("Dime la edad del siguiente alumno o pon un numero negativo para terminar el programa: ");
            edad = sc.nextInt();
        }
        media = (double) suma/numAlu;
        System.out.println("La suma de todas las cantidades introducidas es: " + suma);
        System.out.println("La edad media es: " + media);
        System.out.println("El numero de alumnos es: " + numAlu);
        System.out.println("El numero de alumnos mayores de edad es: " + numAlu18);
    }
}

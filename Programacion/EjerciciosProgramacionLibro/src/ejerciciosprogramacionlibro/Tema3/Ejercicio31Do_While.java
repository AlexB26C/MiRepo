package ejerciciosprogramacionlibro.Tema3;

import java.util.Scanner;

public class Ejercicio31Do_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esPar, esPositivo;
        System.out.print("Introduzca un numero: ");
        int num = sc.nextInt();
        if (num != 0) {
            do  {
                if (num!=0) {
                    esPar = (num % 2 == 0);
                    esPositivo = num >= 0;

                    System.out.println(num + " es par?: " + esPar); 
                    System.out.println(num + " es positivo?: " + esPositivo);
                    System.out.println("El cuadrado de " + num + " es: " + num * num);

                    System.out.print("Dime otro numero o pon 0 para salir del programa: ");
                    num = sc.nextInt();
                } 
            } while (num != 0);
        }
    }
}

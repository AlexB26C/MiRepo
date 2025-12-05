package EjerciciosHojaEjercicios;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el primer numero del rango: ");
        int inicio = sc.nextInt();
        System.out.print("Dime el segundo numero del rango: ");
        int fin = sc.nextInt();

        while (inicio < 2 || fin < inicio) {
            if (inicio < 2) {
                System.out.print("Has puesto que el inicio del rango sea 0 o un numero negativo pon uno que sea 1 o mayor: ");
                inicio = sc.nextInt();
            } else {
                System.out.print("Has puesto que el final del rango sea menor que el inicio pon un numero mayor: ");
                fin = sc.nextInt();
            }
        }

        // numR --> Es el numero de control del rango de numeros seleccionado
        //numD --> Es el numero con el que se van comprobando los divisores de los numeros del rango
        //esPrimo --> Variable booleana que comprueba si el numero es primo o no
        // Incrementa el numero a comprobar desde el primer numero del rango hasta el ultimo
        for (int numR = inicio; numR <= fin; numR++) {
            boolean esPrimo = true;

            // Comprueba que el numero es primo incrementando el numero por el que se dividen los numeros del rango
            for (int numD = 2; numD < numR; numD++) {
                if (numR % numD == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                System.out.print(numR + ",");
            }
        }
    }
}

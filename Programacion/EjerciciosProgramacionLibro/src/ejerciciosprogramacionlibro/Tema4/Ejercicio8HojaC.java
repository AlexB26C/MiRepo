package ejerciciosprogramacionlibro.Tema4;

import java.util.Scanner;

public class Ejercicio8HojaC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el primer numero del rango: ");
        int inicio = sc.nextInt();

        System.out.println("Dime el ultimo numero del rango: ");
        int fin = sc.nextInt();

        numPrimos(inicio, fin);
    }

    static void numPrimos(int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            boolean esPrimo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                System.out.print(i + ", ");
            }
        }
    }
}

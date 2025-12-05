package ejerciciosprogramacionlibro.Tema5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio21Hoja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un numero para crear un array: ");
        int longArray = sc.nextInt();

        int t[] = new int[longArray];

        for (int i = 0; i < t.length; i++) {
            System.out.print("Dime un valor para la posicion " + i + " del array: ");
            t[i] = sc.nextInt();
        }
        Arrays.sort(t);

        int valor = 0;

        do {
            System.out.println("");
            System.out.print("Dime el valor que quieres buscar en el array: ");
            valor = sc.nextInt();

            if (valor != -1) {
                int posicion = Arrays.binarySearch(t, valor);
                System.out.println("Array: " + Arrays.toString(t) + " Valor buscado: " + valor + " Posicion devuelta por binarySearch: " + posicion);
            }
        } while (valor != -1);
        System.out.println("Has terminado la ejecucion");
    }
}

package ejerciciosprogramacionlibro.RepasoTema5y6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio21Hoja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una frase y colocaré sus palabras en orden alfabético:");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" ");

        for (int i = 0; i < palabras.length - 1; i++) {
            for (int j = 0; j < palabras.length - 1; j++) {
                if (palabras[j].compareToIgnoreCase(palabras[j + 1]) > 0) {
                    String palabraActual = palabras[j];
                    palabras[j] = palabras[j + 1];
                    palabras[j + 1] = palabraActual;
                }
            }
        }

        System.out.println(Arrays.toString(palabras));
    }
}
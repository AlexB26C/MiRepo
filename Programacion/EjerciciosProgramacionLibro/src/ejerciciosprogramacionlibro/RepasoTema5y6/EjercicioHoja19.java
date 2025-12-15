package ejerciciosprogramacionlibro.RepasoTema5y6;

import java.util.Scanner;

public class EjercicioHoja19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una palabra: ");
        String palabra = sc.next();

        System.out.println("En cuantas letras quieres hacer la separacion de palabras: ");
        int separacion = sc.nextInt();

        for (int j = 0; j < palabra.length(); j += separacion) {
            if ((j + separacion) > palabra.length()) {
                System.out.println(palabra.substring(j, palabra.length()));
            } else {
                System.out.println(palabra.substring(j, j + separacion));
            }
        }
    }
}

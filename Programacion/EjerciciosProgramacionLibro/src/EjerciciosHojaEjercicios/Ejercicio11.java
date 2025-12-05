package EjerciciosHojaEjercicios;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        System.out.print("Escribe un numero: ");
        int n = new Scanner(System.in).nextInt();

        for (int fila = 1; fila <= n; fila++) {
            // pintamos los espacios que preceden a los asteriscos
            for (int espacios = 0; espacios < n - fila; espacios++) {
                System.out.print(" ");
            }

            // ahora dibujamos los asteriscos separados por un espacio 
            for (int asteriscos = 1; asteriscos <= fila; asteriscos++) {
                System.out.print("* ");
            }

            // y el salto de línea
            System.out.println("");

        }

    }

}

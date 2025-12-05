package ejerciciosprogramacionlibro.Tema4;

import java.util.Scanner;

public class Ejercicio2Excepciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean valido = false;

        System.out.println("Dime un el dividendo: ");
        int dividendo = sc.nextInt();

        do {
            try {
                int divisor;
                System.out.println("Dime un divisor: ");
                divisor = sc.nextInt();

                int division = dividendo / divisor;
                System.out.println("La division de " + dividendo + " entre " + divisor + " es: " + division);

                if (divisor != 0) {
                    valido = true;
                }

            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre 0");
                sc.nextLine();
            }
        } while (!valido);
        System.out.println("Se acabo ya no se divide mas");

    }

}

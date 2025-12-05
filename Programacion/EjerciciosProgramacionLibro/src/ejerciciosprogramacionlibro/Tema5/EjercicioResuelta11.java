package ejerciciosprogramacionlibro.Tema5;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioResuelta11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int longitud = 0;
        boolean valido = false;

        System.out.println("****BIENVENIDO A LA CAMARA SECRETA****");
        do {
            try {
                System.out.println("De cuanto quieres que sea la longitud de la combinacion de digitos entre 1 y 5: ");
                longitud = sc.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Tienes que escribir numeros enteros");
                valido = false;
                sc.nextLine();
            }
        } while (!valido);

        int codigoSecreto[] = new int[longitud];

        for (int i = 0; i < codigoSecreto.length; i++) {
            codigoSecreto[i] = (int) (Math.random() * 5) + 1;
        }

        boolean acertado = false;
        int combinacionJugador[] = new int[longitud];
        
        while (!acertado) {
            
            
            System.out.println("");
            System.out.println("Dime la combinacion secreta: ");
            for (int i = 0; i < combinacionJugador.length; i++) {
                boolean validoNumero = false;
                do {
                    try {
                        System.out.print((i + 1) + ": ");
                        combinacionJugador[i] = sc.nextInt();
                        validoNumero = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Tienes que escribir numeros enteros");
                        validoNumero = false;
                        sc.nextLine();
                    }
                } while (!validoNumero);
            }

            System.out.println("");

            for (int i = 0; i < combinacionJugador.length; i++) {
                if (combinacionJugador[i] > codigoSecreto[i]) {
                    System.out.println("La posicion " + (i + 1) + " de la combinacion es mayor que la de la camara pon un numero mas pequeno(" + combinacionJugador[i] + ")");
                } else if (combinacionJugador[i] < codigoSecreto[i]) {
                    System.out.println("La posicion " + (i + 1) + " de la combinacion es menor que la de la camara pon un numero mas grande (" + combinacionJugador[i] + ")");
                } else {
                    System.out.println("La posicion " + (i + 1) + " es correcta (" + combinacionJugador[i] + ")");
                }
            }

            acertado = Arrays.equals(combinacionJugador, codigoSecreto);
        }
        System.out.println("");
        System.out.println("Has acertado el codigo");
        System.out.println("Codigo: |   " + (Arrays.toString(codigoSecreto)) + "   |" );
        System.out.println("****ENHORABUENA HAS GANADO EL JUEGO DE LA CAMARA SECRETA****");
    }
}

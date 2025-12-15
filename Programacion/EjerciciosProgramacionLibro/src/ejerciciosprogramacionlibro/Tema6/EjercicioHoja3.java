package ejerciciosprogramacionlibro.Tema6;

import java.util.Scanner;

public class EjercicioHoja3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una frase: ");
        String frase = sc.nextLine();

        System.out.println("Dime que letra quieres buscar: ");
        char letra = sc.next().charAt(0);

        int cuentaLetras = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (letra == frase.charAt(i)) {
                cuentaLetras++;
            }
        }
        if (cuentaLetras == 1) {
            System.out.println("La letra " + "\"" + letra + "\" esta " + cuentaLetras + " vez en la palabra");
        } else {
            System.out.println("La letra " + letra + " esta " + cuentaLetras + " veces en la palabra");
        }
    }
}

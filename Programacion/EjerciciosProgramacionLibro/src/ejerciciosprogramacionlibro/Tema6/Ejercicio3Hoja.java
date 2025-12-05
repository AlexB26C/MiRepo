package ejerciciosprogramacionlibro.Tema6;

import java.util.Scanner;

public class Ejercicio3Hoja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una frase: ");
        String cad1 = sc.nextLine();

        System.out.println("Dime la letra a buscar en la frase: ");
        char caracter = sc.next().charAt(0);

        int cant = 0;
        for (int i = 0; i < cad1.length(); i++) {
            if (cad1.charAt(i) == caracter) {
                cant++;
            }
        }
        if (cant == 1) {
            System.out.println("En la palabra " + cad1 + " hay " + cant + " letra " + caracter);
        } else {
            System.out.println("En la palabra " + cad1 + " hay " + cant + " letras " + caracter);
        }
    }

}

package ejerciciosprogramacionlibro.Tema6;

import java.util.Scanner;

public class Ejercicio62 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primera Frase: ");
        String cad1 = sc.nextLine();

        System.out.println("Segunda Frase: ");
        String cad2 = sc.nextLine();

        int longi1 = cad1.length();
        int longi2 = cad2.length();

        if (longi1 > longi2) {
            System.out.println("La segunda es mas corta");
        } else if (longi1 < longi2) {
            System.out.println("La primera es mas corta");
        } else if (longi1 == longi2) {
            System.out.println("Las dos cadenas son igual de largas");
        }

    }

}

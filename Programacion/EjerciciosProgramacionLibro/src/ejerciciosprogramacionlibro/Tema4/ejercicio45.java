package ejerciciosprogramacionlibro.Tema4;

import java.util.Scanner;

public class ejercicio45 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime una letra: ");
        String letra = sc.next();

        System.out.println("La letra " + letra + "  es vocal: " + vocal(letra));

    }

    static boolean vocal(String a) {
        return "A".equals(a) || "E".equals(a) || "I".equals(a) || "O".equals(a) || "U".equals(a) || "a".equals(a) || "e".equals(a) || "i".equals(a) || "o".equals(a) || "u".equals(a);
    }
}

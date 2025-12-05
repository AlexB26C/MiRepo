package ejerciciosprogramacionlibro.Tema2;

import java.util.Scanner;

public class Ejercicio210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una nota entera del 0 al 10");
        int nota = sc.nextInt();
        switch (nota){
            case 0, 1, 2, 3, 4 -> {
               System.out.print("Insuficiente");
            }
            case 5 -> {
                System.out.println("Suficiente");
            }
            case 6 -> {
                System.out.println("Bien");
             }
            case 7, 8 -> {
                System.out.println("Notable");
            }
            case 9, 10 -> {
                System.out.println("Sobresaliente");
            }
            default -> {
                System.out.println("Has dado un numero incorrecto");
            }
        }                
    }
}

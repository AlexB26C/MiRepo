package ejerciciosprogramacionlibro.Tema2;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.print("Dime un numero entero y te dire si es par o no: ");
        num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es par");
        } else {
            System.out.println("El numero " + num + " es impar");
        }
    }
}

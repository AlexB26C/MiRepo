package ejerciciosprogramacionlibro.Tema3;

import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero positivo entero: ");
        int num = sc.nextInt();
        
        int cont = 1;
        
        while (cont <= num) {
            System.out.println(cont);
            cont++;
        }
    }
}

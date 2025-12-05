package ejerciciosprogramacionlibro.Tema2;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.print("Dime el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Dime el segundo numero: ");
        num2 = sc.nextInt();
        
        if (num1 == num2) {
            System.out.println("Los dos numeros son iguales");
        } else {
            System.out.println("Los numeros son distintos");
        }
    }
}

package ejerciciosprogramacionlibro.Tema3;

import java.util.Scanner;

public class Ejercicio36v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero positivo entero: ");
        int num = sc.nextInt();
                
        for (int cont = 1; cont <= num; cont++){
            System.out.println(cont);
        }
    }
}

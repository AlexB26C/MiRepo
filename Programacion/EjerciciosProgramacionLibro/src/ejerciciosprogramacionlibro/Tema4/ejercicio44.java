package ejerciciosprogramacionlibro.Tema4;

import java.util.Scanner;

public class ejercicio44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un numero entero: ");
        int num1 = sc.nextInt();

        System.out.print("Dime otro numero entero: ");
        int num2 = sc.nextInt();

        System.out.println("El numero mas alto de los dos es: " + numMaximo(num1, num2));
    }

    static int numMaximo(int a, int b){
        int max;
        if (a < b) {
            max = b;
        } else {
            max = a;
        }

        return max;

    }
}


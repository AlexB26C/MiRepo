package ejerciciosprogramacionlibro.Tema4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1Excepciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        boolean numvalido = false;
        int suma;
        
        do {
            try {
                System.out.print("Dime el primer numero: ");
                num1 = sc.nextInt();

                System.out.print("Dime el segundo numero: ");
                num2 = sc.nextInt();

                numvalido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de eleccion vuelve a introducir los numeros.");
                sc.nextLine();
            }
        } while (!numvalido);
        suma = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        
    }
}

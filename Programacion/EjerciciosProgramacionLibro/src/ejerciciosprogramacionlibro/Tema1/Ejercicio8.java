package ejerciciosprogramacionlibro.Tema1;

import java.util.Scanner;

/**
 *
 * @author alexb
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu edad: ");
        int edad = sc.nextInt();
        boolean mayorEdad = edad >= 18;
        System.out.println("Mayor de edad: " + mayorEdad);
    }
    
}

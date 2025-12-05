package ejerciciosprogramacionlibro.Tema1;

import java.util.Scanner;

/**
 *
 * @author alexb
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aActual, aNacimiento;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime el año actual: ");
        aActual = sc.nextInt();
        
        System.out.print("Ahora dime tu año de nacimiento: ");
        aNacimiento = sc.nextInt();
        
        System.out.println("Tienes " + (aNacimiento-aActual) + " años");
    }   
}

package EjerciciosHojaEjercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero positivo: ");
        int num = sc.nextInt();
        
        int cont = 0;
        int suma = 0;
        
        while (num > 0) {
            while (cont != num + 1) {
                
                if (cont % 2 != 0) {
                    suma = suma + cont;
                    cont++;
                
                } else {
                    cont++;
                }                
            }
            System.out.println("La suma de todos los impares desde el 1 hasta el " + num + " es " + suma);
            System.out.print("Dime otro numero: ");
            num = sc.nextInt();
            
            cont = 0;
            suma = 0;
        }
    }
}

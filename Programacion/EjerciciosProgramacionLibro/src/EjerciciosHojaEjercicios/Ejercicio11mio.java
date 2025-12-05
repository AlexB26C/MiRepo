package EjerciciosHojaEjercicios;

import java.util.Scanner;

public class Ejercicio11mio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero: ");
        int n = sc.nextInt();
        
        for (int fila = 1; fila <= n; fila++){
            for (int espacios = 0; espacios < n-fila; espacios++){
                System.out.print(" ");
            }
            
            for (int asteriscos = 1; asteriscos <= fila; asteriscos++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

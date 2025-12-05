package EjerciciosHojaEjercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime la base de la potencia: ");
        int base = sc.nextInt();
        
        System.out.print("Dime el exponente de la potencia: ");
        int exp = sc.nextInt();
        
        int potencia = 1;
        
        for (int i = exp; i > 0; i--){
            potencia = potencia * base;
        }
        System.out.println("El resultado de " + base + " elevado a " + exp + " es igual a " + potencia);
    }
}

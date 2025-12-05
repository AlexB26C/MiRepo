package EjerciciosHojaEjercicios;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Dime un numero: ");
        int num = sc.nextInt();
        sc.close();
        
        int resto = 0;
        int raiz = 0;
                
        for (int i = 1; i * i <= num; i++){
                raiz = i;
                resto = num-(raiz*raiz);
        }
        System.out.println("Raiz: " + raiz + ", Resto: " + resto);
    }
    
}

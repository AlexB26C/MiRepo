package ejerciciosprogramacionlibro.Tema4;

import java.util.Scanner;

public class ejercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero entero: ");
        int n = sc.nextInt();
        
        eco(n);
    }
    
    static void eco(int veces){
        for (int i = 0; i < veces; i++){
            System.out.println("Ecooo...");
        }
    }
}

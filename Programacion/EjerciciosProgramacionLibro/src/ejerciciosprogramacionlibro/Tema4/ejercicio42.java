package ejerciciosprogramacionlibro.Tema4;

import java.util.Scanner;

public class ejercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero entero: ");
        int n = sc.nextInt();
        
        System.out.print("Dime otro numero entero: ");
        int m = sc.nextInt();
        
        
        numerosComprendidos(n, m);
    }
    
    static void numerosComprendidos(int a, int b){
        for (int i = a + 1; i < b; i++){
            System.out.print(i + ",");
        }
    }
}


package ejerciciosprogramacionlibro.Tema4;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un numero: ");
        int num = sc.nextInt();
        
        System.out.println(sumaDigitos(num)); 
    }
    
    static int sumaDigitos(int n){
            if (n < 10 && n >= 0){
            return n;
        } else {
            return (n % 10) + (sumaDigitos(n/10));
        }
    }
}

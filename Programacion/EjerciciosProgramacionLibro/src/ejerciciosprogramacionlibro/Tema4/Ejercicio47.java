package ejerciciosprogramacionlibro.Tema4;

import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Dime un numero: ");
        int numEntero=sc.nextInt();
        
        System.out.println("El numero " + numEntero + " tiene " + NumDivisores(numEntero) + " divisores primos");
    }
    
    static boolean esPrimo(int n) {
        boolean primo = true;
                
        if (n < 2) {
            primo = false;
        }
        
        for (int i = 2; i < n && primo == true; i++){
            if (n % i == 0) primo = false;
        }
        return primo;
    }
    
    static int NumDivisores(int num){
        int cont = 0;
        for (int i = 2; i <= num; i++){
            if (esPrimo(i) && num % i == 0){
                cont++;
            }
        }
        return (cont);
    }
}

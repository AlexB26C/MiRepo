package ejerciciosprogramacionlibro.Tema4;

import java.util.Scanner;

public class Ejercicio46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero: ");
        int num = sc.nextInt();    
        
        if (esPrimo(num) == true){
            System.out.println("El numero " + num + " es primo: "+ esPrimo(num));
        } else {
            System.out.println("El numero " + num + " es primo: "+ esPrimo(num));
        }   
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
}

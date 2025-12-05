package ejerciciosprogramacionlibro.Tema6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1Hoja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char t[] = new char[10];
        char mayus[] = new char[10];
        char minus[] = new char[10];
        
        
        System.out.println("Dime caracteres: ");
        for (int i = 0; i < t.length; i++){
            System.out.print((i+1) + ": ");
            t[i] = sc.next().charAt(0);
            mayus[i] = Character.toUpperCase(t[i]);
            minus[i] = Character.toLowerCase(t[i]);
        }
        
        System.out.println("Mayusculas: " + Arrays.toString(mayus));       
        System.out.println("Minusculas: " + Arrays.toString(minus));

    }
    
}

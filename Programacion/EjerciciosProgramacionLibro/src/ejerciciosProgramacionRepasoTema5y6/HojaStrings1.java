package ejerciciosProgramacionRepasoTema5y6;

import java.util.Arrays;
import java.util.Scanner;

public class HojaStrings1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char ArrayString[] = new char [10];
        char mayus[] = new char [10];
        char minus[] = new char [10];
        
        System.out.println("Dime letras de una en una: ");
        for (int i = 0; i < ArrayString.length; i++){
            System.out.print((i+1) + ": ");
            ArrayString[i] = sc.nextLine().charAt(0);
            mayus[i] = Character.toLowerCase(ArrayString[i]);
            minus[i] = Character.toUpperCase(ArrayString[i]);
        } 
        System.out.println("Mayusculas: " + Arrays.toString(mayus));
        System.out.println("Minusculas: " + Arrays.toString(minus));
    }
    
}

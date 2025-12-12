package ejerciciosprogramacionlibro.RepasoTema5y6;

import java.util.Scanner;

public class HojaEjercicios2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String vocales = "aeiouAEIOU";
        int contVocales = 0;
        int contConsonantes = 0;
        
        
        System.out.println("Dime una palabra: ");
        String palabra = sc.nextLine();
        
        for (int i = 0; i < palabra.length(); i++){
            char c = palabra.charAt(i);
            if (vocales.contains(String.valueOf(c))){
                contVocales++;
            } else {
                contConsonantes++;
            }
        }
        
        System.out.println("La palabra \"" + palabra+  "\" tiene " + contVocales + " vocales y " + contConsonantes + " consonantes");
    }
    
}

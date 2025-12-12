package ejerciciosprogramacionlibro.RepasoTema5y6;

import java.util.Scanner;

public class EjercicioHoja17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char conjunto1[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        char conjunto2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
        
        System.out.println("Dime una palabra y la codifico: ");
        String palabra = sc.next();
        
        palabra = palabra.toLowerCase();
        
        char[] ArrayPalabra = palabra.toCharArray();
        
        String palabraNueva = "";
        
        for (int i = 0; i < palabra.length(); i++){
            ArrayPalabra[i] = codifica(conjunto1, conjunto2, ArrayPalabra[i]);
            palabraNueva = palabraNueva + ArrayPalabra[i];
        }
        System.out.println(palabraNueva);
    }
    
    static char codifica(char conjunto1[], char conjunto2[], char c){
        
        for (int i = 0; i < conjunto1.length; i++){
            if (c == conjunto2[i]){
                c = conjunto1[i];
                return c;
            }
        }
        
        return c;
        
    }
}

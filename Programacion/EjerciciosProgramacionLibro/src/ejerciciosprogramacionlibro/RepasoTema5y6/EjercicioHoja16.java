package ejerciciosprogramacionlibro.RepasoTema5y6;

import java.util.Scanner;

public class EjercicioHoja16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char conjunto1[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        char conjunto2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
        
        System.out.println("Dime una frase y la codifico: ");
        String frase = sc.nextLine();
        
        frase = frase.toLowerCase();
        
        char[] ArrayFrase = frase.toCharArray();
        
        String palabraNueva = "";
        
        for (int i = 0; i < frase.length(); i++){
            ArrayFrase[i] = codifica(conjunto1, conjunto2, ArrayFrase[i]);
            palabraNueva = palabraNueva + ArrayFrase[i];
        }
        System.out.println(palabraNueva);
    }
    
    static char codifica(char conjunto1[], char conjunto2[], char c){
        
        for (int i = 0; i < conjunto1.length; i++){
            if (c == conjunto1[i]){
                c = conjunto2[i];
                return c;
            }
        }
        
        return c;
        
    }
}

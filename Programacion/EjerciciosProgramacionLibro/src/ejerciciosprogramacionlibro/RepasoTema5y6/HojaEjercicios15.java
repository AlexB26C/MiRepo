package ejerciciosprogramacionlibro.RepasoTema5y6;

import java.util.Arrays;
import java.util.Scanner;

public class HojaEjercicios15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime una frase a ver si es palindrona: ");
        String frase = sc.nextLine();

        String fraseAlReves = null;
        for (int i = frase.length() -1; i >= 0; i--){
            if (frase.charAt(i) != ' '){
                fraseAlReves = fraseAlReves + frase.charAt(i);
            }
        }
        
        fraseAlReves = fraseAlReves.substring(4, fraseAlReves.length());
        String fraseSinEspacios = frase.replaceAll(" ", "");
        
        if (fraseSinEspacios.equals(fraseAlReves)){
            System.out.println("Tu frase es palindroma");
        } else {
            System.out.println("Tu frase no es palindroma");
        }
    }
}

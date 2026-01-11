package ejerciciosprogramacionlibro.Tema6;

import java.util.Scanner;

public class Ejercicio13Hoja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String prefijo = "Javalin, javalon";
        String sufijo = "javalen, len, len";
        
        System.out.println("Dime una frase: ");
        String frase = sc.nextLine();
        
        boolean idiomaJavaviano = false;                                                       
        
        if (frase.startsWith(prefijo)){
            idiomaJavaviano = true;
            frase = frase.substring(prefijo.length());
        } else if (frase.endsWith(sufijo)){
            idiomaJavaviano = true;
            frase = frase.substring(0, frase.length() - sufijo.length());
        }
        
        if (idiomaJavaviano){
            System.out.println("La traducion de la frase es: " + frase);
        } else {
            System.out.println("No lo has escrito en Javaviano");
        }
    }
}

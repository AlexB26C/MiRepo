package ejerciciosprogramacionlibro.Tema6;

import java.util.Scanner;

public class Ejercicio67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime una frase en la que quieras encontrar una palabra: ");
        String Frase = sc.nextLine();
        
        Frase = Frase.toLowerCase();
        
        System.out.print("Dime la palabra que quieres buscar: ");
        String palabra = sc.next();
        
        int posicion = Frase.indexOf(palabra);
        int veces = 0;
        
        while (posicion != -1){
            veces++;
            posicion = Frase.indexOf(palabra, posicion + 1);
        }
        if (veces == 0){
            System.out.println("\"palabra\"" + " No esta en la frase");
        } else {
            System.out.println("\"" + palabra + "\"" + " Esta " + veces + " veces en la frase");
        }
    }
}

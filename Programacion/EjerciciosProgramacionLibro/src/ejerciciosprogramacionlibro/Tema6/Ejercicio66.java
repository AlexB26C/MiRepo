package ejerciciosprogramacionlibro.Tema6;

import java.util.Scanner;

public class Ejercicio66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char c;
        String sinVocales = "";
        
        System.out.println("Dime tu nombre completo: ");
        String nombre = sc.nextLine();
        
        for (int i = 0; i < nombre.length(); i++){
            c = nombre.charAt(i);
            if (!esVocal(c)){
                sinVocales += c;
            }
        }
        System.out.println(sinVocales);
    }
    
    static boolean esVocal(char c){
        boolean resultado;
        
        String vocales = "aeiouáéíóú";
        
        c = Character.toLowerCase(c);
        if (vocales.indexOf(c) == -1){
            resultado = false;
        } else {
            resultado = true;
        }
        return resultado;
        
    }
}

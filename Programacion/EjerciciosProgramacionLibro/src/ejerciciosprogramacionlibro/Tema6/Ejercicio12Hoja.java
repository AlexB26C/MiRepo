package ejerciciosprogramacionlibro.Tema6;

import java.util.Scanner;

public class Ejercicio12Hoja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime una frase: ");
        String frase = sc.nextLine();
        
        String[] separada = frase.split("\\s+");
        
        int cuentaPalabras = 0;
        String cadenaLarga = separada[0];
        String cadenaCorta = separada[0];
        
        for (int i = 0; i < separada.length; i++){
            if (cadenaLarga.length() <  separada[i].length()){
                cadenaLarga = separada[i];
            }
            
            if (cadenaCorta.length() >  separada[i].length()){
                cadenaCorta = separada[i];
            }
            cuentaPalabras++;
        }
        
        System.out.println("La palabra mas larga es: " + cadenaLarga);
        System.out.println("La palabra mas corta es: " + cadenaCorta);
        System.out.println("La cantidad de palabras en el texto es "+ cuentaPalabras);
    }
    
}

package ejerciciosprogramacionlibro.RepasoTema5y6;

import java.util.Scanner;

public class EjercicioHoja20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String PalabraIntentos = "";

        System.out.print("Jugador 1 di una palabra: ");
        String PalabraAcertar = sc.next();
        PalabraAcertar.toLowerCase();
        
        for (int i = 0; i < PalabraAcertar.length(); i++) {
            PalabraIntentos = PalabraIntentos + "-";
        }
        System.out.println(PalabraIntentos);

        
        char ArrayPalabraAcertar[] = PalabraAcertar.toCharArray();
        
        System.out.println("Jugador B. Dime una letra: ");
        char letra = sc.next();

        int intentos = 7;
        while (intentos != 0) {
            for (int i = 0; i < PalabraIntentos.length(); i++) {
                if (letra ArrayPalabraAcertar[i]){
                    int pos = PalabraAcertar.indexOf(letra);
                    PalabraIntentos.replace(PalabraIntentos.charAt(pos), letra);
                }
            }
        }
    }
}

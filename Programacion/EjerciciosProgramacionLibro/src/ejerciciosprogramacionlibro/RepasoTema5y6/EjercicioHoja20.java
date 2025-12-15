package ejerciciosprogramacionlibro.RepasoTema5y6;

import java.util.Scanner;

public class EjercicioHoja20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String PalabraIntentos = "";

        System.out.print("Jugador A. Dime una palabra: ");
        String PalabraAcertar = sc.next();
        PalabraAcertar = PalabraAcertar.toLowerCase();

        for (int i = 0; i < PalabraAcertar.length(); i++) {
            PalabraIntentos = PalabraIntentos + "-";
        }

        char ArrayPalabraIntento[] = PalabraIntentos.toCharArray();
        char ArrayPalabraAcertar[] = PalabraAcertar.toCharArray();

        int intentos = 7;
        boolean ganado = false;

        do {
            System.out.println("Jugador B. Dime una letra: ");
            char letra = sc.next().toLowerCase().charAt(0);
            boolean encontrada = false;
            for (int i = 0; i < PalabraIntentos.length(); i++) {
                if (letra == ArrayPalabraAcertar[i]) {
                    ArrayPalabraIntento[i] = letra;
                    encontrada = true;
                }
            }
            
            if (!encontrada) {
                intentos--;
            }
            
            ganado = true;
            for (int i = 0; i < ArrayPalabraIntento.length; i++) {
                System.out.print(ArrayPalabraIntento[i]);
                if (ArrayPalabraIntento[i] == '-') {
                    ganado = false;
                }
            }
            
            System.out.println("");
            System.out.println("Te quedan " + intentos + " intentos");
        } while (intentos != 0 && !ganado);
        
        if(ganado){
            System.out.println("Has acertado la palabra");
        } else {
            System.out.println("Se te han acabado los intentos. HAS PERDIDO");
        }
    }
}

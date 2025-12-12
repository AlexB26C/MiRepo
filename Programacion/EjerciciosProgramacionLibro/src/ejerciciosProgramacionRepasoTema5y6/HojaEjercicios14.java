package ejerciciosProgramacionRepasoTema5y6;

import java.util.Scanner;

public class HojaEjercicios14 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase palabra a palabra");
        String fraseIntroducida;
        String fraseFin;
        String frase1 = null;

        String sufijo = "fin";
        boolean fin = false;

        while (!fin) {
            System.out.println("Introduce palabra");
            fraseIntroducida = sc.next();

            frase1 = frase1 + " " + fraseIntroducida;

            fraseFin = fraseIntroducida.toLowerCase();

            if (fraseFin.endsWith(sufijo)) {
                fin = true;
                sc.close();
            }

        }
        frase1 = frase1.substring(5, frase1.length() - sufijo.length());
        frase1 = frase1.trim();

        System.out.println(frase1);

    }

}
    


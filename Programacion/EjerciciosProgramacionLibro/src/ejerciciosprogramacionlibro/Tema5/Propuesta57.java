package ejerciciosprogramacionlibro.Tema5;

import java.util.Arrays;
import java.util.Scanner;

public class Propuesta57 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tus numeros favoritos y cuando quieras terminar pon -1: ");
        int numFav = 0;
        int NumerosFavs[] = new int[1];
        boolean valido = true;
        int i = 0;

        do {
            numFav = sc.nextInt();
            if (numFav > -1) {
                int numeroRep = Arrays.binarySearch(NumerosFavs, numFav);
                while (numeroRep >= 0) {
                    System.out.println("No se pueden poner numeros repetidos pon otro o pon -1 para salir: ");
                    numFav = sc.nextInt();
                    numeroRep = Arrays.binarySearch(NumerosFavs, numFav);
                }
                NumerosFavs[i] = numFav;
                NumerosFavs = Arrays.copyOf(NumerosFavs, NumerosFavs.length + 1);
                i++;
            } else {
                valido = false;
                NumerosFavs = Arrays.copyOf(NumerosFavs, NumerosFavs.length - 1);
            }
        } while (valido);
        System.out.println(Arrays.toString(NumerosFavs));

        System.out.println("Tu numero de la suerte es: " + NumeroSuerte(NumerosFavs));

    }

    static int NumeroSuerte(int NumerosFavoritos[]) {
        while (NumerosFavoritos.length != 2) {
            int numAle1 = (int) (Math.random() * (NumerosFavoritos.length - 1));
            int numAle2 = (int) (Math.random() * (NumerosFavoritos.length - 1));
            while (numAle2 == numAle1) {
                numAle2 = (int) (Math.random() * (NumerosFavoritos.length + 1));
            }

            int media = (NumerosFavoritos[numAle1] + NumerosFavoritos[numAle2]) / 2;

            NumerosFavoritos[numAle1] = media;

            for (int i = numAle2; i < NumerosFavoritos.length - 1; i++) {
                NumerosFavoritos[i] = NumerosFavoritos[i + 1];
            }
            NumerosFavoritos = Arrays.copyOf(NumerosFavoritos, NumerosFavoritos.length - 1);
        }

        int NumeroSuerte = (NumerosFavoritos[0] + NumerosFavoritos[1]) / 2;
        return NumeroSuerte;

    }
}

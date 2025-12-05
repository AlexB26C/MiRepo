package ejerciciosprogramacionlibro.Tema5;

import java.util.Arrays;

public class Ejercicio15Hoja {

    public static void main(String[] args) {

        int[] original = {1, 2, 3, 4, 5};

        int[] copia = copiaArray(original, 8);

        System.out.println("Array original : " + Arrays.toString(original));
        System.out.println("Array copiado  : " + Arrays.toString(copia));
    }

    public static int[] copiaArray(int[] arrayOrigen, int numElemArray) {
        int[] copia = new int[numElemArray];

        int limite = Math.min(arrayOrigen.length, numElemArray);

        for (int i = 0; i < limite; i++) {
            copia[i] = arrayOrigen[i];
        }

        return copia;
    }

}

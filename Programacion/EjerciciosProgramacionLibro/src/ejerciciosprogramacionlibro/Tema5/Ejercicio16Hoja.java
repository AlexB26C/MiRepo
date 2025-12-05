package ejerciciosprogramacionlibro.Tema5;

import java.util.Arrays;

public class Ejercicio16Hoja {

    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50, 60};

        int[] rango1 = copiaRangoArray(original, 1, 4);

        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Rango normal (1-4): " + Arrays.toString(rango1));
    }

    public static int[] copiaRangoArray(int[] aOrigen, int desde, int hasta) {

        if (desde < 0 || desde > aOrigen.length) {
            throw new ArrayIndexOutOfBoundsException("Índice desde no válido");
        }

        if (hasta < desde) {
            throw new IllegalArgumentException("El índice hasta debe ser >= desde");
        }

        if (hasta > aOrigen.length) {
            throw new ArrayIndexOutOfBoundsException("Índice hasta no válido");
        }

        int[] copia = new int[hasta - desde];

        for (int i = 0; i < copia.length; i++) {
            copia[i] = aOrigen[desde + i];
        }

        return copia;
    }
}

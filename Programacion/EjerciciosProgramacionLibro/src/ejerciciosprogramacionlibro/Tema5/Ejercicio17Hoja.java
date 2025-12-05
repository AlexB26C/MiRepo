package ejerciciosprogramacionlibro.Tema5;

import java.util.Arrays;

public class Ejercicio17Hoja {
    public static void main(String[] args) {
        int[] tabla = {1, 7, 2, 3, 2, 7, 0, 7, 1, 3, 4, 2, 3, 5};

        System.out.println("Tabla original:      " + Arrays.toString(tabla));

        System.out.println("Sin repetidos v2:    " + Arrays.toString(sinRepetidosV2(tabla)));
    }

    public static int[] sinRepetidosV2(int[] t) {
        int[] resultado = new int[0];

        for (int num : t) {
            Arrays.sort(resultado);
            if (Arrays.binarySearch(resultado, num) < 0) {
                resultado = Arrays.copyOf(resultado, resultado.length + 1);
                resultado[resultado.length - 1] = num;
            }
        }

        Arrays.sort(resultado);
        return resultado;
    }
}

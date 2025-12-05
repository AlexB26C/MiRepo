package ejerciciosprogramacionlibro.Tema5;

import java.util.Arrays;

public class Ejercicio17Hoja_v3 {

    public static void main(String[] args) {
        int[] tabla = {1, 7, 2, 3, 2, 7, 0, 7, 1, 3, 4, 2, 3, 5};

        System.out.println("Tabla original: " + Arrays.toString(tabla));

        System.out.println("Sin repetidos v3: " + Arrays.toString(sinRepetidosV3(tabla)));
    }

    public static int[] sinRepetidosV3(int[] t) {
        int[] resultado = new int[0];

        for (int i = 0; i < t.length; i++) {
            if (contarApariciones(t, t[i]) == 1) {
                resultado = Arrays.copyOf(resultado, resultado.length + 1);
                resultado[resultado.length - 1] = t[i];
            }
        }

        Arrays.sort(resultado);
        return resultado;
    }

    private static int contarApariciones(int[] t, int valor) {
        int c = 0;
        for (int n : t) {
            if (n == valor) {
                c++;
            }
        }
        return c;
    }
}

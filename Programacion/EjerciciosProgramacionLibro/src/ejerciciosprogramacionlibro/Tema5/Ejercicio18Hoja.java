package ejerciciosprogramacionlibro.Tema5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio18Hoja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Como de grande quieres que sea la tabla con pares e impares: ");
        int longTabla = sc.nextInt();

        int[] t = new int[longTabla];

        System.out.println("Dime numeros enteros para la tabla:");
        for (int i = 0; i < t.length; i++) {
            System.out.print(i + ": ");
            t[i] = sc.nextInt();
        }
        int par[] = new int[1];
        int impar[] = new int[1];
        int x = 0;
        int y = 0;

        for (int j = 0; j < t.length; j++) {
            if (t[j] % 2 == 0) {
                par[x] = t[j];
                x++;
                par = Arrays.copyOf(par, par.length + 1);
            } else {
                impar[y] = t[j];
                impar = Arrays.copyOf(impar, impar.length + 1);
                y++;
            }
        }
        par = Arrays.copyOf(par, par.length - 1);
        impar = Arrays.copyOf(impar, impar.length - 1);

        Arrays.sort(par);
        Arrays.sort(impar);

        System.out.println("Tabla pares: " + Arrays.toString(par));
        System.out.println("Tabla impares: " + Arrays.toString(impar));
    }

}

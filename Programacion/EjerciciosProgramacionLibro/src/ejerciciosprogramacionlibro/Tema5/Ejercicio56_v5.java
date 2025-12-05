package ejerciciosprogramacionlibro.Tema5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio56_v5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean existe = false;
        int t[] = new int[6];
        int tGan[] = new int[6];

        for (int i = 0; i < tGan.length; i++) {
            tGan[i] = (int) (Math.random() * 50);
            for (int igual : tGan) {
                if (tGan[i] == igual) {
                    tGan[i] = (int) (Math.random() * 50);
                }
            }
        }

        Arrays.sort(tGan);

        for (int i = 0; i < t.length; i++) {
            System.out.print("Dime el numero de apuesta " + (i + 1) + ": ");
            t[i] = sc.nextInt();
            while (t[i] > 49 || t[i] < 0) {
                System.out.println("Tienes que poner un numero entre 0 y 49");
                System.out.print("Dime el numero de apuesta " + (i + 1) + ": ");
                t[i] = sc.nextInt();
            }
        }

        System.out.println("****TU APUESTA****");
        System.out.println(Arrays.toString(t));
        System.out.println("");
        System.out.println("****APUESTA GANADORA****");
        System.out.println(Arrays.toString(tGan));
        System.out.println("");
        System.out.println("****TUS ACIERTOS****");
        System.out.println("El numero de aciertos es " + numeroAciertos(t, tGan));
    }

    static int numeroAciertos(int t[], int tGan[]) {
        int numAciertos = 0;
        for (int i = 0; i < tGan.length; i++) {
            if (Arrays.binarySearch(tGan, t[i]) >= 0) {
                numAciertos++;
            }
        }
        return numAciertos;

    }
}

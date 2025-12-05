package EjerciciosHojaEjercicios;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número natural: ");
        int n = sc.nextInt();
        sc.close();

        int i = 1; // empezamos probando desde 1
        while (i * i <= n) { // mientras el cuadrado sea menor o igual que n
            i++;
        }
        
        /* con un for equivalente a las 4 líneas anteriores:
        for (int i=1; i*i<=n; i++); */

        // cuando salimos del bucle, i*i > n, así que la raíz entera es (i - 1)
        int raiz = i - 1;
        int resto = n - raiz * raiz;

        System.out.println("La raíz cuadrada entera de " + n + " es " + raiz +
                           " con un resto de " + resto + ".");
    }
}
package ejerciciosprogramacionlibro.Tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio54 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean terminar = false;
        int num = 0;
        do {
            try {
                System.out.println("Cuantos numeros quieres meter: ");
                num = sc.nextInt();

                while (num < 0) {
                    System.out.println("Tiene que ser un numero positivo entero");
                    System.out.println("Cuantos numeros quieres meter: ");
                    num = sc.nextInt();
                }
            } catch (InputMismatchException  e) {
                System.out.println("Tienes que poner numeros enteros");
                System.out.println("");
                sc.nextLine();
            }
            int x[] = null;
            try{
            x = new int[num];
            } catch (ArrayIndexOutOfBoundsException  e) {
                System.out.println("Tienes que poner numeros enteros");
                System.out.println("");
                sc.nextLine();
            }
            
            for (int i = 0; i < num; i++) {
                try {
                    System.out.println("Dime el numero de la posicion " + i + ": ");
                    x[i] = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Tienes que poner numeros enteros");
                    System.out.println("");
                    sc.nextLine();
                }
            }

            int ArrayMinMax[] = MayorMinimo(x);

            System.out.println("El numero mayor es: " + ArrayMinMax[0]);
            System.out.println("El numero menor es: " + ArrayMinMax[1]);

            terminar = true;

            System.out.println("Tienes que poner numeros enteros");
            System.out.println("");
            sc.nextLine();
        } while (!terminar);
    }

    static int[] MayorMinimo(int t[]) {
        int mayor = t[0];
        int menor = t[0];
        for (int j = 0; j < t.length; j++) {
            if (t[j] > mayor) {
                mayor = t[j];
            } else if (t[j] < menor) {
                menor = t[j];
            }
        }
        int[] valores = {mayor, menor};
        return valores;

    }
}

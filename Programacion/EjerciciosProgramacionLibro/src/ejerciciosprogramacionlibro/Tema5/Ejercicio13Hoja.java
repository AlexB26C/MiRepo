package ejerciciosprogramacionlibro.Tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio13Hoja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        boolean numeroValido = false;

        do {
            try {
                System.out.println("Dime el valor que quieres encontrar en la tabla: ");
                num = sc.nextInt();
                numeroValido = true;

                while (num < 0) {
                    System.out.println("Tienes que dar un numero entero positivo");
                    System.out.println("Dime el valor que quieres encontrar en la tabla: ");
                    num = sc.nextInt();
                    numeroValido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Tienes que poner numeros enteros");
                sc.nextLine();
            }
        } while (!numeroValido);

        int x[] = {2, 0, 2, 8};

        int[] valorFinal = buscar(x, num);
        if (valorFinal[0] == -1) {
            System.out.println("El numero no esta en el array");
        } else if (valorFinal[1] != -1){
            System.out.println("El numero " + num + " esta en la posicion " + valorFinal[0] + " y " + valorFinal[1] + " de la tabla.");
        } else {
            System.out.println("El numero " + num + " solo esta en la posicion " + valorFinal[0]);
        }
    }

    static int[] buscar(int t[], int clave) {
        int array[] = new int [2];
        boolean arrayConUnNumero = false;
        boolean arrayConDobleNumero = false;
        boolean primeroEnc = false;
        
        for (int i = 0; i <= t.length - 1; i++) {
           
            if (clave == t[i]) {
                if (primeroEnc == false) {
                    array[0] = i;
                    primeroEnc = true;
                } else {
                    array[1] = i;
                    arrayConUnNumero = false;
                    arrayConDobleNumero = true;
                }
            }
        }
        if (arrayConUnNumero) {
            array[1] = -1;
            return array;
        } else if (arrayConDobleNumero){
            return array;
        } else{
            array[0] = -1;
            array[1] = -1;
            return array;
        }
    }
}

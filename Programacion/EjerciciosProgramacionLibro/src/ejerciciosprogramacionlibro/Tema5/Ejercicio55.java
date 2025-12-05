package ejerciciosprogramacionlibro.Tema5;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio55 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean valido = false;
        int longi = 0;
        int numeroFin = 0;
        
        
        do {
            try{
            System.out.print("Dime la longitud del array: ");
            longi = sc.nextInt();

            System.out.print("Desde el numero 2 hasta que numero quieres introducir numeros pares: ");
            numeroFin = sc.nextInt();
            
            valido = true;
            }catch (InputMismatchException e){
                System.out.println("Tienes que poner numeros enteros");
                sc.nextLine();
            }
        } while (!valido);
        System.out.println("La tabla de pares ordenada es: " + (Arrays.toString(rellenaPares(longi, numeroFin))));

    }

    //Crea un array con la longitud especificada y desde 2 hasta el numero indicado y lo devuelve ordenado
    static int[] rellenaPares(int longitud, int fin) {
        int[] arrayPares = new int[longitud];
        int i = 0;

        while (i < arrayPares.length) {
            int numeroParAleatorio = (int) (Math.random() * fin + 1);
            if (numeroParAleatorio % 2 == 0) {
                arrayPares[i] = numeroParAleatorio;
                i++;
            }
        }

        Arrays.sort(arrayPares);

        return arrayPares;
    }
}

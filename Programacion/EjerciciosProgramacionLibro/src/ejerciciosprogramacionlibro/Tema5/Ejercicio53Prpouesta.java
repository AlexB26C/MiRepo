package ejerciciosprogramacionlibro.Tema5;

import java.util.Scanner;

public class Ejercicio53Prpouesta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double cantPositivos = 0;
        double cantNegativos = 0;
        double positivos = 0;
        double negativos = 0;
        int ceros = 0;
        
        System.out.print("Cuantos numeros quieres introducir: ");
        int cantNum = sc.nextInt();
        int [] array = new int[cantNum];
        
        for (int i = 0; i < cantNum; i++){
            System.out.print("Dime un numero entero para la posicion" + i + " del array: ");
            array[i] = sc.nextInt();
            
            if (array[i] < 0){
                cantNegativos++;
                negativos = negativos + array[i];
            } else if (array[i] > 0){
                cantPositivos++;
                positivos = positivos + array[i];
            } else {
                ceros++;
            }
        }
        System.out.println("");
        System.out.println("****Desglose final****");
        System.out.println("La media de los positivos es: " + positivos/cantPositivos);
        System.out.println("La media de los negativos es: " + negativos/cantNegativos);
        System.out.println("La media de los positivos es: " + ceros);
        
    }
    
}

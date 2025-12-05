package ejerciciosprogramacionlibro.Tema4;

import java.util.Scanner;

public class Ejercicio16Hoja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime cuanta cantidad de numeros quieres sacar: ");
        int cant = sc.nextInt();

        System.out.print("Dime el numero minimo del rango: ");
        int min = sc.nextInt();

        System.out.print("Dime el numero maximo del rango: ");
        int max = sc.nextInt();

        numAleatorio(cant, min, max);
        numAleatorio(cant);
    }

    //Funcion de los valores entre un rango determinado
    static void numAleatorio(int NumCant, int min, int max) {
        for (int i = 0; i < NumCant; i++) {
            int num = (int) (Math.random() * (max - min + 1)) + min;
            if (i == 0) {
                System.out.print(num);
            } else {
                System.out.print(", " + num);
            }
        }
        System.out.println("");
    }

    //Funcion Sobrecargada da valores reales entre el 0 y el 1
    static void numAleatorio(int NumCant) {
        for (int i = 0; i < NumCant; i++) {
            double num = Math.random();
            if (i == 0) {
                System.out.print(num);
            } else {
                System.out.print(", " + num);
            }
        }
        System.out.println("");
    }
}

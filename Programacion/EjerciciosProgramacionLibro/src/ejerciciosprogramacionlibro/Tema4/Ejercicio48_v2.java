package ejerciciosprogramacionlibro.Tema4;

import java.util.Scanner;

public class Ejercicio48_v2 {

    static int menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir");
        System.out.print("Elige una opcion: ");
        int opcion = sc.nextInt();

        return opcion;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion = menu();
        
        while (opcion < 1 || opcion > 5){
            System.out.println("Di un numero de las operaciones que salen a continuacion: ");
            opcion = menu();
        }
        
        while (opcion != 5) {
            System.out.print("Dime un numero cualquiera: ");
            double num1 = sc.nextDouble();

            System.out.print("Dime otro numero cualquiera: ");
            double num2 = sc.nextDouble();

            System.out.println("El resultado de la operacion es: " + calculadora(opcion, num1, num2));
            
            opcion = menu();
        }
        System.out.println("Has elegido salir");
    }

    static double calculadora(int opcion, double num1, double num2) {
        double resultado = 0;
        switch (opcion) {
            case 1 ->
                resultado = num1 + num2;
            case 2 ->
                resultado = num1 - num2;
            case 3 ->
                resultado = num1 * num2;
            case 4 ->
                resultado = (double) num1 / num2;
        }
        return resultado;
    }
}

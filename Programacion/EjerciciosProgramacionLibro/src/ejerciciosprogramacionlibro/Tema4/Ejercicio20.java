package ejerciciosprogramacionlibro.Tema4;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        int numeroVentas = 0;
        double totalVentas = 0.0;
        int vacio = 0;
        int eleccion = 0;
        
        while (eleccion != 4) {
            eleccion = mostrarMenu();
            if (eleccion == 1) {
                numeroVentas = agregarVenta(numeroVentas);
                totalVentas = agregarVenta(totalVentas, vacio);

            } else if (eleccion == 2) {
                mostrarTotalVentas(totalVentas);

            } else if (eleccion == 3) {
                mostrarNumeroVentas(numeroVentas);

            } else if (eleccion == 4) {
                System.out.println("FIN DEL PROGRAMA");
            }
        }
    }

    public static int mostrarMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== MENU DE REGISTRO DE VENTAS ====");
        System.out.println("1. Añadir nueva venta");
        System.out.println("2. Ver total de ventas");
        System.out.println("3. Ver numero de ventas");
        System.out.println("4. Salir");
        System.out.print("Elige una opcion: ");
        int opcion = sc.nextInt();

        return opcion;
    }

    static void mostrarNumeroVentas(int numVen) {
        System.out.println("El numero total de ventas es: " + numVen);
    }

    static void mostrarTotalVentas(double totalVentas) {
        System.out.println("La suma total de las ventas es: " + totalVentas);
    }

    static double agregarVenta(double totalVentas, int vacio) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el valor de la venta: ");
        double valorVenta = sc.nextDouble();
        while (valorVenta < 0) {
            System.out.print("No se puede introducir una venta negativa. Introduca el valor de la venta: ");
            valorVenta = sc.nextDouble();
        }
        System.out.println("Venta registrada");
        totalVentas = totalVentas + valorVenta;

        return totalVentas;
    }

    static int agregarVenta(int numeroVentas) {
        numeroVentas++;
        return numeroVentas;
    }
}
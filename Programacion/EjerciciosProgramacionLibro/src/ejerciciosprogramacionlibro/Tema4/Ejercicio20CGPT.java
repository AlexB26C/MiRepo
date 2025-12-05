package ejerciciosprogramacionlibro.Tema4;

import java.util.Scanner;

public class Ejercicio20CGPT {
    private double totalVentas;
    private int numeroVentas;
    private Scanner sc = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("==== MENÚ ====");
        System.out.println("1. Añadir venta");
        System.out.println("2. Ver total");
        System.out.println("3. Ver número de ventas");
        System.out.println("4. Salir");
    }

    public void agregarVenta() {
        System.out.print("Introduce venta: ");
        double venta = sc.nextDouble();
        if (venta >= 0) {
            totalVentas += venta;
            numeroVentas++;
        } else {
            System.out.println("No se permiten ventas negativas.");
        }
    }

    public void mostrarTotal() {
        System.out.println("Total ventas: $" + totalVentas);
    }

    public void mostrarNumeroVentas() {
        System.out.println("Número de ventas: " + numeroVentas);
    }

    public void ejecutar() {
        boolean continuar = true;
        while (continuar) {
            mostrarMenu();
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();
            if (opcion == 1) {
                agregarVenta();
            } else if (opcion == 2) {
                mostrarTotal();
            } else if (opcion == 3) {
                mostrarNumeroVentas();
            } else if (opcion == 4) {
                System.out.println("Saliendo...");
                continuar = false;
            } else {
                System.out.println("Opción no válida.");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Ejercicio20CGPT programa = new Ejercicio20CGPT();
        programa.ejecutar();
    }
}

package ejerciciosprogramacionlibro.Tema4;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        calcularTotal();
    }

    static void calcularTotal() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos precios quieres introducir: ");
        int cantPrecios = sc.nextInt();
        double total = 0;

        for (int i = 1; i <= cantPrecios; i++) {
            System.out.print("Dime el precio " + i + ": ");
            double precio = sc.nextDouble();
            while (precio < 0.0) {
                System.out.print("Repiteme el precio " + i + " que es negativo: ");
                precio = sc.nextDouble();
            }
            total = total + precio;
        }
        if (total > 100) {
            System.out.println("El precio sin descuento es: " + total);
            System.out.println("El descuento aplicado es de un 10% " + "(" + total * 0.1 + " euros).");
            System.out.println("El precio con descuento es: " + aplicarDecuento(total));
        } else {
            System.out.println("El precio con y sin descuento es: " + aplicarDecuento(total));
        }

    }

    static double aplicarDecuento(double PrecioTotal) {
        if (PrecioTotal > 100) {
            double descuento = PrecioTotal * 0.1;
            return PrecioTotal - descuento;
        } else {
            return PrecioTotal;
        }
    }
}

package ejerciciosprogramacionlibro.Tema2;

import java.util.Scanner;

public class Ejercicio215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area = 0;
        
        System.out.print("Dime la base: ");
        double base = sc.nextDouble();
        System.out.print("Dime la altura: ");
        double altura = sc.nextDouble();
        
        if (base < 0 || altura < 0) {
            System.out.println("Los datos tienen que ser positivos");
        } else {
            area = (base*altura)/2;
        }
        System.out.println("El area de tu triangulo es: " + area);
    }
}

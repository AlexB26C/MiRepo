package ejerciciosprogramacionlibro.Tema4;

import java.util.Scanner;

public class EjercicioHoja12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime la x y la y del primer punto");
        System.out.print("x1: ");
        double x1 = sc.nextDouble();
        
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
        
        System.out.println("Dime la x y la y del segundo punto");
        System.out.print("x2: ");
        double x2 = sc.nextDouble();

        System.out.print("y2: ");
        double y2 = sc.nextDouble();
        
        double distanciaDePuntos = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        
        System.out.println("La distancia euclidea entre " + x1 + "," + y1 + " y " + x2 + "," + y2 + " es: " + distancia(x1, x2, y1, y2));
        
    }
    
    static double distancia(double x1, double x2, double y1, double y2){               
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }
}

package ejerciciosprogramacionlibro.Tema1;
import java.util.*;
public class Ejercicio11 {
    public static void main(String[] args) {
        
        final double Precio_Manzanas = 2.35;
        final double Precio_Peras = 1.95;
        int ManzanasSem1, ManzanasSem2, PerasSem1, PerasSem2;
        double impTotal;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Para las manzanas: ");
        System.out.println("Venta (en kilos) primer semestre: ");
        ManzanasSem1 = sc.nextInt();
        
        System.out.println("Venta (en kilos) segundo semestre: ");
        ManzanasSem2 = sc.nextInt();
        
        System.out.println("Para las peras: ");
        System.out.println("Venta (en kilos) primer semestre: ");
        PerasSem1 = sc.nextInt();
        
        System.out.println("Venta (en kilos) segundo semestre: ");
        PerasSem2 = sc.nextInt();
        
        impTotal = (ManzanasSem1 + ManzanasSem2) * Precio_Manzanas;
        impTotal += (PerasSem1 + PerasSem2) * Precio_Peras;
        System.out.println("El importe total es de: " + impTotal + " euros");
    }
    
    
}

package ejerciciosprogramacionlibro.Tema1;

import java.util.*;

public class Ejercicio14 {
    public static void main(String[] args) {
        double n;
        int redondeo;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Escibe un numero decimal (con punto): ");
        n = sc.nextDouble();
        redondeo = (int) (n + 0.5);
        System.out.println(n + " redondeado es: " + redondeo);
    } 
    
}

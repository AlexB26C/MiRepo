package ejerciciosprogramacionlibro.Tema2;

import java.util.*;

public class Ejercicio216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int valorAbs;
        
        System.out.println("Dime un numero: ");
        int num = sc.nextInt();
        valorAbs = (num < 0) ? Math.abs(num) : num;
        
        System.out.println("El valor absoluto de tu numero es: " + valorAbs);
    }
}

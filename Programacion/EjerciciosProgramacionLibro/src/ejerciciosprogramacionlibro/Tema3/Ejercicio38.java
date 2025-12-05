package ejerciciosprogramacionlibro.Tema3;

import java.util.Scanner;

public class Ejercicio38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int suma = 0;
        double media;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Escribe un numero entero: ");
            num = sc.nextInt();
            suma = suma + num;
        }
        
        media = suma / 10.0;
        System.out.println("La media de todos los numeros introducidos es: " + media);
    }
}

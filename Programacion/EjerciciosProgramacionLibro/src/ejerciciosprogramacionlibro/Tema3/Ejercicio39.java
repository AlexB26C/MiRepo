package ejerciciosprogramacionlibro.Tema3;

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero que este entre 1 y 10:");
        int num = sc.nextInt();
        
        while (!(num >= 1 && num <= 10)){
            System.out.print("Dime otro numero que este entre 1 y 10: ");
            num = sc.nextInt();
        }
        
        for (int tabla = 1; tabla <= 10; tabla++){
            System.out.println(num + "*" + tabla + "=" + num*tabla);
        }
    }
    
}

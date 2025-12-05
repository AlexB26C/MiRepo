package ejerciciosprogramacionlibro.Tema3;

import java.util.Scanner;

public class Ejercicio39v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero que este entre 1 y 10:");
        int num = sc.nextInt();
        
        int tabla = 1;
        
        while (!(num >= 1 && num <= 10)){
            System.out.print("Dime otro numero que este entre 1 y 10: ");
            num = sc.nextInt();
        }
        
        while (tabla <= 10){
            System.out.println(num + "*" + tabla + "=" + num*tabla);
            tabla++;
        }
    }
}
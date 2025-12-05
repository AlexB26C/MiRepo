package ejerciciosprogramacionlibro.Tema2;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entre el 0 y el 99999 y te dire el numero de cifras que tiene");
        int num = sc.nextInt();
        if (num >= 0 && num <=9){
            System.out.println("El numero " + num + " es de una cifra");
        } else if (num <=99){
            System.out.println("El numero " + num + " es de dos cifras");
       } else if (num <=999){
            System.out.println("El numero " + num + " es de tres cifras");
       } else if (num <=9999){
            System.out.println("El numero " + num + " es de cuatro cifras");
       } else if (num <=99999){
            System.out.println("El numero " + num + " es de cinco cifras");
       } else System.out.println("El numero no esta entre 0 y 99999");
    }
}

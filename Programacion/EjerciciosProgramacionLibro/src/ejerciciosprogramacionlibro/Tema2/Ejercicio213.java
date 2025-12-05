package ejerciciosprogramacionlibro.Tema2;

import java.util.Scanner;

public class Ejercicio213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la hora: ");
        int hora = sc.nextInt();
        System.out.print("Dime los minutos: ");
        int min = sc.nextInt();
        System.out.print("Dime los segundos: ");
        int seg = sc.nextInt();
        seg++;
        if (seg > 59) {
            seg = 0;
            min++;
            if (min > 59) {
                min = 0;
                hora++;
                if (hora > 23){
                    hora = 0;
                }
            }
        } 
        System.out.println("La hora mas un segundo es: " + hora + ":" + min + ":" + seg);
        

    }
    
}

package EjerciciosHojaEjercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero del 1 al 10: ");
        int numElegido=sc.nextInt();
        
        while (!(numElegido <= 10 &&numElegido >= 1)){
            System.out.print("Dime un numero entre 1 y 10: ");
            numElegido=sc.nextInt();
        }
        
        for (int num = numElegido; num <= 10; num++){
            System.out.println("Tabla del " + num);
            for (int i = 1; i <=10; i++){
                System.out.println(num + "*" + i + "=" + num*i);
            }
            System.out.println("");
        }
    }
}
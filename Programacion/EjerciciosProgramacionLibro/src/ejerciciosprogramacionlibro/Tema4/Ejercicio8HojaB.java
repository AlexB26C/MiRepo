package ejerciciosprogramacionlibro.Tema4;

import java.util.Scanner;

public class Ejercicio8HojaB {

    public static void main(String[] args) {
        
        System.out.println("La suma de todos los impares del 1 al numero propuesto es: " + SumaImpares());
    }
    
    static int SumaImpares(){
        Scanner sc = new Scanner(System.in);
        
        int suma = 0;
        boolean impar = true;
        
        System.out.println("Dime un numero positivo: ");
        int num = sc.nextInt();
        
        for (int i = 1; i <= num; i++){
            if (i % 2 == 0){
                impar = false;
            } else {
                impar = true;
                suma = suma + i;
            }
        }
        return suma;
    }
}

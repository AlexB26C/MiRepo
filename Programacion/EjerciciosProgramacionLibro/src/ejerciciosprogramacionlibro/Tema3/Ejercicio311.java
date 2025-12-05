package ejerciciosprogramacionlibro.Tema3;

import java.util.Scanner;

public class Ejercicio311 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long Factorial = 1;
        
        System.out.print("Dime un numero y te dare su factorial: ");
        int num = sc.nextInt();
        
        for (int i = num; i > 0 ; i--){
            Factorial = Factorial * i;
        }
        System.out.println("El resultado de !" + num + "=" + Factorial);
    }
    
}

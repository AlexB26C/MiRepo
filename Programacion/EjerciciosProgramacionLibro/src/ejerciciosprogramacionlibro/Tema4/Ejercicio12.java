package ejerciciosprogramacionlibro.Tema4;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero y te dire su fibonacci: ");
        int num = sc.nextInt();
        
        int resultado = fibonacci(num);
        System.out.println("fibonacci("+ num+ ") = " + resultado);
    }
    
    static int fibonacci(int n){
        int resultado;
        if (n == 0 || n == 1){
            resultado = 1;
        } else {
            resultado = fibonacci(n-1) + fibonacci(n-2);
        }
        return resultado;
    }
    
}

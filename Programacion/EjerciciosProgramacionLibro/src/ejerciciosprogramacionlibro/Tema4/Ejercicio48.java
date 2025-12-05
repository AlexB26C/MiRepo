package ejerciciosprogramacionlibro.Tema4;

import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un numero cualquiera: ");
        double num1 = sc.nextDouble();
        
        System.out.println("Dime otro numero cualquiera: ");
        double num2 = sc.nextDouble();
        
        System.out.println("1-Suma, 2-Resta, 3-Multiplicacion, 4-Division");
        int opcion = sc.nextInt();
    
        if (!(calculadora(opcion, num1, num2) == 0.0)){
            System.out.println("El resultado de la operacion es: " + calculadora(opcion, num1, num2));
        }
    }
    
    static double calculadora(int opcion, double num1, double num2){
        double resultado;
        resultado = switch (opcion){
            case 1 ->
                num1+num2;
            case 2 ->
                num1-num2; 
            case 3 ->
                num1*num2;
            case 4 ->
                (double) num1/num2;
            default -> {
                System.out.println("Operacion no disponible");
                yield 0;
            }
        };
                
        
        return resultado;
    
    }
    
}

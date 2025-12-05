package ejerciciosprogramacionlibro.Tema4;

import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Dime el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.print("Dime el tercer numero: ");
        int num3 = sc.nextInt();
        
        int max = maximo (num1, num2, num3);
        System.out.println("El numero mas alto es " + max);
    }
    
    /*Primero asigna a la variable mayorAB el mayor entre A y B 
    y luego comprueba el mayor de A y B con C y lo devuelve con  el return*/
    static int maximo(int a, int b, int c){ 
        int mayorAB = maximo(a,b);
        return (maximo(mayorAB, c));   
    }
    
    /*Hace la comprobacion de dos numeros ya sea primero la de A y B 
    como luego la del mayor de los dos con C*/
    static int maximo (int a, int b){
        int maxDeTodos;
        if (a < b) {
            maxDeTodos = b;
        } else {
            maxDeTodos = a;
        }
        return maxDeTodos;
    }
}

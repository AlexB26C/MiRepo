package EjerciciosHojaEjercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Salir");
        int eleccion = sc.nextInt();
        
        int multiplicacion;
        int suma;
        int resta;
        
        while (eleccion < 1 && eleccion < 4){
            System.out.print("Dime un numero que este entre 1 y 4: ");
            eleccion = sc.nextInt();
        }
        
        while (eleccion != 4){
            System.out.print("Dime el primer numero que quieras usar: ");
            int num1 = sc.nextInt();
        
            System.out.print("Dime el segundo numero que quieras usar: ");
            int num2 = sc.nextInt();
            
            switch (eleccion) {
                case 1 -> {
                    suma = num1 + num2;
                    System.out.println("El resultado de la suma es: " + suma);
                }
                case 2 -> {
                    resta = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resta);
                }
                case 3 -> {
                    multiplicacion = num1 * num2;
                    System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
                }
            }
            
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Salir");
            eleccion = sc.nextInt();
        }
        System.out.println("Has salido");
    } 
}
   

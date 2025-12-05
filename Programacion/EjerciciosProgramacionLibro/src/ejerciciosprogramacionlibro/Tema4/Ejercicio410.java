/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosprogramacionlibro.Tema4;

import java.util.Scanner;

/**
 *
 * @author alexb
 */
public class Ejercicio410 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime la base: ");
        double base = sc.nextDouble();
        
        System.out.print("Dime el exponente: ");
        int exp = sc.nextInt();
        
        while (exp <= 0){
            System.out.print("El exponente no puede tener comas o ser negativo dame otro exponente: ");
            exp = sc.nextInt();
         }
        System.out.println(potencia(base, exp)); 
    }
    
    static double potencia(double base, int exp){
        long resultado;
        
        if (exp == 0){
            resultado = 1;
        } else {
            resultado = (long) (base * potencia(base, exp-1));
        }
        return resultado;
    }
}

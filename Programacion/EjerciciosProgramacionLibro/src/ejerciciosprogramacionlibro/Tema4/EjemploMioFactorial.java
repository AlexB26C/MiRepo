/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosprogramacionlibro.Tema4;

/**
 *
 * @author alexb
 */
public class EjemploMioFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(factorial(15));        
    }
    static int factorial(int n){
        long resultado;
        if (n == 0){
            resultado = 1;
            
        } else {
            resultado = n * factorial(n-1);
        }
     return (int) (resultado);   
    }
}

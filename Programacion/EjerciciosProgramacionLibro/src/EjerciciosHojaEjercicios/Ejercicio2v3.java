package EjerciciosHojaEjercicios;

import java.util.Scanner;

public class Ejercicio2v3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contFallos = 1;
        int numJugador;
        int numMaquina = (int) (Math.random() * 1000 + 1);
       
        System.out.print("Cuantos intentos quieres tener para poder acertar: ");
        int numIntentos = sc.nextInt();
        
        while (numIntentos <= 0) {
            System.out.print("No puedes tener 0 o un numero negativo de intentos pon otra cantidad de intentos: ");
            numIntentos = sc.nextInt();    
        }
        
        System.out.print("Dime un numero del 1 al 1000 a ver si aciertas: ");
        numJugador = sc.nextInt();
               
        while (numJugador != numMaquina && numJugador != -1 && contFallos != numIntentos) {
            
            while (numJugador > 1000 || numJugador < -1 || numJugador == 0){
            System.out.println("El numero no esta entre 1 y 1000 para jugar o -1 para salir.");
            System.out.print("Dime un numero correcto que sea entre 1 y 1000 o que sea -1 si quieres salir: ");
            numJugador = sc.nextInt();
            }
            
            if (numJugador > numMaquina){
                System.out.println("El numero " + numJugador + " es mayor que el de la maquina.");
                System.out.print("Introduce otro numero para probar suerte o pon -1 para salir del juego: ");
                numJugador = sc.nextInt();
                contFallos++;
        
            } else if (numJugador < numMaquina){
                System.out.println("El numero " + numJugador + " es menor que el de la maquina.");
                System.out.print("Introduce otro numero para probar suerte o pon -1 para salir del juego: ");
                numJugador = sc.nextInt();
                contFallos++;
            }                     
        }
        
        if (numJugador == numMaquina){
            System.out.println("Enhorabuena, has acertado el numero");
            System.out.println("Has acertado con " + contFallos +  " intentos.");
            
        } else if (contFallos == numIntentos) {
            System.out.println("Has fallado los " + numIntentos +  " intentos reinicia el programa para volver a jugar");
            
        } else {
            System.out.println("Has dedicido rendirte");
        }
    }
}
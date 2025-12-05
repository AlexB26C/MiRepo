package ejerciciosprogramacionlibro.Tema3;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contFallos = 0;
        int numJugador;
        int numMaquina = (int) (Math.random() * 100 + 1);
        System.out.println("Dime un numero del 1 al 100 a ver si aciertas: ");
        numJugador = sc.nextInt();
        while (numJugador > 100 || numJugador < -1 || numJugador == 0){
            System.out.println("El numero no esta entre 1 y 100 para jugar o -1 para salir.");
            System.out.print("Dime un numero correcto que sea entre 1 y 100 o que sea -1 si quieres salir: ");
            numJugador = sc.nextInt();
        }
        while (numJugador != numMaquina && numJugador != -1){
            if (numJugador > numMaquina){
                System.out.println("El numero que has introducido es mayor que el de la maquina.");
                System.out.println("Introduce otro numero para probar suerte o pon -1 para salir del juego");
                numJugador = sc.nextInt();
                contFallos++;
            } else if (numJugador < numMaquina){
                System.out.println("El numero que has introducido es menor que el de la maquina.");
                System.out.println("Introduce otro numero para probar suerte o pon -1 para salir del juego");
                numJugador = sc.nextInt();
                contFallos++;
            }                     
        }
        if (numJugador == numMaquina){
            System.out.println("Enhorabuena, has acertado el numero");
        } else {
            System.out.println("Has dedicido rendirte");
        }
        System.out.println("Has acertado con " + contFallos +  " fallos.");
    }
}
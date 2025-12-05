package ejerciciosprogramacionlibro.Tema5;

import java.util.Arrays;
import java.util.Scanner;

public class SimulacroExamen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("De cuantos digitos quieres que sea la longitud del array");
        int longitud = sc.nextInt();
        
        int[] combSecreta = generaCombinacion(longitud);
        int[] combJugador = leeTabla(longitud, sc);
        
        while(!(Arrays.equals(combJugador, combSecreta))){
        muestraPistas(combJugador, combSecreta);
        combJugador = leeTabla(longitud, sc);
        }
        
        System.out.println("!La camara esta abierta!");
    }

    static int[] generaCombinacion(int longitudCombinacion) {
        int[] combinacionSecreta = new int[longitudCombinacion];

        for (int i = 0; i < combinacionSecreta.length; i++) {
            combinacionSecreta[i] = (int) (Math.random() * 5 + 1);
        }
        return combinacionSecreta;
    }

    static int[] leeTabla(int longitudCombinacionSecreta, Scanner sc){
        int[] combinacionJugador = new int[longitudCombinacionSecreta];
        
        System.out.println("Dime un numero para las diferentes posiciones de la combinacion: ");
        for (int i = 0; i < combinacionJugador.length; i++){
            System.out.print((i+1) +": ");
            combinacionJugador[i] = sc.nextInt();
            
            while (combinacionJugador[i] < 1 || combinacionJugador[i] > 5){
                System.out.println("Los numeros de la combinacion tienen que ser entre 1 y 5 ambos incluidos");
                System.out.println("Dime un numero para la posicion " + (i+1) + ": ");
                combinacionJugador[i] = sc.nextInt();
            }
        }
        return combinacionJugador;
    }
    
    static void muestraPistas(int[] jug, int[]secreto){
        for (int i = 0; i < jug.length; i++){
            if(jug[i] == secreto[i]){
                System.out.println("El numero " + jug[i] + " es correcto en la posicion " + (i+1));
            } else if (jug[i] < secreto[i]){
                System.out.println("El numero " + jug[i] + " es menor que el que tienes que adivinar en la posicion " + (i+1));
            } else {
                System.out.println("El numero " + jug[i] + " es mayor que el que tienes que adivinar en la posicion " + (i+1));
            }
        }
    }
}

package ejerciciosprogramacionlibro.Tema5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio20Hoja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int puntuaciones[] = {4, 2, 2, 5, 8};
        
        for (int i = 0; i < puntuaciones.length; i++){
            System.out.println("Puntos programador (" + (i + 1) + "): " + puntuaciones[i]);
        }
        
        Arrays.sort(puntuaciones);
        
        System.out.println("Puntuacion: " + Arrays.toString(puntuaciones));
        
        int puntEx = 0;
        int [] nueva = new int [5];
        int programadoresEx = 0;
        
        while (puntEx != -1){
            System.out.print("Puntos del programador de exhibicion: ");
            puntEx = sc.nextInt();
            programadoresEx++;
            
            int indiceInsercion = Arrays.binarySearch(puntuaciones, puntEx);
            int finalArray = indiceInsercion + 1 + programadoresEx;
            
            nueva = Arrays.copyOfRange(puntuaciones, 0, indiceInsercion);
            nueva = Arrays.copyOf(nueva, puntuaciones.length + 1);
            nueva[indiceInsercion] = puntEx;
            
            System.arraycopy(puntuaciones, indiceInsercion + 1, nueva, indiceInsercion + 1, finalArray);
        }
        System.out.println("Puntuacion final: " + Arrays.toString(nueva));
    }
    
}

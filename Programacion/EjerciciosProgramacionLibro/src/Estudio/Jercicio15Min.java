package Estudio;

import java.util.Scanner;

public class Jercicio15Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime el numero de alumnos: ");
        int numeroAlumnos = sc.nextInt();
        
        int[] notas = new int[numeroAlumnos];
        
        notasAlumnos(notas, sc);
        media(notas);
        notasMayIgu8(notas);
        MaxMin(notas);
    }
    
    static void notasAlumnos(int notas[], Scanner sc){
        
        for(int i = 0; i < notas.length; i++){
            System.out.print("Introduce la nota " + (i+1) + ": ");
            notas[i] = sc.nextInt();
        }
    }
    
    static void media(int[] notas){
        double sumaNotas = 0;
        for (int i = 0; i < notas.length; i++){
            sumaNotas = sumaNotas + notas[i];
        }
        double media = sumaNotas/notas.length;
        System.out.println("La nota media es:" + media);
    }
    
    static void notasMayIgu8(int[] notas){
        int contadorNotasAltas = 0;
        
        for(int i = 0; i < notas.length; i++ ){
            if(notas[i] >= 8){
                contadorNotasAltas++;
            }
        }
        System.out.println("Este es el numero de notas mayores de 8: " + contadorNotasAltas);
    }
    
    static void MaxMin(int[] notas){
        int max = notas[0];
        int min = notas[0];
        
        for (int i = 0; i < notas.length; i++){
            if(notas[i] > max){
                max = notas[i];
            } else if (notas[i] < min){
                min = notas[i];
            }
        }
        System.out.println("La nota maxima es: " + max);
        System.out.println("La nota minima es: " + min);
    }
}

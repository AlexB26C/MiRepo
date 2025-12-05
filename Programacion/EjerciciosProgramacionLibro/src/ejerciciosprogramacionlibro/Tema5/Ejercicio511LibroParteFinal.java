package ejerciciosprogramacionlibro.Tema5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio511LibroParteFinal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("De que lomngitud quieres que sea la tabla: ");
        int longi = sc.nextInt();

        int[] tabla = new int[longi];

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random() * 10);
        }

        System.out.println("Dime el numero a buscar: ");
        int buscar = sc.nextInt();
       
        System.out.println("Esta en " + Arrays.toString(buscarTodos(tabla, buscar)));
        
    }

    static int[] buscarTodos(int t[], int clave) {
        int[] indices = new int[0];
        for (int i = 0; i < t.length; i++) {
            if(t[i]==clave){
                indices = Arrays.copyOf(indices, indices.length + 1);
                indices[indices.length -1] = i;
            }
        }
        return indices;
    }
}

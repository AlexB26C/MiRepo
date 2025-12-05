package ejerciciosprogramacionlibro.Tema5;

import java.util.Arrays;

public class Ejercicio11Hojav_2 {
    public static void main(String[] args) {
        int t[] = new int [15];
        
        
        for (int i = 0; i < t.length; i++){
            t[i] = (int)(Math.random() * 100 + 1);
        }
        Arrays.sort(t);
        
        int maximo = t[0];
        int minimo = t[0];
        
        for (int j = 0; j < t.length; j++){
            if (t[j] > maximo){
                maximo = t[j];
            } else if (t[j] < minimo){
                minimo = t[j];
            }
        }
        System.out.println("****Los valores de la tabla son****");
        System.out.println(Arrays.toString(t));
        System.out.println("");
        System.out.println("****Numero Maximo y numero Minimo****");
        System.out.println("El numero maximo es: " + maximo);
        System.out.println("El numero minimo es: " + minimo);
    }
}

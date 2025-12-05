package EjerciciosHojaEjercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        int edades;
        
        System.out.print("Dime la primera edad: ");
        edades = sc.nextInt();
        
        int edadMax = edades;
        int edadMin = edades;
        
        while (edades != -1) {
            if (edades > edadMax){
                edadMax = edades;
            } else if (edades < edadMin) {
                edadMin = edades;
            }
            
            System.out.print("Dime otra edad: ");
            edades = sc.nextInt();
        }
        
        System.out.println("La edad más alta es " + edadMax);
        System.out.println("La edad más baja es " + edadMin);
    }
}

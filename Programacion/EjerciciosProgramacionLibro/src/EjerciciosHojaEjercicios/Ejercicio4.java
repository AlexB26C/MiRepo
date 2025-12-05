package EjerciciosHojaEjercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un numero positivo: ");
        int numUsuario = sc.nextInt();

        while (numUsuario != 0) {
            numUsuario--;
            System.out.println(numUsuario);
        }
        System.out.println("Despegue");
    }
}

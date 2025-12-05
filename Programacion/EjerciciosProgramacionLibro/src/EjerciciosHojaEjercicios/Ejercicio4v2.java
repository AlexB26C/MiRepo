package EjerciciosHojaEjercicios;

import java.util.Scanner;

public class Ejercicio4v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero positivo: ");
        int numUsuario = sc.nextInt();
        
        while (numUsuario < 0){
            System.out.print("El numero es negativo escribe otro que sea positivo: ");
            numUsuario = sc.nextInt();
        }
        for (int i = numUsuario; i  >= 0 ; i--) {            
            System.out.println(i);
        }
        System.out.println("Despegue!!");
    }
}

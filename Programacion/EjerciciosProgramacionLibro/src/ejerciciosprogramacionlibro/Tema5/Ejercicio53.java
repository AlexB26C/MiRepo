package ejerciciosprogramacionlibro.Tema5;

import java.util.Scanner;

public class Ejercicio53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime la cantidad de numeros que quieres introducir: ");
        int cantNum = sc.nextInt();
        int t[] = new int [cantNum];
        
        for (int i = 0; i < cantNum; i++){
            System.out.print("Dime un numero: ");
            t[i] = sc.nextInt();
        }
        System.out.println("");
        
        for (int i = t.length -1; i >= 0; i--){
            System.out.println(t[i]);
        }
    }
    
}

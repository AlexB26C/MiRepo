package ejerciciosprogramacionlibro.Tema4;

import java.util.Scanner;

public class Hoja_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para saber su cantidad de pares");
        int num = sc.nextInt();

        muestraPares(num);
    }

    static void muestraPares(int n) {
        int cont = 0;
        
        for(int i = 1; cont < n; i++){            
            if(i % 2 == 0) {
                System.out.println(i);
                cont++;
            }
        }

    }

}

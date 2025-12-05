package ejerciciosprogramacionlibro.Tema4;

import java.util.*;

public class ejercicio43_v2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Si quieres el volumen pulse 1 si quieres el area pulse 2: ");
        int opcion = sc.nextInt();

        System.out.print("Dime el radio de la base: ");
        int radio = sc.nextInt();
        
        System.out.print("Dime la altura: ");
        int altura = sc.nextInt();

        while (opcion != 1 && opcion != 2){
            System.out.println("Has dado un valor incorrecto 1 para volumen y 2 para area");
            opcion = sc.nextInt();
        }
        
        cilindro(opcion, altura, radio);
    }

    static void cilindro(int caso, int altura, int radio) {
        switch (caso){
            case 1 -> {
                double volumen = Math.PI * potencia(radio, 2) * altura;
                System.out.println("El volumen del cilindro es: " + volumen);
            }
            case 2 -> {
                double area = 2 * Math.PI * radio * (altura + radio);
                System.out.println("El area del cilindro es: " + area);
            }
        }
    }
    
    static int potencia (int base, int exponente){
        int potencia = 0;
        for (int i = 0; i < exponente; i++){
            potencia = base * base;
        }
        return potencia;
    }
}

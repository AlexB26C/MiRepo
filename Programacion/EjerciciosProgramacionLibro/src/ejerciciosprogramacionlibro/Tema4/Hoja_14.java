package ejerciciosprogramacionlibro.Tema4;
import java.util.Scanner;

public class Hoja_14 {

   
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Introduce la primera hora");
         int h1 = sc.nextInt();
         System.out.println("Introduce los primeros minutos");
         int m1 = sc.nextInt();
         
         
         System.out.println("Introduce la segunda hora");
         int h2 = sc.nextInt();
         System.out.println("Introduce los segundos minutos");
         int m2 = sc.nextInt();
         
         System.out.println("Hay de diferencia " + diferenciaMin(h1, m1, h2, m2) + " minutos");
    }
    
    static int diferenciaMin(int hora1, int minutos1, int hora2, int minutos2){
        int resultado1;
        int resultado2;
        int horasDiferencia;
        int diferencia;
        if (hora1 > hora2){
            horasDiferencia = hora1-hora2; 
            resultado1 = (hora1 * 60) + minutos1;
            resultado2 = (hora2 + 24) * 60 + minutos2;
            diferencia = resultado2 - resultado1;
        } else {
            resultado1 = hora1 * 60 + minutos1;
            resultado2 = hora2 * 60 + minutos2;
            diferencia = resultado2 - resultado1;
        }
        
        
        return(diferencia);
    }
    
}

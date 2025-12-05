package ejerciciosprogramacionlibro.Tema1;
import java.util.*;
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio, area, longitud;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime el radio de la circunferencia: ");
        radio = sc.nextDouble();
        
        longitud = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);
        
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El area de la circunferencia es: " + area);
    }
    
}

package ejerciciosprogramacionlibro.Tema1;




import java.util.Scanner;

/**
 *
 * @author alexb
 */
public class Ejercicio6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota1, nota2;
        double media;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dame la primera nota: ");
        nota1 = sc.nextInt();
        
        System.out.print("Dame la segunda nota: ");
        nota2 = sc.nextInt();
        
        media = (nota1+nota2)/2.0;
        
        System.out.println("La nota media de las notas es: " + media);
    }
}

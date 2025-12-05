package ejerciciosprogramacionlibro.Tema1;

import java.util.Scanner;

/**
 *
 * @author alexb
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean llueve, tareas, biblioteca;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Esta lloviendo?: (true/false)");
        llueve = sc.nextBoolean();
        
        System.out.println("¿Has terminado las tareas?: (true/false)");
        tareas = sc.nextBoolean();
        
        System.out.println("¿Tienes que ir a la biblioteca?: (true/false)");
        biblioteca = sc.nextBoolean();
        
        boolean salir = !llueve && tareas || biblioteca;
        
        System.out.println("Puedes salir: " + salir);
     }
}
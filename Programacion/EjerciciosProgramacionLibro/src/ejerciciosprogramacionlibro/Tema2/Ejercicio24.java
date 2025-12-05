package ejerciciosprogramacionlibro.Tema2;
    import java.util.*;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num;
        
        System.out.print("Dime un numero decimal: ");
        num = sc.nextDouble();
        
        if (-1 < num && 1 > num && num != 0) {
            System.out.println("El numero es un casi-cero");
        } else {
            System.out.println("El numero no es un casi-cero");
        }
    }
}

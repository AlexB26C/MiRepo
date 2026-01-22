package ActividadResuelta_8_1_Y_8_2;
import java.util.Scanner;
public class NewMain {
    public static void main(String[] args) {
        // TODO code application logic here
        HoraExacta r = new HoraExacta(11, 15, 23);
        System.out.println(r);
        for (int i = 1; i <= 61; i++) {
            r.inc();
        }
        System.out.println(r); 
        System.out.println("Escriba los segundos:");
        int segundos = new Scanner(System.in).nextInt();

        if (r.setSegundos(segundos)) {
            System.out.println(r);
        } else {
            System.out.println("No se pueden cambiar los segundos");
        }
    }

}

package ActividadResuelta_8_1_Y_8_2;
import java.util.Arrays;
import java.util.Scanner;
public class NewMain {
    public static void main(String[] args) {
        HoraExacta a = new HoraExacta(1, 2, 3);
        HoraExacta b = new HoraExacta(1, 2, 3);
        HoraExacta c = new HoraExacta(10, 20, 30);
        
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}

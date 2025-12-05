package EjerciciosHojaEjercicios;
public class Ejercicio7 {
    public static void main(String[] args) {
        for (int num = 1; num <= 10; num++){
            System.out.println("Tabla del " + num);
            for (int i = 1; i <=10; i++){
                System.out.println(num + "*" + i + "=" + num*i);
            }
            System.out.println("");
        }
    }
    
}

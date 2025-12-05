package EjerciciosHojaEjercicios;

public class Ejercicio13 {

    public static void main(String[] args) {
        int aleatorio = (int) (Math.random() * 6 + 1);

        int tiradas = 1;
        int dinero = 0;
        int dado = 0;

        do {
            dado = (int) (Math.random() * 6 + 1);

            if (dado != aleatorio) {
                dinero = dinero + dado;
                tiradas++;
            } 
            if (dado == aleatorio) {
                System.out.println("Has acertado, Dinero Acumulado: " + dinero + ", (Ha salido el numero: " + dado + ")");
            } else {
                System.out.println("Dinero Acumulado: " + dinero + ", (Ha salido el numero: " + dado + ")");
            }
        } while (dado != aleatorio);
        System.out.println("");

        System.out.print("Numero prohibido");
        System.out.print("  Dinero Acumulado");
        System.out.print("  Tiradas");
        System.out.println("");
        System.out.print("        " + aleatorio);
        System.out.print("               " + dinero);
        System.out.print("             " + tiradas);
        System.out.println("");

    }
}

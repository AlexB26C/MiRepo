package ejerciciosprogramacionlibro.Tema4;

import java.util.Scanner;


public class EjercicioCajero {

    public static void main(String[] args) {
        mostrarMenu();
    }

    static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        double saldo = 1000;

        while (opcion != 4) {
            System.out.println("==== CAJERO AUTOMATICO ====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            System.out.println("");
            
            while (opcion < 1 || opcion > 4) {
                System.out.println("Has elegido una opcion no valida. Elige un numero del 1 al 4 segun la opcion que quieras");

                System.out.println("==== CAJERO AUTOMATICO ====");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Ingresar dinero");
                System.out.println("3. Retirar dinero");
                System.out.println("4. Salir");
                System.out.print("Elige una opcion: ");
                opcion = sc.nextInt();
                System.out.println("");
            }

            switch (opcion) {
                case 1 ->
                    consultar(saldo);
                case 2 ->
                    saldo = ingresar(saldo, sc);
                case 3 ->
                    saldo = retirar(saldo, sc);
            }
        }
        System.out.println("HAS SALIDO");
    }

    static double ingresar(double saldo, Scanner sc) {
        double dineroNuevo;

        System.out.print("Cuanto dinero quieres ingresar: ");
        double dineroAIngresar = sc.nextDouble();

        while (dineroAIngresar < 0) {
            System.out.println("No puedes ingresar cantidades negativas");
            System.out.println("Introduce una nueva cantidad para ingresar: ");
            dineroAIngresar = sc.nextDouble();
        }
        dineroNuevo = saldo + dineroAIngresar;

        System.out.println("Nuevo saldo: " + dineroNuevo);

        return dineroNuevo;
    }

    static double retirar(double saldo, Scanner sc) {
        double dineroNuevo = 0;

        try {
            System.out.println("Cuanto dinero quieres retirar: ");
            double dineroARetirar = sc.nextDouble();

            while (dineroARetirar > saldo || dineroARetirar < 0) {
                System.out.println("No puedes retirar mas de lo que tienes ni cantidades negativas");
                System.out.println("Introduce una nueva cantidad para retirar: ");
                dineroARetirar = sc.nextDouble();
                
                dineroNuevo = saldo - dineroARetirar;

                System.out.println("Nuevo saldo: " + dineroNuevo);

                
            }
        } catch (NumberFormatException e) {
            System.out.println("Tienes que poner numeros reales no letras");
        }
        return dineroNuevo;
}
    

    static void consultar(double saldo) {
        System.out.println("El saldo actual es: " + saldo);
    }
}
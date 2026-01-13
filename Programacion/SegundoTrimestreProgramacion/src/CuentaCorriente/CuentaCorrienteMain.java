package CuentaCorriente;

import java.util.Scanner;

public class CuentaCorrienteMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime el numero del DNI (Obligatorio): ");
        String dni = sc.next();
        
        System.out.print("Dime tu nombre o para no asignar nombre dale al Enter: ");
        String nombre = sc.nextLine();
        
        sc.nextLine();
        
        System.out.print("Dime si quieres meter una cantidad inicial de saldo o si no quieres pulsa Enter: ");
        double saldo = sc.nextDouble();
        
        CuentaCorriente c;
        if (nombre.equals(" ")){
            c = new CuentaCorriente(dni, saldo);
        } else {
            if(saldo == 0){
                c = new CuentaCorriente(dni, nombre);
            } else {
                c = new CuentaCorriente(dni, nombre, saldo);
            }
        }
        
        c.ingreso(1000);
        c.sacarDinero(300);
        c.mostrarInformacion();
        System.out.println("Puedo sacar 700 euros: " + c.sacarDinero(700));
        System.out.println("Puedo sacar 500 euros: " + c.sacarDinero(500));
        c.setBanco("Hola");
        c.mostrarInformacion();
    }
    
}

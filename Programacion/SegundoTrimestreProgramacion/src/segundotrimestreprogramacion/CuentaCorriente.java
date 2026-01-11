package segundotrimestreprogramacion;
public class CuentaCorriente {
    String DNI;
    String Nombre;
    double saldo;
    static private String nombreBanco = "BBVA";
            
    CuentaCorriente(String D1, String N1){
        DNI = D1;
        Nombre = N1;
        saldo = 0;
    }
    
    CuentaCorriente(String D2, double S2){
        DNI = D2;
        Nombre = "Sin asignar";
        saldo = S2;
    }
    
    CuentaCorriente(String D3, String N3, double S3){
        DNI = D3;
        Nombre = N3;
        saldo = S3;
    }
    
    boolean sacarDinero (double cantidad){
        boolean operacionPosible;
        
        if (saldo >= cantidad) {
            saldo -= cantidad;
            operacionPosible = true;
        } else {
            System.out.println("No hay disponible suficiente");
            operacionPosible = false;
        }
        return operacionPosible;
    }
    
    void ingreso (double cantidad){
        saldo += cantidad;
    }
    
    void mostrarInformacion() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("DNI: " + DNI);
        System.out.println("Saldo: " + saldo + " euros.");
        System.out.println("Nombre del banco: " + getBanco());
    }

    static void setBanco(String NombreBanco){
        nombreBanco = NombreBanco;
    }
    
    static String getBanco(){
        return nombreBanco;
    }
}


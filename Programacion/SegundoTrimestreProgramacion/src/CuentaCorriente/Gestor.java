package CuentaCorriente;
public class Gestor {
    static private String Telefono;
    public String NombreGestor;
    static double importeMaximo;
    
    public Gestor(String NombreGestor, String Telefono, double importeMaximo){
        this.NombreGestor = NombreGestor;
        this.Telefono = Telefono;
        this.importeMaximo = importeMaximo;
    }
    
    public Gestor(String NombreGestor, String Telefono){
        this.NombreGestor = NombreGestor;
        this.Telefono = Telefono;
        this.importeMaximo = 10000;
    }
    
    static void setImporte (double importeNuevo){
        importeMaximo = importeNuevo;
    }
    
    static String getTelefono(){
        return Telefono;
    }
    
    void mostrarInformacion() {
        System.out.println("Nombre: " + NombreGestor);
        System.out.println("Telefono: " + Telefono);
        System.out.println("Immporte Maximo: " + importeMaximo + " euros");
    }     
}


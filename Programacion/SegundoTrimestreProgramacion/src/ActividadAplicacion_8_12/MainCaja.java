package ActividadAplicacion_8_12;
public class MainCaja {
    public static void main(String[] args) {
        Caja c = new Caja(12, 20, 30, "CM");
        System.out.println(c.getVolumen());
        c.setEtiqueta("LaCajaDePandora");
        System.out.println(c);
    }
    
}

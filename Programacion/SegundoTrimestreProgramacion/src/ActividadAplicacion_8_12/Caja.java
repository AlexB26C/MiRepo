package ActividadAplicacion_8_12;
public class Caja {
    int ancho;
    int alto;
    int fondo;
    String etiqueta;
    enum Unidad{CM, M}
    Unidad unidad;
    
    public Caja(int ancho, int alto, int fondo, String unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = Unidad.valueOf(unidad);
    }
    
    double getVolumen(){
        return ancho*alto*fondo;
    }
    
    void setEtiqueta(String etiqueta){
        if(etiqueta.length() > 30){
            this.etiqueta = "Te has pasado con la longitud de la etiqueta el maximo es 30";
        } else {
            this.etiqueta = etiqueta;
        }
        
    }
    
    @Override
    public String toString() {
        return "Caja: \nancho: " + ancho + "\nalto: " + alto + "\nfondo: " + fondo + "\nunidad: " + unidad + "\netiqueta: " + etiqueta;
    }
    
    
}

package SintonizadorFM;
public class SintonizadorFM {
    double frecuencia;

    public SintonizadorFM(double frecuencia) {
        if (frecuencia < 80){
            this.frecuencia = 80;
        } else if (frecuencia > 108){
            this.frecuencia = 108;
        } else {
            this.frecuencia = frecuencia;
        }
    }
    
    public SintonizadorFM(){
        this(80);
    }
    
    public void up(){
        frecuencia += 0.5;
        if (frecuencia > 108){
            frecuencia = 80;
        }
    }
    
    public void down(){
        frecuencia -= 0.5;
        if (frecuencia < 80){
            frecuencia = 108;
        }
    }
    
    public void display(){
        System.out.println("Frecuencia: " + frecuencia + " MHz");
    }
    
}

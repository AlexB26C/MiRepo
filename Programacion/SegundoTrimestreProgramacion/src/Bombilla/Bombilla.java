package Bombilla;
public class Bombilla {
    private boolean estadoBombilla;
    static boolean interruptorGeneral = true;
    
    public Bombilla(){
        estadoBombilla = false;       
    }
    
    public void encender(){
        estadoBombilla = true;
    }
    
    public void apagar(){
        estadoBombilla = false;
    }
    
    public boolean mostrarEstadoBombilla(){
        boolean encendida = false;
        if(interruptorGeneral == false){
            encendida = false;
        } else if (interruptorGeneral == true && estadoBombilla == true){
            encendida = true;
        } else if (interruptorGeneral == true && estadoBombilla == false){
            encendida = false;
        }
        return encendida;
    }
    
    
}

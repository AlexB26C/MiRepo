package Hora;
public class Hora {
    static private byte hora;
    static private byte minuto;
    static private byte segundo;

    static public void setHora(byte horaAsignada) {
        if(hora > 23 || hora < 0){
            hora = 0;
        } else {
            hora = horaAsignada;
        }
    }

    static public void setMinuto(byte minutoAsignado) {
        if(minuto > 59 || minuto < 0){
            minuto = 0;
        } else {
            minuto = minutoAsignado;
        }
    }

    static public void setSegundo(byte segundoAsignado) {
        if(segundo > 59 || segundo < 0){
            segundo = 0;
        } else {
            segundo = segundoAsignado;
        }
    }
    
    static String incrementaSegundo(int primero){
        segundo += 1;
        
        if(segundo == 60){
            segundo = 0;
            minuto += 1;
        }
        
        if (minuto == 60){
            minuto = 0;
            hora += 1;
        } 
        
        if(hora == 24){
            hora = 0;
        }
        
        
        return hora+":"+minuto+":"+segundo;
        
        
    }
    
    static String incrementaSegundo(){
        
        if(segundo == 60){
            segundo = 0;
            minuto += 1;
        }

        if (minuto == 60){
            minuto = 0;
            hora += 1;
        } 

        if(hora == 24){
            hora = 0;
        }
        
        return hora+":"+minuto+":"+segundo;
        
        
    }
}


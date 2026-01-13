package Hora;

import java.util.Scanner;

public class MainHora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Hora: ");
        Hora.setHora(sc.nextByte());
        
        System.out.print("Minuto: ");
        Hora.setMinuto(sc.nextByte());
        
        System.out.print("Segundo: ");
        Hora.setSegundo(sc.nextByte());
        
        System.out.print("Cuantos segundos quieres mostrar: ");
        int segundosAMostrar = sc.nextInt();
        
        boolean primerIncremento = false;
        for(int i = 0; i < segundosAMostrar; i++){
            if (primerIncremento){
                System.out.println(Hora.incrementaSegundo(1));
            } else {
                System.out.println(Hora.incrementaSegundo());
            }
            primerIncremento = true;
            
        }
        
        
    }
    
}

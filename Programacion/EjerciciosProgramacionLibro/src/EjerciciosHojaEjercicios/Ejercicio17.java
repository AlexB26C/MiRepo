package EjerciciosHojaEjercicios;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("!AVISO PREVIO¡ Si quieres salir del programa tendras que poner que se añadan -1 segundos");
        System.out.print("Dime la hora (00-23): ");
        int hora = sc.nextInt();
        
        System.out.print("Dime los minutos (00-59): ");
        int min = sc.nextInt();
        
        System.out.print("Dime los segundos (00-59): ");
        int seg = sc.nextInt();
        
        System.out.println("Dime cuantos segundos quieres añadir: ");
        int segAñadir = sc.nextInt();
        int segARestar = 0;
        
          if (seg < 60){
                seg = seg + segAñadir;
                segARestar = 60 - seg;
                            }
            
            if (seg >= 60){
                min = min + 1;
                seg = seg - 60;
            }
                      
            if (min >= 60){
                hora = hora+1;
                min = min - 60;
                seg = seg - 60;
            }
            
            if (hora == 24){
                hora = 0;
            } 
                       
            System.out.println(hora + ":" + min + ":" + seg);
                  
        }
        
    }
    


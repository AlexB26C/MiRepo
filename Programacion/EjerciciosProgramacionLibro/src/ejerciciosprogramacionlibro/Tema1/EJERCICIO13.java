package ejerciciosprogramacionlibro.Tema1;

import java.util.*;

public class EJERCICIO13 {
    public static void main(String[] args) {
        int nota1, nota2, nota3, notaMediaBoletin;
        double notaMediaExpediente;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime la nota del primer trimestre");
        nota1 = sc.nextInt();
        System.out.print("Dime la nota del segundo trimestre");
        nota2 = sc.nextInt();
        System.out.print("Dime la nota del tercer trimestre");
        nota3 = sc.nextInt();
        
        notaMediaExpediente = (nota1 + nota2 + nota3)/3.0;
        notaMediaBoletin = (int) notaMediaExpediente;
        
        System.out.println("Boletin de calificaciones: " + notaMediaBoletin);
        System.out.println("Expediente: " + notaMediaExpediente);
    }
    
}

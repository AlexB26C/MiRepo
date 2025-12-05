package ejerciciosprogramacionlibro.Tema2;

import java.util.Scanner;

public class Ejercicio212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime el dia: ");
        int dia = sc.nextInt();
        
        System.out.print("Dime el mes: ");
        int mes = sc.nextInt();
        
        System.out.print("Dime el año: ");
        int anio = sc.nextInt();
        
        boolean fechaCorrecta = false;
        
        if ((mes == 2) && (dia >= 1 && dia <= 28)) {
            fechaCorrecta = true;
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes ==11) && (dia >=1 && dia <= 30)){
            fechaCorrecta = true;
        } else fechaCorrecta = ((mes == 1 || mes == 3 || mes == 5 || mes ==7 || mes == 8 || mes == 10|| mes == 12) && (dia >= 1 && dia <= 31));
        
        if (fechaCorrecta){
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es correcta");
        } else System.out.println("La fecha es incorrecta");
    }
    
}

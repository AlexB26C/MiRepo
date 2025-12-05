/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosprogramacionlibro.Tema3;

/**
 *
 * @author alexb
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here     
        for (int i = 1; i <= 3; i++) {
            System.out.println("Bucle externo, i=" + i);
            int j=1;
            while (j <= i) {
                System.out.println("...Bucle interno, j=" + j);
                j++;
            }
        }
    }
    
}

package ejerciciosprogramacionlibro.Tema5;

import java.util.Arrays;

public class Resuelta12 {
    public static void main(String[] args) {
        int t[][] = new int [5][4];
            
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 4; j++){
                t[i][j] = (10*i) +j;
            }
        }
        System.out.println(Arrays.deepToString(t));
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(t[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

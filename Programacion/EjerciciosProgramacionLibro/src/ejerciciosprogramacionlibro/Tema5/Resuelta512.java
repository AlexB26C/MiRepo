package ejerciciosprogramacionlibro.Tema5;
public class Resuelta512 {
    public static void main(String[] args) {
        int t[] [] = new int [5] [4];
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 4; j++){
                t[i][j] = 10 * i + j;
            }
        }
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    
}

package ejerciciosprogramacionlibro.Tema5;
public class Ejercicio11Hojav_3 {
    public static void main(String[] args) {
       
        cargar();
        int MaxMin[] = MaxMin(cargar());
        
        System.out.println("El numero maximo es: " + MaxMin[0]);
        System.out.println("El numero minimo es: " + MaxMin[1]);
    }
    
    static int[] cargar(){
        int t[] = new int [15];
        
        
        for (int i = 0; i < t.length; i++){
            t[i] = (int)(Math.random() * 100 + 1);
        }
        
        return t;
    }
    
    static int[] MaxMin(int t[]){
        int resultado[] = new int[2];
        int maximo = t[0];
        int minimo = t[0];
        
        for (int j = 0; j < t.length; j++){
            if (t[j] > maximo){
                maximo = t[j];
            } else if (t[j] < minimo){
                minimo = t[j];
            }
        }
        resultado[0] = maximo;
        resultado[1] = minimo;
        return resultado;
        
    }
}

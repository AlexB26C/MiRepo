package ejerciciosprogramacionlibro.Tema5;
public class Ejercicio52 {
        public static void main(String[] args) {
        int array1[] = new int[10];
        int suma = 0;
        
        //Bucle para meter en cada posicion un numero random desde 0 hasta el valor final de int.
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 100 + 1);
            suma = suma + array1[i];
        } 

        System.out.println("****Valores de las posiciones del array****");

        //Bucle para mostrar cada valor de las posiciones del array creado antes.
        for (int i = 0; i < array1.length; i++) {
            System.out.println("El numero de la posicion " + i + " es: " + array1[i]);
        }

        
        /* Otra manera de hacer la suma con un for que recorre todos los valores del array
        int suma = 0;
        for (int valor: array1){
            suma += valor;
        }
        */
        System.out.println("La suma de todos los valores aleatorios es: " + suma);
    }
}

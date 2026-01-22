package EjercicioAplicacion7_17;
public class Cesar {
    final String abecedario[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    
    static String cifrar(String palabraACifrar, int numeroCodificar){
        char arrayPalabraCifrada[] = new char[palabraACifrar.length()];
        String palabraCifrada;
        
        palabraACifrar = palabraACifrar.toLowerCase();
        
        char ArrayACifrar[] = palabraACifrar.toCharArray();
        
        for (int i = 0; i < ArrayACifrar.length; i++){
            if(ArrayACifrar[i + numeroCodificar] > ArrayACifrar.length){
            
            }
            arrayPalabraCifrada[i] = ArrayACifrar[i + numeroCodificar];
        }
        return null;
    }
}

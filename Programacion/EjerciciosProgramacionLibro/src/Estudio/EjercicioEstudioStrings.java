package Estudio;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioEstudioStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de cadenas: ");
        int numeroCadenas = sc.nextInt();

        String[] textos = new String[numeroCadenas];

        cargarYLimpiarCadenas(textos, sc);
        clasificarCadenas(textos);

        sc.nextLine();
        System.out.print("Que cadena quieres buscar: ");
        String cadenaABuscar = sc.nextLine();

        buscarSubcadena(textos, cadenaABuscar);

        invertirCadenas(textos);

        ordenarPorLongitudYAlfabeto(textos);

        reemplazarVocales(textos);
    }

    static void cargarYLimpiarCadenas(String[] textos, Scanner sc) {
        for (int i = 0; i < textos.length; i++) {
            System.out.print("Introduce cadena " + (i + 1) + ": ");
            textos[i] = sc.next();
            if (textos[i].equals(" ")) {
                System.out.println("No se pueden meter cadenas vacias");
                System.out.println("Introduce cadena " + (i + 1) + ": ");
                textos[i] = sc.next();
            }
        }
    }

    static void clasificarCadenas(String[] textos) {
        int cuentaLetras = 0;
        int cuentaNumeros = 0;
        int cuentaAlfanum = 0;
        int cuentaMezcla = 0;

        for (int i = 0; i < textos.length; i++) {

            boolean soloLetras = true;
            boolean soloDigitos = true;
            boolean tieneLetra = false;
            boolean tieneDigito = false;
            boolean tieneOtro = false;

            for (int j = 0; j < textos[i].length(); j++) {
                char c = textos[i].charAt(j);

                if (Character.isLetter(c)) {
                    tieneLetra = true;
                    soloDigitos = false;
                } else if (Character.isDigit(c)) {
                    tieneDigito = true;
                    soloLetras = false;
                } else {
                    tieneOtro = true;
                    soloLetras = false;
                    soloDigitos = false;
                }
            }

            if (soloLetras && textos[i].length() > 0) {
                cuentaLetras++;
            } else if (soloDigitos && textos[i].length() > 0) {
                cuentaNumeros++;
            } else if (tieneLetra && tieneDigito && !tieneOtro) {
                cuentaAlfanum++;
            } else {
                cuentaMezcla++;
            }
        }
        System.out.println("- Solo letras: " + cuentaLetras);
        System.out.println("- Solo digitos: " + cuentaNumeros);
        System.out.println("- Solo Alfanumericos: " + cuentaAlfanum);
        System.out.println("- Mezcla de todo: " + cuentaMezcla);
    }

    static void buscarSubcadena(String[] textos, String subcadena) {
        System.out.print("La subcadena aparece en las cadenas: ");
        for (int i = 0; i < textos.length; i++) {
            if (textos[i].contains(subcadena)) {
                System.out.print(textos[i] + " (pos " + i + "),");
            }
        }
    }

    static void invertirCadenas(String[] textos) {
        String[] arrayInvertido = new String[textos.length];
        for (int i = 0; i < textos.length; i++) {
            String palabraInvertida = "";
            String palabraActual = textos[i];
            for (int j = palabraActual.length() - 1; j >= 0; j--) {
                palabraInvertida = palabraInvertida + palabraActual.charAt(j);

            }
            arrayInvertido[i] = palabraInvertida;
        }
        System.out.println("");
        System.out.println("Las cadenas invertidas son: " + Arrays.toString(arrayInvertido));
    }

    static void ordenarPorLongitudYAlfabeto(String[] textos) {
        int Longitudlarga = textos[0].length();
        int Longitudcorta = textos[0].length();

        String palabraLarga = textos[0];
        String palabraCorta = textos[0];

        for (int i = 1; i < textos.length; i++) {
            if (textos[i].length() == Longitudlarga) {
                if (textos[i].compareToIgnoreCase(palabraLarga) < 0) {
                    Longitudlarga = textos[i].length();
                    palabraLarga = textos[i];
                }
            } else if (textos[i].length() > Longitudlarga) {
                Longitudlarga = textos[i].length();
                palabraLarga = textos[i];

            } else if (textos[i].length() < Longitudcorta) {
                Longitudcorta = textos[i].length();
                palabraCorta = textos[i];
            }
        }

        System.out.println("La palabra mas larga es: " + palabraLarga);
        System.out.println("La palabra mas corta es: " + palabraCorta);
    }

    static void reemplazarVocales(String[] textos) {
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        String[] sinVocales = new String[textos.length];

        for (int i = 0; i < textos.length; i++) {
            String PalabraSinVocal = "";
            for (int j = 0; j < textos[i].length(); j++) {
                char c = textos[i].charAt(j);
                boolean esVocal = false;
                for (int x = 0; x < vocales.length; x++) {
                    if (Character.toLowerCase(c) == vocales[x]) {
                        esVocal = true;
                    }
                }
                if (esVocal) {
                    PalabraSinVocal = PalabraSinVocal + "*";
                } else {
                    PalabraSinVocal = PalabraSinVocal + textos[i].charAt(j);
                }
            }
            sinVocales[i] = PalabraSinVocal;
        }
        System.out.println("Cadenas sin vocales: " + Arrays.toString(sinVocales));
    }

}

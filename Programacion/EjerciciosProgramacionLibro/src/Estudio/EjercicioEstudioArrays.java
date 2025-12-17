package Estudio;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioEstudioArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero de alumnos: ");
        int numeroAlumnos = sc.nextInt();

        int[] notas = new int[numeroAlumnos];

        cargarNotas(notas, sc);
        mostrarNotas(notas);
        calcularMedia(notas);
        contarAprobadosSuspesos(notas);
        mostrarMaxMin(notas);
        ordenarYMostrar(notas);

        System.out.print("Introduce una nota a buscar: ");
        int nota = sc.nextInt();

        System.out.println("La nota aparece " + buscarNota(notas, nota) + " veces");
    }

    static void cargarNotas(int[] notas, Scanner sc) {
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Introduce la nota " + (i + 1) + ": ");
            notas[i] = sc.nextInt();
        }
    }

    static void mostrarNotas(int[] notas) {
        System.out.println("Notas: " + Arrays.toString(notas));
    }

    static double calcularMedia(int[] notas) {
        double media = 0;
        double sumaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            sumaNotas = sumaNotas + notas[i];
            media = sumaNotas / notas.length;
        }
        return media;
    }

    static void contarAprobadosSuspesos(int[] notas) {
        int contadorAprobados = 0;
        int contadorSuspensos = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                contadorAprobados++;
            } else if (notas[i] < 5) {
                contadorSuspensos++;
            }
        }
        System.out.println("Aprobados: " + contadorAprobados);
        System.out.println("Suspensos: " + contadorSuspensos);
    }

    static void mostrarMaxMin(int[] notas) {
        int max = notas[0];
        int min = notas[0];

        for (int i = 0; i < notas.length; i++) {
            if (i != notas.length - 1) {
                if (notas[i] > max) {
                    max = notas[i];

                } else if (notas[i] < min) {
                    min = notas[i];
                }
            }
        }
        System.out.println("Nota Maxima: " + max);
        System.out.println("Nota Minima: " + min);
    }

    static void ordenarYMostrar(int[] notas) {
        Arrays.sort(notas);

        System.out.println("Notas ordenadas: " + Arrays.toString(notas));
    }

    static int buscarNota(int[] notas, int nota) {
        int contNota = 0;
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] == nota){
                contNota++;
            }
        }
        return contNota;
    }
}

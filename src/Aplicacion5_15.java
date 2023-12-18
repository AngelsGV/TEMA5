
import java.util.Arrays;
import java.util.Scanner;

public class Aplicacion5_15 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        int[][] notas = new int[5][3];
        // He decicido que será una tabla bidimensional porque en la tabla notas hay 2 propiedades.
        // Eje y --> trimestre (Hay 3 trimestres)
        // Eje x --> alumno ( son 5 por grupo, y el enunciado pide que solo estudiemos un grupo,
        // si no, la haríamos tridimensional, con z --> nº de grupos)

        for (int j = 0; j < 3; j++) {
            System.out.println("Trimestre " + (j + 1) + ": ");

            for (int i = 0; i < 5; i++) {
                System.out.println("Nota del alumno (" + (i + 1) + "): ");
                int nota = sc.nextInt();

                while (nota < 0 || nota > 10) {
                    // He puesto este bucle para delimitar el rango de notas de 0 a 10
                    // y que si te equivocas no debas empezar desde el principio.
                    System.out.println("Nota no valida, vuelve a introducirla: ");
                    nota= sc.nextInt();
                }
                notas[i][j] = nota;
            }
        }
        System.out.println(Arrays.deepToString(notas));
        // Lo usamos para ver que el programa resuelve correctamente.
        notaMedia(notas);
        notaMediaAlumno(notas);
    }
    static void notaMedia(int t[][]){

    }
    static void notaMediaAlumno(int t[][]){
        System.out.println("¿ De qué alumno quieres la media? (Pulsa -1 para salir): ");
        // Lo voy a hacer así para que sea más interesante, por si se quiere comprobar más de una media.

    }
}


// -------------------------------------------------
// MEJORAR:
// - Limitar rango de notas de 0 a 10 --> Solucionado a medias, te vuelve a pedir la nota 1 vez.
// Después si la pones otra vez mal, no la mira. --> CORREGIDO! He pasado de un if-else a un while con la condición
// érronea dentro del bucle. Así hasta que no cumpla la condición el bucle es infinito.




import java.util.Scanner;

    public class Actividad5_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el tamaño del grupo y el número de trimestres
        final int NUM_ALUMNOS = 5;
        final int NUM_TRIMESTRES = 3;

        // Crear la matriz para almacenar las notas
        int[][] notas = new int[NUM_ALUMNOS][NUM_TRIMESTRES];

        // Entrada de datos
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            for (int j = 0; j < NUM_TRIMESTRES; j++) {
                System.out.print("Introduce la nota del alumno " + (i + 1) + " en el trimestre " + (j + 1) + ": ");
                notas[i][j] = scanner.nextInt();
            }
        }

        // Calcular la media del grupo en cada trimestre
        double[] mediaTrimestre = new double[NUM_TRIMESTRES];
        for (int j = 0; j < NUM_TRIMESTRES; j++) {
            int sumaNotasTrimestre = 0;
            for (int i = 0; i < NUM_ALUMNOS; i++) {
                sumaNotasTrimestre += notas[i][j];
            }
            mediaTrimestre[j] = (double) sumaNotasTrimestre / NUM_ALUMNOS;
        }

        // Mostrar la media del grupo en cada trimestre
        System.out.println("\nMedia del grupo en cada trimestre:");
        for (int j = 0; j < NUM_TRIMESTRES; j++) {
            System.out.println("Trimestre " + (j + 1) + ": " + mediaTrimestre[j]);
        }

        // Solicitar la posición del alumno para calcular su media
        System.out.print("\nIntroduce la posición del alumno (1-" + NUM_ALUMNOS + "): ");
        int posicionAlumno = scanner.nextInt();

        // Verificar que la posición sea válida
        if (posicionAlumno < 1 || posicionAlumno > NUM_ALUMNOS) {
            System.out.println("Posición de alumno no válida.");
        } else {
            // Calcular la media del alumno en la posición dada
            double mediaAlumno = 0;
            for (int j = 0; j < NUM_TRIMESTRES; j++) {
                mediaAlumno += notas[posicionAlumno - 1][j];
            }
            mediaAlumno /= NUM_TRIMESTRES;

            // Mostrar la media del alumno en la posición dada
            System.out.println("Media del alumno en la posición " + posicionAlumno + ": " + mediaAlumno);
        }

        // Cerrar el scanner
        scanner.close();
    }
}

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
    static void notaMedia(int[][] t){
        // Las medias que se buscan son de las columnas.
        // La idea es separarlo por trimestres.
        int[] sumaTrimestres = new int[3];
        double[] mediaTrimestres = new double[3];

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 5; i++) {
                sumaTrimestres[j] += t[i][j];
            }
            mediaTrimestres[j] = (double) sumaTrimestres[j] / 5;
        }

        for (int j = 0; j < 3; j++) {
            System.out.println("La media del trimestre " + (j + 1) + " es: " + mediaTrimestres[j]);
        }
    }
    static void notaMediaAlumno(int[][] t){
        // En este caso nos interesaría hacer la media de una fila.
        Scanner sc = new Scanner(System.in);
        System.out.println("¿ De qué alumno quieres la media? (Pulsa -1 para salir): ");
        // Lo voy a hacer así para que sea más interesante, por si se quiere comprobar más de una media.
        int alumno = sc.nextInt();
        int sumaNotasAlumno = 0;

        while (alumno != -1){
            // Se podría poner while(alumno!=-1 && (alumno > 5 || alumno < 1){
            // pero me parece más facil verlo de esta forma.
            // cuando he visto 2 while seguidos he visto que se podrían juntar.
            while (alumno > 5 || alumno < 1){
                //Si sale del rango del grupo de alumnos se vuelve a pedir el valor.

            System.out.println("Ese aumno no está en nuestra base de datos.");
            System.out.println("Vuelva a introducir el número de alumno, por favor: ");
            alumno = sc.nextInt();
            }

            for (int j = 0; j < 3; j++) {
                //Se recorre el array del trimestre 1 al 3
                sumaNotasAlumno += t[alumno - 1][j];
                // Se descuenta 1 al alumno  porque la array va de 0 a 2.


            double mediaAlumno = (double) sumaNotasAlumno / 3;
            System.out.println("La media del alumno " + alumno + " es: " + mediaAlumno);

            System.out.print("¿De qué otro alumno quieres la media? (1-5, pulsa -1 para salir): ");
             alumno = sc.nextInt();
             }
        }
    }
}




// -------------------------------------------------
// MEJORAR:
// - Limitar rango de notas de 0 a 10 --> Solucionado a medias, te vuelve a pedir la nota 1 vez.
// Después si la pones otra vez mal, no la mira. --> CORREGIDO! He pasado de un if-else a un while con la condición
// érronea dentro del bucle. Así hasta que no cumpla la condición el bucle es infinito.

// PROBLEMAS:
// - No se como abordar las funciones de las medias, sobretodo no se me ocurre cómo coger una --> OK
// - Conseguí volver a pedir el alumno que se quiere la media, pero si es mayor y ya se ha calculado 1 vez, da error.
// --> CORREGIDO


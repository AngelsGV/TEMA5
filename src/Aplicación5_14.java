import java.util.Scanner;
import java.util.Arrays;
public class Aplicación5_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sueldo = 0;

        double contador = 0, sumaSueldos = 0; //Lo inicializamos en 0.
        double sueldos[] = new double[2]; //El sueldo puede ser con decimales.
        // Empezamos la tabla con longitud uno y luego la incrementaremos a medida que vayamos introduciendo valores.
        // Actualización 2.0. --> He puesto que la longitud sea 2 para tener más margen de error,
        // pero el principio que usaré es el anterior.

        // También podriamos crearla de longitud muy grande y que queden espacios vacíos,
        // ocuparía memoria pero el recolector de basura se haría cargo.
        // Creo que la 1ª opción es la más óptima.
        boolean seguirPreguntando = true; //Lo iniciamos en true porque vamos a poner la condicion en false.

        while (sueldo != -1) {
            System.out.println("Introduce el sueldo (finaliza con -1): ");
            sueldo = sc.nextDouble();
            for (int i = 0; i < sueldos.length; i++) {
                sueldos[i] = sueldo;
            }
            if (sueldo == -1) {
                seguirPreguntando = false;
            }

        }
        System.out.println(Arrays.toString(sueldos));
        maxSueldos(sueldos);
        minSueldos(sueldos);

    }

    static double maxSueldos(double t[]) {
        // Vamos a crear una función para cada apartado del problema. En este caso la función calculará el max.
        double max = t[0];
        // Indicamos que max está en indice 0 para poder recorrer el array buscando el maximo real,
        for (double sueldo : t) { // e serán los valores del Array t, que será sueldos.
                if (sueldo > max) {
                    sueldo = max;
                }
                System.out.println("El valor máximo será: " + max);

        }return max;
    }
    static double minSueldos(double t[]) {
        // Vamos a crear una función para cada apartado del problema. En este caso la función calculará el max.
        double min = t[0];
        // Indicamos que max está en indice 0 para poder recorrer el array buscando el maximo real,
        for (double sueldo : t) { // e serán los valores del Array t, que será sueldos.
            if (sueldo < min) {
                sueldo = min;
            }
            System.out.println("El valor minimo será: " + min);

        }return min;
    }

}
// ----------------------------------------------------
//PROBLEMAS:
// - Cuando sale del bucle para introducir los datos, el array no se ha generado correctamente.

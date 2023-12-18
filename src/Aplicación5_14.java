import java.util.Scanner;
import java.util.Arrays;
public class Aplicación5_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sueldo = 0;

        double contador = 0, sumaSueldos = 0; //Lo inicializamos en 0.
        double sueldos[] = new double[1]; //El sueldo puede ser con decimales.
        // Empezamos la tabla con longitud uno y luego la incrementaremos a medida que vayamos introduciendo valores.
        // También podriamos crearla de longitud muy grande y que queden espacios vacíos,
        // ocuparía memoria pero el recolector de basura se haría cargo.
        // Creo que la 1ª opción es la más óptima.
        boolean seguirPreguntando = true; //Lo iniciamos en true porque vamos a poner la condicion en false.

        while ( sueldo != -1) {
            System.out.println("Introduce el sueldo (finaliza con -1): ");
            sueldo = sc.nextDouble();

            if (sueldo == -1) {
                seguirPreguntando = false;

            if(contador == sueldos.length) {
                sueldos = Arrays.copyOf(sueldos, (int) contador + 1);
                // Se aumenta la longitud de la array.

            }
            sueldos[(int) contador] = sueldo;
                sumaSueldos += sueldo;
                contador++;



        }System.out.println(Arrays.toString(sueldos));

    }
}
}

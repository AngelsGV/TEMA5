
import java.util.Scanner;
import java.util.Arrays;
public class Actividad5_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sueldo; //Puede ser con cifras.
        System.out.println("Introduce el sueldo, se ha de introducir -1 para parar:" );
        double[] sueldos = new double[1]; //El tamaño inicial de el array es 1, luego va incrementando.

        int contador = 0; //El contador, oviamente lo empezamos en 0.
        while (true) {
            sueldo = scanner.nextDouble();

            // Verificar si se debe finalizar la entrada de datos
            if (sueldo == -1) {
                break;
            }

            // Aumentar el tamaño del array si es necesario
            if (contador == sueldos.length) {
                double[] nuevoArray = new double[contador * 2];
                System.arraycopy(sueldos, 0, nuevoArray, 0, contador);
                sueldos = nuevoArray;
            }

            // Agregar sueldo al array
            sueldos[contador] = sueldo;
            contador++;
        }

        // Verificar si se han introducido sueldos
        if (contador == 0) {
            System.out.println("No se introdujeron sueldos.");
        } else {
            // Ordenar los sueldos de forma decreciente usando Selection Sort
            for (int i = 0; i < contador - 1; i++) {
                int indiceMaximo = i;
                for (int j = i + 1; j < contador; j++) {
                    if (sueldos[j] > sueldos[indiceMaximo]) {
                        indiceMaximo = j;
                    }
                }
                // Intercambiar sueldos[i] y sueldos[indiceMaximo]
                double temp = sueldos[i];
                sueldos[i] = sueldos[indiceMaximo];
                sueldos[indiceMaximo] = temp;
            }

            // Mostrar sueldos ordenados
            System.out.println("\nSueldos ordenados de forma decreciente:");
            for (int i = 0; i < contador; i++) {
                System.out.println(sueldos[i]);
            }

            // Calcular y mostrar el sueldo máximo y mínimo
            double sueldoMaximo = sueldos[0];
            double sueldoMinimo = sueldos[contador - 1];
            System.out.println("\nSueldo máximo: " + sueldoMaximo);
            System.out.println("Sueldo mínimo: " + sueldoMinimo);

            // Calcular y mostrar la media de los sueldos
            double sumaSueldos = 0;
            for (int i = 0; i < contador; i++) {
                sumaSueldos += sueldos[i];
            }
            double mediaSueldos = sumaSueldos / contador;
            System.out.println("Media de los sueldos: " + mediaSueldos);
        }
    }
}
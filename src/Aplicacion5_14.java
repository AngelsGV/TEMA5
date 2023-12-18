import java.util.Scanner;
import java.util.Arrays;

public class Aplicacion5_14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sueldo = 0;
        int cont=0;
        double[] sueldos = new double[1]; //El sueldo puede ser con decimales.
        // Empezamos la tabla con longitud uno y luego la incrementaremos a medida que vayamos introduciendo valores.

        // También podriamos crearla de longitud muy grande y que queden espacios vacíos,
        // ocuparía memoria pero el recolector de basura se haría cargo.
        // Creo que la 1ª opción es la más óptima.

        boolean seguirPreguntando = true; //Lo iniciamos en true porque vamos a poner la condicion en false.

        while (sueldo != -1) {
            System.out.println("Introduce el sueldo (finaliza con -1): ");
            sueldo = sc.nextDouble();

            //for (int i = 0; i < sueldos.length; i++) {
               // sueldos[i] = sueldo;}
            // Código mal escrito. Al actualizar la forma de hacer este programa he decidido omitirlo.
            // Lo dejo para estudiarlo en el futuro. Pero es inútil.

            if (sueldo == -1) { // Condición para salir del bucle sin usar break.
                seguirPreguntando = false;
            }
            else {
                //Para ir aumentando la longitud de la matriz se deberán hacer copias nuevas ídenticas
                // pero con incremento de la longitud.
                sueldos = Arrays.copyOf(sueldos,sueldos.length +1);
                sueldos[cont] = sueldo;
                cont++;
            }
        }
        System.out.println(Arrays.toString(sueldos));


        // En este punto vamos a llamar a las funciones creadas.
        ordenDecreciente(sueldos);
        maxSueldos(sueldos);
        minSueldos(sueldos);
        System.out.println("La media de los sueldos es: " + mediaSueldos(sueldos,sueldos.length));
        //El último te lo escribo así para que veas que si que sé usar las funciones que devuelven valores ya.

    }

    static void maxSueldos(double[] t) {
        // Vamos a crear una función para cada apartado del problema. En este caso la función calculará el max.
        double max = t[0];
        // Indicamos que max está en indice 0 para poder recorrer el array buscando el maximo real,
        for (double sueldo : t) { // sueldo serán los valores del Array t, que será sueldos.
                if (sueldo > max) {
                    max = sueldo;
                }
        }
        System.out.println("El valor máximo será: " + max);
    }
    static void minSueldos(double[] t) {
        // Vamos a crear una función para cada apartado del problema. En este caso la función calculará el min.
        double min = t[0];
        // Indicamos que min está en indice 0 para poder recorrer el array buscando el minimo real,
        for (double sueldo : t) { // sueldo serán los valores del Array t, que será sueldos.
            if (sueldo < min) {
                min = sueldo;
            }
        }
        System.out.println("El valor minimo será: " + min);
    }
    static void ordenDecreciente(double[] t) { //No hace falta gastar in, porque no devuelve un calculo núerico como tal.
            Arrays.sort(t); // Ordenar en orden ascendente
            System.out.println("El orden decreciente es: ");
            for (int i = t.length - 1; i >= 0; i--) { // Esta vez empezamos por el último indice i vamos decreciendo hasta llegar al 0.
              //  System.out.println(t[i]);
            }
            System.out.println(Arrays.toString(t));
        }

    static double mediaSueldos(double[] t, int n){
        double sumaSueldos = 0;
        for (double sueldo : t){
           sumaSueldos += sueldo;
        }
        double media = sumaSueldos/n;
        return media;
    }

}
// ----------------------------------------------------
//PROBLEMAS:
// - Cuando sale del bucle para introducir los datos, el array no se ha generado correctamente.
// - 2.0. Ahora se genera bien pero la longitud final incrementa 1. (Pone un 0)
// - Valor max y min incorrecto. --> Corregido!
//      Error: Sueldo = min X
//             Min = Sueldo OK
// - Media incorrecta. --> Corregido :)

//POSIBLES MEJORAS:
// - Mostrar el orden decreciente en Arrays. --> Corregido!

//OTRAS FORMAS:
// - for(int cont;sueldo!=-1;cont++) --> En vez del while del principio.

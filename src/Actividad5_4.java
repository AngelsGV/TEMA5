//buscar: int buscar(int t[], int clave)
import java.util.Arrays;
import java.util.Scanner;
//Importamos librerías necessarias para este ejercicio.
public class Actividad5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el valor clave: ");
        int clave = sc.nextInt();

        System.out.println("Introduzca la cantidad de números que quiere la matriz: ");
        int n = sc.nextInt();
        //Números que va a tener el array.

        while (n <= 0) {
            //Para evitar que nos salte error si un núm es negativo. Y pedirlo positivo
            System.out.println("Por favor, introduzca un número positivo para la cantidad de números: ");
            n = sc.nextInt();
        }

        int[] tabla = new int[n];
        // Se introduce el nombre del array y los números que va a tener.
        // En este caso serán los introducidos por el usuario.

        for (int i = 0; i < n; i++) {
            //Bucle for que empieza con i=0, acaba cuando la  i sea mayor o igual al número de la array.
            // Y en cada iteración del bucle, i aumenta una unidad.
            System.out.println("Introduzca un número entero: ");
            tabla[i] = sc.nextInt();
            //Se guardan los números en sus posiciones correspondientes.
        }

        System.out.println(Arrays.toString(tabla));
        //Mostrar tabla creada.
        // No lo pide el ejercicio, pero lo encuentro necesario para ver si el inicio del programa funciona como toca
        // y para controlar que la función se aplique como toca.

        buscar(tabla, clave);
    }
    // e es la posición, por lo que la primera posición es el valor 0 en un array.
    //e no tiene que superar el largo de la tabla, que en este ejercicio será n,el valor introducido por el usuario
    // se irá incrementando e en un valor a cada vez que se ejecute el bucle.
    static int buscar(int[] t, int clave) {
        for (int e = 0; e < t.length; e++) {
            // e es la posición, por lo que la primera posición es el valor 0 en un array.
            //e no tiene que superar el largo de la tabla, que en este ejercicio será n,el valor introducido por el usuario
            // se irá incrementando e en un valor a cada vez que se ejecute el bucle.
            if (t[e] == clave) {
                System.out.println("La clave " + clave + " se encuentra en la posición " + e);
                return e;
            }
        }

        System.out.println("La clave " + clave + " no se encuentra en la tabla.");
        return -1; // No se encontró la clave en la tabla
    }
}
//No tengo claro como o si podría poner un return global con en el bucle for y usando if-else.
//Lo he intentado y no me ha salido de ninguna de las maneras.

//También me encuentro en el error de que si en el array hay dos o mas veces la misma clave,
// me cuenta la primera posición que encuentra.

//Por otro lado, he reutilizado un ejercicio que ya tenía para hacer la matriz,
// porque no has dicho como querías que generaramos la matriz. También se hubiera podído hacer los valores randoms.





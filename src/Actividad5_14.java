import java.util.Arrays;
import java.util.Scanner;
//Importamos librerías necessarias para este ejercicio.
public class Actividad5_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tabla = new int[n];
        // Se introduce el nombre del array y los números que va a tener.
        // En este caso serán los introducidos por el usuario.

        for (int i = 0; i == -1; i++) {
            //Bucle for que empieza con i=0, acaba cuando la  i sea mayor o igual al número de la array.
            // Y en cada iteración del bucle, i aumenta una unidad.
            System.out.println("Introduzca su sueldo: ");
            entrada(i);
            tabla[i] = sc.nextInt();
            //Se guardan los números en sus posiciones correspondientes.
        }

        System.out.println(Arrays.toString(tabla));
        //Mostrar tabla creada.
        // No lo pide el ejercicio, pero lo encuentro necesario para ver si el inicio del programa funciona como toca
        // y para controlar que la función se aplique como toca.

    }
    static void entrada ( int n){
        while (n <= 0) {
            Scanner sc = new Scanner(System.in);
            //Para evitar que nos salte error si un núm es negativo. Y pedirlo positivo
            System.out.println("Por favor, introduzca un número positivo para la cantidad de números: ");
            n = sc.nextInt();
        }
    }
}

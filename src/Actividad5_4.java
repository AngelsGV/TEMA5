//buscar: int buscar(int t[], int clave)
import java.util.Arrays;
import java.util.Scanner;
//Importamos librerías necessarias para este ejercicio.
public class Actividad5_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor clave: ");
        int clave = sc.nextInt();
        System.out.println("Introduzca la cantidad de números que quiere la matriz: ");
        int n= sc.nextInt();
        //Números que va a tener el array.

        while (n <= 0) {
            //Para evitar que nos salte error si un núm es negativo. Y pedirlo positivo
            System.out.println("Por favor, introduzca un número positivo para la cantidad de números: ");
            n = sc.nextInt();
        }

        int tabla[] = new int[n];
        // Se introduce el nombre del array y los números que va a tener.
        // En este caso serán los introducidos por el usuario.

        for(int i= 0; i < n; i++) {
            //Bucle for que empieza con i=0, acaba cuando la  i sea mayor o igual al número de la array.
            // Y en cada iteración del bucle, i aumenta una unidad.
            System.out.println("Introduzca un número entero: ");
            tabla[i]= sc.nextInt();
            //Se guardan los números en sus posiciones correspondientes.
        }

        System.out.println(Arrays.toString(tabla));
        //Mostrar tabla creada.
        // No lo pide el ejercicio, pero lo encuentro necesario para ver si el inicio del programa funciona como toca
        // y para controlar que las funciones calculan correctamente.

        buscar(tabla,clave);
    }
    static int buscar(int t[], int clave) {
        for (int i = 0; i < t.length; i++) {
            int cl;
            if (t[i] == clave) {
                cl = i;
                System.out.println(i);
            }else{
                cl = -1;
                System.out.println(-1);
            }
        }
        return (cl);
    }
}

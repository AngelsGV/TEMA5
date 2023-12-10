import java.util.Arrays;
import java.util.Scanner;
//Importamos librerías necessarias para este ejercicio.
public class Actividad5_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de números que quiere la matriz: ");
        int n= sc.nextInt();
        //Números que va a tener el array.
        int tabla[] = new int[n];
        // Se introduce el nombre del array y los números que va a tener.
        // En este caso serán los introducidos por el usuario.

        for(int i= 0; i < n; i++) {
            //Bucle for que empieza con i=0, acaba cuando la  i sea mayor o igual al número de la array.
            // Y en cada iteración del bucle, i aumenta una unidad.
            System.out.println("Introduzca un número: ");
            tabla[i]= sc.nextInt();
            //Se guardan los números en sus posiciones correspondientes.
        }
        System.out.println(Arrays.toString(tabla));
        //Mostrar tabla creada.
        // No lo pide el ejercicio, pero lo encuentro necesario para ver si el inicio del programa funciona como toca
        // y para controlar que las funciones calculan correctamente.
        mediaP(tabla);
        //Se llama a la función que calcula la media de los positivos.
        mediaN(tabla);
        //Se llama a la función que calcula la media de los negativos.
        zeros(tabla);
        //Se llama a la función que cuenta los zeros.
    }
    static int mediaP(int t[]){
        //Uso int porque devolverá números.
        int sumaP = 0;
        int cantidadP = 0;
        // Como pides la media de los positivos, el divisor no será n. Será el num de positivos que haya en el array.
        int medP = t[0];
        for (int e:t){
            if (e > 0) {
                cantidadP ++;
                sumaP += e;
            }
        }
        medP = sumaP/cantidadP;
        System.out.println("El valor medio de los números positivos  es: " + medP);
        return (medP);

    }
    static int mediaN(int t[]){
        //Uso int porque devolverá números.
        int sumaN = 0;
        int cantidadN = 0;
        // Como pides la media de los negativos, el divisor no será n. Será el num de positivos que haya en el array.
        int medN = t[0];
        for (int e:t){
            if (e > 0) {
                cantidadN ++;
                sumaN += e;
            }
        }
        medN = sumaN/cantidadN;
        System.out.println("El valor medio de los números positivos  es: " + medN);
        return (medN);

    }
    static int zeros(int t[]){

        int z = t[0];
        for (int e:t){
            if (e == 0) {
                z++;
            }
        }
        System.out.println("La cantidad de zeros que hay en la martriz es: " + z);
        return (z);

    }
}


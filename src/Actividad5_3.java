import java.util.Arrays;
import java.util.Scanner;
//Importamos librerías necessarias para este ejercicio.
public class Actividad5_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
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

        mediaP(tabla);
        //Se llama a la función que calcula la media de los positivos.

        mediaN(tabla);
        //Se llama a la función que calcula la media de los negativos.

        zeros(tabla);
        //Se llama a la función que cuenta los zeros.
    }

    static double mediaP(int t[]){
        //Uso double porque devolverá números que pueden ser con decimales.
        int sumaP = 0;
        int cantidadP = 0;
        // Como pides la media de los positivos, el divisor no será n. Será el num de positivos que haya en el array.
        double medP;

        for (int e:t){
            if (e > 0) {
                cantidadP ++;
                sumaP += e;
            }
        }if (cantidadP!=0) {
            medP = (double) sumaP/cantidadP;
        } else medP = 0;
        //Si no añado esto, el valor cuando no ha positivos da NaN. Creo que es mas visual así.
        // También hubiese podido abrir un bucle for con retun (0) si es este caso.

        System.out.println("El valor medio de los números positivos  es: " + medP);
        return (medP);

    }
    static double mediaN(int t[]){
        //Uso double porque devolverá números que pueden ser no enteros.
        int sumaN = 0;
        int cantidadN = 0;
        // Como pides la media de los negativos, el divisor no será n. Será el num de positivos que haya en el array.
        double medN;

        for (int e:t){
            if (e < 0) {
                cantidadN ++;
                sumaN += e;
            }
        }if (cantidadN!=0) {
            medN = (double) sumaN/cantidadN;
        } else medN=0;

        System.out.println("El valor medio de los números negativos es: " + medN);
        return (medN);

    }//Este bucle es casi igual que la media positiva.
    static int zeros(int t[]){

        int z = 0;// El sumatorio empezará en 0.
        for (int e:t){ //Recorre todos los valores de la array t
            if (e == 0) {
                z++;
            }
        }

        System.out.println("La cantidad de zeros que hay en la martriz es: " + z);
        return (z);

    }
}

//Problemas al hacer el ejercicio:
//Con las funciones que no tienen 0 me cuenta el negativo.
// static int zeros(int t[]){
//
//        int z = t[0];
//        for (int e:t){
//            if (e == 0) {
//                z++;
//            }
//        }
//        System.out.println("La cantidad de zeros que hay en la martriz es: " + z);
//        return (z);
//
//    }
// En este caso el error estaba en que no iniciaba la suma de z en 0. La iniciaba en el primer valor de la tabla.

//Tanto en negativo como en positivo:
//Primer error, no pensar que la media puede tener decimales.
//problemas con fot(int e:t) --> con el mismo codigo que está escrito
// cada vez que recompilaba el programa me salía un error nuevo :)
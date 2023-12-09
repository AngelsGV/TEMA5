// Pregunar los números que quiere introducir. Núm enteros y mostrar en orden inverso los números introducidos.
import java.util.Arrays;
import java.util.Scanner;
public class Resuelta5_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de números que quiere la matriz: ");
        int e= sc.nextInt();
        int tabla[] = new int[e];

        for(int i= 0; i < e; i++) {
            System.out.println("Introduzca un número: ");
            tabla[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(tabla));
        //Mostrar tabla creada.

        System.out.println("Los números en orden inverso son: ");
        for (int i= tabla.length - 1;i >= 0 ; i --){
            System.out.println(tabla[i]);
        }
    }
    }



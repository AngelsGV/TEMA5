//int[] rellenaPares(int longitud, int fin)
// tabla ordenada en longitud especificada  rellena de numeros pares aleatorios
// Rango de pares 2 hasta fin incluido.
import java.util.Arrays;
import java.util.Scanner;
public class Resuelta5_5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Añade la longitud del array: ");
        int longitud = sc.nextInt();
        System.out.println("En que número quieres que acabe la tabla: ");
        int fin = sc.nextInt();


        rellenaPares(longitud,fin);
    }
    static int[] rellenaPares(int longitud, int fin) {
        int pares[] = new int[longitud];
        int i = 0;
        while (i < pares.length) {
            int num = (int) (Math.random() * fin + 1);
            if (num % 2 == 0) {
                pares[i] = num;
                i++;
            }
            Arrays.sort(pares);
        }return (pares);
    }
}

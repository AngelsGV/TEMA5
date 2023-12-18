
import java.util.Arrays;
import java.util.Scanner;

public class Aplicacion5_15 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        int[][] notas = new int[5][3];

        for (int j = 0; j < 3; j++) {
            System.out.println("Trimestre " + (j + 1) + ": ");

            for (int i = 0; i < 5; i++) {
                System.out.println("Nota del alumno (" + (i + 1) + "): ");
                int nota = sc.nextInt();
                if (nota >= 0 && nota <= 10) {
                    notas[i][j] = nota;
                } else {
                    System.out.println("Nota no valida, vuelve a introducirla: ");
                }
            }
        }
    }
}


// -------------------------------------------------
// MEJORAR:
// - Limitar rango de notas de 0 a 10

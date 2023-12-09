//Introducir por teclado 5 num decimales y mostrarlos en pantalla
import java.util.Arrays;
import java.util.Scanner;
public class Resuelta5_2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double valores[] = new double[5];

        for(int i= 0; i < 5; i++) {
            System.out.println("Introduzca un número: ");
            valores[i]= sc.nextDouble();
        }
        System.out.println(Arrays.toString(valores));
    }
}

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Arrays;
import java.util.Scanner;
public class Resuelta5_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la lonitud deseada de la tabla: ");
        int n = sc.nextInt();
        int t[] = new int[n];

        for(int i=0; i<n; i++ ){
            System.out.println("Introduce valor (" + i + "):" );
            t[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(t));
        System.out.println("¿Qué valor quieres que sea  el máximo en la tabla?");
        int valor = sc.nextInt();

        sinMayores(t,valor);

    }
    static int[] sinMayores(int t[],int valor){
        int copia[] = Arrays.copyOf(t,t.length);
        int i=0;
        while (i<copia.length){
            if (copia[i]>valor){
                copia[i] = copia[copia.length-1];
                copia = Arrays.copyOf(copia,copia.length);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(copia));
        return copia;
    }
}

import java.util.Arrays;
import java.util.Scanner;
public class Resuelta5_9 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int puntos[] = new int[5];

        for (int i = 0; i < 5; i++){
            System.out.println("Puntos del programador (" + (i+1)+"): ");
            puntos[i] = sc.nextInt();
        }

        Arrays.sort(puntos); // ordenamos
        System.out.println("Puntuación: " + Arrays.toString(puntos)); //mostramos

        System.out.println("Puntos del programador de exhibición: ");
        int pPEx = sc.nextInt();
        while (pPEx != -1){
            int pos = Arrays.binarySearch(puntos,pPEx);
            int IndiceInsercion;
            if (pos < 0){
                IndiceInsercion = -pos -1;
            }else{
                IndiceInsercion = pos; //puntuación repetida, ya está en la tabla.
            }
            int copia[] = new int[puntos.length +1];
            System.arraycopy(puntos,0,copia,0,IndiceInsercion);
            System.arraycopy(puntos,IndiceInsercion,copia,IndiceInsercion + 1, puntos.length - IndiceInsercion);
            copia[IndiceInsercion]= pPEx;
            puntos = copia;
            System.out.println("Puntos del programador en exhibición: ");
            pPEx = sc.nextInt();
        }
        System.out.println("Puntuación final: " + Arrays.toString(puntos));
    }
}

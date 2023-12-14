// funcion parametros 2 tablas. 1º 6 num 2ºordenada 6 núm. La función devolvera el número de aciertos.

import java.util.Arrays;

public class Resuelta5_6 {
    static int primitiva (int apuesta[], int comGanadora[]){
        int aciertos= 0;
        for (int a:apuesta){
            if (Arrays.binarySearch(comGanadora, a) >= 0){
                aciertos ++;
            }
        } return (aciertos);
    }
}

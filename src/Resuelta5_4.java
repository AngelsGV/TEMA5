//Función int maximo(int t[]). MAximo valor contenido en la tabla t
public class Resuelta5_4 {

    public static void main(String[] args) {
        int[] t; // o int valores[];
       t = new int[10];

        for (int i = 0; i < t.length; i++) {
            t[i] = (int)(Math.random() * 100 + 1);
            System.out.println(t[i]); //Para que saque los valores aleatorios generados.
        }
        int suma = 0; // Variable de tipo entero iniciada en 0.
        for (int valor: t){
            //Se inicia un bucle for-each que itera a través de una colección llamada valores.
            //La colección debe ser de tipo iterable, como un array,
            //una lista o alguna otra estructura de datos que admita la iteración.
            //En cada iteración, el valor actual se asigna a la variable valor.
            suma += valor;
        }
        System.out.println("La suma de los valores aleatorios es: " + suma);
        maximo(t);
    }
    static int maximo(int t[]){
        int max = t[0];
        for (int e:t){
            if (e > max) {
                max = e;
            }
        }
        System.out.println("El valor máximo es: " + max);
        return (max);

    }
}

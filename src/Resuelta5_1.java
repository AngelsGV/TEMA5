// Tabla de longitud 10, valores aleatorios de 1 a 100. Se mostrará suma de todos los valores.
public class Resuelta5_1 {
    public static void main(String[] args) {
        int[] valores; // o int valores[];
        valores = new int[10];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random() * 100 + 1);
            System.out.println(valores[i]); //Para que saque los valores aleatorios generados.
        }
        int suma = 0; // Variable de tipo entero iniciada en 0.
        for (int valor: valores){
            //Se inicia un bucle for-each que itera a través de una colección llamada valores.
            //La colección debe ser de tipo iterable, como un array,
            //una lista o alguna otra estructura de datos que admita la iteración.
            //En cada iteración, el valor actual se asigna a la variable valor.
            suma += valor;
        }
        System.out.println("La suma de los valores aleatorios es: " + suma);
    }

}


public class Punto24 {

	public static void main(String[] args) {

        // Array de numeros
        int[] numeroS = {23, 67, 89, 12, 55, 33, 74};

        // Contador de numeros mayores a 50
        int cont = 0;

        // Se recorre el array con for-each
        for (int numero : numeroS) {
            // Si el numero es mayor que 50 se suma 1 al cont
            if (numero > 50) {
                cont++;
            }
        }

        // Se muestra el resultado
        System.out.println("Cantidad de numeros mayores que 50: " + cont);
	}

}

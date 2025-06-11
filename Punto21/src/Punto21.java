import java.util.Scanner;

public class Punto21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = {5, 12, 7, 3, 18, 9, 21, 14, 2, 10};

        System.out.print("Ingrese un numero: ");
        int nIn = scanner.nextInt();

        int contador = 0;

        for (int num : numeros) {
            if (num > nIn) {
                contador++;
            }
        }

        System.out.println("Cantidad de numeros mayores que " + nIn + ": " + contador);

        scanner.close();
    }
}

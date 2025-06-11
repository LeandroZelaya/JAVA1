import java.util.Scanner;
import java.util.Random;

public class Punto20 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese la longitud de la contraseña: ");
        int n = scanner.nextInt();

        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String contraseña = "";

        for (int i = 0; i < n; i++) {
            contraseña += caracteres.charAt(random.nextInt(caracteres.length()));
        }

        System.out.println("Contraseña : " + contraseña);

        scanner.close();
	}

}

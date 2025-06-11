import java.util.Random;
import java.util.Scanner;
public class Punto8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int n= 0;
		int nIn=0;
		int cont = 0;
		n = random.nextInt(100);
		
		System.out.println("Ingresar el numero a adivinar");		
		do {
		cont++;
		nIn= scanner.nextInt();
		if(nIn >n) {
			System.out.println("el numero es menor");
		}else {
			System.out.println("el numero es mayor");
		}
		}while(nIn != n);
		System.out.println("Correcto, te tomó " + cont + " intentos");
		scanner.close();
	}

}

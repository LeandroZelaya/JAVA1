
import java.util.Scanner;

public class Punto4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		int par=0;
		int impar=0;
		int i = 0;
		System.out.println("Ingrese un numero");
		n = scanner.nextInt();
		
		for(i=0;i<n;i++) {
			if(i%2==0) {
				par += i;
			}
			else {
				impar +=i;
			}
		}
		
		System.out.println("pares:"+par+"\nimpares:"+ impar);
		scanner.close();
	}

}

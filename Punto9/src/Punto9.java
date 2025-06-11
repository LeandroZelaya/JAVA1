import java.util.Random;
import java.util.Scanner;

public class Punto9 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int [] n;
	n = new int[3];
	int nM=0;
	int i =0;
	System.out.println("Ingresar los 3 numeros");
	for(i=0;i<3;i++) {
		n[i]=scanner.nextInt();
		if(n[i]>nM) {
			nM=n[i];
		}
	}
	System.out.println("el numero mayor es: "+nM);
	}

}

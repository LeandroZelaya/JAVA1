import java.util.Scanner;

public class Punto10 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n=0;
	int i =0;
	int fact =1;
	System.out.println("Ingresar el numero");
	n=scanner.nextInt();
	for(i=1;i<=n;i++) {
		fact= i * fact;
				}
	
	System.out.println("el factorial es: "+fact);
	}

}

import java.util.Scanner;
public class Punto3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		int numero;
		int divisores =0;
		int i;
		System.out.println("ingresar un numero mayor 100 y que sea primo");
		do {
		numero = scanner.nextInt();
		for(i = 1; i<=numero ; i++) { 
			if(numero % i == 0 && numero>100){
				divisores++;
			}
		}
		}while(numero<100 && divisores != 2);
		if(divisores == 2) {
		System.out.println("Es primo");
		}
	 scanner.close();
	}

}

import java.util.Scanner;
public class Punto1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		int numero;
		System.out.println("ingresar un numero del 1 al 100");
		numero = scanner.nextInt();
		if(numero >=1 && numero <=100){
			if(numero % 2 == 0) {
				System.out.println("Es par");
			}
			else {
				System.out.println("Es impar");

			}
		}else {
		System.out.println("El numero esta fuera del rango");
	
		}
	 scanner.close();
	}

}

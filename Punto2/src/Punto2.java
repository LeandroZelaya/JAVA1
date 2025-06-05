import java.util.Scanner;
public class Punto2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		int numero;
		int divisores=0;
		System.out.println("ingresar un numero del 50 al 100");
		numero = scanner.nextInt();
		if(numero >=50 && numero <=100){
			for(int i = 1; i<=numero ; i++) { //for para sacar el numero de divisores
				if(numero % i == 0){
					divisores++;
				}
			}
			if(divisores == 2) {
			System.out.println("Es primo");
			}
			else {
		System.out.println("No es primo");
		for(int i = 1; i<=numero ; i++) {
			if(numero % i == 0){
				System.out.println(i);
			}
		}
			}
		}else {
		System.out.println("El numero esta fuera del rango");
	
		}
	 scanner.close();
	}

}

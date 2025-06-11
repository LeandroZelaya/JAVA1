import java.util.Scanner;

public class Punto11 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n=0;
	int i =0;
	System.out.println("Ingresar el año");
	n=scanner.nextInt();
	if(n%4==0) {
		if(n%100==0 && n%400 != 0) {
			System.out.println("no es bisiesto");
			
		}else {
			System.out.println("si, es bisiesto");

		}
	}else {
		System.out.println("no es bisiesto");
		
	}
	
	}

}

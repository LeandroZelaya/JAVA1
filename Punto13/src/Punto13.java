import java.util.Scanner;

public class Punto13 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String str="";
	int i =0;
	int suma=0;
	int opc = 0;
	int F=0;
	int C=0;
	System.out.println("Ingresar el pasaje:\n1)F a C\n2)C a F");
	opc=scanner.nextInt();
	
	switch(opc) {
		case 1:
			System.out.println("Ingresar el valor en Fahrenheit");
			F=scanner.nextInt();
			C= (F-32)*5/9;
			System.out.println("El resultado del pasaje a Celsius es:"+ C);
			break;
		case 2:
			System.out.println("Ingresar el valor en Celsius");
			C=scanner.nextInt();
			F= C*9/5+32;
			System.out.println("El resultado del pasaje a Fahrenheit es:"+ F);
			break;	
	}
	

	}

}
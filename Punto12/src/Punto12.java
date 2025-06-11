import java.util.Scanner;

public class Punto12 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String str="";
	int i =0;
	int suma=0;
	System.out.println("Ingresar el numero");
	str=scanner.nextLine();
	
	for(i=0; i< str.length();i++) {
		String n = String.valueOf(str.charAt(i));
		suma += Integer.parseInt(n);
	}
	
	System.out.println(suma);
	}

}

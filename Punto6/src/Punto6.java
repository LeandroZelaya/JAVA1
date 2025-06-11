import java.util.Scanner;

public class Punto6{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str="";
		String inv="";
		
		System.out.println("Ingrese la cadena");
		str = scanner.nextLine();
		
        for (int i = str.length() - 1; i >= 0; i--) {
            char letra = str.charAt(i);
            inv += letra;
        }
		System.out.println(inv);
		}
	}


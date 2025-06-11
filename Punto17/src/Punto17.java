import java.util.Scanner;

public class Punto17 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese una frase:");
	        String frase = scanner.nextLine();

	        frase = frase.trim();

	        if (frase.isEmpty()) {
	            System.out.println("La frase no contiene palabras");
	        } else {
	        	String[] partes = frase.split(" ");
	            int contador = 0;

	            for (String palabra : partes) {
	                if (!palabra.equals("")) {
	                    contador++;
	                }
	            }

	            System.out.println("Cantidad de palabras: " + contador);
	        }

	        scanner.close();
	    
	}

}

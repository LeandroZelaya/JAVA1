import java.util.Scanner;

public class Punto23 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        String[] ciudades = {"Buenos Aires", "Cordoba", "Rosario", "Mendoza", "Salta"};

	        System.out.print("Ingrese el nombre de una ciudad: ");
	        String buscada = scanner.nextLine();

	        boolean encontrada = false;

	        for (String ciudad : ciudades) {
	            if (ciudad.equalsIgnoreCase(buscada)) {
	                encontrada = true;
	                break;
	            }
	        }

	        if (encontrada) {
	            System.out.println("La ciudad " + buscada + " fue encontrada en el array");
	        } else {
	            System.out.println("La ciudad " + buscada + " no fue encontrada en el array");
	        }

	        scanner.close();	
		
		
	}

}

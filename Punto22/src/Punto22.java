import java.util.Scanner;

public class Punto22 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double[] calificaciones = new double[5];

	        for (int i = 0; i < calificaciones.length; i++) {
	            System.out.print("Ingrese la calificación " + (i + 1) + " ");
	            calificaciones[i] = scanner.nextDouble();
	        }

	        double suma = 0;
	        for (double nota : calificaciones) {
	            suma += nota;
	        }

	        double promedio = suma / 5;

	        System.out.println("El promedio de las calificaciones es: " + promedio);

	        scanner.close();
	    }
}

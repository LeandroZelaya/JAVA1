import java.util.Scanner;

public class Punto16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud del primer lado:");
        double lado1 = scanner.nextDouble();

        System.out.println("Ingrese la longitud del segundo lado:");
        double lado2 = scanner.nextDouble();

        System.out.println("Ingrese la longitud del tercer lado:");
        double lado3 = scanner.nextDouble();

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Es un triángulo equilatero");
            } 
            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Es un triangulo isosceles");
            } 
            else {
                System.out.println("Es un triangulo escaleno");
            }
    

        scanner.close();
	}

}

import java.util.Scanner;

public class Punto15 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        double saldo = 1000.0;
	        int opc;
	        boolean salir = false;

	        while (!salir) {
	            System.out.println("1. Consultar saldo");
	            System.out.println("2. Depositar dinero");
	            System.out.println("3. Retirar dinero");
	            System.out.println("4. Salir");
	            System.out.print("Seleccione una opción: ");
	            opc = scanner.nextInt();

	            switch (opc) {
	                case 1:
	                    System.out.println("Saldo actual: " + saldo);
	                    break;

	                case 2:
	                    System.out.print("Ingrese monto a depositar: ");
	                    double deposito = scanner.nextDouble();
	                    if (deposito > 0) {
	                        saldo += deposito;
	                        System.out.println("Nuevo saldo: " + saldo);
	                    } else {
	                        System.out.println("Monto invalido");
	                    }
	                    break;

	                case 3:
	                    System.out.print("Ingrese monto a retirar: ");
	                    double retiro = scanner.nextDouble();
	                    if (retiro > 0 && retiro <= saldo) {
	                        saldo -= retiro;
	                        System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
	                    } 
	                    else if (retiro > saldo) {
	                        System.out.println("Fondos insuficientes");
	                    } 
	                    else {
	                        System.out.println("Monto invalido");
	                    }
	                    break;

	                case 4:
	                    salir = true;
	                    System.out.println("Saliendo...");
	                    break;

	                default:
	                    System.out.println("Opción invalida");
	            }
	        }

	        scanner.close();
	    
	}

}

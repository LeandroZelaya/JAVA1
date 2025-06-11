import java.util.Scanner;

public class Pun25 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese la operacion (+, -, *, /): ");
        char opc = scanner.next().charAt(0);

        double resultado = 0;
        boolean opValida = true;

        switch (opc) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error, No se puede dividir por cero");
                    opValida = false;
                }
                break;
            default:
                System.out.println("Operacion no valida");
                opValida = false;
        }

        if (opValida) {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
	}

}

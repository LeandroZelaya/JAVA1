import java.util.Scanner;

public class Punto14{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n =0;
		int i = 0;
		int a=0;
		int b =1;
		System.out.println("Ingrese la cantidad de numeros a generar");
		n = scanner.nextInt();
		
        for (i = 0; i < n; i++) {
                System.out.println(a);
                int sig = a + b;
                a = b;
                b = sig;
            }
        }
		
	}


import java.util.Random;

public class Punto19 {
    public static void main(String[] args) {

	Random random = new Random();

    int dado1 = random.nextInt(6) + 1; 
    int dado2 = random.nextInt(6) + 1;

    int suma = dado1 + dado2;

    System.out.println("Dado 1: " + dado1);
    System.out.println("Dado 2: " + dado2);
    System.out.println("Suma : " + suma);
}
    
}

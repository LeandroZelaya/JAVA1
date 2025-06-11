import java.util.Scanner;

public class Punto7{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str=" ";
		int voc=0;
		int con=0;
		
		System.out.println("Ingrese la cadena");
		str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
        	char s = Character.toLowerCase(str.charAt(i));
            if(s == 'a' || s =='e' ||s == 'i' ||s == 'o' || s =='u' ){
            voc++;
        }
            else {
            	con++;
            }
          }
		System.out.println("numero de vocales: " + voc);
		System.out.println("numero de consonantes: " + con);

		}
	}


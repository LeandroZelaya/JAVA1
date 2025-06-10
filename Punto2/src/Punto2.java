import java.util.Scanner;
public class Punto2 {

	public static void main(String[] args) {
		int i = 0;
		int j=0;
		int divi=0;
		
		for(i=50; i<=100;i++) {
			divi=0;
			for(j=1; j <=100; j++) {
				if(i%j==0) {
					divi++;
				}

			}
			if(divi==2) {
				System.out.println("\n" +i +": Es primo");
			}
			else {
				System.out.println("\n"+i+" divisores:    ");
				for(j=1;j<100;j++){
					if(i%j==0) {
						System.out.println(j+" ");
					}
				}
			}
			
		}	
		
		}		
		}	
	


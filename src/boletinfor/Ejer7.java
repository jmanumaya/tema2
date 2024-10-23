package boletinfor;
import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Dime un número y te diré si es primo.");
		System.out.println("Numero: ");
		num = sc.nextInt();
		
		if (num <= 1) {
			System.out.println("No es primo");
			
		} else {
		
			for (int i = num ; num > -i ; ++i) {
				
				if (num % i == 0) {
					System.out.println("No es primo");
				} else
					System.out.println("Es primo");
				
			}
			
		}
	}

}

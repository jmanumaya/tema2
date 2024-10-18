package boletindowhile;
import java.util.Scanner;
public class Ejer3 {

	public static void main(String[] args) {
		
		
		int numDefault = 1;
		int numUser;
		int limite = 1;
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Voy a sumar 1+2+3... hasta el número que tu introduzcas");
		System.out.println("Número: ");
		numUser = sc.nextInt();
		
		do {
			
			++limite;
			numDefault += limite; 
			
		} while (numUser != limite);
		
		System.out.println(numDefault);
		
		sc.close();
	}

}

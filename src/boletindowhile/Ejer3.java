package boletindowhile;
import java.util.Scanner;
public class Ejer3 {

	public static void main(String[] args) {
		
		// Variable para albergar el resultado de las sumas de números.
		int numDefault = 1;
		// Variable para albergar el número que indique el usuario.
		int numUser;
		// Variable que funciona como límite.
		int limite = 1;
		
		// Instancio el escaner para poder usarlo y recojer datos por parte del usuario.
		Scanner sc = new Scanner (System.in);

		// Le indico al usuario que va a hacer el programa.
		System.out.println("Voy a sumar 1+2+3... hasta el número que tu introduzcas");
		
		// Le pido un número
		System.out.println("Número: ");
		numUser = sc.nextInt();
		
		// Do while para realiar lo que hay dentro hasta que el numero del usuario sea igual que el límite.
		do {
			
			// Limite para saber cuando parar de incrementar la suma de números.
			++limite;
			
			// Suma de números continuos.
			numDefault += limite; 
			
		} while (numUser != limite);
		
		// Le indico al usuario el resultado de la suma que le dije que haría el programa.
		System.out.println(numDefault);
		
		// Cierro uso de escaner.
		sc.close();
	}

}

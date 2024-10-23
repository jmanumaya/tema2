package boletinfor;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		
		// Variable para albergar el número que de el usuario.
		int num = 0;
		
		// Variable para albergar el resultado del factorial.
		long result = 1;
		
		// Creo el escaner para poder recojer datos por parte del usuario.
		Scanner sc = new Scanner (System.in);
		
		// Le indico al usuario que hará el programa y que tiene que hacer.
		System.out.println("Dame un número y te diré su factorial.");
		System.out.print("Numero: ");
		// Recojo el número por parte del usuario.
		num = sc.nextInt();
		
		/* Bucle for donde creo una nueva variable i que será la que irá 
		 * decrementandose por cada vuelta y permitirá ir multiplicando cada número
		 * desde el indicado por el usuario obteniendo así su factorial*/
		for (int i = num; i > 1; i--) {		
			
			result *= i; 
			
		}
		
		// Imprimo el resultado de lo que le digo al usuario que hará el programa
		System.out.print("El factorial de " + num + " = " + result);
		
		// Cierro uso de escaner.
		sc.close();

	}

}

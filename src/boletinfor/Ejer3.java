package boletinfor;
import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		
		// Variable que albergará el dato introducido por el usuario.
		int num;
		
		// Constante que alberga el límite de números que puede meter el usuario.
		final int limite = 10;
		
		// Variable que albergará la media de los números 
		double media;
		
		// Creo el escaner para poder usarlo.
		Scanner sc = new Scanner (System.in);
		
		// Le digo al usuario que tiene que hacer y que hará el programa.
		System.out.println("Dime 10 números y te diré la media.");
		System.out.println("Numéro: ");
		// Recojo el primer número introducido por el usuario.
		num = sc.nextInt();

		/* Bucle for donde creo una nueva variable i que será la que irá 
		 * incrementandose por cada vuelta para luego parar al obtener una suma total
		 * de 10 números introducidos por el usuario.*/ 
		for (int i = 1; i < limite; i++) {
			
			System.out.println("Siguiente Numéro: ");
			// voy sumandole a num cada número que va indicando el usuario.
			num += sc.nextInt();
			
		}
		
		// Realizo la media de la suma de todos los números introducidos por el usuario.
		media = (double) num / limite;
		
		// Imprimo el resultado por pantalla al usuario.
		System.out.println("La media de tus números es: " + media);
		
		// Cierro uso de escaner.
		sc.close();
		
	}

}

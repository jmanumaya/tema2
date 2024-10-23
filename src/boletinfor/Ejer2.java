package boletinfor;
import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		
		// Creo la variable num para albergar el dato por parte del usuario.
		int num;
		// Está variable va a servir de contador de números múltiplos de 3.
		int cont = 0;
		
		// Creo el escaner para poder usarlo y recojer datos por parte del usuario.
		Scanner sc = new Scanner (System.in);

		// Indico al usuario que hará el programa y que tiene que hacer.
		System.out.println("Dime un número y te diré cuantos números hay múltiplo de tres desde 1 al número que me des.");
		// Recojo el dato por parte del usuario.
		num = sc.nextInt();
		
		/* Bucle for donde creo una nueva variable i que será la que irá 
		 * incrementandose por cada vuelta para luego obtener si es multiplo de 3 y 
		 * comprobar cuando se llega al limite establecido por el user.*/
		for  (int i = 1;i <= num;i++){
			
			// Un if para contar cuando un número sea múltiplo de 3.
			if (i % 3 == 0) {
				++cont;
			}
		}
		
		// Muestro al usuario el resultado que busca.
		System.out.println("Desde 1 a " + num + " hay " + cont + " números múltiplos de tres.");
		
		// Cierro uso de escaner.
		sc.close();
	}

}

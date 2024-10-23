package boletinfor;
import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		
		// Creo la variable nota para albergar el dato por parte del usuario.
		int nota;
		// Está variable va a servir de contador de notas suspensas.
		int cont = 0;
		
		// Creo el escaner para poder usarlo y recojer datos por parte del usuario.
		Scanner sc = new Scanner (System.in);

		// Indico al usuario que hará el programa y que tiene que hacer.
		System.out.println("Dime 5 notas y te diré si tienes algun suspenso");
		
		
		/* Bucle for donde creo una nueva variable i que será la que irá 
		 * incrementandose por cada vuelta donde la iré comparando con 5 ya que pido 5 datos.*/
		for  (int i = 1;i <= 5;i++){
			
			System.out.print("Nota: ");
			// Recojo el dato por parte del usuario.
			nota = sc.nextInt();
			
			// Un if para contar cuando una nota sea menos de 5 (suspensos).
			if (nota < 5)
				++cont;
			
		}
		
		// If para imprimir un resultado u otro segun si se detecta que cont ha subido y por ende tiene algun suspenso.
		if (cont >= 1)
			System.out.println(" :( Tienes " + cont + " notas suspensas.");
		else
			System.out.println(" :) Enhorabuena tienes todas las notas aprobadas.");
		
		// Cierro uso de escaner.
		sc.close();
	}

}
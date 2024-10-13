package boletincondicionales;
import java.util.Scanner;

public class Ejer2 {
	
	// Valor de entrada: 5 (por ejemplo).
	// Resultado esperado: El valor absoluto de 5 es 5
	// Resultado obtenido: El valor absoluto de 5 es 5

	public static void main(String[] args) {
		
		/* Creo las variables doubles para poder albergar los números correspondientes 
		 * (las he creado doubles porque en el enunciado no se especifica si es entero entonces con double podemos albergar enteros y decimales).*/
		double number; // Albergará el valor que de el usuario.
		double valorabs; // Albergará el valor absoluto del numero que haya indicado el usuario
		
		// Creo el escaner para poder obtener un dato por parte del usuario.
		Scanner sc = new Scanner (System.in);

		// Le indico al usuario que tiene que hacer y que hará el programa.
		System.out.println("Dame un número y te diré su valor absoluto.");
		System.out.print("Numero: ");
		// Recojo el dato del usuario
		number = sc.nextDouble();
		
		// Si es negativo lo combertimos a positivo poniendo -number (-(-number) = number) así pasamos el valor a positivo y si era positivo pues es el mismo numero.
		valorabs = (number < 0) ? -number : number;
		
		// Imprimo el resultado que se le dijo al usuario que obtendría con el programa.
		System.out.println("El valor absoluto de " + number + " es " + valorabs);
		
		// Cierro uso de escaner.
		sc.close();
	}

}

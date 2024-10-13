package boletincondicionales;
import java.util.Scanner;
import java.util.Random; // Importo la clase Random para poder usarlo

public class Ejer5 {

	// Valor de entrada: 6 (por ejemplo de la suma del numero aleatorio 4 + el otro número aleatorio 2).
	// Resultado esperado: Correcto
	// Resultado obtenido: Correcto
	
	public static void main(String[] args) {
		
		// Creo la instancia de Random para poder usarlo mas adelante y lo mismo con escaner para poder recoger un dato por parte del usuario.
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		// Obtengo un número random gracias a la clase e instancia que hemos creado y le digo que tiene que estar entre 1 y 99. (le sumo 1 porque sino la mínima sería 0 y la máxima 98.)
		int randomNumberOne = random.nextInt(99) + 1;
		// Obtengo un segundo número random gracias a la clase e instancia que hemos creado y le digo que tiene que estar entre 1 y 99. (le sumo 1 porque sino la mínima sería 0 y la máxima 98.)
		int randomNumberTwo = random.nextInt(99) + 1;
		// Variable que contendrá el valor que introduzca el usuario.
		int resultado;
		
		// Le indico al usuario que debe hacer y que hará el programa.
		System.out.println("Voy a darte una suma entre dos números randoms y tendras que poner el resultado.");
		// Imprimo la suma poniendo el primer número generado mas el segundo.
		System.out.print(randomNumberOne + " + " + randomNumberTwo + " = ");
		// Recojo el dato introducido por el usuario.
		resultado = sc.nextInt();
		
		// Compruebo si ha respondido correctamente.
		if (randomNumberOne + randomNumberTwo == resultado){
			// Imprimo "Correcto" si ha respondido correctamente.
			System.out.println("Correcto");
		} else {
			// Imprimo "Incorrecto" si ha respondido incorrectamente.
			System.err.println("Incorrecto");
		}
		// Cierro uso de escaner.
		sc.close();
	}
}

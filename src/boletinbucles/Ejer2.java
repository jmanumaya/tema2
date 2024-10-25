package boletinbucles;

import java.util.*;

public class Ejer2 {

	public static void main(String[] args) {

		// Variable para contener el dato por parte del usuario.
		int num;

		// Variable para contabilizar los primos que encuentre.
		int cont = 0;

		// Boleano para saber si el número se establece como primo.
		boolean esPrimo = true;

		// Creo el escaner para recojer datos por parte del usuario.
		Scanner sc = new Scanner(System.in);

		// Le indico al usuario que debe hacer y le digo que hará el programa.
		System.out.println("Dime un número y te diré la cantidad de primos que hay desde 1 al número que me digas");
		num = sc.nextInt();

		// For para hacer las instrucciones de dentro hasta que i sea el numero
		// indicado.
		for (int i = 1; i <= num; ++i) {

			// Reseteo el valor de esPrimo.
			esPrimo = true;

			// Compruebo si el número es menor o igual a 1, ya que los números <= 1 no son
			// primos.
			if (i <= 1) {
				// Si el número es <= 1, lo marco como no primo.
				esPrimo = false;
			} else {
				// Uso un bucle for para verificar si el número tiene divisores entre 2 y la mitad del número
				// Empiezo desde x=2, y si encuentro un divisor, actualizo 'esPrimo' a false.
				for (int x = 2; x <= i / 2 && esPrimo; x++) {
					// Verifico si 'numero' es divisible por 'i', es decir, si el residuo es 0.
					if (i % x == 0) {
						// Si es divisible por 'i', entonces no es primo.
						esPrimo = false;
					}
				}
			}

			// Después del bucle, verifico el valor de 'esPrimo'.
			// Si sigue siendo true, significa que el número es primo así sumo 1 al contador.
			if (esPrimo) {
				++cont;
			}
		}

		// Imprimo el contador de números primos que hay desde 1 al número indicado.
		System.out.println("hay " + cont + " primos desde 1 a " + num);

		// Cierro uso de escaner.
		sc.close();
	}
}

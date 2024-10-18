package boletindowhile;

public class Ejer2 {

	public static void main(String[] args) {
		
		// Variable que almacena los números pares a mostrar.
		int num = 1;
		
		// Le indico al usuario lo que va a hacer el programa.
		System.out.println("ATENTO, voy a mostrarte los primeros 200 números pares... [Música épica]");
		
		// Do while para imprimir los primeros 200 números pares
		do {
			// If para comprobar si es número par e imprimirlo
			if (num % 2 == 0) {
				System.out.println(num);
			}
			// Incremento de num.
			++num;
		// El while comprueba que el número no se pase de 200 y sea mayor de 1 para seguir en el do.
		} while (num > 1 && num <= 200);

	}

}

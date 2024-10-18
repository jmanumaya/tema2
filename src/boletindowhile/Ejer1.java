package boletindowhile;

public class Ejer1 {

	public static void main(String[] args) {
		
		// Variable que almacena los números naturales a mostrar.
		int num = 1;
		
		// Le indico al usuario lo que va a hacer el programa.
		System.out.println("ATENTO, voy a mostrar los primeros 20 números naturales... [Música épica]");
		
		// Do while para imprimir los primeros 20 números naturales
		do {
			System.out.println(num);
			++num;
		// El while comprueba que el número no se pase de 20 para seguir imprimiendolo e incrementandolo.
		} while (num <= 20);

	}

}

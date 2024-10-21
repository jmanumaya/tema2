package boletindowhile;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {

		// Declaro las constantes para luego usarlas para comparar lo que el usuario introduzca.
		final String PIEDRA = "PIEDRA"; // Esta vale "PIEDRA".
		final String PAPEL = "PAPEL"; // Esta vale "PAPEL".
		final String TIJERAS = "TIJERAS"; // Esta vale "TIJERAS".

		// Creo el escaner para poder recoger datos de parte del usuario.
		Scanner sc = new Scanner(System.in);

		// Variables tipo String que va a contener la cadena de texto que el usuario introduzca.
		String jugador1 = ""; // Corresponde a lo que introduzca el jugador 1.
		String jugador2 = ""; // Corresponde a lo que introduzca el jugador 2.
		String jugar = "S"; // Corresponde a si quieren jugar o no.

		// Bucle para jugar cuando digan que quieren seguir introduciendo "S"
		while (jugar.equals("S")) {

			// Bucle do para preguntarle al usuario 1 su elección y que diga una válida si o si.
			do {

				// Le indico a los jugadores lo que tienen que hacer, introducir y los turnos.
				System.out.println("Turno de jugador 1, elije PIEDRA, PAPEL O TIJERAS: ");
				// Recojo lo que introduzca el jugador 1.
				jugador1 = sc.next().toUpperCase();

			} while (!jugador1.equals("PIEDRA") && !jugador1.equals("PAPEL") && !jugador1.equals("TIJERAS"));

			// Bucle do para preguntarle al usuario 2 su elección y que diga una válida si o si.
			do {

				// Le indico a los jugadores lo que tienen que hacer, introducir y los turnos.
				System.out.println("Turno de jugador 2, elije PIEDRA, PAPEL O TIJERAS: ");
				// Recojo lo que introduzca el jugador 2.
				jugador2 = sc.next().toUpperCase();

			} while (!jugador2.equals("PIEDRA") && !jugador2.equals("PAPEL") && !jugador2.equals("TIJERAS"));

			// Hago las respectivas comprobaciones para saber que jugador gana comparandolas con las constantes que definí al principio y lo muestro por pantalla.
			if (jugador1.equalsIgnoreCase(jugador2)) {
				System.out.println("EMPATEEE!!!!");
			} else if (jugador1.equalsIgnoreCase(PIEDRA) && jugador2.equalsIgnoreCase(TIJERAS)
					|| (jugador1.equalsIgnoreCase(PAPEL) && jugador2.equalsIgnoreCase(PIEDRA))
					|| (jugador1.equalsIgnoreCase(TIJERAS) && jugador2.equalsIgnoreCase(PAPEL))) {
				System.out.println("GANA JUGADOR 1!!!");
			} else {
				System.out.println("GANA JUGADOR 2!!!");
			}

			// Le pregunto a los jugadores si quieren volver a jugar.
			System.out.println("¿Quereis volver a jugar? ('S' para si 'N' para no)");
			jugar = sc.next().toUpperCase();
			
		}

		// Cierro uso de escaner
		sc.close();
	}

}

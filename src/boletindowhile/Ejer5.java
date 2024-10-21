package boletindowhile;

import java.util.*;

public class Ejer5 {

	public static void main(String[] args) {

		// Instancio la clase random para obtener un número random para poder realizar
		// el ejercicio.
		Random rd = new Random();

		// Variable string para guardar el estado inicial.
		String estadoInicial;

		// Variable string para guardar el estado de juego.
		String estadoJuego;

		// Variable string para guardar el estado de jugar o no.
		String jugar = "si";

		// Variable para contabilizar los intentos que ha hecho la máquina para adivinar
		// el numero.
		int contador = 0;

		// Variable int para albergar el numero menor.
		int numMenor = 1;

		// Variable int para albergar el numero mayor.
		int numMayor = 100;

		// Variable int para albergar el número geenerado por la máquina aleatoriamente entre el número menor y el mayor.
		int numMaquina = rd.nextInt(numMenor, numMayor + 1);

		// Instancio el escaner para poder usarlo y recojer datos por parte del usuario.
		Scanner sc = new Scanner(System.in);

		// do While para jugar mientras el estado de juego sea si, indicado por el usuario.
		do {
			
			// Le indico al usuario lo que tiene que hacer y lo que hará el programa.
			System.out.println("Piensa en algún número del 1 al 100 e intentaré adivinartelo. \nIndicame 'listo' cuando hayas pensado el número.");
			// Recojo cuando el usuario esté listo para empezar.
			estadoInicial = sc.nextLine().toLowerCase();

			// Condicional para comenzar el programa si el usuario lo indica.
			if (estadoInicial.equals("listo")) {
				
				// Le muestro las instrucciones al usuario.
				System.err.println("INSTRUCCIONES:\n - Cuando te diga algún número:\n  - Indicame 'mayor' si el número que te digo es menor al tuyo.\n  - indicame 'menor' si el número que te digo es mayor al tuyo.\n  - indicame 'acertado' si he adivinado tu número.");

				// Do para repetir la entrada de la máquina y el usuario hasta que la máquina adivine el número secreto.
				do {

					// Incremento contador por cada intento de la máquina.
					++contador;
					
					// Intento de la máquina.
					System.out.println("Creo que tu número es: " + numMaquina);
					
					// Respuesta del usuario.
					estadoJuego = sc.nextLine().toLowerCase();

					// Si el número de la máquina es menor, el nuevo límite inferior es numMaquina + 1
					if (estadoJuego.equals("mayor")) {

						// Establezco el nuevo límite.
						numMenor = numMaquina + 1;

						// Compruebo si el numero menor es menor o igual al mayor.
						if (numMenor <= numMayor) {
							
							// Genero un nuevo número aleatorio entre los dos nuevos límites.
							numMaquina = rd.nextInt(numMenor, numMayor + 1);
						}
					}
					// Si el número de la máquina es mayor, el nuevo límite superior es numMaquina - 1
					else if (estadoJuego.equals("menor")) {

						// Establezco el nuevo límite.
						numMayor = numMaquina - 1;

						// Compruebo si el numero menor es menor o igual al mayor.
						if (numMenor <= numMayor) {
							
							// Genero un nuevo número aleatorio entre los dos nuevos límites.
							numMaquina = rd.nextInt(numMenor, numMayor + 1);
						}
					}

				// se va a repetir el do while mientras el usuario no indique que ha acertado el número.
				} while (!estadoJuego.equals("acertado"));

				// Condicional para imprimirle al usuario los distintos resultados posibles según los intentos realizados por la máquina. (Easter Egg)
				if (numMaquina == 7) {

					if (contador == 1)
						System.out.println("A LA PRIMERAA! SOY UN MÁQUINA (nunca mejor dicho) por cierto, el número 7 es mi favorito :)");
				
					else if (contador == 2)
						System.out.println("AYYYY CASI A LA PRIMERA!  " + "Por cierto, el número 7 es mi favorito :)");
					
					else if (contador <= 5)
						System.out.println("MMM...! NO ESTÁ MAL, EN " + contador + " INTENTOS. " + "Por cierto, el número 7 es mi favorito :)");
					
					else if (contador <= 10)
						System.out.println("UFFF...! ME LO HAS PUESTO COMPLICADO. Por cierto, el número 7 es mi favorito :)");
				
					else
						System.out.println("ALA! ALA! ALA!, QUE DIFÍCIL HA ESTADO. Por cierto, el número 7 es mi favorito :)");

				// Si no se cumple el Easter Egg pues se imprimen los siguientes resultados según los intentos realizados por la máquina.
				} else {

					if (contador == 1)
						System.out.println("A LA PRIMERAA! SOY UN MÁQUINA (nunca mejor dicho)");

					else if (contador == 2)
						System.out.println("AYYYY CASI A LA PRIMERA!");

					else if (contador <= 5)
						System.out.println("MMM...! NO ESTÁ MAL, EN " + contador + " INTENTOS.");

					else if (contador <= 10)
						System.out.println("UFFF...! ME LO HAS PUESTO COMPLICADO.");

					else
						System.out.println("ALA! ALA! ALA!, QUE DIFÍCIL HA ESTADO.");
				}

				// Reseteo al principio los valores para cuando se vuelva a jugar.
				numMenor = 1;
				numMayor = 100;
				contador = 0;
				// Genero un nuevo numero aleatorio por la máquina.
				numMaquina = rd.nextInt(numMenor, numMayor + 1);

				// Pregunto al usuario si quiere seguir jugando.
				System.out.println("¿Quieres seguir jugando? (indica 'si' para continuar jugando)");
				jugar = sc.nextLine().toLowerCase();
			
			// Este else es por si se equivoca al introducir listo al inicio del juego.
			} else {
				System.err.println("Valor no válido. Recuerda: introduce 'listo' cuando estes preparado.");
			}

		// Aquí es donde se comprueba si se debe repetir el do while si el usuario quiere seguir jugando.
		} while (jugar.equals("si"));

		// Cierro uso de escaner.
		sc.close();
	}

}

package boletindowhile;

import java.util.*;

public class Ejer5 {
	
	// REVISAR MAXIMOS Y MINIMOS NUMEROS ALEATORIOS EN EL DO

	public static void main(String[] args) {

		Random rd = new Random();

		int numSecret;
		String estadoInicial;
		String estadoJuego;
		String jugar = "si";
		int newNum;
		int numMaquina = rd.nextInt(100) + 1;
		int numMenor = 1;
		int numMayor = 100;

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Piensa en algún número del 1 al 100 e intentaré adivinartelo. \nIndicame 'listo' cuando hayas pensado el número.");
		estadoInicial = sc.nextLine();

		while (jugar.equals("si")) {

			if (estadoInicial.equals("listo")) {

				System.out.println(
						"INSTRUCCIONES:\n - Cuando te diga algún número:\n  - Indicame 'mayor' si el número que te digo es mayor al tuyo.\n  - indicame 'menor' si el número que te digo es menor al tuyo.\n  - indicame 'acertado' si he adivinado tu número.");

				do {

					System.out.println("Creo que tu número es: " + numMaquina);
					estadoJuego = sc.nextLine();
					
					numMenor = numMaquina;
					

					if (estadoJuego.equals("mayor")) {

						numMaquina = rd.nextInt(numMenor, numMayor);

					} else if (estadoJuego.equals("menor")) {

						numMaquina = rd.nextInt(1, numMaquina);
						numMayor = numMaquina;
					}

				} while (!estadoJuego.equals("acertado"));

				if (numMaquina == 7) {

					System.out.println("Genial!! Has pensado en un gran número. De hecho es mi favorito :)");

				} else {
					System.out.println("Genial!! Has pensado en un gran número.");

				}
				
				System.out.println("¿Quieres seguir jugando?");
				jugar = sc.nextLine();

			}

		}
		
		System.out.println("Gracias por jugar!");

	}

}

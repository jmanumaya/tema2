package boletinejerciciosexamenes;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {

		// Variable que contendrá el número indicado el usuario para los lados del
		// cuadrado.
		int lados;

		// Creo el escaner para poder usarlo.
		Scanner sc = new Scanner(System.in);

		// Pregunto al usuario por los lados que quiere que tenga el cuadrado.
		System.out.println("Voy a dibujar un cuadrado con asteriscos.");
		System.out.print("Dime el número de asteriscos que tiene que tener por cada lado: ");
		lados = sc.nextInt();

		// For para las veces que se va a repetir segun las lineas que necesite.
		for (int i = 1; i <= lados; i++) {

			// If para imprimir los asteriscos si nos encontramos en la primera o ultima
			// fila.
			if (i == 1 || i == lados) {

				// For para hacer ese bucle de veces que se tiene que pintar el asterisco cuando
				// se cumpla la condición del if
				for (int x = 1; x <= lados; x++) {
					System.out.print("*");
				}

				// Si no se cumple el if procedemos al apartado de pintar las líneas normales de dentro con los respectivos espacios.
			} else {

				// Pintamos un primer asterisco.
				System.out.print("*");

				// For para pintar los espacios que hay despues del primer asterisco con un menos 2 ya que son los reservados a los asteriscos que pintar.
				for (int j = 1; j <= (lados - 2); j++) {
					System.out.print(" ");
				}

				// Pintamos el asterisco final de la linea.
				System.out.print("*");

			}

			// Salto de linea.
			System.out.println("");

		}

		// Cierro uso de escaner.
		sc.close();
	}

}

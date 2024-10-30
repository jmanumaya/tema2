package boletinbucles;

import java.util.*;

public class Ejer9 {
	
	// Valor introducido: 456
	// Resultado esperado: "El número 456 tiene 3 dígitos"
	// Resultado obtenido: "El número 456 tiene 3 dígitos"

	public static void main(String[] args) {
		
		// Variable que contendrá el número indicado por el usuario.
		int num;
		
		/* Variable que contendrá el número indicado por el usuario para poder usarlo en la comprobación de 
		dígitos y que no se machaque el original. */
		int num2;
		
		// Contador de dígitos.
		int digitos = 0;
		
		// String que usaré para volver a repetir el programa o no en función a la respuesta del usuario.
		String seguir;
		
		// Creo el escaner para poder usarlo.
		Scanner sc = new Scanner (System.in);
		
		// Do-while para repetir todo el programa siempre que el usuario lo indique.
		do {
			// Do-while para pedirle un número y si indica uno 0 o menor repetirle la pregunta.
			do {
				System.out.println("Dime un número mayor de 0 y te diré cuantos dígitos tiene.");
				System.out.println("Número: ");
				num = sc.nextInt();
			} while (num <= 0);
		
		// Doy valor de num a num2 para ahora usarlo.
		num2 = num;
		
		// Bucle para obtener los digitos del número indicado.
		while (num2 != 0) {
			
			// Voy asignando y quitando la ultima cifra de num2 hasta que llegue a 0.
			num2 /= 10;
			
			// Sumo los digitos cada vez que realizo el bucle.
			++digitos;
		}
		
		// Imprimo el resultado al usuario.
		System.out.println("El número " + num + " tiene " + digitos + " dígitos");
		sc.nextLine();
		
		// Do-while para preguntarle si quiere seguir o no introduciendo números y repitiendo el programa.
		do {
			
			System.out.println("¿Quieres volver a introducir otro número? ('S' para seguir, 'N' para parar.)");
			seguir = sc.nextLine().toUpperCase();
		
		// Fuerzo a que me de una S para seguir o N para parar por si poner otra cosa sin querer.
		} while (!seguir.equals("S") && !seguir.equals("N"));
		
		// Reseteo el valor de digitos por si repetimos el programa.
		digitos = 0;
		
		// While del do principal.
		} while (seguir.equalsIgnoreCase("S"));
		
		// Informo en consola fin del programa.
		System.err.println("Fin del Programa.");
		
		// Cierro uso de escaner.
		sc.close();
	}

}

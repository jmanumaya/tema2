package boletinejerciciosexamenes;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		
		// Variable que contendrá el número indicado por el usuario.
		int number;
		
		// Variable que contendrá el número indicado por el usuario pero servirá para modificarlo durante el proceso.
		int mirrorNumber;
		
		// Variable que contedrá en todo momento la última cifra del número indicado por el usuario.
		int ultCifra;
		
		// Variable que contará las cifras que tenga el número.
		int contCifras = 0;
		
		// Variable que contará las cifras pares que tenga el número.
		int contPares = 0;
		
		// Variable que contará las cifras impares que tenga el número.
		int contImpares = 0;
		
		// Creo el escaner para poder usarlo.
		Scanner sc = new Scanner (System.in);
		
		// Pido al usuario un número y le indico que hará el programa.
		System.out.println("Dame un número y te diré la cantidad de números pares e impares que lo componen.");
		System.out.print("Número: ");
		number = sc.nextInt();
		
		// Asigno el valor de number a mirrorNumber.
		mirrorNumber = number;
		
		// Obtengo el numero de cifras que compone el numero indicado.
		do {
			mirrorNumber /= 10;
			++contCifras;
		} while (mirrorNumber != 0);
		
		// Vuelvo a asignarle el valor de number para volver a usarla de nuevo con ese valor.
		mirrorNumber = number;
	
		// For que servirá para contar desde 1 a el total de cifras que se haya contado del número introducido por el usuario.
		for (int i = 1; i <= contCifras; i++) {
			
			// Cojo la última cifra del número para compararla si es par o impar para poder incrementar un contador u otro.
			ultCifra = mirrorNumber % 10;
			
			if (ultCifra % 2 == 0) {
				
				++contPares;
				
			} else {
				
				++contImpares;
			}
			
			// Le quito la última cifra del número para cuando vuelva a comenzar el bucle coja la siguiente última cifra.
			mirrorNumber /= 10;
		}
		
		// Imprimo en pantalla el resultado esperado por el usuario.
		System.out.println("Tu numero " + number + " está formado por " + contPares + " cifras pares y por " + contImpares + " cifras Impares.");

		// Cierro uso de escaner.
		sc.close();
	}

}

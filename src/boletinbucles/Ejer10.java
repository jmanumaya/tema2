package boletinbucles;

import java.util.*;

public class Ejer10 {
	
	// Valor introducido: 1001
	// Resultado esperado: "El número 1001 es capicua"
	// Resultado obtenido: "El número 1001 es capicua"

	public static void main(String[] args) {
		
		// Variable que contendrá el número indicado por el usuario.
		int num;
		
		// Variable que contendrá cada num actualizado quitandole la ultima cifra al dividir entre 10.
		int division;
		
		// Variable que se quedará con la ultima cifra en cada momento.
		int ultimaCifra;
		
		// Variable que será el num indicado por el usuario pero alrevés.
		int numReves = 0;
		
		// Creo el escaner para poder usarlo.
		Scanner sc = new Scanner (System.in);
		
		// Indico al usuario que tiene que hacer y que hará el programa.
		System.out.println("Dime un número y te diré si es capicúa.");
		
		// Recojo el valor por parte del usuario.
		num = sc.nextInt();
		
		// Doy valor de num a division.
		division = num;
		
		// Bucle para ir opteniendo la ultima cifra e ir creando ese número al reves del original.
		while (division > 0) {
			
			ultimaCifra = division % 10;
			numReves = numReves * 10 + ultimaCifra;
			division /= 10;
			
		}
		
		// Comparo si el número al reves es igual que el número original para dar un resultado u otro.
		if (numReves == num) {
			System.out.println("El número " + num + " es capicua");
		} else {
			System.out.println("El número " + num + " no es capicua");
		}
		
		// Cierro uso de escaner.
		sc.close();		
		
	}

}

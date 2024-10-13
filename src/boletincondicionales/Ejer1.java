package boletincondicionales;
import java.util.Scanner;

public class Ejer1 {
	
	// Valor de entrada: 101 (por ejemplo)
	// Resultado esperado: El número 101 es capicúa.
	// Resultado obtenido: El número 101 es capicúa.

	public static void main(String[] args) {
		
		// Declaro las variables enteras que usaré durante el programa.
		int number; // Contendrá el número del usuario
		int cifra1; // Contendrá la primera cifra del numero.
		int cifra2; // Contendrá la segunda cifra del numero.
		int cifra3; // Contendrá la tercera cifra del numero.
		int cifra4; // Contendrá la cuarta cifra del numero.
		
		// Creo el escaner para poder recoger un dato por parte del usuario.
		Scanner sc= new Scanner (System.in);
		
		// Le digo que tiene que hacer y lo que hará el programa.
		System.out.println("Dime un número del 0 al 9999 y te diré si es capicúa");
		System.out.println("Numero: ");
		// Recojo el número que se le pide
		number = sc.nextInt();
		
		// Compruebo si el número introducido está en rango correcto
		if (number >= 0 && number < 10000) {
			// Compruebo si el número es menor de 10 ya que sería capicúa.
			if (number < 10) {
				// Imprimo el resultado
				System.out.println("El número " + number + " es capicúa");
			// Compruebo si el número es menor de 100 para hacer las comprobaciones y saber si es o no capicúa.
			} else if (number < 100) {
				// Cojo la segunda y primera cifra del número.
				cifra2 = number % 10;
				cifra1 = number / 10;
				// Comparo las cifras.
				if (cifra1 == cifra2) {
					// Imprimo el resultado si es capicúa.
					System.out.println("El numero " + number + " es capicua");
				} else {
					// Imprimo el resultado si no es capicúa.
					System.out.println("El numero " + number + " no es capicua");
				}
			// Compruebo si el número es menor de 1000 para hacer las comprobaciones y saber si es o no capicúa.
			} else if (number < 1000) {
				// Cojo la tercera y primera cifra del número.
				cifra3 = number % 10;
				cifra1 = number / 100;
				// Comparo las cifras.
				if (cifra1 == cifra3) {
					// Imprimo el resultado si es capicúa.
					System.out.println("El numero " + number + " es capicua");
				} else {
					// Imprimo el resultado si no es capicúa.
					System.out.println("El numero " + number + " no es capicua");
				}
			// Compruebo si el número es menor de 10000 para hacer las comprobaciones y saber si es o no capicúa.
			} else if (number < 10000) {
				// Cojo la cuarta, primera, segunda y tercera cifra del número.
				cifra4 = number % 10;
				cifra1 = number / 1000;
				cifra2 = (number / 100) % 10;
				cifra3 = (number / 10) % 10;
				// Comparo las cifras correspondientes entre sí.
				if (cifra1 == cifra4 && cifra2 == cifra3) {
					// Imprimo el resultado si es capicúa.
					System.out.println("El numero " + number + " es capicua");
				} else {
					// Imprimo el resultado si no es capicúa.
					System.out.println("El numero " + number + " no es capicua");
				}
			}
		// Como el número no es correcto imprimo el error para que el usuario sepa que se ha equivocado o ha introducido un valor no válido
		} else {
			System.err.println("Número introducido no válido");
		}
		// Cierro uso de escaner.
		sc.close();
	}
}

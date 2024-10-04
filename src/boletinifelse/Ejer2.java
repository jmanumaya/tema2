package boletinifelse;

import java.util.Scanner;

public class Ejer2 {
	
	public static void main(String[] args) {
		
		// Introduzco el escaner a mi programa para su uso.
		Scanner sc = new Scanner (System.in);
		// Declaro las variables enteras para albergar los valores que de el usuario.
		int a;
		int b;
		// Le indico por consola al usuario lo que hará el progama y para que me de los datos.
		System.out.println("Buenas, introduce dos números enteros y te diré si son inguales");
		System.out.println("Primer Número: ");
		// Entrada del usuario por teclado para introducir el primer número que se le pide.
		a = sc.nextInt();
		System.out.println("Segundo Número: ");
		// Entrada del usuario por teclado para introducir el segundo número que se le pide.
		b = sc.nextInt();
		
		// IF para comprobar si los número introducidos por el usuario son iguales.
		if (a == b) {
			System.out.println("El número " + a + " es igual al número " + b);
		} else {
			System.out.println("El número " + a + " no es igual al número " + b);
		}
		// Este else ha determinado que los número no son iguales.
		// Cierro uso de escaner.
		sc.close();
	}
}

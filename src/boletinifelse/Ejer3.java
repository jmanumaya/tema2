package boletinifelse;

import java.util.Scanner;

public class Ejer3 {
	
	public static void main(String[] args) {
		
		// Introduzco el escaner a mi programa para su uso.
		Scanner sc = new Scanner (System.in);
		// Declaro la variable double para albergar el valor que de el usuario.
		double a;
		
		// Le indico por consola al usuario lo que hará el progama y para que me de los datos.
		System.out.println("Buenas, introduce un número (puede ser decimal) y te diré si es un número casi-cero: ");
		// Entrada del usuario por teclado para introducir el número que se le pide.
		a = sc.nextDouble();

		// IF para comprobar si el número introducido es casi-cero.
		if (a < 1 && a > -1 && a !=0) {
			System.out.println("El número " + a + " es casi-cero");
		} else {
			System.out.println("El número " + a + " no es casi-cero");
		}
		// Este else ha determinado que el número no es casi-cero.
		// Cierro uso de escaner.
		sc.close();
	}
}

package boletinifelse;

import java.util.Scanner;

public class Ejer4 {
	
	public static void main(String[] args) {
		
		// Introduzco el escaner a mi programa para su uso.
		Scanner sc = new Scanner (System.in);
		// Declaro las variables enteras para albergar los valores que de el usuario.
		int a;
		int b;
		// Le indico por consola al usuario lo que hará el progama y para que me de los datos.
		System.out.println("Buenas, introduce dos números enteros y te los mostraré ordenadamente de menor a mayor.");
		System.out.println("Primer Número: ");
		// Entrada del usuario por teclado para introducir el primer número que se le pide.
		a = sc.nextInt();
		System.out.println("Segundo Número: ");
		// Entrada del usuario por teclado para introducir el segundo número que se le pide.
		b = sc.nextInt();
		
		// IF para realizar la ordenación de los números introducidos por el usuario.
		if (a > b) {
			System.out.println(b + " < " + a); // Este if me va a devolver por pantalla que el valor de b es menor que el de a.
		} else if (b > a){
			System.out.println(a + " < " + b); // Este else if me va a devolver por pantalla que el valor de a es menor que el de b.
		} else {
			System.out.println(a + " = " + b); // Este else ha determinado que los número no son iguales.
		}

		// Cierro uso de escaner.
		sc.close();
	}
}

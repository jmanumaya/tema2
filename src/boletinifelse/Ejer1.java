package boletinifelse;
import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		
		// Introduzco el escaner a mi programa para su uso.
		Scanner sc = new Scanner (System.in);
		// Declaro la variable a para albergar el valor que de el usuario.
		int a;
		// Le indico por consola al usuario lo que hará el progama y para que me de un número.
		System.out.print("Buenas, introduce un número y te diré si es par o impar: ");
		// Entrada del usuario por teclado para introducir el número que se le pide.
		a = sc.nextInt();
		
		// IF para comprobar si el número del usuario es par en este caso.
		if (a % 2 == 0) {
			System.out.println("El número " + a + " es par");
		} else {
			System.out.println("El número " + a + " es impar");
		}
		// Este else ha determinado que el numero será impar al no ser par.
		// Cierro uso de escaner.
		sc.close();
	}
}

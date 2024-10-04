package boletinifelse;

import java.util.Scanner;

public class Ejer5 {
	
	public static void main(String[] args) {
		
		// Introduzco el escaner a mi programa para su uso.
		Scanner sc = new Scanner (System.in);
		// Declaro las variables enteras para albergar los valores que de el usuario.
		int a;
		int b;
		int c;
		// Le indico por consola al usuario lo que hará el progama y para que me de los datos.
		System.out.println("Buenas, introduce tres números enteros y te los mostraré ordenadamente de mayor a menor.");
		System.out.println("Primer Número: ");
		// Entrada del usuario por teclado para introducir el primer número que se le pide.
		a = sc.nextInt();
		System.out.println("Segundo Número: ");
		// Entrada del usuario por teclado para introducir el segundo número que se le pide.
		b = sc.nextInt();
		System.out.println("Tercer Número: ");
		// Entrada del usuario por teclado para introducir el segundo número que se le pide.
		c = sc.nextInt();
		
		// IF para realizar la ordenación de los números introducidos por el usuario.
		if (a > b && b > c) {
			System.out.println(a + " > " + b + " > " + c); // Este if me va a devolver por pantalla que el valor de a es mayor que el de b y el de b es mayor que el de c.
		} else if (b > a && a > c){
			System.out.println(b + " > " + a + " > " + c); // Este else if me va a devolver por pantalla que el valor de a es menor que el de b.
		} else if (c > b && a > b) {
			System.out.println(c + " > " + a + " > " + b); // Este else if me va a devolver por pantalla que el valor de a es menor que el de b.
		} else if (b > c && c > a) {
			System.out.println(b + " > " + c + " > " + a); // Este else if me va a devolver por pantalla que el valor de a es menor que el de b.
		} else if (c > a && a > b) {
			System.out.println(c + " > " + a + " > " + b); // Este else if me va a devolver por pantalla que el valor de a es menor que el de b.
		} else if (a > c && c > b) {
			System.out.println(a + " > " + c + " > " + b); // Este else if me va a devolver por pantalla que el valor de a es menor que el de b.
		} else if (c > b && b > a) {
			System.out.println(c + " > " + b + " > " + a); // Este else if me va a devolver por pantalla que el valor de a es menor que el de b.
		} else if (a == b && b == c) {
			System.out.println(a + " = " + b + " = " + c); // Este else if me va a devolver por pantalla que el valor de a es menor que el de b.
		} else if (a == b && b > c) {
			System.out.println(a + " = " + b + " > " + c); // Este else if me va a devolver por pantalla que el valor de a es menor que el de b.
		} else if (a == c && b < c) {
			System.out.println(a + " = " + c + " > " + b); // Este else if me va a devolver por pantalla que el valor de a es menor que el de b.
		} else if (a > b && b == c) {
			System.out.println(a + " > " + b + " = " + c); // Este else if me va a devolver por pantalla que el valor de a es menor que el de b.
		} else if (a == b && c > b) {
			System.out.println(c + " > " + b + " = " + a); // Este else if me va a devolver por pantalla que el valor de a es menor que el de b.
		} else if (b > a && a == c) {
			System.out.println(b + " > " + a + " = " + c); // Este else if me va a devolver por pantalla que el valor de a es menor que el de b.
		} 
		
		
		
		
		/*else {
			System.out.println(a + " = " + b); // Este else ha determinado que los número no son iguales.
		} */

		// Cierro uso de escaner.
		sc.close();
	}
}
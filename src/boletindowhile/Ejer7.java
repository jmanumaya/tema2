package boletindowhile;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		
		// Creo el escaner para poder usarlo en el programa.
		Scanner sc = new Scanner (System.in);
						
		// Creo las variables enteras para albergar los valores que de el usuario.
		int num1;
		int num2;
		// Creo la variable tipo String para recojer la elección del usuario con un caracter en un futuro
		String eleccion;
		// Variable para usarla en el bucle donde siempre que sea 0 se hará dicho bucle.
		int salir = 0;
		
		// Bucle Do para realizarse siempre que el usuario no indique la opción E que le daría valor a salir y saldría del bucle acabando el programa
		do {
						
		// Le indico al usuario que tiene que introducir y lo que hará el programa.
		System.out.println("Dime dos número y luego te daré opciones que puedes hacer con esos números");
		System.out.print("Primer Número: ");
		// Recojo el dato por parte del usuario.
		num1 = sc.nextInt();
		System.out.print("Segundo Número: ");
		// Recojo el dato por parte del usuario.
		num2 = sc.nextInt();
		// Muestro en pantalla el menú de opciones que tiene el usuario para elegir.
		System.out.println("MENÚ DE OPCIONES (Introduce la letra correspondiente)\n"
				+ "¿Qué quieres hacer con esos números?\n (A) SUMAR LOS NÚMEROS\n (B) RESTAR LOS NÚMEROS\n "
				+ "(C) MULTIPLICAR LOS NÚMEROS\n (D) DIVIDIR LOS NÚMEROS\n (E) SALIR DEL PROGRAMA");
		// Recojo la elección del usuario.
		eleccion = sc.next().toUpperCase();
		
		// Creo el switch para imprimir en pantalla un caso segun lo que el usuario introduzca.
		switch (eleccion) {
			case "A" -> {
				System.out.println(num1 + " + " + num2 + " = " + (num1+num2)); // Si pone A imprime la suma.
			}
			case "B" -> {
				System.out.println(num1 + " - " + num2 + " = " + (num1-num2)); // Si pone B imprime la resta.
			}
			case "C" -> {
				System.out.println(num1 + " * " + num2 + " = " + (num1*num2)); // Si pone C imprime la multiplicación.
			}
			case "D" -> {
				System.out.println(num1 + " / " + num2 + " = " + (num1/num2)); // Si pone D imprime la división.
			}
			case "E" -> {
				salir = 1; // Si pone E Sale del bucle y finaliza el programa.
			}
			default -> {
				System.out.println("Recuerda! introduce A, B, C o D :)"); // Mensaje default por si se equivoca el usuario.
			}
		 }
		
		} while (salir == 0);
		
		// Indico al usuario que ha acabado el programa.
		System.out.println("Fin Del Programa");
	
		//Cierro uso de escaner.
		sc.close();

	}

}
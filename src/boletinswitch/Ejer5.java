package boletinswitch;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		
		// Creo el escaner para poder usarlo en el programa.
		Scanner sc = new Scanner (System.in);
				
		// Creo la variable de tipo String para albergar el valor que de el usuario.
		String letra;
				
		// Le indico al usuario que me introduzca la letra de un tipo de carnet y le digo lo que hará el programa.
		System.out.print("Dime cualquier letra de un tipo de carnet de conducir y te diré a que vehículos corresponde: ");
		// Recojo el dato por parte del usuario.
		letra = sc.nextLine().toUpperCase();
		
		// Creo el switch para imprimir en pantalla un caso segun lo que el usuario introduzca.
		switch (letra) {
			case "E" -> {
				System.out.println("La letra " + letra + " corresponde a Remolques"); // Si la letra es E imprime remolques.
			}
			case "D" -> {
				System.out.println("La letra " + letra + " corresponde a Autobuses"); // Si la letra es D imprime autobuses.
			}
			case "C1", "C5" -> {
				System.out.println("La letra " + letra + " corresponde a Camiones"); // Si la letra es "C1 o C5" imprime camiones.
			}
			case "A" -> {
				System.out.println("La letra " + letra + " corresponde a Motocicletas"); // Si la letra es A imprime motocicletas.
			}	
			case "B1", "B2" -> {
				System.out.println("La letra " + letra + " corresponde a Automóviles"); // Si la letra es "B1 o B2" imprime automóviles.
			}
			default -> {
				System.err.println("Categoría no contemplada."); // Mensaje default por si se equivoca el usuario o introduce un valor no válido.
			}
				
		}
		//Cierro uso de escaner.
		sc.close();
	}

}
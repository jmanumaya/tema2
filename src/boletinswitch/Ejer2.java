package boletinswitch;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		
		// Creo el escaner para poder usarlo en el programa.
		Scanner sc = new Scanner (System.in);
				
		// Creo la variable entera nota para albergar el valor que de el usuario.
		int numberDia;
				
		// Le indico al usuario que tiene que introducir y lo que hará el programa.
		System.out.print("Dime el día en número y te diré que día es: ");
		// Recojo el dato por parte del usuario.
		numberDia = sc.nextInt();
		
		// Creo el switch para imprimir en pantalla un caso segun lo que el usuario introduzca.
		switch (numberDia) {
			case 1 -> {
				System.out.println("Lunes"); // Si pone 1 imprime Lunes.
			}
			case 2 -> {
				System.out.println("Martes"); // Si pone 1 imprime Martes.
			}
			case 3 -> {
				System.out.println("Miércoles"); // Si pone 1 imprime Miércoles.
			}
			case 4 -> {
				System.out.println("Jueves"); // Si pone 1 imprime Jueves.
			}	
			case 5 -> {
				System.out.println("Viernes"); // Si pone 1 imprime Viernes.
			}	
			case 6 -> {
				System.out.println("Sábado"); // Si pone 1 imprime Sábado.
			}
			case 7 -> {
				System.out.println("Domingo"); // Si pone 1 imprime Domingo.
			}
			default -> {
				System.out.println("Recuerda! del 1 al 7 :)"); // Mensaje default por si se equivoca el usuario.
			}
		}
		//Cierro uso de escaner.
		sc.close();
	}

}

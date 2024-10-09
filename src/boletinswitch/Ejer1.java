package boletinswitch;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		
		// Creo el escaner para poder usarlo en el programa.
		Scanner sc = new Scanner (System.in);
				
		// Creo la variable entera nota para albergar el valor que de el usuario.
		int nota;
				
		// Le indico al usuario que me introduzca su nota.
		System.out.print("Dime tu nota: ");
		// Recojo el dato por parte del usuario.
		nota = sc.nextInt();
		
		// Creo el switch para imprimir en pantalla un caso segun lo que el usuario introduzca.
		switch (nota) {
			case 0, 1, 2, 3, 4 -> {
				System.out.println("INSUFICIENTE"); // Si la nota es o 0, 1, 2, 3, 4, 5 imprime INSUFICIENTE.
			}
			case 5 -> {
				System.out.println("SUFICIENTE"); // Si la nota es o 0, 1, 2, 3, 4, 5 imprime SUFICIENTE.
			}
			case 6 -> {
				System.out.println("BIEN"); // Si la nota es o 0, 1, 2, 3, 4, 5 imprime BIEN.
			}
			case 7, 8 -> {
				System.out.println("NOTABLE"); // Si la nota es o 0, 1, 2, 3, 4, 5 imprime NOTABLE.
			}	
			case 9, 10 -> {
				System.out.println("SOBRESALIENTE"); // Si la nota es o 0, 1, 2, 3, 4, 5 imprime SOBRESALIENTE.
			}
			default -> {
				System.out.println("Recuerda!  introduce tu nota de 0 al 10 :)"); // Mensaje default por si se equivoca el usuario.
			}
				
		}
		//Cierro uso de escaner.
		sc.close();
	}

}

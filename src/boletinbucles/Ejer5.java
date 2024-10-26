package boletinbucles;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		
		// Variable para contener el dato por parte del usuario.
		int num;
		
		// Variable para contener si se quiere seguir jugando.
		String jugar;
		
		// Variable para contabilizar las veces a repetir.
		int cont;
		
		// Creo el escaner para poder usarlo.
		Scanner sc = new Scanner (System.in);
		
		// Do-while para repetir el ejercicio hasta que el usuario quiera decidir pararlo.
		do {
			
			// Le indico al usuario que hacer y que hará el programa.
			System.out.println("Dime un número entero entre 0 y 20 y te mostraré los numeros que hay desde 1 a N "
					+ "repitiendo cada número tantas veces como su valor.");
			
			// Le pido al usuario un número límite.
			System.out.print("Numero: ");
			num = sc.nextInt();
			
			// Reseteo las entradas porque después me daba fallos a la hora de pedir una respuesta de volver a repetir el ejercicio.
			sc.nextLine();
			
			// If para comprobar que el usuario ha introducido un número válido.
			if (num >= 1 && num < 20) {
			
				// For para ir de 1 al número indicado por el usuario.
				for (int i = 1; i <= num ; ++i) {
					
					// Le doy a cont el valor de i para luego repetirlo las veces que valga el valor.
					cont = i;
					
					// For para repetir el número las tantas veces como valga dicho número.
					for (; cont >= 1 ; --cont) {
						
						// If para decidir si hay que pasar de linea o seguir imprimiendo en la misma.
						if (cont == 1) {
							System.out.println(i);
						} else {
							System.out.print(i);
						}
					}
					
				}
			
			// Si el usuario introduce un dato no valido se muestra el mensaje de error para informar al usuario.
			} else {
				
				System.err.println("Valor introducido no valido.\nRecuerda que debe ser un número comprendido entre 1 y 20.");
				
			}
		
		// Le pregunto si quiere volver a reproducir el programa.
		System.out.println("¿Quieres volver a introducir otro número? (Introduce 'S' para seguir o 'N' para parar.)");
		
		// Recojo la respuesta.
		System.out.print("Respuesta: ");
		jugar = sc.nextLine();
		
		// Compruebo el valor de jugar para seguir en el bucle o no.
		} while (jugar.equalsIgnoreCase("S"));
		
		// Si salimos del bucle lo informamos informamos.
		System.err.println("Fin del Programa");
		
		// Cierro uso de escaner.
		sc.close();

	}

}

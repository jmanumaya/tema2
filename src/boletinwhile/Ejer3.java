package boletinwhile;
import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		
		// Creo el escaner para poder recojer datos por parte del usuario.
		Scanner sc = new Scanner (System.in); 
		
		// Variables que usaré durante el programa.
		
		// Variable que usaré para recojer el número que introduzca el usuario.
		int num;
		
		// Variable para albergar la suma de números que se introduce.
		int suma = 0;
		
		// Variable para recojer cuantos números se van introduciendo (contador).
		int contador = 0;
		
		// Variable para recojer alfinal la media.
		double media;

		// Le indico al usuario que debe hacer y que hará el programa.
		System.out.println("Dime números enteros positivos y te diré la media, cuando quieras parar pon simplemente uno negativo.");
		System.out.print("Número: ");
		// recojo el dato por parte del usuario.
		num = sc.nextInt();

		// Bucle para introducir números hasta que se introduzca uno negativo.
		while (num >= 0) {
			
			// Voy actualizando la variable suma sumandole lo que valga num.
			suma += num;
			
			// Incremento el contador.
			++contador;
			
			// Vuelvo a pedir el número al usuario.
			System.out.print("Número: ");
			num = sc.nextInt();
			
		}
		
		// Calculo la media.
		media = (double) suma / contador;
		
		// Le imprimo por pantalla al usuario la media de sus números introducidos.
		System.out.println("Total de la media de sus números: " + media);

		// Cierro uso de escaner.
		sc.close();
	}

}

package boletinswitch;
import java.util.Scanner;
public class Ejer4 {

	public static void main(String[] args) {
		
		// Creo el escaner.
		Scanner sc = new Scanner (System.in);
		// Variables que albergaran las tiradas del usuario (el dato que introduzca)
		String tirada1;
		String tirada2;
		int datoTda1 = 0;
		int datoTda2 = 0;
		// Le explico por pantalla lo que tiene que hacer y lo que hará el programa.
		System.out.println("Tira dos dados y dime los números (en letras) que te han salido, luego te daré el total.");
		System.out.print("Primera Tirada: ");
		// Recojo la primera tirada.
		tirada1 = sc.nextLine().toUpperCase();
		// Hago las comprobaciones de posibles casos con dicha tirada.
		switch (tirada1) {
		 case "UNO" -> {
			 datoTda1 = 1;
		 }
		 case "DOS" -> {
			 datoTda1 = 2;
		 }
		 case "TRES" -> {
			 datoTda1 = 3;
		 }
		 case "CUATRO" -> {
			 datoTda1 = 4;
		 }
		 case "CINCO" -> {
			 datoTda1 = 5;
		 }
		 case "SEIS" -> {
			 datoTda1 = 6;
		 }
		 default -> {
			 System.out.println("Recuerda! dime el número con letras (UNO, DOS... SEIS)");
			 sc.close();
		 }
		}
		// Inicio un if para comprobar que el dato de la tirada 1 ha sido correcto y proseguir con el dato 2
		if (datoTda1 != 0) {
			System.out.print("Segunda Tirada: ");
			// Recojo la segunda tirada
			tirada2 = sc.nextLine();
			// Hago las comprobaciones de posibles casos con dicha tirada.
			switch (tirada2) {
				case "UNO" -> {
					datoTda2 = 1;
				}
				case "DOS" -> {
					datoTda2 = 2;
				}
				case "TRES" -> {
					datoTda2 = 3;
				}
				case "CUATRO" -> {
					datoTda2 = 4;
				}
				case "CINCO" -> {
					datoTda2 = 5;
				}
				case "SEIS" -> {
					datoTda2 = 6;
				}
				default -> {
					System.out.println("Recuerda! dime el número con letras (UNO, DOS... SEIS)");
				}
			}
			// Hago un if para comprobar que el dato de la tirada 2 es correcto y así poder darle el resultado al usuario.
			if (datoTda2 != 0) {
			System.out.println("Has sacado un "+ (datoTda1+datoTda2));
			}
		} else {
			System.out.println("");
		}
		
		sc.close();
	}
}

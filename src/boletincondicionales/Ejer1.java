package boletincondicionales;
import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		
		int number;
		int cifra1;
		int cifra2;
		int cifra3;
		int cifra4;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Dime un número del 0 al 9999 y te diré si es capicúa");
		System.out.println("Numero: ");
		number = sc.nextInt();
		
		if (number >= 0 && number < 10000) {
			
			if (number < 10) {
				System.out.println("El número " + number + " es capicúa");
			} else if (number < 100) {
				cifra2 = number % 10;
				cifra1 = number / 10;
				if (cifra1 == cifra2) {
					System.out.println("El numero " + number + " es capicua");
				} else {
					System.out.println("El numero " + number + " no es capicua");
				}
			} else if (number < 1000) {
				cifra3 = number % 10;
				cifra1 = number / 100;
				if (cifra1 == cifra3) {
					System.out.println("El numero " + number + " es capicua");
				} else {
					System.out.println("El numero " + number + " no es capicua");
				}
			} else if (number < 10000) {
				cifra4 = number % 10;
				cifra1 = number / 1000;
				cifra2 = (number / 100) % 10;
				cifra3 = (number / 10) % 10;
				if (cifra1 == cifra4 && cifra2 == cifra3) {
					System.out.println("El numero " + number + " es capicua");
				} else {
					System.out.println("El numero " + number + " no es capicua");
				}
			}
			
		} else {
			System.err.println("Número introducido no válido");
		}
		
		sc.close();

	}

}

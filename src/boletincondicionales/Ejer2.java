package boletincondicionales;
import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		
		double number;
		double valorabs;
		
		Scanner sc = new Scanner (System.in);

		
		System.out.println("Dame un número y te diré su valor absoluto.");
		System.out.print("Numero: ");
		number = sc.nextDouble();
		
		// Si es negativo lo combertimos a positivo poniendo -number (-(-number) = number) así pasamos el valor a positivo y si era positivo pues es el mismo numero.
		valorabs = (number < 0) ? -number : number;
		
		System.out.println("El valor absoluto de " + number + " es " + valorabs);
		
		sc.close();
	}

}

package boletinwhile;
import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		
		int num;
		int suma = 0;
		int contador = 0;
		double media;

	
		System.out.println("Dime números enteros positivos y te diré la media, cuando quieras parar pon simplemente uno negativo.");
		System.out.print("Número: ");
		num = sc.nextInt();

		
		while (num >= 0) {
			
			suma += num;
			++contador;
			System.out.print("Número: ");
			num = sc.nextInt();
			
		}
		
		media = (double) suma / contador;
		
		System.out.println("Total de la media de sus números: " + media);

		sc.close();
	}

}

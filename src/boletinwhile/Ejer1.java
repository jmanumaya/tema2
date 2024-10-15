package boletinwhile;
import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		
		int num;
		int suma = 0;

	
		System.out.println("Dime números enteros positivos y los iré sumando, cuando quieras parar pon simplemente uno negativo.");
		System.out.print("Número: ");
		num = sc.nextInt();

		
		while (num >= 0) {
			
			suma += num;
			
			System.out.print("Número: ");
			num = sc.nextInt();
			
		}
		
		System.out.println("Total de la suma de sus números: " + suma);

		sc.close();
	}

}

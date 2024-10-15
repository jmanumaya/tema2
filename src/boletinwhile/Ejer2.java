package boletinwhile;
import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num;
		int contador = 0;
		
		
		System.out.println("Introduce números positivos y te diré al final cuantos números introducistes\n(Cuando quieras parar introduce uno negativo)");
		System.out.println("Número: ");
		num = sc.nextInt();
		
		while (num >= 0) {
			
			++contador;
			
			System.out.println("Número: ");
			num = sc.nextInt();
			
		}
		
		switch (contador) {
		
		case 1 -> System.out.println("Has introducido: " + contador + " número positivo.");
		default -> System.out.println("Has introducido: " + contador + " números positivos.");
		}
		
		sc.close();
		
	}

}

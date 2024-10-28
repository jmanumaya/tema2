package boletinbucles;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		
		
		int num;
		
		int cont = 1;
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Dame la base de un triangulo.");
		System.out.println("Base: ");
		num = sc.nextInt();
		
		
		for (int i = num; i > 0; --i) {
			
			for (int x = 1; x <= cont; x++) {
			
				System.out.print(" * ");

			}
			
			System.out.println("");
			++cont;
			
		}

		sc.close();
	}

}

package boletinwhile;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num;
		int contador = 0;
		int sumaPositivo = 0;
		int sumaNegativo = 0;
		int contadorNegativo = 0;
		double media;
		int sumaCeros = 0;
		
		
		System.out.println("Dime 10 números (positivos, negaivos o cero)");
		
		while (contador < 10) {
			
			++contador;
			
			System.out.print("Número: ");
			num = sc.nextInt();
			
			if (num > 0) {
				
				sumaPositivo += num;
				
			} else if (num < 0) {
				
				sumaNegativo += num;
				++contadorNegativo;
				
			} else {
				
				++sumaCeros;
			}
		}
		
		media = (double) sumaNegativo / contadorNegativo;
		
		System.out.println("Suma de los números positivos: " + sumaPositivo);
		System.out.println("Media de los números negativos: " + media);
		System.out.println("Número de ceros introducidos: " + sumaCeros);
		
		sc.close();
		

	}

}

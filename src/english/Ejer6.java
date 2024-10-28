package english;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int hour;
		
		int minut;
		
		System.out.println("Give me a hour");
		hour = sc.nextInt();
		
		System.out.println("Give me a minuts");
		minut = sc.nextInt();
		
		switch (hour) {
		
		case 1 -> hour = 11;
		case 2 -> hour = 10;
		case 3 -> hour = 9;
		case 4 -> hour = 8;
		case 5 -> hour = 7;
		case 6 -> hour = 12;
		
		}
		
		minut = minut - minut - minut;
		
		System.out.println("The real time is " + hour + " : " + minut);
			
		sc.close();
	}

}

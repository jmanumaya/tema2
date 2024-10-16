package english;
import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		
		// Create the scanner for collect the numbers of user.
		Scanner sc = new Scanner (System.in);
		
		// Variable for collect the numbers
		int num;
		// Variable for count
		int cont = 0;
		
		// say to user that should put a number for that the program print the multiplication table for the number.
		System.out.println("Put a number and the program print the multiplication table of this number.");
		System.out.println("Number: ");
		// Collect the number
		num = sc.nextInt();
		
		// While for check if count is lees than 10
		while (cont < 10) {
			
			// Increment count.
			++cont;
			
			// print the multiplication table with the numbers 
			System.out.println(num + " * " + cont + " = " + num * cont);
		}
		
		// Close scanner.
		sc.close();
	}

}

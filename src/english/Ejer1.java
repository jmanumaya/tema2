package english;
import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		
		// Create the scanner for collect the numbers of user.
		Scanner sc = new Scanner (System.in);
		
		// Variable for collect the numbers
		int num;
		
		// I question for the number.
		System.out.print("Put a number (put negative number for go end): ");
		// Collect the number
		num = sc.nextInt();
		
		// while for check if number is old of zero
		while (num >= 0) {
			
			// Conditional for the check if number  is EVEN.
			if (num % 2 == 0) {
				System.out.println("Your number is EVEN");
				// If the don't is EVEN print ODD
			} else {
				System.out.println("Your number is ODD");
			}
			
			// Collect one more number.
			System.out.print("Put a Number: ");
			num = sc.nextInt();
		}
		
		// If user put a number negative, i print end of the program.
		System.err.println("END OF THE PROGRAM");
		
		// Close of Scanner.
		sc.close();
	}

}

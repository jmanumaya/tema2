package english;
import java.util.*;


public class Ejer4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Random rd = new Random();
		
		int number;
		
		int secretNumber = rd.nextInt(100) + 1;
		
		
		System.out.println("You should guess the secret number");
		System.out.println("What is the secret number?");
		number = sc.nextInt();
		
		while (number != secretNumber) {
			
			if (number < secretNumber) {
				
				System.out.println("The secret number is greater than your number");
			} else if (number > secretNumber) {
				
				System.out.println("The secret number is less than your number");
			}
			
			System.out.println("What is the secret number?");
			number = sc.nextInt();
		}
		
		System.out.println("Congrats! you guess the secret number!!!");
		
		sc.close();
	}
}

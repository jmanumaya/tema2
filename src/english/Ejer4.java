package english;

import java.util.*;

public class Ejer4 {

	public static void main(String[] args) {

		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);

		// Create a Random object to generate a random number
		Random rd = new Random();

		int number; // Variable to store the user's guess

		// Generate a random secret number between 1 and 100
		int secretNumber = rd.nextInt(100) + 1;

		// Prompt the user to start guessing the secret number
		System.out.println("You should guess the secret number");
		System.out.println("What is the secret number?");

		// Read the first guess from the user
		number = sc.nextInt();

		// Continue looping until the user guesses the correct number
		while (number != secretNumber) {

			// If the guess is lower than the secret number
			if (number < secretNumber) {
				System.out.println("The secret number is greater than your number");
			}
			// If the guess is higher than the secret number
			else if (number > secretNumber) {
				System.out.println("The secret number is less than your number");
			}

			// Prompt the user to guess again
			System.out.println("What is the secret number?");
			number = sc.nextInt(); // Read the new guess
		}

		// If the user guesses the correct number, print the success message
		System.out.println("Congrats! You guessed the secret number!!!");

		// Close the scanner to avoid resource leaks
		sc.close();
	}
}

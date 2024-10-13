package boletincondicionales;
import java.util.Scanner;
import java.util.Random;

public class Ejer5 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		int randomNumberOne = random.nextInt(99) + 1;
		int randomNumberTwo = random.nextInt(99) + 1;
		int resultado;
		
		System.out.println("Voy a darte una suma entre dos números randoms y tendras que poner el resultado.");
		System.out.print(randomNumberOne + " + " + randomNumberTwo + " = ");
		resultado = sc.nextInt();
		
		if (randomNumberOne + randomNumberTwo == resultado){
			System.out.println("Correcto");
		} else {
			System.err.println("Incorrecto");
		}
		
		sc.close();
	}
}

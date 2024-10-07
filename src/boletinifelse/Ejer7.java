package boletinifelse;
import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int number;
		int result;
		
		System.out.println("Dime un número comprendido entre 0 y 99999: ");
		number = sc.nextInt();
		
		if (number > 0 && number < 99999) {
			
			System.out.println(Integer.toString(number).length());   // NO QUIERE ESTO AUN.......................................
			
		} else {
			
			System.out.println("Has introducido un número no valido");
		}
		
		
		
	}

}

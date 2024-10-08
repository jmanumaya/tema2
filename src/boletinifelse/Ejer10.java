package boletinifelse;
import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		
		// Declaro las variables para albergar los datos que dé el usuario.
		int number1; // Contendrá el primer número.
		int number2; // Contendrá el segundo número.
		int number3; // Contendrá el tercer número.
		
		// Creo el escaner para recoger datos del usuario
		Scanner sc = new Scanner (System.in);
		
		// Le indico por pantalla que hará el programa y que tiene que hacer el usuario.
		System.out.println("Buenas, dame tres números enteros y te diré si la suma de dos de ellos da el otro número.");
		// Le pido el primer número.
		System.out.println("Primer Número: ");
		// Entrada del usuario por teclado.
		number1 = sc.nextInt();
		// Le pido el segundo número.
		System.out.println("Segundo Número: ");
		// Entrada del usuario por teclado.
		number2 = sc.nextInt();
		// Le pido el tercer número.
		System.out.println("Tercer Número: ");
		// Entrada del usuario por teclado.
		number3 = sc.nextInt();
		
		// IF y varios ELSE IF para realizar las comprobaciones de las distintas combinaciones que tiene este programa que realizar para comprobar el resultado que buscamos y mostrarselo al usuario.
		if (number1 + number2 == number3) {
			System.out.println("La suma de " + number1 + " + " + number2 + " = " + number3);
		} else if (number2 + number3 == number1){
			System.out.println("La suma de " + number2 + " + " + number3 + " = " + number1);
		} else if (number1 + number3 == number2){
			System.out.println("La suma de " + number1 + " + " + number3 + " = " + number2);
		} else {
			System.out.println("Ningun número sumado con otro dá como resultado el otro número restante");
		}
		
		// Cierro uso de escaner.
		sc.close();
	}

}

package boletinfor;
import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {

		// Creo un objeto Scanner para leer la entrada del usuario.
		Scanner sc = new Scanner(System.in);

		// Declaro las variables valueA y valueB que almacenarán los números ingresados por el usuario.
		int valueA;
		int valueB;

		// Indico al usuario que tiene que hacer y que hará el programa.
		System.out.println("Dime dos números correspondientes a 'A' y a 'B' y te diré los números que hay hasta llegar desde uno a otro.");

		// Pido al usuario que introduzca el número A y lo almaceno en la variable
		// 'valueA'.
		System.out.print("Introduce el número entero para A: ");
		valueA = sc.nextInt();

		// Pido al usuario que introduzca el número B y lo almaceno en la variable
		// 'valueB'.
		System.out.print("Introduce el número entero B: ");
		valueB = sc.nextInt();

		// Compruebo si valueA es menor que valueB.
		if (valueA < valueB) {
			// Si valueA es menor que valueB, uso un for para mostrar los números desde
			// valueA hasta valueB.
			System.out.println("Números desde A hasta B:");
			for (int i = valueA; i <= valueB; i++) {
				// Muestro el valor de 'i' que recorre desde valueA hasta valueB.
				System.out.println(i);
			}
		} else {
			// Si valueB es menor que valueA, uso un for para mostrar los números desde valueB hasta valueA.
			System.out.println("Números desde B hasta A:");
			for (int i = valueB; i <= valueA; i++) {
				// Muestro el valor de 'i' que recorre desde valueB hasta valueA.
				System.out.println(i);
			}
		}
		// Cierro uso de escaner.
		sc.close();
	}
}

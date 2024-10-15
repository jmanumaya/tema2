package boletinwhile;
import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		
		// Creo el escaner para poder recojer datos de parte del usuario.
		Scanner sc = new Scanner (System.in); 
		
		// Creo las variables que usaré en el programa.
		// Esta contendrá el dato del usuario.
		int num;
		// Esta irá incrementando con la suma de los datos del usuario.
		int suma = 0;

		// Le indico al usuario que hacer y que hará el programa.
		System.out.println("Dime números enteros positivos y los iré sumando, cuando quieras parar pon simplemente uno negativo.");
		System.out.print("Número: ");
		// Recojo el dato por parte del usuario.
		num = sc.nextInt();

		// Bucle para que el usuario tenga que introducir datos hasta que uno de ellos sea menor que 0.
		while (num >= 0) {
			// Incremento suma con los nuevos datos que vaya introduciendo el usuario.
			suma += num;
			// Le vuelvo a pedir un nuevo número al usuario.
			System.out.print("Número: ");
			num = sc.nextInt();
			
		}
		
		// Le imprimo al usuario lo que le dije que haría el programa.
		System.out.println("Total de la suma de sus números: " + suma);
		// Cierro uso del escaner.
		sc.close();
	}

}

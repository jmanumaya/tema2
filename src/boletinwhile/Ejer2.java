package boletinwhile;
import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		
		// Creo el escaner para poder recojer datos de parte del usuario.
		Scanner sc = new Scanner (System.in);
		
		// Creo las variables que usaré en el programa.
		
		// Variable para albergar el numero introducido por el usuario. 
		int num;
		// Variable contador para contabilizar las veces que se introduce un número.
		int contador = 0;
		
		// Le indico al usuario lo que tiene que hacer y lo que hará el programa.
		System.out.println("Introduce números positivos y te diré al final cuantos números introducistes\n(Cuando quieras parar introduce uno negativo)");
		System.out.println("Número: ");
		// Recojo el número por parte del usuario.
		num = sc.nextInt();
		
		// Bucle para pedir números hasta que el usuario introduzca uno negativo.
		while (num >= 0) {
			
			// Incremento contador al introducir un número.
			++contador;
			
			// Vuelvo a pedirle otro número.
			System.out.println("Número: ");
			num = sc.nextInt();
			
		}
		
		// He implementado este switch simplemente para diferenciar entre plural y singular e imprimir el resultado.
		switch (contador) {
		
		case 1 -> System.out.println("Has introducido: " + contador + " número positivo.");
		default -> System.out.println("Has introducido: " + contador + " números positivos.");
		}
		
		// Cierro uso de escaner.
		sc.close();
		
	}

}

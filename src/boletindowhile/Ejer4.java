package boletindowhile;
import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		
		// Creo el escaner para recojer datos por parte del usuario.
		Scanner sc = new Scanner (System.in);
		
		// Variable para recojer el número por parte del usuario.
		int num;
		// Variable como contador.
		int cont = 0;
		
		// Le digo al usuario que tiene que hacer y que hará el programa.
		System.out.println("Pon un número y te diré su tabla de multiplicar.");
		System.out.println("Número: ");
		// Recojo el dato por parte del usuario.
		num = sc.nextInt();
		
		// Do para realizar las siguientes instrucciones.
		do {
			// Incremento contador
			++cont;
			// Imprimo por pantalla la tabla de multiplicar.
			System.out.println(num + " * " + cont + " = " + num * cont);
		
		// While para realizar el do mientras se cumpla
		}while (cont < 10);
		
		// Cierro uso de escaner.
		sc.close();
	}
}

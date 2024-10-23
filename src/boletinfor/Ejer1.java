package boletinfor;
import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		
		// Creo el objeto escaner para poder recojer un dato por parte del usuario. 
		Scanner sc = new Scanner (System.in);
		
		// Variable que albergará el número que indique el usuario.
		int num;
		
		// Le indico al usuario que hará el programa y que tiene que hacer.
		System.out.println("Dime un número y contaré desde 1 al número que me digas.");
		System.out.print("Número: ");
		// Recojo el dato por parte del usuario.
		num = sc.nextInt();
		
		// Bucle for donde creo una variable i para compararla con el número indicado por el user y luego la incremento para salir del bucle en un momento dado.
		for (int i = 1;i <= num; i++) {
			//Imprimo el valor de i en cada vuelta.
			System.out.println(i);

		}
		
		// Cierro uso de escaner.
		sc.close();
		
	}

}

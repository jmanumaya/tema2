package boletinifelse;
import java.util.Scanner;
public class Ejer8 {

	public static void main(String[] args) {
		
		// Creo el escaner para poder usarlo en el programa.
		Scanner sc = new Scanner (System.in);
		
		// Creo la variable entera nota para albergar el valor que de el usuario.
		double nota;
		
		// Le indico al usuario que me introduzca su nota.
		System.out.print("Dime tu nota: ");
		// Recojo el dato por parte del usuario
		nota = sc.nextDouble();
		
		// Hago las diferentes comprobaciones para imprimir uno u otro resultado por pantalla segun la nota que haya introducido.
		if (nota >= 0 && nota < 5) {
			
			System.out.println("INSUFICIENTE :(");
			
		} else if (nota >= 5 && nota < 6) {
			
			System.out.println("SUFICIENTE :/");
			
		} else if (nota >= 6 && nota < 7) {
			
			System.out.println("¡BIEN!");
			
		} else if (nota >= 7 && nota < 9) {
			
			System.out.println("¡¡NOTABLE!!");
			
		} else if (nota >= 9 && nota < 10) {
			
			System.out.println("¡¡¡SOBRESALIENTE!!!");
		}
		
		//Cierro uso de escaner.
		sc.close();
		
	}

}

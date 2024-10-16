package boletinwhile;
import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		
		// Variables que usaré durante el programa.
		
		// Variable para albergar durante el programa las medidas de los arboles.
		double medidaArbol;
		
		// Variable para albergar la medida mayor.
		double mayorArbol = 0;
		
		// Creo el escaner.
		Scanner sc = new Scanner (System.in);
		
		// Indico al usuario y le digo que hará el programa.
		System.out.println("Introduce la medida de cada arbol en centimetros y te diré la mayor de todas. (Cuando quieras parar introduce '-1')");
		System.out.print("Medida: ");
		// Recojo el dato por parte del usuario.
		medidaArbol = sc.nextDouble();
		
		// While para recojer datos hasta que introduzca -1.
		while (medidaArbol !=(-1)) {
			
			// If para saber si tengo que actualizar la medida mayor de los arboles introducidos.
			if (medidaArbol > mayorArbol) {
				// Actualizo dicha medida
				mayorArbol = medidaArbol;
			}
			
			// Vuelvo a pedir el dato al usuario.
			System.out.print("Medida: ");
			medidaArbol = sc.nextDouble();
			
		}
		
		// Muesto la medida mayor una vez que ya ha indicado que no introducirá mas medidas.
		System.out.println("La medida mayor es: " + mayorArbol + " cm.");
		
		// Cierro uso de escaner.
		sc.close();

	}

}

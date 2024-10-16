package boletinwhile;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		
		// Variables que usaré durante el programa
		
		// Variable que contendrá las edades.
		int edad;
		
		// Variable que contendrá la suma de las edades que se van introduciendo.
		int suma = 0;
		
		// Variable que funciona como contador.
		int contador = 0;
		
		// Variable que funciona como contador de mayores de edad.
		int contadorMayores = 0;
		
		// Variable para almacenar la media.
		double media;
		
		// Creo el escaner para recojer datos en el programa por parte del usuario.
		Scanner sc = new Scanner (System.in);
		
		// Le indico al usuario lo que tiene que hacer y lo que hará el programa.
		System.out.println("Buenas, ve introduciendo edades y te daré unas estadisticas sobre ellas. (Para parar pon un número negativo)");
		System.out.print("Edad: ");
		// Recojo el dato por parte del usuario.
		edad = sc.nextInt();
		
		// Bucle para realizarse mientras edad sea mayor o igual que cero.
		while (edad >= 0) {
			
			// Igualo y sumo la edad en la variable suma
			suma += edad;
			// Incremento contador.
			++contador;
			
			// Condicionar para incrementar en contador de mayores si la edad es mayor o igual a 18
			if (edad >= 18) {
				++contadorMayores;
			}
			
			// Pregunto de nuevo el dato.
			System.out.print("Edad: ");
			edad = sc.nextInt();
				
		}
		
		// Calculo la media.
		media = (double) suma / contador;
		
		// Imprimo los distintos resultados al usuario.
		System.out.println("Suma de las edades: " + suma + "\nMedia de las edades: " + media + "\nNúmero de alumnos: " + contador + "\nMayores de edad: " + contadorMayores);

		// Cierro uso de escaner.
		sc.close();
	}

}

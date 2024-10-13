package boletincondicionales;
import java.util.Scanner;

public class Ejer7 {

	// Valor de entrada: distancia: "850" estancia: "8" (por ejemplo).
	// Resultado esperado: El precio de su billete es 1487,50 € (descuento del 30% aplicado)
	// Resultado obtenido: El precio de su billete es 1487,50 € (descuento del 30% aplicado)
	
	public static void main(String[] args) {
		
		// Creo el escaner para poder obtener un valor por parte del usuario.
		Scanner sc = new Scanner(System.in);
		
		// Creo las diferentes variables y constantes que usaré en el programa.
		final double DESCUENTO = 0.30; // Constante con valor que se aplica de descuento (30%)
		final double PRECIO_POR_KILOMETRO = 2.5; // Constante con el valor que tiene de precio cada km (2,50€)
		int distancia; // Variable con el dato que introduzca el usuario de distancia.
		int estancia; // Variable con el dato que introduzca el usuario de días de estancia.
		double precioFinal; // Variable que albergará el precioFinal que obtendrá el usuario.

		// Le indico al usuario que hará el programa y qué tiene que hacer.
		System.out.println("Voy a calcular el precio de tu billete de tren.");
		System.out.println("¿Cual será la distancia a recorrer?: ");
		// Recojo el dato por parte del usuario a "distancia".
		distancia = sc.nextInt();
		System.out.println("¿Cuantos días de estancia estarás?: ");
		// Recojo el dato por parte del usuario a "estancia".
		estancia = sc.nextInt();
		
		// Calculo el precio que tendrá según la distancia que ha introducido el usuario por el valor por km establecido.
		precioFinal = PRECIO_POR_KILOMETRO * distancia;
		
		// IF para comprobar si hay que aplicar descuento al precioFinal viendo si la estancia es mayor a 7 días y la distancia es mayor a 800Km.
		if (estancia > 7 && distancia > 800) {
			
			// Cálculo para aplicar el descuento.
			precioFinal = precioFinal - (precioFinal * DESCUENTO);
			// Imprimo al usuario el precio de su billete con descuento aplicado.
			System.out.printf("El precio de su billete es %.2f € (descuento del 30%% aplicado)\n", precioFinal);
		} else {
			// Imprimo al usuario el precio de su billete (sin descuento).
			System.out.printf("El precio de su billete es %.2f €\n", precioFinal);
		}
		// Cierro uso de escaner.
		sc.close();
	}
}

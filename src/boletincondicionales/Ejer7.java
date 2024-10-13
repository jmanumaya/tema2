package boletincondicionales;
import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double DESCUENTO = 0.30;
		final double PRECIO_POR_KILOMETRO = 2.5;
		int distancia;
		int estancia;
		double precioFinal;

		System.out.println("Voy a calcular el precio de tu billete de tren.");
		System.out.println("¿Cual será la distancia a recorrer?: ");
		distancia = sc.nextInt();
		System.out.println("¿Cuantos días de estancia estarás?: ");
		estancia = sc.nextInt();
		
		precioFinal = PRECIO_POR_KILOMETRO * distancia;
		
		if (estancia > 7 && distancia > 800) {
			
			precioFinal = precioFinal - (precioFinal * DESCUENTO);
			
			System.out.printf("El precio de su billete es: %.2f € (descuento del 30%% aplicado)\n", precioFinal);
		} else {
			
			System.out.printf("El precio de su billete es: %.2f €\n", precioFinal);
		}
		
		sc.close();
	}

}

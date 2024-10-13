package boletincondicionales;
import java.util.Scanner;

public class Ejer8 {
	
	// Valor de entrada: año: "2024" mes: "7" (por ejemplo).
	// Resultado esperado: El año 2024 es bisiesto y el mes 7 tiene 31 días
	// Resultado obtenido: El año 2024 es bisiesto y el mes 7 tiene 31 días

	public static void main(String[] args) {
		
		// Creo el escaner para poder obtener un valor por parte del usuario.
		Scanner sc = new Scanner (System.in);
		
		// Creo las variables que usaré para albergar los datos que introduzca el usuario (el mes y el año)
		int mes; // Contendrá el número del mes
		int anno; // Contendrá el número del año
		
		// Explico al usuario que tiene que hacer y que hará el programa.
		System.out.println("Buenas, dime un año cualquiera y un mes (en número) y te diré si el año es bisiesto y los días que tiene dicho mes.");
		System.out.println("Año: ");
		// Recojo el número del año.
		anno = sc.nextInt();
		System.out.println("Mes:");
		// Recojo el número del mes.
		mes = sc.nextInt();
		
		// Compruebo si ha introducido un mes válido.
		if (mes <= 12 && mes >= 1 ) {
			// Compruebo si el año introducido es bisiesto. (tiene que ser divisible por 4 Y no divisible por 100 O divisible por 400 también)
			if (anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0) {
				
				// Hago los diferentes casos según el valor de "mes" para imprimir un resultado u otro.
				switch (mes) {
				
				case 2 -> System.out.println("El año " + anno + " es bisiesto y el mes " + mes + " tiene 29 días"); // Si es el mes 2 imprimo que tiene 29 días al ser bisiesto.
				case 4, 6, 9, 11 -> System.out.println("El año " + anno + " es bisiesto y el mes " + mes + " tiene 30 días"); // Si es el mes 4, 6, 9 o 11 imprimo que tiene 30 días.
				case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("El año " + anno + " es bisiesto y el mes " + mes + " tiene 31 días"); // Si es el mes 1, 3, 5, 7, 8, 10 o 12 imprimo que tiene 31 días.
				
				}
			// Si no es bisiesto hago la comprobación de diferentes casos segun el valor de (mes) para imprimir un resultado u otro.
			} else {
				
				switch (mes) {
				
				case 2 -> System.out.println("El año " + anno + " no es bisiesto y el mes " + mes + " tiene 28 días"); // Si es el mes 2 imprimo que tiene 28 días al no ser bisiesto.
				case 4, 6, 9, 11 -> System.out.println("El año " + anno + " no es bisiesto y el mes " + mes + " tiene 30 días"); // Si es el mes 4, 6, 9 o 11 imprimo que tiene 30 días.
				case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("El año " + anno + " no es bisiesto y el mes " + mes + " tiene 31 días"); // Si es el mes 1, 3, 5, 7, 8, 10 o 12 imprimo que tiene 31 días.
				
				}
			}
		// Si no es un valor valido de mes introducido se lo indico al usuario con un error y le informo.
		} else {
			
			System.err.println("Valor introducido no valido\nRecuerda que hay 12 meses (1 al 12)");
		}
		// Cierro uso de escaner.
		sc.close();
	}
}

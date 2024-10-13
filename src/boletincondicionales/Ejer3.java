package boletincondicionales;
import java.util.Scanner;

public class Ejer3 {
	
	/* EXPLICACIÓN: HE IMPLEMENTADO UN COMPROBANTE PARA SABER SI EL NÚMERO INTRODUCIDO ES DE 8 CIFRAS. PARA ELLO LO HE RECOJIDO COMO CADENA DE CARÁCTERES -----
	 * LUEGO HE HECHO UN IF PARA COMPROBAR SI LA CADENA MIDE 8 O DE LARGO TIENE 8 (NO SE COMO EXPLICARLO) LUEGO SI ES DE 8 DE LARGO, LA HE PASADO A ENTERO -----
	 * CON LA AYUDA DEL Integer.parseInt() EL OTRO DIA NO QUERIAS QUE LA USASE PARA PASAR A TEXTO SI NO RECUERDO MAL PERO LA TENIA QUE USAR PARA HACER LA COMPROBACIÓN ----
	 * COMO HABIA PENSADO QUE PODIA HACERLA (NOSE SI HABRÁ OTRA HASTA DONDE HEMOS DADO PERO ESTA ES LA QUE SE ME HA OCURRIDO) LUEGO YA PUES LO NORMAL RECOJO EL MODULO Y DEMAS...*/
	
	// Valor de entrada: 26300577 (por ejemplo).
	// Resultado esperado: La letra del número del DNI 26300577 es P
	// Resultado obtenido: La letra del número del DNI 26300577 es P
	
	public static void main(String[] args) {
		
		// Creo las variables de tipo entero y String para albergar datos en ella durante el proceso del programa.
		String numberFirst; // Contendrá el valor introducido por el usuario.
		int numberSecond; // Contendrá el valor introducido por el usuario pero transformado a entero.
		int numLetra; // Contendrá el número correspondiente a "X" letra.
		
		// Creo el escaner para poder recoger un valor por parte del usuario.
		Scanner sc = new Scanner (System.in);
		
		// Le indico al usuario y le digo que hará el programa.
		System.out.println("Dime un número de DNI y te diré a que letra corresponde");
		System.out.println("Numero: ");
		// Recojo el dato introducido por el usuario (explicación del porque es de tipo String arriba).
		numberFirst = sc.nextLine();
		
		// Compruebo si el número introducido por el usuario es de 8 cifras.
		if (numberFirst.length() == 8) {
			
			// Transformo el dato del usuario a tipo int para poder operar con él posteriormente.
			numberSecond = Integer.parseInt(numberFirst);
			
			// Doy el valor a numLetra del modulo.
			numLetra = numberSecond % 23;
		
			// Imprimo un resultado según el valor que tenga numLetra (resto de la división del numero del DNI introducido por el usuario y 23)
			switch (numLetra) {
		
			case 0 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "T");
			case 1 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "R");
			case 2 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "W");
			case 3 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "A");
			case 4 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "G");
			case 5 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "M");
			case 6 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "Y");
			case 7 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "F");
			case 8 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "P");
			case 9 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "D");
			case 10 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "X");
			case 11 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "B");
			case 12 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "N");
			case 13 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "J");
			case 14 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "Z");
			case 15 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "S");
			case 16 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "Q");
			case 17 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "V");
			case 18 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "H");
			case 19 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "L");
			case 20 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "C");
			case 21 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "K");
			case 22 -> System.out.println("La letra del número del DNI " + numberFirst + " es " + "E");
			}
		// Si no es un valor de 8 cifras imprimo el siguiente error para informar al usuario.
		} else {
			System.err.println("Valor introducido incorrecto\nRecuerda que el número del DNI está formado por 8 números");
		}
		
		// Cierro uso de escaner.
		sc.close();
	}

}

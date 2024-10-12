package boletincondicionales;
import java.util.Scanner;

public class Ejer3 {
	
	/* EXPLICACIÓN: HE IMPLEMENTADO UN COMPROBANTE PARA SABER SI EL NÚMERO INTRODUCIDO ES DE 8 CIFRAS. PARA ELLO LO HE RECOJIDO COMO CADENA DE CARÁCTERES -----
	 * LUEGO HE HECHO UN IF PARA COMPROBAR SI LA CADENA MIDE 8 O DE LARGO TIENE 8 (NO SE COMO EXPLICARLO) LUEGO SI ES DE 8 DE LARGO, LA HE PASADO A ENTERO -----
	 * CON LA AYUDA DEL Integer.parseInt() EL OTRO DIA NO QUERIAS QUE LA USASE PARA PASAR A TEXTO SI NO RECUERDO MAL PERO LA TENIA QUE USAR PARA HACER LA COMPROBACIÓN ----
	 * COMO HABIA PENSADO QUE PODIA HACERLA (NOSE SI HABRÁ OTRA HASTA DONDE HEMOS DADO PERO ESTA ES LA QUE SE ME HA OCURRIDO) LUEGO YA PUES LO NORMAL RECOJO EL MODULO Y DEMAS...*/
	
	public static void main(String[] args) {
		
		
		String numberFirst;
		int numberSecond;
		int numletra;
		
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Dime un número de DNI y te diré a que letra corresponde");
		System.out.println("Numero: ");
		numberFirst = sc.nextLine();
		
		if (numberFirst.length() == 8) {
			
			numberSecond = Integer.parseInt(numberFirst);
			
			numletra = numberSecond % 23;
		
		
			switch (numletra) {
		
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
		} else {
			System.err.println("Valor introducido incorrecto\nRecuerda que el número del DNI está formado por 8 números");
		}

		sc.close();
	}

}

package boletincondicionales;
import java.util.Scanner;

public class Ejer6 {
	
	// Valor de entrada: horas: "23" minutos: "59" segundos: "59" (por ejemplo).
	// Resultado esperado: 0 : 0 : 0
	// Resultado obtenido: 0 : 0 : 0

	public static void main(String[] args) {
		
		// Creo el escaner para poder obtener un valor por parte del usuario.
		Scanner sc = new Scanner(System.in);
		
		// Creo las variables horas, minutos y segundos para albergar el valor que de el usuario a las distintas variables.
		int horas;
		int minutos;
		int segundos;
		
		// Indico al usuario que tiene que hacer y que hará el programa.
		System.out.println("Dime la hora que es junto a los minutos y segundos y te diré la hora que será dentro de un segundo.");
		System.out.println("Hora: ");
		// Recojo el dato de horas por parte del usuario.
		horas = sc.nextInt();
		System.out.println("Minutos: ");
		// Recojo el dato de minutos por parte del usuario.
		minutos = sc.nextInt();
		System.out.println("Segundos: ");
		// Recojo el dato de segundos por parte del usuario.
		segundos = sc.nextInt();
		
		// Incremento a 1 los segundos.
		++segundos;
		
		// Compruebo si los datos introducidor por el usuario son correctos, ya que no puede introducir mas de 23 horas ya que la 24 volveria a 0 y tampoco puede introducir mas de 59 minutos y segundos.
		if (horas < 24 && minutos < 60 && segundos < 61) {
			
			// Primero compruebo si los segundos es mayor a 59.
			if (segundos > 59) {
				
				// Al ser mayor de 59 volvería a 0 (los segundos) y le incrementamos a minutos porque habría pasado un minuto (60 segundos).
				segundos = 0;
				++minutos;
				
				// Ahora compruebo lo mismo pero a los minutos.
				if (minutos > 59) {
					
					// Al ser mayor de 59 volvería a 0 (los minutos) y le incrementamos a horas porque habría pasado una hora (60 minutos).
					minutos = 0;
					++horas;
					
					// Comprobamos si horas es mayor que 23 ya que tiene que volver a la hora 0.
					if (horas > 23) {
						
						// Le doy el valor 0 al ser mayor a 23.
						horas = 0;
					}
				}
			}
			// Imprimo el resultado con las horas, minutos y segundos totales al pasar un segundo del tiempo inicial dado por el usuario.
			System.out.println(horas + " : " + minutos + " : " + segundos);
		
		// Si el número introducido no es válido se lo comunico al usuario y le indico.
		} else {
			System.err.println("Valores introducidos no válidos\nRecuerda puedes introducir hasta 23 horas, 59 minutos y 59 segundos");
		}
		// Cierro uso de escaner.
		sc.close();
	}

}

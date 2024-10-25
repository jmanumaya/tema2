package boletinbucles;
import java.util.Scanner;

public class Ejer1 {
	
	// Valor de entrada: horas: "23" minutos: "59" segundos: "59" suma de segundos: "31" (por ejemplo).
	// Resultado esperado: 0 : 0 : 30
	// Resultado obtenido: 0 : 0 : 30

	public static void main(String[] args) {
		
		// Creo el escaner para poder obtener un valor por parte del usuario.
		Scanner sc = new Scanner(System.in);
		
		// Creo las variables horas, minutos y segundos para albergar el valor que de el usuario a las distintas variables.
		int horas;
		int minutos;
		int segundos;
		int incremento;
		
		// Indico al usuario que tiene que hacer y que hará el programa.
		System.out.println("Dime la hora que es junto a los minutos y segundos y un números de segundos a incrementar y te diré la hora que sería.");
		System.out.println("Hora: ");
		// Recojo el dato de horas por parte del usuario.
		horas = sc.nextInt();
		System.out.println("Minutos: ");
		// Recojo el dato de minutos por parte del usuario.
		minutos = sc.nextInt();
		System.out.println("Segundos: ");
		// Recojo el dato de segundos por parte del usuario.
		segundos = sc.nextInt();
		System.out.println("Incremento: ");
		// Recojo el dato de segundos por parte del usuario.
		incremento = sc.nextInt();
		
		if (horas <=23 && minutos <=59 && segundos <=59) {
			
			for ( int i = 0; i <= incremento ; ++segundos, ++i) {
				
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
			}
			
			// Imprimo el resultado con las horas, minutos y segundos totales al pasar los segundos dados por el usuario.
			System.out.println(horas + " : " + minutos + " : " + segundos);
			
		} else {
			System.err.println("Valores introducidos no válidos\nRecuerda puedes introducir hasta 23 horas, 59 minutos y 59 segundos");
		}
		
		// Cierro uso de escaner.
		sc.close();	
	}
}
package boletincondicionales;
import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horas;
		int minutos;
		int segundos;
		
		System.out.println("Dime la hora que es junto a los minutos y segundos y te diré la hora que será dentro de un segundo.");
		System.out.println("Hora: ");
		horas = sc.nextInt();
		System.out.println("Minutos: ");
		minutos = sc.nextInt();
		System.out.println("Segundos: ");
		segundos = sc.nextInt();
		
		++segundos;
		
		if (horas < 24 && minutos < 60 && segundos < 61) {
			
			if (segundos > 59) {
				
				segundos = 0;
				++minutos;
				
				if (minutos > 59) {
					
					minutos = 0;
					++horas;
					
					if (horas > 23) {
						
						horas = 0;
					}
				}
			}
			
			System.out.println(horas + " : " + minutos + " : " + segundos);
			
		} else {
			
			System.err.println("Valores introducidos no validos\nRecuerda puedes introducir hasta 23 horas, 59 minutos y 59 segundos");
		}
	
		sc.close();
	}

}

package boletinifelse;
import java.util.Scanner;
public class Ejer9 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner (System.in);
		
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERAS = "TIJERAS";
		
		String jugador1;
		String jugador2;
		
		System.out.println("Turno de jugador 1, elije PIEDRA, PAPEL O TIJERAS: ");
		jugador1 = sc.next();
		System.out.println("Turno de jugador 2, elije PIEDRA, PAPEL O TIJERAS: ");
		jugador2 = sc.next();
		
		if (jugador1.equalsIgnoreCase(jugador2)) {
			System.out.println("EMPATEEE!!!!");
		} else if (jugador1.equalsIgnoreCase("PIEDRA") && jugador2.equalsIgnoreCase("TIJERAS")
				||(jugador1.equalsIgnoreCase("PAPEL") && jugador2.equalsIgnoreCase("PIEDRA"))
				||(jugador1.equalsIgnoreCase("TIJERAS") && jugador2.equalsIgnoreCase("PAPEL"))){
			System.out.println("GANA JUGADOR 1!!!");
		} else {
			System.out.println("GANA JUGADOR 2!!!");
		}

	}

}

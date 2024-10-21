package boletindowhile;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		
		// Creo el escaner.
        Scanner sc = new Scanner(System.in);
        // Variables tipo String que albergaran las tiradas del usuario (el dato que introduzca).
        String tirada1;
        String tirada2;
        // Variables que pasaran a tener el valor que introduzca el usuario en número.
        int datoTda1 = 0;
        int datoTda2 = 0;
        
        // Le explico por pantalla lo que tiene que hacer y lo que hará el programa.
        System.out.println("Tira dos dados y dime los números (en letras) que te han salido, luego te daré el total.");
        
        // Do while para recojer el dato del usuario hasta que introduzca un dato válido.
        do {
        	
	        System.out.print("Primera Tirada: ");
	        // Recojo la primera tirada.
	        tirada1 = sc.nextLine().toUpperCase();
	        
	        // Hago las comprobaciones de posibles casos con dicha tirada y le asigno el correspondiente valor a la variable.
	        switch (tirada1) {
	            case "UNO" -> datoTda1 = 1;
	            case "DOS" -> datoTda1 = 2;
	            case "TRES" -> datoTda1 = 3;
	            case "CUATRO" -> datoTda1 = 4;
	            case "CINCO" -> datoTda1 = 5;
	            case "SEIS" -> datoTda1 = 6;
	            default -> System.out.println("Recuerda! dime un número válido y con letras (UNO, DOS... SEIS.)");
	        }
        
        } while(!tirada1.equals("UNO") && !tirada1.equals("DOS") && !tirada1.equals("TRES") && !tirada1.equals("CUATRO") && !tirada1.equals("CINCO") && !tirada1.equals("SEIS"));

        // Do while para recojer el dato del usuario hasta que introduzca un dato válido.
        do {
        	
	        System.out.print("Segunda Tirada: ");
	        // Recojo la segunda tirada.
	        tirada2 = sc.nextLine().toUpperCase();
	        
	        // Hago las comprobaciones de posibles casos con dicha tirada y le asigno el correspondiente valor a la variable.
	        switch (tirada2) {
	            case "UNO" -> datoTda2 = 1;
	            case "DOS" -> datoTda2 = 2;
	            case "TRES" -> datoTda2 = 3;
	            case "CUATRO" -> datoTda2 = 4;
	            case "CINCO" -> datoTda2 = 5;
	            case "SEIS" -> datoTda2 = 6;
	            default -> System.out.println("Recuerda! dime un número válido y con letras (UNO, DOS... SEIS.)");
	        }
        
        } while(!tirada2.equals("UNO") && !tirada2.equals("DOS") && !tirada2.equals("TRES") && !tirada2.equals("CUATRO") && !tirada2.equals("CINCO") && !tirada2.equals("SEIS"));

        // Imprimo el total al usuario.
        System.out.println("Has sacado un " + (datoTda1 + datoTda2));
        
        // Cierro uso de escaner.
        sc.close();

	}

}

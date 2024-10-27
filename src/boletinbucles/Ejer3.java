package boletinbucles;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		
		// Creo el escaner para poder usarlo.
        Scanner sc = new Scanner(System.in);
        
        // Variable que contendrán los dos números indicados por el usuario.
        int a;
        int b;
        
        // Variable que contendrá el menor de los dos números dados.
        int menor;
        
        // Variable que contendrá el MCD y que inicializo en 1.
        int mcd = 1;
        
        // Solicitar al usuario los dos números y le digo que hará el programa.
        System.out.println("Ingresa dos números y te diré su máximo común divisor.");
        System.out.print("Ingrese el primer número: ");
        a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        b = sc.nextInt();

        // Encontrar el menor de los dos números
        menor = Math.min(a, b);

        // Realizamos el bucle desde el número menor hasta 1 para encontrar el MCD.
        for (int i = menor; i > 0; i--) {
        	
        	// If para comprobar si encontramos el máximo común divisor.
            if (a % i == 0 && b % i == 0) {
            	// Al encontrar el primer divisor común, lo guardamos en mcd.
                mcd = i;
                // Forzamos terminar la búsqueda.
                break; // Puedo igualar i a 0 pero queda mejor un break y ya.
            }
        }

        // Mostrar el resultado
        System.out.println("El MCD de " + a + " y " + b + " es: " + mcd);
        
        // Cierro uso de escaner.
        sc.close();
    }

}

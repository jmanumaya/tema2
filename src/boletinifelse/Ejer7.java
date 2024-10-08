package boletinifelse;
import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		
		// Lo había hecho con el Integer.toString para que sea lo más optimizado posible pero como no querias...
		
		// Creo la variable que contendrá el valor indicado por el usuario.
		int numero;
		
		// Creo el escaner para poder usarlo.
        Scanner sc = new Scanner(System.in);

        // Solicito al usuario que ingrese un número.
        System.out.println("Introduce un número entre 0 y 99999:");
        // Recojo el número por parte del usuario.
        numero = sc.nextInt();

        // Verificamos que el número esté dentro del rango válido y hago los condicionales para determinar el número de cifras..
        if (numero < 0 || numero > 99999) {
            System.out.println("El número no está entre 0 y 99999.");
        } else {
            if (numero < 10) {
                System.out.println("El número tiene 1 cifra.");
            } else if (numero < 100) {
                System.out.println("El número tiene 2 cifras.");
            } else if (numero < 1000) {
                System.out.println("El número tiene 3 cifras.");
            } else if (numero < 10000) {
                System.out.println("El número tiene 4 cifras.");
            } else {
                System.out.println("El número tiene 5 cifras.");
            }
        }

        // Cierro el escaner.
        sc.close();
    }

}

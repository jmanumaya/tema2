package boletinifelse;
import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		// Creo las variables para los coeficientes.
		int a;
		int b;
		int c;
		// Creo las dos variables para los dos posibles resultados.
		double x1;
		double x2;
		// Creo la variable para almacenar el discriminante.
		double discriminante;
		
		
		// Creo el escaner para poder recoger los datos que introduzca el usuario.
		Scanner sc = new Scanner (System.in);

		// Pedimos al usuario los coeficientes de la ecuación
		System.out.println("Buenas, introduce los coeficientes de una ecuación y te daré el o los posibles resultados.");
		System.out.print("Dame el valor de 'a': ");
		// Recojo el primer valor correspondiente a 'a'
		a = sc.nextInt();
		System.out.print("Dame el valor de 'b': ");
		// Recojo el primer valor correspondiente a 'b'
		b = sc.nextInt();
		System.out.print("Dame el valor de 'c': ");
		// Recojo el primer valor correspondiente a 'c'
		c = sc.nextInt();

		// Hago los condicionales y operaciones para hallar el resultado.
		// Comprobamos si a es igual a 0 y asi poder omitir bastante el proceso.
		if (a == 0) {
			x1 = (double) -c / b;
			System.out.println("La ecuación sólo tiene una solución: " + x1);
		// Le doy valor al discriminante haciendo dicha operación según la formula
		} else {
			discriminante = b * b - 4 * a * c;
			// Comprobamos si el discriminante es negativo ya que si lo es no tendría solución la ecuación.
			if (discriminante < 0) {
				System.out.println("La ecuación no tiene solución");
			// Si no es negativo procedemos a realizar los cálculos restantes para hallar los resultados
			} else {
				// (-5 + 3) /4 = -2 / 4
				x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
				// (-5 -3/ 4 = -2
				x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
				System.out.println("Primera solución: x1 = " + x1);
				System.out.println("Segunda solución: x2 = " + x2);
			}
		}
		
		// Cierro uso de escaner.
		sc.close();
	}

}

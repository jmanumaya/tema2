package boletinwhile;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		
		// Creo uso de escaner.
		Scanner sc = new Scanner (System.in);
		
		// Variables que voy a utilizar.
		
		// Variable que albergará el número introducido por el usuario.
		int num;
		
		// Variable para contabilizar las veces que se introducen datos.
		int contador = 0;
		
		// Variable para incrementarse sumandose los números positivos que se introduzcan.
		int sumaPositivo = 0;
		
		// Variable para incrementarse sumandose los números negativos que se introduzcan.
		int sumaNegativo = 0;
		
		// Variable para contabilizar los números negativos que se introducen.
		int contadorNegativo = 0;
		
		// Variable que albergará la nota al final.
		double media;
		
		// Variable para contabilizar los ceros que se introducen.
		int contadorCeros = 0;
		
		// Le digo al usuario lo que tiene que hacer.
		System.out.println("Dime 10 números (positivos, negaivos o cero)");
		
		// Bucle que se realizará mientras que contador sea menor de 10 (osea 10 veces al iniciarlizarlo en 0).
		while (contador < 10) {
			
			// Incremento contador.
			++contador;
			
			// Le pido el dato al usuario.
			System.out.print("Número: ");
			num = sc.nextInt();
			
			// Condición para comprobar si el número es positivo y así ir sumando dichos números.
			if (num > 0) {
				
				sumaPositivo += num;
			
			// Compruebo si el número es negativo para ir sumando sichos números e incrementar contador de negativos.
			} else if (num < 0) {
				
				sumaNegativo += num;
				++contadorNegativo;
			
			// Si no es mayor de 0 ni menor es 0 así que incremento el contador de ceros introducidos. 
			} else {
				
				++contadorCeros;
			}
		}
		
		// Calculo la media de los negativos introducidos.
		media = (double) sumaNegativo / contadorNegativo;
		
		// Imprimo en pantalla los diferentes resultados según lo recolectado.
		System.out.println("Suma de los números positivos: " + sumaPositivo);
		System.out.println("Media de los números negativos: " + media);
		System.out.println("Número de ceros introducidos: " + contadorCeros);
		
		// Cierro uso de escaner.
		sc.close();
	}

}

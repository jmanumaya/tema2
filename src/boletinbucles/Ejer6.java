package boletinbucles;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		
		// Esta variable contendrá el valor indicado por el usuario.
		int num;
		
		// Creo el escaner para poder usarlo
		Scanner sc = new Scanner (System.in);
		
		// Indico al usuario que tiene que hacer y que hará el programa.
		System.out.println("Dame la base de un triangulo. (la altura será la misma)");
		
		// Pido la base del triangulo
		System.out.println("Base: ");
		num = sc.nextInt();
		
		
		// Dibuja el triángulo
        for (int i = 1; i <= num; i++) {
        	
            // Imprime los espacios antes de los asteriscos
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // Imprime los asteriscos con espacios intermedios
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Salta a la siguiente línea después de imprimir los asteriscos
            System.out.println();
        }

        // Cierro uso de escaner.
		sc.close();
	}

}

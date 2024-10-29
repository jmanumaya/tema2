package boletinbucles;

import java.util.Scanner;

public class Ejer7 {
	
    public static void main(String[] args) {
    	
    	// Variable que contendrá el número indicado por el usuario.
    	int num;
    	
    	// Creo el escaner para poder usarlo.
        Scanner sc = new Scanner(System.in);
        
        // Indico al usuario que tiene que hacer y que hará el programa.
        System.out.println("Ingrese un número de filas para imprimir una piramide formada por esos numeros en cada "
        		+ "fila de forma ascendente y descendiente en la misma fila:\n(EJEMPLO SI SE INDICA UN 4):\n1\n121\n12321\n1234321");
        
        // Recojo el dato por parte del usuario.
        System.out.print("Números de filas: ");
        num = sc.nextInt();
        
        // For para generar la pirámide.
        for (int i = 1; i <= num; i++) {
            
            // For para imprimir la primera mitad de la fila (ascendente).
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // For para imprimir la segunda mitad de la fila (descendente).
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            
            // Salto de linea para la siguiente fila.
            System.out.println();
        }
        
        // Cierro uso de escaner.
        sc.close();
    }
}


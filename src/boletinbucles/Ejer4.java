package boletinbucles;

import java.util.Scanner;

public class Ejer4 {
	
	// Valor introducido: 3 y 6
	// Resultado esperado: "El MCM de 3 y 6 es: 6"
	// Resultado obtenido: "El MCM de 3 y 6 es: 6"

    public static void main(String[] args) {
        
        // Creao el escáner para poder usarlo.
        Scanner sc = new Scanner(System.in);
        
        // Variables para los dos números indicados por el usuario.
        int a, b;
        
        // Esta variable va a contener el menor de los dos valores introducidos.
        int menor;
        
        // Inicializo el mcd a 1.
        int mcd = 1;
        
        // Variable que contendrá el valor del mcm final.
        int mcm;
        
        // Solicito al usuario los dos números y le explico que hará el programa.
        System.out.println("Ingresa dos números y te diré su mínimo común múltiplo.");
        System.out.print("Ingrese el primer número: ");
        a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        b = sc.nextInt();

        // Encontrar el MCD de los dos números
        menor = Math.min(a, b);

        // Realizamos el bucle desde el número menor hasta 1 para encontrar el MCD (igual que en el 3).
        for (int i = menor; i > 0; i--) {
        	
            if (a % i == 0 && b % i == 0) {
                mcd = i;
                break;
            }
        }

        // Calculo para obtener el MCM usando la fórmula: MCM(a y b) = |a * b| / MCD(a y b)
        mcm = (a * b) / mcd;

        // Muestro el resultado al usuario.
        System.out.println("El MCM de " + a + " y " + b + " es: " + mcm);
        
        // Cerrar el escáner.
        sc.close();
    }
}


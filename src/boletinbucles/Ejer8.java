package boletinbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) {
        
        // Contador de números fallados.
        int totalFallados = 0;
        
        // Contador de números totales introducidos.
        int totalIntroducidos = 0;
        
        // Alberga el último número introducido.
        int ultimoNumero = 0;
        
        /* Alberga el número que introduce el usuario después del último introducido para comprobar
        si se tiene que contabilizar o si es uno válido y por tanto convertirse en el último introducido. */
        int numero;
        
        // Creo el escáner para poder usarlo.
        Scanner sc = new Scanner(System.in);

        // Bucle para manejar la entrada del primer número y asegurar que es válida.
        while (true) {
        	
        	// try con catch para recojer la excepcion que me daría si ingreso un valor que no sea un número entero.
            try {
                // Pido y leo el primer número.
                System.out.print("Dime un número inicial: ");
                ultimoNumero = sc.nextInt();
                
                if (ultimoNumero > 0) { // Asegurarse de que el número es mayor que 0.
                    totalIntroducidos++; // Incremento 1 al introducir un número ya.
                    break; // Salir del bucle si el número es válido
                } else {
                    System.out.println("El número inicial debe ser mayor que 0.");
                }
            
            } catch (InputMismatchException e) {
            	
            	// Devuelvo por consola ese mensajio si sale la excepción por un error de dato de entrada por parte del usuario.
                System.out.println("Entrada inválida. Por favor, introduce un número entero.");
                sc.next(); // Limpiar el buffer de entrada
            }
        }

        // Bucle para que se realice hasta introducir un 0 que saldremos forzosamente del bucle.
        while (true) {
        	
        	// try con catch para recojer la excepcion que me daría si ingreso un valor que no sea un número entero.
            try {
                // Pido un nuevo número.
                System.out.print("Dime un número: ");
                numero = sc.nextInt();
                
                // If para terminar el bucle si el usuario ingresa 0
                if (numero == 0) {
                    break;
                }

                // If para verificar si el número es mayor que el último número válido.
                if (numero > ultimoNumero) {
                    // Actualizamos el último número válido.
                    ultimoNumero = numero; 
                    
                    // Contamos como número válido.
                    totalIntroducidos++;   
                    
                } else {
                    // Contabilizamos como número fallado
                    System.out.println("Fallo es menor.");
                    totalFallados++;
                    
                    // Reseteo el valor del último número.
                    ultimoNumero = 0;
                    
                    // Sumo un nuevo número introducido aunque sea fallado.
                    ++totalIntroducidos;
                }
                
            } catch (InputMismatchException e) {
            	
            	// Devuelvo por consola ese mensajio si sale la excepción por un error de dato de entrada por parte del usuario.
                System.out.println("Entrada inválida. Por favor, introduce un número entero.");
                sc.next(); // Limpiar el buffer de entrada
            }
        }

        // Muestro los resultados al usuario dando tanto los números totales introducidos como los totales fallados.
        System.out.println("Total de números introducidos: " + totalIntroducidos);
        System.out.println("Total de números fallados: " + totalFallados);

        // Cierro uso de escáner.
        sc.close();
    }
}

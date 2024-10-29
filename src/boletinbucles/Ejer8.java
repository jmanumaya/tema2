package boletinbucles;

import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) {
    	
    	// Contador de numeros fallados.
    	int totalFallados = 0;
    	
    	// Contador de numeros totales introducidos.
    	int totalIntroducidos = 0;
    	
    	// Alberga el último número introducido.
    	int ultimoNumero;
    	
    	/* Alberga el número que introduce el usuario después del último introducido para comprobrar 
    	si se tiene que contabilizar o si es uno valido y por tanto convertirse en el úlimo introducido.*/
    	
    	int numero;
    	
    	// Creo el escaner para poder usarlo.
        Scanner sc = new Scanner(System.in);
        
        // Pido y leo el primer número.
        System.out.print("Dime un número inicial: ");
        ultimoNumero = sc.nextInt();
        
        // Incremento 1 al introducir un número ya.
        ++totalIntroducidos;

        // Bucle para que se realize hasta inroducir un 0 que saldremos forzosamente del bucle.
        while (true) {
        	
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
                
                // Reseteo el valor del ultimo número.
                ultimoNumero = 0;
                
                // Sumo un nuevo número introducido aun que sea fallado.
                ++totalIntroducidos;
            }
        }

        // Muestro los resultados al usuario dando tantos los numeros totales introducidos como los totales fallados.
        System.out.println("Total de números introducidos: " + totalIntroducidos);
        System.out.println("Total de números fallados: " + totalFallados);
        
        // Cierro uso de escaner.
        sc.close();
    }
}
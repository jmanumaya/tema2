package boletinifelse;

import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
    	
    	// Creo el escaner para porder usarlo
        Scanner sc = new Scanner(System.in);
        
        // Creo las variables que almacenarán los números que introduzca el usuario
        int a;
        int b;
        int c;
        // Variables para almacenar los números ordenados
        int mayor; // Contendrá el número mayor
        int medio; // Contendrá el número del medio
        int menor; // Contendrá el número menor
        
        // Pedimos los tres números al usuario
        System.out.print("Introduce el primer número: ");
        a = sc.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        b = sc.nextInt();
        
        System.out.print("Introduce el tercer número: ");
        c = sc.nextInt();

        // Comparar para determinar el orden.
        // Primero comprobamos si a es mayor y luego las posiciones de b y c.
        if (a >= b && a >= c) {
            mayor = a;
            if (b >= c) {
                medio = b;
                menor = c;
            } else {
                medio = c;
                menor = b;
            }
        // Aquí comprobamos si b es el mayor y luego las posiciones de a y c.
        } else if (b >= a && b >= c) {
            mayor = b;
            if (a >= c) {
                medio = a;
                menor = c;
            } else {
                medio = c;
                menor = a;
            }
        // Si llegasemos hasta aquí sabriamos que c es el mayor y luego se haría las comprobaciones de las posiciones de a y b.
        } else {
            mayor = c;
            if (a >= b) {
                medio = a;
                menor = b;
            } else {
                medio = b;
                menor = a;
            }
        }

        // Mostrar los números ordenados de mayor a menor después de determinar el orden.
        System.out.println("Los números ordenados de mayor a menor son: " + mayor + ", " + medio + ", " + menor);
        
        // Cerramos uso de escaner.
        sc.close();
    }
}
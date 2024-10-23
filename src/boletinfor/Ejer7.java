package boletinfor;
import java.util.Scanner;

public class Ejer7 {
	
    public static void main(String[] args) {
    	
        // Creo un objeto de tipo Scanner para leer la entrada del usuario.
        Scanner sc = new Scanner(System.in);
        
        // Declaro la variable 'numero' que almacenará el número introducido por el usuario.
        int numero;
        
        // Declaro una variable booleana 'esPrimo' que asumirá que el número es primo al inicio.
        boolean esPrimo = true;

        // Pido un número entero positivo al usuario y lo almaceno en la variable 'numero' y le digo que hará el programa.
        System.out.print("Introduce un número entero positivo y te diré si es primo o no: ");
        numero = sc.nextInt();

        // Compruebo si el número es menor o igual a 1, ya que los números <= 1 no son primos.
        if (numero <= 1) {
            // Si el número es <= 1, lo marco como no primo.
            esPrimo = false;
        } else {
            // Uso un bucle for para verificar si el número tiene divisores entre 2 y la mitad del número
            // Empiezo desde i=2, y si encuentro un divisor, actualizo 'esPrimo' a false.
            for (int i = 2; i <= numero / 2 && esPrimo; i++) {
                // Verifico si 'numero' es divisible por 'i', es decir, si el residuo es 0.
                if (numero % i == 0) {
                    // Si es divisible por 'i', entonces no es primo.
                    esPrimo = false;
                }
            }
        }

        // Después del bucle, verifico el valor de 'esPrimo'.
        // Si sigue siendo true, significa que el número es primo.
        if (esPrimo) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            // Si 'esPrimo' es false, significa que el número no es primo.
            System.out.println("El número " + numero + " no es primo.");
        }
        
        // Cierro uso de escaner.
        sc.close();
    }
}


package boletinswitch;

import java.util.Scanner;

public class Ejer4 {

    public static void main(String[] args) {

        // Creo el escaner.
        Scanner sc = new Scanner(System.in);
        // Variables tipo String que albergaran las tiradas del usuario (el dato que introduzca).
        String tirada1;
        String tirada2;
        // Variables que pasaran a tener el valor que introduzca el usuario en número.
        int datoTda1 = 0;
        int datoTda2 = 0;
        // Le explico por pantalla lo que tiene que hacer y lo que hará el programa.
        System.out.println("Tira dos dados y dime los números (en letras) que te han salido, luego te daré el total.");
        System.out.print("Primera Tirada: ");
        // Recojo la primera tirada.
        tirada1 = sc.nextLine().toUpperCase();
        // Hago las comprobaciones de posibles casos con dicha tirada y le asigno el correspondiente valor a la variable.
        switch (tirada1) {
            case "UNO" -> datoTda1 = 1;
            case "DOS" -> datoTda1 = 2;
            case "TRES" -> datoTda1 = 3;
            case "CUATRO" -> datoTda1 = 4;
            case "CINCO" -> datoTda1 = 5;
            case "SEIS" -> datoTda1 = 6;
            default -> System.out.println("Recuerda! dime el número con letras (UNO, DOS... SEIS)");
        }

        // Inicio un if para comprobar que el dato de la tirada 1 ha sido correcto y proseguir con el dato 2
        if (datoTda1 != 0) {
            System.out.print("Segunda Tirada: ");
            // Recojo la segunda tirada
            tirada2 = sc.nextLine().toUpperCase();
            // Hago las comprobaciones de posibles casos con dicha tirada.
            switch (tirada2) {
                case "UNO" -> datoTda2 = 1;
                case "DOS" -> datoTda2 = 2;
                case "TRES" -> datoTda2 = 3;
                case "CUATRO" -> datoTda2 = 4;
                case "CINCO" -> datoTda2 = 5;
                case "SEIS" -> datoTda2 = 6;
                default -> System.out.println("Recuerda! dime el número con letras (UNO, DOS... SEIS)");
            }

            // Verifico si la segunda tirada también es válida antes de calcular el total
            if (datoTda2 != 0) {
                // Si ambas tiradas son válidas, imprimo el total
                System.out.println("Has sacado un " + (datoTda1 + datoTda2));
            } else {
                // Si la segunda tirada es inválida, imprimo el error
                System.err.println("No se pudo calcular el resultado debido a una entrada inválida en la segunda tirada.");
            }
        } else {
            // Si la primera tirada es inválida, imprimo el error
            System.err.println("No se pudo calcular el resultado debido a una entrada inválida en la primera tirada.");
        }

        // Cierro uso de escaner
        sc.close();
    }
}

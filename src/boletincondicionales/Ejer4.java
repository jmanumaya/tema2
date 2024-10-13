package boletincondicionales;
import java.util.Scanner;

public class Ejer4 {
	
	// Valor de entrada: 3 (por ejemplo).
	// Resultado esperado: tres
	// Resultado obtenido: tres
	
    public static void main(String[] args) {
    	
    	// Creo el escaner para poder recoger datos por parte del usuario.
        Scanner sc = new Scanner (System.in);
        
        // Declaro las siguientes variables de tipo int y String.
        int numero; // Contendrá el valor introducido por parte del usuario.
        int decenas; // Contendrá el valor de decenas, es decir, la primera cifra de un número de dos cifras (de 20 cojerá el 2)
        int unidades; // Contendrá el valor de unidades, es decir, la última cifra de un número de dos cifras (de 20 cojerá el 0)
        String resultado = ""; // Creo la variable de tipo String para albergar el posible resultado a imprimir.
        
        // Le indico al usuario y le digo que obtendrá por parte del programa.
        System.out.print("Introduce un número entre 1 y 99 y te lo diré en letras: ");
        // Recojo el valor introducido por el usuario.
        numero = sc.nextInt();
        // Compruebo si el valor introducido por el usuario está dentro del rango que se le pide.
        if (numero < 1 || numero > 99) {
        	// Como no estária dentro del rango pues le imprimimos por pantalla el error y le informamos.
        	System.err.println("Valor introducido incorrecto\nRecuerda que el número debe ser del 1 al 99");
        } else {
        	// Primero compruebo si el número es menor de 19 ya que son excepciones.
            if (numero <= 19) {
                // Combierto los numeros que estan entre el 1 y el 19 ya que se llaman de una forma única cada uno.
                switch (numero) {
                    case 1 -> resultado = "uno"; // Asigno a resultado "uno".
                    case 2 -> resultado = "dos"; // Asigno a resultado "dos".
                    case 3 -> resultado = "tres"; // Asigno a resultado "tres".
                    case 4 -> resultado = "cuatro"; // Asigno a resultado "cuatro".
                    case 5 -> resultado = "cinco"; // Asigno a resultado "cinco".
                    case 6 -> resultado = "seis"; // Asigno a resultado "seis".
                    case 7 -> resultado = "siete"; // Asigno a resultado "siete".
                    case 8 -> resultado = "ocho"; // Asigno a resultado "ocho".
                    case 9 -> resultado = "nueve"; // Asigno a resultado "nueve".
                    case 10 -> resultado = "diez"; // Asigno a resultado "diez".
                    case 11 -> resultado = "once"; // Asigno a resultado "once".
                    case 12 -> resultado = "doce"; // Asigno a resultado "doce".
                    case 13 -> resultado = "trece"; // Asigno a resultado "trece".
                    case 14 -> resultado = "catorce"; // Asigno a resultado "catorce".
                    case 15 -> resultado = "quince"; // Asigno a resultado "quince".
                    case 16 -> resultado = "dieciséis"; // Asigno a resultado "dieciséis".
                    case 17 -> resultado = "diecisiete"; // Asigno a resultado "diecisiete".
                    case 18 -> resultado = "dieciocho"; // Asigno a resultado "dieciocho".
                    case 19 -> resultado = "diecinueve"; // Asigno a resultado "diecinueve".
                }
            // Continuamos por aquí si no es menor de 19
            } else {
                /* Combierto a decenas y obtengo las unidades si es 20 me quedo con el 2 para saber que tengo que imprimir veinte en este caso 
                 * y si es un 24 por ejemplo me quedo con la ultima cifra para saber si tiene unidades que mostrar */
                decenas = numero / 10;
                unidades = numero % 10;

                // Recojo en la variable "resultado" el nombre de las decenas.
                switch (decenas) {
                    case 2 -> resultado = "veinte"; // Asigno a resultado "veinte".
                    case 3 -> resultado = "treinta"; // Asigno a resultado "treinta".
                    case 4 -> resultado = "cuarenta"; // Asigno a resultado "cuarenta".
                    case 5 -> resultado = "cincuenta"; // Asigno a resultado "cincuenta".
                    case 6 -> resultado = "sesenta"; // Asigno a resultado "sesenta".
                    case 7 -> resultado = "setenta"; // Asigno a resultado "setenta".
                    case 8 -> resultado = "ochenta"; // Asigno a resultado "ochenta".
                    case 9 -> resultado = "noventa"; // Asigno a resultado "noventa".
                }
                
                // Compruebo si unidades es diferente a 0 y si la variable resultado se ha guardado con el valor "veinte" ya que aquí he hecho una excepción y en vez de ser veinte y dos será veintidos
                if (unidades != 0 && resultado.equals("veinte")) {
                	// Le asigno el nuevo valor a resultado
                	resultado = "veinti"; // Asigno a resultado "veinti".
                	// Le añado a resultado la correspondiente siguiente cadena. Si es 24 se muestra veinticuatro ya que le añado y asigno dicha cadena a la que ya tiene asignada
                	switch (unidades) {
                    case 1 -> resultado += "uno"; // Añado a resultado "uno".
                    case 2 -> resultado += "dos"; // Añado a resultado "dos".
                    case 3 -> resultado += "tres"; // Añado a resultado "tres".
                    case 4 -> resultado += "cuatro"; // Añado a resultado "cuatro".
                    case 5 -> resultado += "cinco"; // Añado a resultado "cinco".
                    case 6 -> resultado += "seis"; // Añado a resultado "seis".
                    case 7 -> resultado += "siete"; // Añado a resultado "siete".
                    case 8 -> resultado += "ocho"; // Añado a resultado "ocho".
                    case 9 -> resultado += "nueve"; // Añado a resultado "nueve".
                	}
                
                // Al no ser veinte agrego " y " a resultado si hay unidades y le agrego dicha cadena con su correspondiente unidad. Si es 34 pues pasa a ser treinta y cuatro. "treinta" + " " + "y" + " " + "cuatro".
                } else if (unidades != 0) {
                	resultado += " y "; // Añado a resultado " y ".
                    switch (unidades) {
                        case 1 -> resultado += "uno"; // Añado a resultado "uno".
                        case 2 -> resultado += "dos"; // Añado a resultado "dos".
                        case 3 -> resultado += "tres"; // Añado a resultado "tres".
                        case 4 -> resultado += "cuatro"; // Añado a resultado "cuatro".
                        case 5 -> resultado += "cinco"; // Añado a resultado "cinco".
                        case 6 -> resultado += "seis"; // Añado a resultado "seis".
                        case 7 -> resultado += "siete"; // Añado a resultado "siete".
                        case 8 -> resultado += "ocho"; // Añado a resultado "ocho".
                        case 9 -> resultado += "nueve"; // Añado a resultado "nueve".
                    }
                }
            }
            // Imprimo el resultado que se le dice al usuario que obtendrá y "resultado" tendrá su valor final según que cadena ha ido obteniendo en cada caso.
            System.out.println("El número " + numero + " es: " + resultado);
            // Cierro uso de escaner.
            sc.close();
        }
    }
}

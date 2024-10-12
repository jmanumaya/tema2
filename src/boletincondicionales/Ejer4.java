package boletincondicionales;
import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner (System.in);
        
        int numero;
        int decenas;
        int unidades;
        String resultado = "";
        
        
        System.out.print("Introduce un número entre 1 y 99 y te lo diré en letras: ");
        numero = sc.nextInt();

        if (numero < 1 || numero > 99) {
        	System.err.println("Valor introducido incorrecto\nRecuerda que el número debe ser del 1 al 99");
        } else {
            if (numero <= 19) {
                // Combierto los numeros que estan entre el 1 y el 19 ya que se llaman de una forma única cada uno.
                switch (numero) {
                    case 1: resultado = "uno"; break;
                    case 2: resultado = "dos"; break;
                    case 3: resultado = "tres"; break;
                    case 4: resultado = "cuatro"; break;
                    case 5: resultado = "cinco"; break;
                    case 6: resultado = "seis"; break;
                    case 7: resultado = "siete"; break;
                    case 8: resultado = "ocho"; break;
                    case 9: resultado = "nueve"; break;
                    case 10: resultado = "diez"; break; 
                    case 11: resultado = "once"; break;
                    case 12: resultado = "doce"; break;
                    case 13: resultado = "trece"; break;
                    case 14: resultado = "catorce"; break;
                    case 15: resultado = "quince"; break;
                    case 16: resultado = "dieciséis"; break;
                    case 17: resultado = "diecisiete"; break;
                    case 18: resultado = "dieciocho"; break;
                    case 19: resultado = "diecinueve"; break;
                }
            } else {
                /* Combierto a decenas y obtengo las unidades si es 20 me quedo con el 2 para saber que tengo que imprimir veinte en este caso 
                 * y si es un 24 por ejemplo me quedo con la ultima cifra para saber si tiene unidades que mostrar */
                decenas = numero / 10;
                unidades = numero % 10;

                switch (decenas) {
                    case 2: resultado = "veinte"; break;
                    case 3: resultado = "treinta"; break;
                    case 4: resultado = "cuarenta"; break;
                    case 5: resultado = "cincuenta"; break;
                    case 6: resultado = "sesenta"; break;
                    case 7: resultado = "setenta"; break;
                    case 8: resultado = "ochenta"; break;
                    case 9: resultado = "noventa"; break;
                }
                
                if (unidades != 0 && resultado.equals("veinte")) {
                	resultado = "veinti";
                	switch (unidades) {
                    case 1: resultado += "uno"; break;
                    case 2: resultado += "dos"; break;
                    case 3: resultado += "tres"; break;
                    case 4: resultado += "cuatro"; break;
                    case 5: resultado += "cinco"; break;
                    case 6: resultado += "seis"; break;
                    case 7: resultado += "siete"; break;
                    case 8: resultado += "ocho"; break;
                    case 9: resultado += "nueve"; break;
                	}
                
                // Agrego " y " a resultado si hay unidades y si no es de decena 20 en este caso pues posteriormente le añado a resultado dichas unidades.
                } else if (unidades != 0) {
                	resultado += " y ";
                    switch (unidades) {
                        case 1: resultado += "uno"; break;
                        case 2: resultado += "dos"; break;
                        case 3: resultado += "tres"; break;
                        case 4: resultado += "cuatro"; break;
                        case 5: resultado += "cinco"; break;
                        case 6: resultado += "seis"; break;
                        case 7: resultado += "siete"; break;
                        case 8: resultado += "ocho"; break;
                        case 9: resultado += "nueve"; break;
                }
            }
            }
            System.out.println("El número " + numero + " es: " + resultado);
            sc.close();
        }
    }
}

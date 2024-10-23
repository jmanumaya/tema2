package boletinfor;

public class Ejer4 {

	public static void main(String[] args) {
		
		// Creo la variable num para ir incrementandola con los impares que se vaya encontrando.
		int num = 0;
		
		/* Bucle for donde creo una nueva variable i que será la que irá 
		 * incrementandose por cada vuelta y otra cont que hará lo mismo pero cuando
		 * encuentre número impar y aparte a num le voy incrementando cada número impar*/
		for (int i = 1, cont = 0; cont < 10;i++) {
			
			if (i % 2 != 0) {
				
				num += i;
				cont++;
			}
		}
		
		// Imprimo el resultado total de la suma de los 10 primeros números impares.
		System.out.println("La suma de los 10 primeros números impares: " + num);
		
	}

}

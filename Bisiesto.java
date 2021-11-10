/**
 * Clase Bisiesto
 * Esta clase nos permite conocer si el año ingresado es bisiesto o no
 * @author Brenda Paola Resendiz Mendoza 
 * @version 1.0
 */

import java.util.Scanner;
public class Bisiesto {
    
    /**
     *Parametros para declarar el objeto e inicializar con el objeto de entrada
     * 
     * @param Scanner in El parametro que decalar el objeto 
     * @param int in El parametro que represeta el año que nos ha dado la persona
     */
    
    public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);

	// Imprime el texto ***Bisiesto***
	System.out.println("***Bisiesto***");

	// Imprime el texto Ingresa el año del que deseas saber si es bisiesto o no
	System.out.println("Ingresa el año del que deseas saber si es bisiesto o no");
	
	int año = in.nextInt();

	// Este bloque se cumple solo cuando la sentencia se a que el si el año es divisible entre 4 y al mismo tiempo no es divisible o que el año sea divisible entre 400
	if((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
	    System.out.println("El año: " + año + " es bisiesto");
	}
	// Este bloque se cumple solo cuando no sucede la sentencia anterior
	else{
	    System.out.println("El año: " + año + " no es bisiesto");
	}
    }
}

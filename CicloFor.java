/**
 * Clase CicloFor
 * La clase CicloFor nos permite conocer todos los numeros primos que hay entre 0 y 1000
 * @author Brenda Paola Resendiz Mendoza 
 * @version 1.0
 */

public class CicloFor {

    /**
     * Parametros que nos dan los valores de x, i y si el numero es primo
     *
     * @param x El parametro que tendra el valor del numero al que queremos llegar
     * @param esPrimo El parametro que nos dira si un numero es primo
     * @param i El parametro que tendra el valor de un numero  
     */

    /**
     * este es el metodo main
     * @param args son los args de main
     */
    
    public static void main(String[] args)
    {
	int[] x = new int[1000];
	boolean esPrimo = true;
	int i;

	// Imprime el texto Iniciando Validacion de numeros primos...
	System.out.println("Iniciando Validacion de numeros primos...");

	/**
	 * Este bloque indica primero el valor inicial
	 * despues el valor final 
	 * y por ultimo que va a ir incrementando
	 */
	for(i =1; i <= 1000; i++)
	    
	    {
		// Si la sentencia anterior se cumple pasa a la siguiente sentencia
		esPrimo = true;

		/**
		 * Este bloque indica que j debe tener el valor 2
		 * despues que 2 tiene que se mayor al numero dado para que la
		 * sentencia se cumpla
		 * y por ultimo que el valor de j tambien va a ir incrementando
		 */
		for(int j = 2; j<i; j++)
		    {

			//Preguntamos si el residuo de dividir el valor de i con j es 0
			if(i%j==0)
			    {
				/**
				 * si la sentencia anterior se cumple la sentencia de 
				 * si es primo se vuelve falsa 
				 */
				esPrimo = false;
			    }
		    }
		/**
		 *Si el numero pasa la sentencia de si es primo,
		 *esta se imprime con el siguiente texto ES PRIMO: 
		 *y se le agrega el numero que queriamos saber si era primo o no
		 */
		if(esPrimo)
		  System.out.println("ES PRIMO: " + i);
	    }
    }
}

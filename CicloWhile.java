/**
 * Clase CicloWhile
 * Esta clase nos permite conocer los numeros primos que hay entre el 0 y el 100o con el ciclo DoWhile
 * @author Brenda Paola Resendiz Mendoza 
 * @version 1.0
 */

public class CicloWhile {

    /**
     *Parametros con los valores de i, j y esPrimo
     *
     * @param int i El parametro que representa el valor de i
     * @param int j El parametro que representa el valor de j
     * @param boolean esPrimo El parametro representa si el numero es primo
     */

    /**
     * este es el metodo main
     * @param args son los args del main
     */
    
    public static void main(String[] args) {

	int i = 2;
	int j = 2;
	boolean esPrimo = true;

	// Este bloque se cumple solo si si i es menor a 1000
	while(i<1000){
	    esPrimo = true;
	    j=2;

	    // Este bloque se cumple solo si j es menor a i
	    while(j<i){

		// si i entre j se cumple y no tiene residuo se cumple esta sentencia
		 if(i%j==0){
		     esPrimo = false;
		     break;
		 }
		 j++;
	    }
	    // si la sentencia anterior no se cumple, pasa a la siguiente sentencia 
	    if (esPrimo){

		        // si la anterior setencia se cumple se imprime el texto Es primo: y el numero
			System.out.println("Es primo: " +i);
		    }
		    i++;
	}
    }
}

/**
 * Clase CicloDoWhile
 * Esta clase nos permite conocer los numeros primos que hay entre el 0 y el 100o con el ciclo do while
 * @author Brenda Paola Resendiz Mendoza 
 * @version 1.0
 */

public class CicloDoWhile {

    /**
     * Parametros con los valores i, j y esPrimo
     *
     * @param int i El parametro que representa el valor de i 
     * @param int j El parametro que representa el valor de j
     * @param boolean esPrimo El parametro que representa si un numero es primo
     */

    /**
     * este es el metodo main
     * @param args son los args del main
     */
    
    public static void main(String[] args) {

	int i = 2;
	boolean esPrimo = true;

	// Esta sentencia se cumple cuando j es igual a 2
	do{
	    esPrimo = true;
	    int j = 2;

	    /**
	     *Esta sentencia se cumple cuando i entre j se cumple 
	     *y cuando el valor de i es difrente a j
	     */
	    do{
		if(i%j==0 && i!=j){
		    esPrimo = false;
		    break;
		}
		
		j = j + 1;

		//Esta sentencia se cumple una vez si j es mayor o igual a i
	    }while (j<=i);
	    if(esPrimo){
		System.out.println("Es primo: " + i);
	    }
	    i=i+1;
	    // ESta sentencia se cumple cuando i es menor a 1000
	}while(i<1000);
    }
}

	

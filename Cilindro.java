/**
 * Clase Cilindro
 * Esta clase nos permite conocer el area y el volumen de un cilindro.
 * @author Brenda Paola Resendiz Mendoza 
 * @version 1.0
 */

public class Cilindro {

        /**
         * Parametros con los valores del radio, altura y de pi
         *
         * @param int r El parametro que representa el valor del radio de un cilindro que es 10
         * @param int h El parametro que representa el valor de la altura de un cilindro que es 20
	 * @param double pi El parametro que representa el valor de pi que es 3.1416
	 * @param double area El parametro que representa la formula para obtener el area de un cilindro
	 * @param double volumen El parametro que representa la formula para obtener el volumen de un cilindro
	 *
         */

    /**
     * este es el metodo main
     * @param args son los args del main
     */
    
    public static void main(String[] args) {
	int r = 10;
	int h = 20;
	double pi = 3.1416;
	
	double area = 2*pi*r*h+2*pi*r*r;
	double volumen = pi*h*r*r;

	//Muestra en la pantalla el texto ***Area y volumen de un cilindro***
        System.out.println("***Area y volumen de un cilindro***");
	
	//Muestra en la pantalla el texto El area del cilindro es: y con los datos de los parametros  dados anteriormente muestra el valor del area del cilindro.
	System.out.println("El area del cilindro es: " + area);
	
	//Muestra en la pantalla el texto El volumen del cilindro es: y con los datos de los parametros  dados anteriormente muestra el valor del volumen del cilindro
	System.out.println("El volumen del cilindro es: " + volumen);
	
    }
}

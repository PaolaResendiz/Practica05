/**
 * Clase que representa una cuenta
 * Esta clase nos permite conocer los datos de una cuenta (titular y dinero disponible)
 * @author Brenda Paola Resendiz Mendoza 
 * @version 1.0
 */

import java.util.Scanner;
    public class MainCuenta{
	/** 
	 * Representa la informacion de la cuenta
	 * Parametros de nombre 1 y nombre 2
	 * @param nombre1 Representacion del nombre1
	 * @param nombre2 Representacion del nombre2
	 */
    public static void main(String [] args){

	Scanner scan = new Scanner(System.in);

	Cuenta nombre1 = new Cuenta("Luis");
	System.out.println("Usuario: " + nombre1.getTitular());
	nombre1.setDineroDisponible(5000);
	System.out.println("Dinero disponible: " + nombre1.getDineroDisponible());
	
	Cuenta nombre2 = new Cuenta("Roberto");
	System.out.println("Usuario: " +nombre2.getTitular());
	nombre1.setDineroDisponible(5000);
	System.out.println("Dinero disponible: " +nombre2.getDineroDisponible());
    }
}

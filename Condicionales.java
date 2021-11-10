/**
 * Clase Condicionales
 * La clase condicionales permite pedir a la persona dos números y a partir de eso, regresar el número mayor
 * @author Brenda Paola Resendiz Mendoza 
 * @version 1.0
 */

import java.util.Scanner;
public class Condicionales {
    /**
     * Parametros que nos dara la persona para saber que valores tendran los numeros
     * @param número1 El parametro que tendra el primer valor que nos de la persona 
     * @param número2 El parametro que tendra el segundo valor que nos de la persona 
     */

    /**
     * este es el metodo main
     * @param args son los args de main
     */
    
    public static void main(String[] args) {
	
	//tenemos una clase scanner que nos permitirá leer los datos que nos de la persona
	Scanner in = new Scanner(System.in);
	
	//Imprime el texto ***Condicionales***
	System.out.println("***Condicionales***");

	//Imprime el texto Dame el número 1:
	System.out.println("Dame el número 1: ");
	int número1 = in.nextInt();

	//Imprime el texto Dame el número 2:
	System.out.println("Dame el número 2: ");
	int número2 = in.nextInt();

	//Ejecuta este bloque si la condicion número 1 es mayor a número 2 se cumple
	if(número1 > número2) {
	    //Imprime el texto El número mayor es:
	    System.out.println("El número mayor es: " + número1);
	}
	//Ejecuta este bloque si la condición número 1 es mayor a número 2 no se cumple 
	else{
	    //Imprime el texto El número mayor es:
	    System.out.println("El número mayor es: " + número2);
	}

    }
}

	    

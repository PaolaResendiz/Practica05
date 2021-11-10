/**
 * Clase Primitivo
 * Esta clase nos permite conocer el tamaño de bytes de los tipos primitivos 
 * @author Brenda Paola Resendiz Mendoza 
 * @version 1.0
 */

public class Primitivo {
    public static void main(String[] args) {

	//Se imprime el texto ***Tipos primitivos***
	System.out.println(" ***Tipos primitivos*** ");
	
	//Se imprime el texto byte y se agrega el comando Byte.BYTES para que el mismo programa te de el valor de bytes de byte y por ultimo agrega el texto bytes
	System.out.println("byte: " + Byte.BYTES + " bytes");
	
	//Se imprime el texto short y se agrega el comando Short.BYTES para que el mismo programa te de el valor de bytes de short y por ultimo agrega el texto bytes 
	System.out.println("short: " + Short.BYTES + " bytes");
	
	// Se imprime el texto int y se agrega el comando Integer.BYTES para que el mismo programa te de el valor de bytes de int y por ultimo agrega el texto bytes 
	System.out.println("int: " + Integer.BYTES + " bytes");
	
	//Se imprime el texto long y se agrega el comando Long.BYTES para que el mismo programa te de el valor de bytes de long y por ultimo agrega el texto bytes 
	System.out.println("long: " + Long.BYTES + " bytes");
	
        //Se imprime el texto float y se agrega el comando Float.BYTES para que el mismo programa te de el valor de bytes de float y por ultimo agrega el texto bytes 
	System.out.println("float: " + Float.BYTES + " bytes");
	
	//Se imprime el texto double y se agrega el comando Double.BYTES para que el mismo programa te de el valor de bytes de double y por ultimo agrega el texto bytes 
	System.out.println("double: " + Double.BYTES + " bytes");
	
	//Se imprime el texto boolean: 1 bytes, ya que el comando no funciona con boolean 
	System.out.println("boolean: 1 bytes");
	
	//Se imprime el texto char y se agrega el comando Character.BYTES para que el mismo programa te de el valor de bytes de cahr  y por ultimo agrega el texto bytes 
	System.out.println("char: " + Character.BYTES + " bytes");
    }
}

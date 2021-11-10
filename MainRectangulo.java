/**
 * Clase que representa un rectangulo
 * Esta clase nos permite conocer el area y el perimetro de un rectangulo
 * @author Brenda Paola Resendiz Mendoza 
 * @version 1.0
 */
public class MainRectangulo{

    /**
     * Representa la informacion del rectangulo
     * y como sacar el perimetro y area de este 
     * @param rectangulo Representación de rectangulo
     */
    public static void main(String[] args){

	Rectangulo rectangulo = new Rectangulo();

	rectangulo.setBase(7);
	rectangulo.setAltura(12);

	System.out.println("El area es: " + rectangulo.area());
	System.out.println("El perimetro es: " + rectangulo.perimetro());

	System.out.println(rectangulo);
    }
}

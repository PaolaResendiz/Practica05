/**
 * Clase que representa un rectangulo
 * Esta clase nos permite conocer el area y el perimetro de un rectangulo
 * @author Brenda Paola Resendiz Mendoza 
 * @version 1.0
 */
public class Rectangulo{

    // La base del triangulo
    private double base;
    // La altura del triangulo
    private double altura;

    /**
     * Constructor que recibe dos valores reales
     * y los representa como la base y la altura del traingulo
     */

    /**
     * Metodo que devuelve el valor de la base 
     * @return la cordenada base
     */
    public double getBase (){
	return this.base;
    }

    /**
     * Metodo que cambia el valor de la base
     * @param base El nuevo valor de base
     */
    public void setBase(double base){
	this.base = base;
    }

     /**
     * Metodo que devuelve el valor de la altura
     * @return la cordenada altura
     */
    public double getAltura(){
	return this.altura;
    }

     /**
     * Metodo que cambia el valor de la altura
     * @param altura El nuevo valor de altura
     */
    public void setAltura(double altura){
	this.altura = altura;
    }
    /**
     * Metodo que devuelve el valor del area 
     * @return El area del triangulo
     */
    public double area(){
	return (this.base * this.altura);
    }

    /**
     * Metodo que devuelve el valor del perimetro
     * @return El perimetro del triangulo
     */
    public double perimetro(){
	return (this.base + this.base) + (this.altura + this.altura);
    }
}



    

    

	


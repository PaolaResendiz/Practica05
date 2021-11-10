/**
 * Clase que representa una cuenta
 * Esta clase nos permite conocer los datos de una cuenta (titular y dinero disponible)
 * @author Brenda Paola Resendiz Mendoza 
 * @version 1.0
 */
public class Cuenta{

    //El titular de la cuenta
    private String titular;
    //Dinero disponible de la cuenta
    private double dinerodisponible;

    /**
     * Constructor que recibe un valor real
     * y lo representa como el titular de la cuenta
     *
     * @param titular El parametro que representa el nombre del titular de la cuenta
     */
    public Cuenta (String titular)
    {
	this.titular=titular;
	    dinerodisponible=0;
    }

    /**
     * Metodo que devuelve el nombre del titular
     * @return titular
     */
    public String getTitular (){
	return this.titular;
    }

    /**
     * Metodo que cambia el valor de titular
     * @param titular El nuevo valor de titular
     */
    public void setTitular(String titular){
	this.titular = titular;
    }

     /**
     * Metodo que devuelve el dinero disponible de la cuenta
     * @return dinerodisponible
     */
    public double getDineroDisponible(){
	return this.dinerodisponible;
    }

    /**
     * Metodo que cambia el valor de dinero disponible
     * @param dinerodisponible El nuevo valor de dinero disponible
     */
    public void setDineroDisponible(double dinerodisponoble){
	this.dinerodisponible = dinerodisponible;
    }
}



    

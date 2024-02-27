package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente 
{
	/**
	 * Un String de Cliente NATURAL, se inicializa en "Natural".
	 */
	public static String NATURAL = "Natural";
	
	/**
	 * Un String con el Nombre deL Cliente Natural.
	 */
	private String nombre;
	
	/**
     * Constructor de la clase ClienteNatural.
     */
	public ClienteNatural(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * 
	 * @return El tipo de Cliente.
	 */
	public String getTipoCliente()
	{
		return null;
	}
	
	/**
	 * 
	 * @return El identificador del Cliente.
	 */
	public String getIdentificador()
	{
		return null;
	}
}

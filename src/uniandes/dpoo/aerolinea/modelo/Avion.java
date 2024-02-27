package uniandes.dpoo.aerolinea.modelo;

public class Avion 
{
	
	/**
     * Un String con el nombre del Avion.
     */
	private String nombre;
	
	/**
     * Un int con la cantidad de asientos que posee el Avion.
     */
	private int capacidad;
	
	/**
     * Constructor de la clase Avion.
     */
	public Avion(String nombre, int capacidad) 
	{
		this.nombre = nombre;
		this.capacidad = capacidad;
	}
	
	/**
	 * @return Nombre del Avion
	 */
	public String getNombre() 
	{
		return nombre;
	}
	
	/**
	 * @return Capacidad del Avion
	 */
	public int getCapacidad() 
	{
		return capacidad;
	}
}

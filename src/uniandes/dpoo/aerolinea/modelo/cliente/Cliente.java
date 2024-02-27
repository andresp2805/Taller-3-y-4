package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.ArrayList;
import java.util.List;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente 
{
	/**
	 * Lista de Tiquetes sin Usar.
	 */
	private List<Tiquete> tiquetesSinUsar;
	
	/**
	 * Lista de Tiquetes Usados.
	 */
	private List<Tiquete> tiquetesUsados;

	/**
     * Constructor de la clase Cliente.
     */
	public Cliente() {
		tiquetesSinUsar = new ArrayList<Tiquete>( );
		tiquetesUsados = new ArrayList<Tiquete>( );
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
	
	/**
	 * Agrega un Tiquete a la lista de tiquetes.
	 * @param Tiquete a agregar
	 */
	public void agregarTiquete(Tiquete tiquete)
	{
		
	}
	
	/**
	 * 
	 * @return
	 */
	public int calcularValorTotalTiquetes()
	{
		return -1;
	}
	
	/**
	 * 
	 * @param 
	 * Elimina un Tiquete de la lista de Tiquetes sin Usar y lo agrega a la lista de Tiquetes Usados.
	 */
	public void usarTiquetes(Vuelo vuelo)
	{
		
	}
}

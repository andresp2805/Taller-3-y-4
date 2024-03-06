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
		
	}
	
	/**
	 * 
	 * @return El tipo de Cliente.
	 */
	public abstract String getTipoCliente();
	
	/**
	 * 
	 * @return El identificador del Cliente.
	 */
	public abstract String getIdentificador();
	
	/**
	 * Agrega un Tiquete a la lista de tiquetes.
	 * @param Tiquete a agregar
	 */
	public void agregarTiquete(Tiquete tiquete)
	{
		tiquetesSinUsar.add(tiquete);
	}
	
	/**
	 * 
	 * @return Calcula el valor total de los tiquetes que ha comprado un cliente
	 */
	public int calcularValorTotalTiquetes()
	{
		int total = 0;
		for (int i = 0; i < this.tiquetesSinUsar.size(); i++)
		{
			total += this.tiquetesSinUsar.get(i).getTarifa();
		}
		return total;
	}
	
	/**
	 * 
	 * @param 
	 * Elimina un Tiquete de la lista de Tiquetes sin Usar y lo agrega a la lista de Tiquetes Usados.
	 */
	public void usarTiquetes(Vuelo vuelo)
	{
		ArrayList<Tiquete> tiquetesVuelo = (ArrayList<Tiquete>) vuelo.getTiquetes();
		for (int i = 0; i < tiquetesVuelo.size(); i++)
		{
			if(tiquetesSinUsar.contains(tiquetesVuelo.get(i)))
			{
				tiquetesVuelo.get(i).marcarComoUsado();
				tiquetesSinUsar.remove(tiquetesVuelo.get(i));
				tiquetesUsados.add(tiquetesVuelo.get(i));
			}
		}
	}
}

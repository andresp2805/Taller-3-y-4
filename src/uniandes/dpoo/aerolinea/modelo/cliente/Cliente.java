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

	public Cliente() {
		tiquetesSinUsar = new ArrayList<Tiquete>( );
		tiquetesUsados = new ArrayList<Tiquete>( );
	}
	
	public String getTipoCliente()
	{
		return null;
	}
	
	public String getIdentificador()
	{
		return null;
	}
	
	public void agregarTiquete(Tiquete tiquete)
	{
		
	}
	
	public int calcularValorTotalTiquetes()
	{
		return -1;
	}
	
	public void usarTiquetes(Vuelo vuelo)
	{
		
	}
}

package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete 
{
	/**
	 * Un String con el codigo del Tiquete.
	 */
	private String codigo;
	
	/**
	 * Un int con la tarifa del Tiquete.
	 */
	private int tarifa;
	
	/**
	 * Un boolean que dice si el Tiquete ya ha sido usado.
	 */
	private boolean usado;
	
	/**
	 * Vuelo al que pertenece el Tiquete.
	 */
	private Vuelo vuelo;
	
	/**
	 * Cliente al que pertenece el Tiquete.
	 */
	private Cliente cliente;

	/**
     * Constructor de la clase Tiquete.
     */
	public Tiquete(String codigo, Vuelo vuelo, Cliente cliente, int tarifa) 
	{
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.vuelo = vuelo;
		this.cliente = cliente;
	}

	/**
	 * @return El codigo del Tiquete.
	 */
	public String getCodigo() 
	{
		return codigo;
	}

	/**
	 * @return La tarifa del Tiquete.
	 */
	public int getTarifa() 
	{
		return tarifa;
	}

	/**
	 * @return El Vuelo al que pertenece el Tiquete.
	 */
	public Vuelo getVuelo() 
	{
		return vuelo;
	}

	/**
	 * @return El Cliente al que pertenece el Tiquete.
	 */
	public Cliente getCliente() 
	{
		return cliente;
	}
	
	/**
	 * Marca a un Tiquete como usado.
	 */
	public void marcarComoUsado()
	{
		this.usado = true;
	}
	
	/**
	 * Determina si un Tiquete esta usado, true si el Tiquete esta usado false de lo contrario.
	 */
	public boolean esUsado()
	{
		return this.usado;
	}
	
}

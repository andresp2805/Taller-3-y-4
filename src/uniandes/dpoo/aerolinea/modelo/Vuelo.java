package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.Map;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo 
{
	/**
     * Un String con la fecha del vuelo.
     */
	private String fecha;
	
	/**
     * El Avion del vuelo.
     */
	private Avion avion;
	
	/**
     * La Ruta del vuelo.
     */
	private Ruta ruta;
	
	/**
     * Un Mapa de tiquetes donde las llaves son el codigo del tiquete.
     */
	private Map<String,Tiquete> tiquetes;
	
	/**
     * Constructor de la clase Vuelo.
     */
	public Vuelo(String fecha, Avion avion, Ruta ruta) {
		super();
		this.fecha = fecha;
		this.avion = avion;
		this.ruta = ruta;
	}

	/**
	 * @return La fecha del Vuelo.
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @return El Avion del Vuelo.
	 */
	public Avion getAvion() {
		return avion;
	}

	/**
	 * @return La Ruta del Vuelo.
	 */
	public Ruta getRuta() {
		return ruta;
	}

	/**
	 * @return Una Collection con los tiquetes del vuelo.
	 */
	public Collection<Tiquete> getTiquetes() {
		return tiquetes.values();
	}
	
	/**
	 * 
	 * @param Cliente al que se le va a vender un tiquete
	 * @param Calculadora para la tarifa de un tiquete
	 * @param Cantidad de Tiquetes a vender
	 * @return Vende una determinada cantidad de tiquetes para el vuelo y los deja registrados en el mapa de tiquetes
	 */
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad)
	{
		return -1;
	}
	
	public boolean equals(Object obj)
	{
		return false;
	}
}

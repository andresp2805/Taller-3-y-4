package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas 
{
	/**
     * Tarifa de IMPUESTO inicializada en 0.28.
     */
	public double IMPUESTO = 0.28;
	
	/**
     * Cliente.
     */
	private Cliente cliente;
	
	/**
     * Vuelo.
     */
	private Vuelo vuelo;
	
	/**
	 * 
	 * @param Vuelo al que se le va a calcular la tarifa.
	 * @param Cliente al que se le va a calcular la tarifa.
	 * @return Tarifa
	 */
	public int calcularTarifa(Vuelo vuelo, Cliente cliente)
	{
		return -1;
	}
	
	/**
	 * 
	 * @param Vuelo al que se le va a calcular la tarifa.
	 * @param Cliente al que se le va a calcular la tarifa.
	 * @return Costo Base.
	 */
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente)
	{
		return -1;
	}
	
	protected double calcularPorcentajeDescuento(Cliente cliente)
	{
		return -1;
	}
}

package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
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
	 * @param Vuelo al que se le va a calcular el costo base.
	 * @param Cliente al que se le va a calcular el costo base.
	 * @return Costo Base.
	 */
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente)
	{
		return -1;
	}
	
	/**
	 * 
	 * @param Cliente al que se le va a calcular porcentaje de descuento.
	 * @return El Porcentaje de Descuento
	 */
	protected double calcularPorcentajeDescuento(Cliente cliente)
	{
		return -1;
	}
	
	/**
	 * 
	 * @param Ruta al que se le va a calcular la distancia.
	 * @return Distancia del Vuelo.
	 */
	protected int calcularDistanciaVuelo(Ruta ruta)
	{
		return -1;
	}
	
	/**
	 * 
	 * @param Costo Base 
	 * @return Valor de los impuestos
	 */
	protected int ValorImpuestos(int costoBase)
	{
		return -1;
	}
}

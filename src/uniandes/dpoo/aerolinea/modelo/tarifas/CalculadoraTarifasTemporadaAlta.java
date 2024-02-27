package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas
{
	/**
	 * Costo por km, se inicializa en 1000km.
	 */
	protected int COSTO_POR_KM = 1000;
	
	/**
	 * 
	 * @param Vuelo al que se le va a calcular el costo base.
	 * @param Cliente al que se le va a calcular el costo base.
	 * @return Costo Base.
	 */
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente)
	{
		return -1;
	}
	
	/**
	 * 
	 *@param Cliente al que se le va a calcular porcentaje de descuento.
	 * @return El Porcentaje de Descuento
	 */
	public double calcularPorcentajeDescuento(Cliente cliente)
	{
		return -1;
	}
}

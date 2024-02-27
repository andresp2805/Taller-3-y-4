package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas
{
	/**
	 * Costo por km Natural, se inicializa en 600km.
	 */
	protected int COSTO_POR_KM_NATURAL = 600;
	
	/**
	 * Costo por km Corporativo, se inicializa en 900km.
	 */
	protected int COSTO_POR_KM_CORPORATIVO = 900;
	
	/**
	 * Descuento PEQ, se inicializa en 2%.
	 */
	protected double DESCUENTO_PEQ = 0.02;
	
	/**
	 * Descuento MEDIANAS, se inicializa en 10%.
	 */
	protected double DESCUENTO_MEDIANAS = 0.1;
	
	/**
	 * Descuento GRANDES, se inicializa en 20%.
	 */
	protected double DESCUENTO_GRANDES = 0.2;
		
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

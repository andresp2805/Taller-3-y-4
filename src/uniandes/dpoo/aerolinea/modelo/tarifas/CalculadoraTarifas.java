package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
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
		int tarifa = (int) (calcularCostoBase(vuelo,cliente) * calcularPorcentajeDescuento(cliente) + ValorImpuestos(calcularCostoBase(vuelo,cliente)));
		return tarifa;
	}
	
	/**
	 * 
	 * @param Vuelo al que se le va a calcular el costo base.
	 * @param Cliente al que se le va a calcular el costo base.
	 * @return Costo Base.
	 */
	protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente);
	
	/**
	 * 
	 * @param Cliente al que se le va a calcular porcentaje de descuento.
	 * @return El Porcentaje de Descuento
	 */
	protected abstract double calcularPorcentajeDescuento(Cliente cliente);
	
	/**
	 * 
	 * @param Ruta al que se le va a calcular la distancia.
	 * @return Distancia del Vuelo.
	 */
	protected int calcularDistanciaVuelo(Ruta ruta)
	{
		Aeropuerto origen = ruta.getOrigen();
		Aeropuerto destino = ruta.getDestino();
		int distancia = Aeropuerto.calcularDistancia(origen, destino);
		return distancia;
	}
	
	/**
	 * 
	 * @param Costo Base 
	 * @return Valor de los impuestos
	 */
	protected int ValorImpuestos(int costoBase)
	{
		int impuesto = (int) (costoBase * IMPUESTO);
		return impuesto;
	}
}

package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteCorporativo;

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
		Ruta ruta = vuelo.getRuta();
		Aeropuerto origen = ruta.getOrigen();
		Aeropuerto destino = ruta.getDestino();
		int distancia = Aeropuerto.calcularDistancia(origen, destino);
		int costoBase = distancia * COSTO_POR_KM;
		return costoBase;
	}
	
	/**
	 * 
	 *@param Cliente al que se le va a calcular porcentaje de descuento.
	 * @return El Porcentaje de Descuento
	 */
	public double calcularPorcentajeDescuento(Cliente cliente)
	{
		return 0;
	}
}

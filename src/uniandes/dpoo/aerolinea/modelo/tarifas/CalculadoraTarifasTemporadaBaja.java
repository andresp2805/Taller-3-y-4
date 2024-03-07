package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
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
		String tipoCliente = cliente.getTipoCliente();
		Ruta ruta = vuelo.getRuta();
		Aeropuerto origen = ruta.getOrigen();
		Aeropuerto destino = ruta.getDestino();
		int distancia = Aeropuerto.calcularDistancia(origen, destino);
		int costoBase = 0;
		if (tipoCliente == "Natural")
		{
			costoBase = distancia * COSTO_POR_KM_NATURAL;
		}
		else
		{
			costoBase = distancia * COSTO_POR_KM_CORPORATIVO;

		}
		return costoBase;
	}
	
	/**
	 * 
	 *@param Cliente al que se le va a calcular porcentaje de descuento.
	 * @return El Porcentaje de Descuento
	 */
	public double calcularPorcentajeDescuento(Cliente cliente)
	{
		String tipoCliente = cliente.getTipoCliente();
		double descuento = 0;
		if(tipoCliente == "Corporativo")
		{
			String id = cliente.getIdentificador();
			String[] array = id.split(".");
			String tamañoeEmpresa = array[0];
			if (tamañoeEmpresa == "GRANDE")
			{
				descuento = this.DESCUENTO_GRANDES;
			}
			else if (tamañoeEmpresa == "MEDIANA")
			{
				descuento = this.DESCUENTO_MEDIANAS;
			}
			else if (tamañoeEmpresa == "PEQUENA")
			{
				descuento = this.DESCUENTO_PEQ;
			}
		}
		return descuento;
	}
}

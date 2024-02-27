package uniandes.dpoo.aerolinea.modelo;

import java.util.HashSet;
import java.util.Set;

import uniandes.dpoo.aerolinea.exceptions.AeropuertoDuplicadoException;

/**
 * Esta clase encapsula la información sobre los aeropuertos e implementa algunas operaciones relacionadas con la ubicación geográfica de los aeropuertos.
 * 
 * No puede haber dos aeropuertos con el mismo código.
 */
public class Aeropuerto
{
    // TODO completar
	/**
     * Un String con el nombre del Aeropuerto.
     */
    private String nombre;
    
    /**
     * Un String con el codigo del Aeropuerto.
     */
    private String codigo;
    
    /**
     * Un String con el nombre de la ciudad.
     */
    private String nombreCiudad;
    
    /**
     * Un double la latitud del Aeropuerto.
     */
    private double latitud;
    
    /**
     * Un double la longitud del Aeropuerto.
     */
    private double longitud;
    
    /**
     * Un hashSet que contiene todos los codigos utilizados.
     */
    private static Set<String> codigosUtilizados = new HashSet<String>();
    
    /**
     * Un int con el radio de la tierra.
     */
    private static int RADIO_TERRESTRE = 6371;
    
    /**
     * Constructor de la clase Aeropuerto.
     */
    public Aeropuerto(String nombre, String codigo, String nombreCiudad, double latitud, double longitud) 
    {
		this.nombre = nombre;
		this.codigo = codigo;
		this.nombreCiudad = nombreCiudad;
		this.latitud = latitud;
		this.longitud = longitud;
	}
    
	/**
	 * @return El nombre del Aeropuerto.
	 */
	public String getNombre() 
	{
		return nombre;
	}

	/**
	 * @return El codigo del Aeropuerto.
	 */
	public String getCodigo() 
	{
		return codigo;
	}

	/**
	 * @return El nombre de la ciudad.
	 */
	public String getNombreCiudad() 
	{
		return nombreCiudad;
	}

	/**
	 * @return La latitud del Aeropuerto.
	 */
	public double getLatitud() 
	{
		return latitud;
	}

	/**
	 * @return La longitud del Aeropuerto.
	 */
	public double getLongitud() 
	{
		return longitud;
	}
	
	/**
     * Este método calcula la distancia *aproximada* entre dos aeropuertos. Hay fórmulas más precisas pero esta es suficientemente buena para el caso de la aerolínea.
     * 
     * Este método asume que las coordenadas (latitud y longitud) de los aeropuertos están expresadas en la forma que las hace más cercanas. Si no es así, la distancia entre
     * los dos aeropuertos podría ser la más larga posible.
     * 
     * Por ejemplo, dependiendo de cómo estén expresadas las longitudes, la distancia calculada entre Narita (Tokyo) y El Dorado (Bogotá) podría ser atravesando el Pacífico, o
     * atravesando el Atlántico y Asia (el camino largo)
     * 
     * @param aeropuerto1
     * @param aeropuerto2
     * @return La distancia en kilómetros entre los puntos
     */
    public static int calcularDistancia( Aeropuerto aeropuerto1, Aeropuerto aeropuerto2 )
    {
        // Convertir los ángulos a radianes para facilitar las operaciones trigonométricas
        double latAeropuerto1 = Math.toRadians( aeropuerto1.getLatitud( ) );
        double lonAeropuerto1 = Math.toRadians( aeropuerto1.getLongitud( ) );
        double latAeropuerto2 = Math.toRadians( aeropuerto2.getLatitud( ) );
        double lonAeropuerto2 = Math.toRadians( aeropuerto2.getLongitud( ) );

        // Calcular la distancia debido a la diferencia de latitud y de longitud
        double deltaX = ( lonAeropuerto2 - lonAeropuerto1 ) * Math.cos( ( latAeropuerto1 + latAeropuerto2 ) / 2 );
        double deltaY = ( latAeropuerto2 - latAeropuerto1 );

        // Calcular la distancia real en kilómetros
        double distancia = Math.sqrt( deltaX * deltaX + deltaY * deltaY ) * RADIO_TERRESTRE;
        
        return ( int )Math.round( distancia );
    }

}

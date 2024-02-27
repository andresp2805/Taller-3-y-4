package uniandes.dpoo.aerolinea.modelo;

/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta
{
    // TODO completar
	/**
     * Un String con la hora de salida.
     */
	private String horaSalida;
	
	/**
     * Un String con la hora de llegada.
     */
	private String horaLlegada;
	
	/**
     * Un String con el codigo de la ruta.
     */
	private String codigoRuta;
	
	/**
     * Un Aeropuerto de origen.
     */
	private Aeropuerto origen;
	
	/**
     * Un Aeropuerto de destino.
     */
	private Aeropuerto destino;
	
	/**
     * Constructor de la clase Ruta.
     */
    public Ruta(String horaSalida, String horaLlegada, String codigoRuta, Aeropuerto origen, Aeropuerto destino) 
    {
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.codigoRuta = codigoRuta;
		this.origen = origen;
		this.destino = destino;
	}

	/**
	 * @return La hora de salida.
	 */
	public String getHoraSalida() 
	{
		return horaSalida;
	}

	/**
	 * @return La hora de llegada.
	 */
	public String getHoraLlegada() 
	{
		return horaLlegada;
	}

	/**
	 * @return El codigo de la ruta. 
	 */
	public String getCodigoRuta() 
	{
		return codigoRuta;
	}

	/**
	 * @return Aeropuerto de origen.
	 */
	public Aeropuerto getOrigen() 
	{
		return origen;
	}

	/**
	 * @return Aeropuerto de destino.
	 */
	public Aeropuerto getDestino() 
	{
		return destino;
	}
	
	/**
	 * @return Duración de la Ruta.
	 */
	public int getDuracion()
	{
		return -1;
	}
	
	/**
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
    public static int getMinutos( String horaCompleta )
    {
        int minutos = Integer.parseInt( horaCompleta ) % 100;
        return minutos;
    }

    /**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public static int getHoras( String horaCompleta )
    {
        int horas = Integer.parseInt( horaCompleta ) / 100;
        return horas;
    }

    
}

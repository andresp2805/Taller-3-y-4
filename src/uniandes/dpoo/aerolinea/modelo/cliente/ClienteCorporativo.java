package uniandes.dpoo.aerolinea.modelo.cliente;

import org.json.JSONObject;

/**
 * Esta clase se usa para representar a los clientes de la aerolínea que son empresas
 */
public class ClienteCorporativo extends Cliente
{
    // TODO completar
	/**
	 * Un String de Cliente CORPORATIVO, se inicializa en "Corporativo".
	 */
	public String CORPORATIVO = "Corporativo";
	
	/**
	 * Un int que representa una empresa GRANDE, se inicializa en 1.
	 */
	public int GRANDE = 1;

	/**
	 * Un int que representa una empresa MEDIANA, se inicializa en 2.
	 */
	public int MEDIANA = 2;
	
	/**
	 * Un int que representa una empresa PEQUENA, se inicializa en 3.
	 */
	public int PEQUENA = 3;
	
	/**
	 * Un String con el Nombre de la Empresa.
	 */
	private String nombreEmpresa;
	
	/**
	 * Un int con el Tamaño de la Empresa.
	 */
	private int tamanoEmpresa;
	
	/**
     * Constructor de la clase ClienteCorporativo.
     */
    public ClienteCorporativo(String nombreEmpresa, int tamanoEmpresa) 
    {
		this.nombreEmpresa = nombreEmpresa;
		this.tamanoEmpresa = tamanoEmpresa;
	}

	/**
	 * @return El nombre de la Empresa.
	 */
	public String getNombreEmpresa() 
	{
		return nombreEmpresa;
	}

	/**
	 * @return El tamaño de la Empresa.
	 */
	public int getTamanoEmpresa() 
	{
		return tamanoEmpresa;
	}
	
	/**
	 * 
	 * @return El tipo de Cliente.
	 */
	public String getTipoCliente()
	{
		return CORPORATIVO;
	}
	
	/**
	 * 
	 * @return El identificador del Cliente.
	 */
	public String getIdentificador()
	{
		String identificador = "";
		if (this.tamanoEmpresa == GRANDE)
		{
			identificador += "GRANDE.";
		}
		else if (this.tamanoEmpresa == MEDIANA)
		{
			identificador += "MEDIANA.";
		}
		else if (this.tamanoEmpresa == PEQUENA)
		{
			identificador += "PEQUENA.";
		}
		identificador += CORPORATIVO+"."+this.nombreEmpresa;
		return identificador;
	}
	
	/**
     * Crea un nuevo objeto de tipo a partir de un objeto JSON.
     * 
     * El objeto JSON debe tener dos atributos: nombreEmpresa (una cadena) y tamanoEmpresa (un número).
     * @param cliente El objeto JSON que contiene la información
     * @return El nuevo objeto inicializado con la información
     */
    public static ClienteCorporativo cargarDesdeJSON( JSONObject cliente )
    {
        String nombreEmpresa = cliente.getString( "nombreEmpresa" );
        int tam = cliente.getInt( "tamanoEmpresa" );
        return new ClienteCorporativo( nombreEmpresa, tam );
    }

    /**
     * Salva este objeto de tipo ClienteCorporativo dentro de un objeto JSONObject para que ese objeto se almacene en un archivo
     * @return El objeto JSON con toda la información del cliente corporativo
     */
    public JSONObject salvarEnJSON( )
    {
        JSONObject jobject = new JSONObject( );
        jobject.put( "nombreEmpresa", this.nombreEmpresa );
        jobject.put( "tamanoEmpresa", this.tamanoEmpresa );
        jobject.put( "tipo", CORPORATIVO );
        return jobject;
    }
}

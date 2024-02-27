package uniandes.dpoo.aerolinea.persistencia;

import java.io.IOException;

import uniandes.dpoo.aerolinea.exceptions.InformacionInconsistenteException;
import uniandes.dpoo.aerolinea.modelo.Aerolinea;

public interface IPersistenciaAerolinea 
{
	/**
	 * 
	 * @param String con el nombre del archivo a cargar
	 * @param Aerolina que va a ser cargada
	 */
	public void cargarAerolinea(String archivo, Aerolinea aerolinea) throws IOException, InformacionInconsistenteException;
	
	/**
	 * 
	 * @param String con el nombre del archivo a salvar
	 * @param Aerolina que va a ser guardada
	 */
	public void salvarAerolinea(String archivo, Aerolinea aerolinea) throws IOException;
}

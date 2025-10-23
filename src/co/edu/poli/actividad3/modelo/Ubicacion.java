package co.edu.poli.actividad3.modelo;

/**
 * Representa la ubicación física donde se realiza una actividad o visita.
 *
 * <p>
 * Contiene información detallada como la dirección, sala específica y ciudad
 * donde se encuentra la ubicación. Permite almacenar y consultar datos
 * esenciales para localizar un evento o exposición.
 * </p>
 *
 * @author Brayan
 * @version 1.0
 */
public class Ubicacion {

	private String direccion;
	private String sala;
	private String ciudad;

	/**
	 * Crea una nueva ubicación con todos sus datos específicos.
	 *
	 * @param direccion Dirección principal de la ubicación
	 * @param sala      Sala o espacio específico dentro del lugar
	 * @param ciudad    Ciudad donde se encuentra la ubicación
	 */
	public Ubicacion(String direccion, String sala, String ciudad) {
		this.direccion = direccion;
		this.sala = sala;
		this.ciudad = ciudad;
	}

	/**
	 * @return Dirección principal del lugar
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Modifica la dirección principal de la ubicación.
	 *
	 * @param direccion Nueva dirección a asignar
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return Sala o espacio específico dentro del lugar
	 */
	public String getSala() {
		return sala;
	}

	/**
	 * Modifica la sala donde se llevará a cabo la actividad.
	 *
	 * @param sala Nueva sala a asignar
	 */
	public void setSala(String sala) {
		this.sala = sala;
	}

	/**
	 * @return Ciudad donde se encuentra la ubicación
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * Modifica la ciudad de la ubicación.
	 *
	 * @param ciudad Nueva ciudad a asignar
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "UBICACION: | direccion='" + direccion + "' | sala='" + sala + "' | ciudad='" + ciudad + "' |";
	}
}

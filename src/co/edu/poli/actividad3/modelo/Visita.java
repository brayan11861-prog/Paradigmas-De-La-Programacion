package co.edu.poli.actividad3.modelo;

/**
 * Clase que representa una actividad de tipo Visita dentro del sistema.
 * Extiende la clase {@link Actividad} y agrega información específica como el
 * género del visitante y la fecha de la visita.
 * 
 * @author TuNombre
 */
public class Visita extends Actividad {

	/** Género de la persona que realiza la visita */
	private String genero;

	/** Fecha en la que se realiza la visita */
	private String fechaVisita;

	/**
	 * Constructor completo para crear un objeto Visita con todos los datos.
	 * 
	 * @param serial      Identificador único de la actividad
	 * @param nombre      Nombre de la actividad o visitante
	 * @param fechainicio Fecha de inicio de la actividad
	 * @param fechafin    Fecha de finalización de la actividad
	 * @param genero      Género del visitante
	 * @param fechaVisita Fecha en que se registra la visita
	 */
	public Visita(String serial, String nombre, String fechainicio, String fechafin, String genero,
			String fechaVisita) {
		super(serial, nombre, fechainicio, fechafin);
		this.genero = genero;
		this.fechaVisita = fechaVisita;
	}

	/**
	 * Constructor alternativo cuando solo se conoce el serial y nombre. Se asignan
	 * valores por defecto al género y fecha de visita.
	 * 
	 * @param serial Identificador único de la actividad
	 * @param nombre Nombre de la actividad o visitante
	 */
	public Visita(String serial, String nombre) {
		super(serial, nombre);
		this.genero = "No especificado";
		this.fechaVisita = "Sin fecha";
	}

	/**
	 * Obtiene el género del visitante.
	 * 
	 * @return género de la visita
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Modifica el género del visitante.
	 * 
	 * @param genero nuevo género a asignar
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * Obtiene la fecha de la visita.
	 * 
	 * @return fecha en que se registró la visita
	 */
	public String getFechaVisita() {
		return fechaVisita;
	}

	/**
	 * Modifica la fecha en la que se realiza la visita.
	 * 
	 * @param fechaVisita nueva fecha de visita
	 */
	public void setFechaVisita(String fechaVisita) {
		this.fechaVisita = fechaVisita;
	}

	/**
	 * Registra una visita mostrando un mensaje informativo en consola.
	 */
	public void registrarVisita() {
		System.out.println("La " + getNombre() + " se registró el " + fechaVisita);
	}

	/**
	 * Retorna una representación en texto del objeto Visita.
	 * 
	 * @return información detallada del objeto en formato String
	 */
	@Override
	public String toString() {
		return "VISITA: |" + super.toString() + " (género='" + genero + "')|" + " (fechaVisita='" + fechaVisita + "')|";
	}
}

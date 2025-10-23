package co.edu.poli.actividad3.modelo;

/**
 * Representa una exposición registrada dentro del sistema como una subclase de {@link Actividad}.
 * Una exposición corresponde a una muestra artística, histórica o cultural que se encuentra
 * disponible para el público durante un rango de fechas específico.
 *
 * <p>Incluye información sobre su descripción, temática y posibles asociaciones
 * con una visita guiada o ubicación particular.</p>
 *
 * @author Brayan Niño
 * @version 1.0
 */
public class Exposicion extends Actividad {

	private String descripcion;
	private String tema;
	private Visita visita;
	private Ubicacion ubicacion;

	/**
	 * Constructor principal que inicializa una exposición con atributos clave.
	 *
	 * @param serial       Identificador único de la exposición
	 * @param nombre       Nombre de la exposición
	 * @param fechainicio  Fecha de inicio
	 * @param fechafin     Fecha de finalización
	 * @param descripcion  Breve descripción de la exposición
	 * @param tema         Tema principal de la exposición
	 */
	public Exposicion(String serial, String nombre, String fechainicio, String fechafin,
			String descripcion, String tema) {
		super(serial, nombre, fechainicio, fechafin);
		this.descripcion = descripcion;
		this.tema = tema;
	}

	/**
	 * Constructor alternativo que crea una exposición con datos mínimos.
	 * Se asignan valores por defecto para descripción y tema.
	 *
	 * @param serial Identificador único de la exposición
	 * @param nombre Nombre de la exposición
	 */
	public Exposicion(String serial, String nombre) {
		super(serial, nombre);
		this.descripcion = "Sin descripción";
		this.tema = "General";
	}

	/**
	 * @return Descripción de la exposición
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion Nueva descripción para la exposición
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return Tema principal de la exposición
	 */
	public String getTema() {
		return tema;
	}

	/**
	 * @param tema Nuevo tema para la exposición
	 */
	public void setTema(String tema) {
		this.tema = tema;
	}

	/**
	 * Simula el proceso de inauguración de la exposición mostrando un mensaje en consola.
	 */
	public void inaugurar() {
		System.out.println("La exposición " + getNombre() + " ha sido inaugurada.");
	}

	@Override
	public String toString() {
		return "EXPOSICION: |" + super.toString()
				+ " (descripcion='" + descripcion + "')|"
				+ " (tema='" + tema + "')|";
	}
}

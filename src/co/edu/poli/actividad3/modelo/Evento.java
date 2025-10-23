package co.edu.poli.actividad3.modelo;

/**
 * Representa un evento dentro del sistema como una subclase de {@link Actividad}.
 * Un evento puede corresponder a conferencias, exposiciones, presentaciones,
 * talleres u otros tipos de actividades organizadas por una institución.
 *
 * <p>Incluye información del tipo de evento y permite gestionar su organización.</p>
 * 
 * @author Brayan Niño
 * @version 1.0
 */
public class Evento extends Actividad {

	private String tipoEvento;

	/**
	 * Constructor que inicializa un evento con todos los atributos requeridos.
	 * 
	 * @param serial       Identificador único del evento
	 * @param nombre       Nombre del evento
	 * @param fechainicio  Fecha de inicio del evento
	 * @param fechafin     Fecha de finalización del evento
	 * @param tipoEvento   Tipo de evento (conferencia, exposición, etc.)
	 */
	public Evento(String serial, String nombre, String fechainicio, String fechafin, String tipoEvento) {
		super(serial, nombre, fechainicio, fechafin);
		this.tipoEvento = tipoEvento;
	}

	/**
	 * Constructor alternativo que solo requiere datos mínimos del evento.
	 * El tipo de evento se inicializa como "General".
	 * 
	 * @param serial Identificador único del evento
	 * @param nombre Nombre del evento
	 */
	public Evento(String serial, String nombre) {
		super(serial, nombre);
		this.tipoEvento = "General";
	}

	/**
	 * @return Tipo de evento
	 */
	public String getTipoEvento() {
		return tipoEvento;
	}

	/**
	 * @param tipoEvento Nuevo tipo de evento
	 */
	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	/**
	 * Simula la organización del evento mostrando un mensaje en consola.
	 * Útil para trazabilidad o pruebas del sistema.
	 */
	public void organizarEvento() {
		System.out.println("El evento " + getNombre() + " se está organizando.");
	}

	@Override
	public String toString() {
		return "EVENTO: " + super.toString() + " |(tipoEvento='" + tipoEvento + "')|";
	}
}

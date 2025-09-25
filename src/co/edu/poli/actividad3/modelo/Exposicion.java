package co.edu.poli.actividad3.modelo;

/**
 * Clase que representa una exposición como subclase de Actividad. Contiene
 * descripción, tema, visita y ubicación. Permite inaugurar la exposición.
 * 
 * @author Brayan Niño
 * @version 1.0
 */
public class Exposicion extends Actividad {
	private String descripcion;
	private String tema;
	private Visita visita;
	private Ubicacion ubicacion;

	public Exposicion(String serial, String nombre, String fechainicio, String fechafin, String descripcion,
			String tema) {
		super(serial, nombre, fechainicio, fechafin);
		this.descripcion = descripcion;
		this.tema = tema;
	}

	public Exposicion(String serial, String nombre) {
		super(serial, nombre);
		this.descripcion = "Sin descripcion";
		this.tema = "General";
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	/**
	 * Muestra por consola la inauguración de la exposición.
	 */
	public void inaugurar() {
		System.out.println("La exposicion " + getNombre() + " ha sido inaugurada.");
	}

	@Override
	public String toString() {
		return "EXPOSICION: |" + super.toString() + " (descripcion='" + descripcion + ")|" + " (tema='" + tema + ")|";
	}
}

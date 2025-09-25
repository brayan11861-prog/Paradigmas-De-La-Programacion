package co.edu.poli.actividad3.modelo;

/**
 * Clase que representa la calificación de una obra. Contiene serial, categoría,
 * nombre y descripción de la calificación. Permite evaluar una obra.
 * 
 * @author Brayan Niño
 * @version 1.0
 */
public class Calificacion {
	private String serial;
	private char categoria;
	private String nombre;
	private String descripcion;

	public Calificacion(String serial, char categoria, String nombre, String descripcion) {
		this.serial = serial;
		this.categoria = categoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Calificacion(String serial, char categoria) {
		this(serial, categoria, "Sin nombre", "Sin descripcion");
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public char getCategoria() {
		return categoria;
	}

	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Muestra por consola la calificación de la obra.
	 */
	public void evaluar() {
		System.out.println("La obra " + nombre + " recibio una calificacion categoria " + categoria);
	}

	@Override
	public String toString() {
		return "CALIFICACION: " + "(serial='" + serial + "')|" + " (categoria='" + categoria + "')|" + " (nombre='"
				+ nombre + "')|" + " (descripcion='" + descripcion + "')|";
	}
}

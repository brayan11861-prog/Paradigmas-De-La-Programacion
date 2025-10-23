package co.edu.poli.actividad3.modelo;

/**
 * Representa un autor de obras artísticas dentro del sistema del museo.
 * Contiene información básica del autor como su identificador, nombre y
 * nacionalidad.
 * <p>
 * Esta clase puede ser utilizada para asociar autores a obras registradas.
 * Además, cuenta con una acción simbólica de creación de obras.
 * </p>
 * 
 * @author Brayan Niño
 * @version 1.1
 */
public class Autor {

	/** Identificador único del autor */
	private String idAutor;

	/** Nombre completo del autor */
	private String nombre;

	/** Nacionalidad del autor */
	private String nacionalidad;

	/**
	 * Constructor principal para crear un autor con toda su información.
	 *
	 * @param idAutor      identificador del autor
	 * @param nombre       nombre del autor
	 * @param nacionalidad país de origen del autor
	 */
	public Autor(String idAutor, String nombre, String nacionalidad) {
		this.idAutor = idAutor;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}

	/**
	 * Constructor alternativo que permite crear un autor sin especificar
	 * nacionalidad.
	 *
	 * @param idAutor identificador del autor
	 * @param nombre  nombre del autor
	 */
	public Autor(String idAutor, String nombre) {
		this(idAutor, nombre, "Desconocida");
	}

	/** @return identificador del autor */
	public String getIdAutor() {
		return idAutor;
	}

	/** @param idAutor nuevo identificador del autor */
	public void setIdAutor(String idAutor) {
		this.idAutor = idAutor;
	}

	/** @return nombre del autor */
	public String getNombre() {
		return nombre;
	}

	/** @param nombre nuevo nombre del autor */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/** @return nacionalidad del autor */
	public String getNacionalidad() {
		return nacionalidad;
	}

	/** @param nacionalidad nueva nacionalidad del autor */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	/**
	 * Simula la acción de crear una obra por parte del autor. Únicamente imprime un
	 * mensaje informativo.
	 */
	public void crearObra() {
		System.out.println("_________________________________________________________");
		System.out.println("El autor " + nombre + " está creando una obra.");
	}

	/**
	 * Retorna los valores del autor en formato de texto.
	 *
	 * @return cadena con los datos del autor
	 */
	@Override
	public String toString() {
		return "Autor{" + "idAutor='" + idAutor + '\'' + ", nombre='" + nombre + '\'' + ", nacionalidad='"
				+ nacionalidad + '\'' + '}';
	}
}

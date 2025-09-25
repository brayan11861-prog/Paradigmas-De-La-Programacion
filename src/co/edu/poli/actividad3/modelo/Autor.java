package co.edu.poli.actividad3.modelo;

/**
 * Clase que representa un autor de obras. Permite crear obras y almacenar
 * información del autor. Contiene id, nombre y nacionalidad.
 * 
 * @author Brayan Niño
 * @version 1.0
 */
public class Autor {
	private String idAutor;
	private String nombre;
	private String nacionalidad;

	public Autor(String idAutor, String nombre, String nacionalidad) {
		this.idAutor = idAutor;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}

	public Autor(String idAutor, String nombre) {
		this(idAutor, nombre, "Desconocida");
	}

	public String getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(String idAutor) {
		this.idAutor = idAutor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	/**
	 * Simula la creación de una obra por parte del autor.
	 */
	public void crearObra() {
		System.out.println("_________________________________________________________");
		System.out.println("El autor " + nombre + " esta creando una obra.");
	}

	@Override
	public String toString() {
		return "AUTOR: " + "|(id= " + idAutor + ")|" + " nombre= " + nombre + ")|" + " nacionalidad= " + nacionalidad
				+ ")|";
	}
}

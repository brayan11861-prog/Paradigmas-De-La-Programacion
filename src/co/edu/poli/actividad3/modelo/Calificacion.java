package co.edu.poli.actividad3.modelo;

/**
 * Representa una calificación otorgada a una obra dentro del sistema del museo.
 * Contiene un serial identificador, una categoría en forma de letra, un nombre
 * descriptivo y una explicación de la calificación.
 * <p>
 * Esta clase puede ser asociada a una obra para registrar su evaluación dentro
 * del catálogo del museo.
 * </p>
 * 
 * @author Brayan
 * @version 1.1
 */
public class Calificacion {

	/** Identificador único de la calificación */
	private String serial;

	/** Categoría asignada (por ejemplo: A, B, C, etc.) */
	private char categoria;

	/** Nombre o título dado a la calificación */
	private String nombre;

	/** Detalle explicativo de la evaluación */
	private String descripcion;

	/**
	 * Constructor principal que permite definir todos los datos de la calificación.
	 *
	 * @param serial      identificador de la calificación
	 * @param categoria   categoría asignada (A, B, C, ...)
	 * @param nombre      nombre descriptivo de la calificación
	 * @param descripcion explicación breve de la evaluación
	 */
	public Calificacion(String serial, char categoria, String nombre, String descripcion) {
		this.serial = serial;
		this.categoria = categoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	/**
	 * Constructor alternativo. Crea una calificación con nombre y descripción por
	 * defecto.
	 *
	 * @param serial    identificador de la calificación
	 * @param categoria categoría asignada
	 */
	public Calificacion(String serial, char categoria) {
		this(serial, categoria, "Sin nombre", "Sin descripción");
	}

	/** @return identificador de la calificación */
	public String getSerial() {
		return serial;
	}

	/** @param serial nuevo serial de la calificación */
	public void setSerial(String serial) {
		this.serial = serial;
	}

	/** @return categoría asignada */
	public char getCategoria() {
		return categoria;
	}

	/** @param categoria nueva categoría */
	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}

	/** @return nombre de la calificación */
	public String getNombre() {
		return nombre;
	}

	/** @param nombre nuevo nombre de la calificación */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/** @return descripción detallada */
	public String getDescripcion() {
		return descripcion;
	}

	/** @param descripcion nueva descripción */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Imprime en consola un mensaje de evaluación asociado a la obra.
	 */
	public void evaluar() {
		System.out.println("La obra '" + nombre + "' recibió una calificación categoría " + categoria + ".");
	}

	/**
	 * Retorna los datos principales de la calificación como texto.
	 *
	 * @return representación de la calificación en formato String
	 */
	@Override
	public String toString() {
		return "Calificación{" + "serial='" + serial + '\'' + ", categoria=" + categoria + ", nombre='" + nombre + '\''
				+ ", descripcion='" + descripcion + '\'' + '}';
	}
}

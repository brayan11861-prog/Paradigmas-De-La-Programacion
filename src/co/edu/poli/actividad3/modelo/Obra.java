package co.edu.poli.actividad3.modelo;

/**
 * Representa una obra artística registrada dentro del sistema. Una obra incluye
 * información relevante como su identificador, título, técnica empleada y fecha
 * de creación.
 *
 * <p>
 * Además cuenta con una acción que permite simular su exposición dentro de una
 * galería o museo.
 * </p>
 *
 * @author Brayan Niño
 * @version 1.0
 */
public class Obra {

	private String idObra;
	private String titulo;
	private String tecnica;
	private String fechaCreacion;

	/**
	 * Constructor principal que inicializa todos los atributos de una obra.
	 *
	 * @param idObra        Identificador único de la obra
	 * @param titulo        Título o nombre de la obra
	 * @param tecnica       Técnica artística utilizada en su creación
	 * @param fechaCreacion Año o fecha en que fue creada
	 */
	public Obra(String idObra, String titulo, String tecnica, String fechaCreacion) {
		this.idObra = idObra;
		this.titulo = titulo;
		this.tecnica = tecnica;
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * Constructor alternativo que crea una obra con datos mínimos. Se establecen
	 * valores por defecto para técnica y fecha de creación.
	 *
	 * @param idObra Identificador de la obra
	 * @param titulo Título de la obra
	 */
	public Obra(String idObra, String titulo) {
		this(idObra, titulo, "Desconocida", "Desconocida");
	}

	/** @return Identificador único de la obra */
	public String getIdObra() {
		return idObra;
	}

	/** @param idObra Nuevo identificador de la obra */
	public void setIdObra(String idObra) {
		this.idObra = idObra;
	}

	/** @return Título de la obra */
	public String getTitulo() {
		return titulo;
	}

	/** @param titulo Nuevo título de la obra */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/** @return Técnica empleada en la creación de la obra */
	public String getTecnica() {
		return tecnica;
	}

	/** @param tecnica Nueva técnica de creación */
	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	/** @return Fecha de creación de la obra */
	public String getFechaCreacion() {
		return fechaCreacion;
	}

	/** @param fechaCreacion Nueva fecha de creación */
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * Simula la exposición de la obra mostrando un mensaje en consola.
	 */
	public void exponerObra() {
		System.out.println("La obra " + titulo + " está siendo expuesta.");
	}

	@Override
	public String toString() {
		return "OBRA: |(id='" + idObra + "')| (titulo='" + titulo + "')| (tecnica='" + tecnica + "')| (fechaCreacion='"
				+ fechaCreacion + "')|";
	}
}

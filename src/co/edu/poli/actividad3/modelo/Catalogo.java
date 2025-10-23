package co.edu.poli.actividad3.modelo;

import java.util.ArrayList;

/**
 * Representa un catálogo de obras dentro del sistema del museo.
 * <p>
 * Permite almacenar, organizar y mostrar un conjunto de obras, facilitando la
 * gestión de colecciones artísticas.
 * </p>
 *
 * @author Brayan Niño
 * @version 1.1
 */
public class Catalogo {

	/** Identificador único del catálogo */
	private String idCatalogo;

	/** Lista dinámica que almacena las obras pertenecientes al catálogo */
	private ArrayList<Obra> obras;

	/**
	 * Constructor que permite inicializar un catálogo vacío identificado por un
	 * código.
	 *
	 * @param idCatalogo identificador asignado al catálogo
	 */
	public Catalogo(String idCatalogo) {
		this.idCatalogo = idCatalogo;
		this.obras = new ArrayList<>();
	}

	/** @return identificador del catálogo */
	public String getIdCatalogo() {
		return idCatalogo;
	}

	/** @param idCatalogo nuevo identificador para el catálogo */
	public void setIdCatalogo(String idCatalogo) {
		this.idCatalogo = idCatalogo;
	}

	/** @return lista de obras registradas en el catálogo */
	public ArrayList<Obra> getObras() {
		return obras;
	}

	/**
	 * Agrega una nueva obra al catálogo.
	 *
	 * @param obra objeto de tipo {@link Obra} a agregar
	 */
	public void agregarObra(Obra obra) {
		obras.add(obra);
		System.out.println(" Obra '" + obra.getTitulo() + "' añadida al catálogo " + idCatalogo);
	}

	/**
	 * Muestra en consola los títulos de todas las obras almacenadas en el catálogo.
	 */
	public void mostrarCatalogo() {
		System.out.println(" Catálogo '" + idCatalogo + "' contiene las siguientes obras:");
		for (Obra o : obras) {
			System.out.println(" - " + o.getTitulo());
		}
	}

	/**
	 * Genera una representación resumida del catálogo.
	 *
	 * @return cadena con el identificador del catálogo y número de obras
	 */
	@Override
	public String toString() {
		return "Catalogo{" + "idCatalogo='" + idCatalogo + '\'' + ", cantidadObras=" + obras.size() + '}';
	}
}

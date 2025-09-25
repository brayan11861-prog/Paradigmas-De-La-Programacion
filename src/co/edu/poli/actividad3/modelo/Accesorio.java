package co.edu.poli.actividad3.modelo;

/**
 * Clase que representa un accesorio de una obra. Permite manejar atributos
 * básicos y calcular la cadena de tamaño.
 * 
 * @author Brayan Niño
 * @version 1.0
 */
public class Accesorio {

	private String idAccesorio;
	private String nombre;
	private String material;
	private String fechaFabricacion;

	public Accesorio(String idAccesorio, String nombre, String material, String fechaFabricacion) {
		this.idAccesorio = idAccesorio;
		this.nombre = nombre;
		this.material = material;
		this.fechaFabricacion = fechaFabricacion;
	}

	public Accesorio(String idAccesorio, String nombre, String material) {
		this(idAccesorio, nombre, material, "Desconocida");
	}

	public Accesorio(String idAccesorio, String nombre) {
		this(idAccesorio, nombre, "Desconocido", "Desconocida");
	}

	public String getIdAccesorio() {
		return idAccesorio;
	}

	public void setIdAccesorio(String idAccesorio) {
		this.idAccesorio = idAccesorio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(String fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	/**
	 * Calcula la longitud de la cadena de un accesorio según el tamaño del piñón.
	 * 
	 * @param tamPinion tamaño del piñón
	 * @return longitud de la cadena
	 */
	public double determinarCadena(double tamPinion) {
		return tamPinion * 2.5;
	}

	@Override
	public String toString() {
		return "ACCESORIO: " + "|(id= " + idAccesorio + ")|" + " (nombre= " + nombre + ")|" + " (materia= " + material
				+ ")|" + " (fechaFabricacion= " + fechaFabricacion + ")|";
	}
}

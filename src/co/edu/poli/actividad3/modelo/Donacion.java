package co.edu.poli.actividad3.modelo;

/**
 * Clase que representa una donación realizada a una institución o entidad.
 * Contiene información como serial, fecha, donador, cantidad y tipo de
 * donación. Proporciona métodos para registrar la donación e imprimir su
 * información.
 * 
 * <p>
 * Esta clase puede ser utilizada en sistemas de gestión de donaciones dentro de
 * museos, bibliotecas, instituciones benéficas, entre otros.
 * </p>
 * 
 * @author Brayan Niño
 * @version 1.0
 */
public class Donacion {
	private String serial;
	private String fecha;
	private String donador;
	private String cantidad;
	private String tipoDonacion;

	/**
	 * Constructor que inicializa todos los atributos de la donación.
	 * 
	 * @param serial       Identificador único de la donación
	 * @param fecha        Fecha en que se realizó la donación
	 * @param donador      Nombre de la persona o entidad donante
	 * @param cantidad     Cantidad de la donación (valor o volumen)
	 * @param tipoDonacion Tipo de donación (económica, física, etc.)
	 */
	public Donacion(String serial, String fecha, String donador, String cantidad, String tipoDonacion) {
		this.serial = serial;
		this.fecha = fecha;
		this.donador = donador;
		this.cantidad = cantidad;
		this.tipoDonacion = tipoDonacion;
	}

	/**
	 * Constructor alternativo que inicializa una donación con datos mínimos. Se
	 * asignan valores por defecto al resto de atributos.
	 * 
	 * @param serial  Identificador único de la donación
	 * @param donador Nombre del donante
	 */
	public Donacion(String serial, String donador) {
		this(serial, "Sin fecha", donador, "0", "Desconocido");
	}

	/**
	 * @return Serial de la donación
	 */
	public String getSerial() {
		return serial;
	}

	/**
	 * @param serial Nuevo serial de la donación
	 */
	public void setSerial(String serial) {
		this.serial = serial;
	}

	/**
	 * @return Fecha de la donación
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha Nueva fecha de la donación
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return Nombre del donador
	 */
	public String getDonador() {
		return donador;
	}

	/**
	 * @param donador Nuevo nombre del donador
	 */
	public void setDonador(String donador) {
		this.donador = donador;
	}

	/**
	 * @return Cantidad donada
	 */
	public String getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad Nueva cantidad donada
	 */
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return Tipo de donación
	 */
	public String getTipoDonacion() {
		return tipoDonacion;
	}

	/**
	 * @param tipoDonacion Nuevo tipo de donación
	 */
	public void setTipoDonacion(String tipoDonacion) {
		this.tipoDonacion = tipoDonacion;
	}

	/**
	 * Registra la información básica de la donación mostrando un mensaje por
	 * consola. Útil para hacer seguimiento rápido de la acción realizada.
	 */
	public void registrarDonacion() {
		System.out.println("Donación de " + cantidad + " realizada por " + donador);
	}

	@Override
	public String toString() {
		return "DONACION: |" + "(serial='" + serial + "')|" + " (fecha='" + fecha + "')|" + " (donador='" + donador
				+ "')|" + " (cantidad='" + cantidad + "')|" + " (tipoDonacion='" + tipoDonacion + "')|";
	}
}

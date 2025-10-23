package co.edu.poli.actividad3.modelo;

/**
 * Representa a un director encargado de supervisar una obra dentro del museo.
 * <p>
 * Contiene datos acerca de la autenticidad, valor y posibilidad de manipulación
 * de la obra, además de mantener una referencia a la obra supervisada.
 * </p>
 *
 * @author Brayan Niño
 * @version 1.1
 */
public class Director {

	/** Identificador único del director */
	private String serial;

	/** Indica si la obra es considerada histórica */
	private boolean esHistorico;

	/** Indica si la obra es original */
	private boolean esOriginal;

	/** Valor económico o referencial de la obra */
	private String valor;

	/** Indica si es posible manipular físicamente la obra */
	private String esManipulable;

	/** Obra bajo supervisión del director */
	private Obra obra;

	/**
	 * Constructor principal que inicializa todos los atributos del director.
	 *
	 * @param serial        identificador del director
	 * @param esHistorico   indica si la obra es histórica
	 * @param esOriginal    indica si la obra es original
	 * @param valor         valor asignado a la obra
	 * @param esManipulable indica si la obra puede ser manipulada
	 * @param obra          obra que será supervisada
	 */
	public Director(String serial, boolean esHistorico, boolean esOriginal, String valor, String esManipulable,
			Obra obra) {
		this.serial = serial;
		this.esHistorico = esHistorico;
		this.esOriginal = esOriginal;
		this.valor = valor;
		this.esManipulable = esManipulable;
		this.obra = obra;
	}

	/**
	 * Constructor alternativo que genera un director sin datos de obra.
	 *
	 * @param serial identificador del director
	 */
	public Director(String serial) {
		this(serial, false, false, "0", "No", null);
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public boolean isEsHistorico() {
		return esHistorico;
	}

	public void setEsHistorico(boolean esHistorico) {
		this.esHistorico = esHistorico;
	}

	public boolean isEsOriginal() {
		return esOriginal;
	}

	public void setEsOriginal(boolean esOriginal) {
		this.esOriginal = esOriginal;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getEsManipulable() {
		return esManipulable;
	}

	public void setEsManipulable(String esManipulable) {
		this.esManipulable = esManipulable;
	}

	public Obra getObra() {
		return obra;
	}

	public void setObra(Obra obra) {
		this.obra = obra;
	}

	/**
	 * Muestra por consola la acción de supervisar una obra asociada.
	 */
	public void supervisar() {
		if (obra != null) {
			System.out.println(" El director supervisa la obra: " + obra.getTitulo());
		} else {
			System.out.println(" El director no tiene obra asignada.");
		}
	}

	/**
	 * Genera una representación del director con detalles relevantes.
	 *
	 * @return información del director en formato String
	 */
	@Override
	public String toString() {
		return "Director{" + "serial='" + serial + '\'' + ", esHistorico=" + esHistorico + ", esOriginal=" + esOriginal
				+ ", valor='" + valor + '\'' + ", esManipulable='" + esManipulable + '\'' + ", obra="
				+ (obra != null ? obra.getTitulo() : "Ninguna") + '}';
	}
}

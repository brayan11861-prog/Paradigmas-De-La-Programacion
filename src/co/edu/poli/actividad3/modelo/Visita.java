package co.edu.poli.actividad3.modelo;

/**
 * Clase que representa una visita como subclase de Actividad.
 */
public class Visita extends Actividad {
	private String genero;
	private String fechaVisita;
	private Ubicacion ubicacion; // 🔄 agregado

	public Visita(String serial, String nombre, String fechainicio, String fechafin, String genero,
			String fechaVisita) {
		super(serial, nombre, fechainicio, fechafin);
		this.genero = genero;
		this.fechaVisita = fechaVisita;
	}

	public Visita(String serial, String nombre) {
		super(serial, nombre);
		this.genero = "No especificado";
		this.fechaVisita = "Sin fecha";
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getFechaVisita() {
		return fechaVisita;
	}

	public void setFechaVisita(String fechaVisita) {
		this.fechaVisita = fechaVisita;
	}

	public void registrarVisita() {
		System.out.println("La " + getNombre() + " se registro el " + fechaVisita);
	}

	@Override
	public String toString() {
		return "VISITA: |" + super.toString() + " (género='" + genero + "')|" + " (fechaVisita='" + fechaVisita + "')|";
	}
}

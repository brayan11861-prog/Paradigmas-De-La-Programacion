package co.edu.poli.actividad3.modelo;

public class Evento extends Actividad {
	private String tipoEvento;

	public Evento(String serial, String nombre, String fechainicio, String fechafin, String tipoEvento) {
		super(serial, nombre, fechainicio, fechafin);
		this.tipoEvento = tipoEvento;
	}

	public Evento(String serial, String nombre) {
		super(serial, nombre);
		this.tipoEvento = "General";
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public void organizarEvento() {
		System.out.println("El evento " + getNombre() + " se esta organizando.");
	}

	@Override
	public String toString() {
		return "EVENTO: " + super.toString() + " |(tipoEvento='" + tipoEvento + ")|" + '}';
	}
}
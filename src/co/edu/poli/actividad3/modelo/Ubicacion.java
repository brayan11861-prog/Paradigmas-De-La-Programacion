package co.edu.poli.actividad3.modelo;

/**
 * Clase que representa la ubicación de una actividad.
 */
public class Ubicacion {
	private String direccion;
	private String sala;
	private String ciudad;

	public Ubicacion(String direccion, String sala, String ciudad) {
		this.direccion = direccion;
		this.sala = sala;
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "UBICACION: (direccion='" + direccion + "', sala='" + sala + "', ciudad='" + ciudad + "')";
	}
}
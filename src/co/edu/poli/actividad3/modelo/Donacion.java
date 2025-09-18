package co.edu.poli.actividad3.modelo;

public class Donacion {
	private String serial;
	private String fecha;
	private String donador;
	private String cantidad;
	private String tipoDonacion;

	public Donacion(String serial, String fecha, String donador, String cantidad, String tipoDonacion) {
		this.serial = serial;
		this.fecha = fecha;
		this.donador = donador;
		this.cantidad = cantidad;
		this.tipoDonacion = tipoDonacion;
	}

	public Donacion(String serial, String donador) {
		this(serial, "Sin fecha", donador, "0", "Desconocido");
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDonador() {
		return donador;
	}

	public void setDonador(String donador) {
		this.donador = donador;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getTipoDonacion() {
		return tipoDonacion;
	}

	public void setTipoDonacion(String tipoDonacion) {
		this.tipoDonacion = tipoDonacion;
	}

	public void registrarDonacion() {
		System.out.println("Donacion de " + cantidad + " realizada por " + donador);
	}

	@Override
	public String toString() {
		return "DONACION: |" + "(serial='" + serial + "')|" + " (fecha='" + fecha + "')|" + " (donador='" + donador
				+ "')|" + " (cantidad='" + cantidad + "')|" + " (tipoDonacion='" + tipoDonacion + "')|";
	}
}
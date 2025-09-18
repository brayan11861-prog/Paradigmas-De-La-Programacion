package co.edu.poli.actividad3.modelo;
public class Actividad {
	private String serial;
	private String nombre;
	private String fechainicio;
	private String fechafin;

	// Constructor completo
	public Actividad(String serial, String nombre, String fechainicio, String fechafin) {
	this.serial = serial;
	this.nombre = nombre;
	this.fechainicio = fechainicio;
	this.fechafin = fechafin;
	}

	// Constructor sobrecargado
	public Actividad(String serial, String nombre) {
	this(serial, nombre, "Sin inicio", "Sin fin");
	}

	// Getters y setters
	public String getSerial() { return serial; }
	public void setSerial(String serial) { this.serial = serial; }

	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	public String getFechainicio() { return fechainicio; }
	public void setFechainicio(String fechainicio) { this.fechainicio = fechainicio; }

	public String getFechafin() { return fechafin; }
	public void setFechafin(String fechafin) { this.fechafin = fechafin; }

	@Override
	public String toString() {
	return "ACTIVIDAD: " +
	"(serial='" + serial + ")|" +
	"(nombre='" + nombre + ")|" +
	"(fechainicio='" + fechainicio + ")|" +
	"(fechafin='" + fechafin + ")|" ;
	}
	}
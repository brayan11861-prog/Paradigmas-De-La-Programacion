package co.edu.poli.actividad3.modelo;

public class Obra {
	private String idObra;
	private String titulo;
	private String tecnica;
	private String fechaCreacion;

	public Obra(String idObra, String titulo, String tecnica, String fechaCreacion) {
		this.idObra = idObra;
		this.titulo = titulo;
		this.tecnica = tecnica;
		this.fechaCreacion = fechaCreacion;
	}

	public Obra(String idObra, String titulo) {
		this(idObra, titulo, "Desconocida", "Desconocida");
	}

	public String getIdObra() {
		return idObra;
	}

	public void setIdObra(String idObra) {
		this.idObra = idObra;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public void exponerObra() {

		System.out.println("La obra " + titulo + " esta siendo expuesta.");
	}

	@Override
	public String toString() {
		return "OBRA: " + "|(Seria=" + idObra + ')' + ", (titulo='" + titulo + ")|" + ", tecnica='" + tecnica + ")|"
				+ ", fechaCreacion='" + fechaCreacion + ")|";
	}

}
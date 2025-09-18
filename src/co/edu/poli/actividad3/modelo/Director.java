package co.edu.poli.actividad3.modelo;

import co.edu.poli.actividad3.modelo.Obra;

public class Director {
	private String serial;
	private boolean esHistorico;
	private boolean esOriginal;
	private String valor;
	private String esManipulabre;
	private Obra obra; // relaciÃ³n con Obra
	private Director director; // relaciÃ³n recursiva (un director puede estar asociado a otro)

// Constructor completo
	public Director(String serial, boolean esHistorico, boolean esOriginal, String valor, String esManipulabre,
			Obra obra) {
		this.serial = serial;
		this.esHistorico = esHistorico;
		this.esOriginal = esOriginal;
		this.valor = valor;
		this.esManipulabre = esManipulabre;
		this.obra = obra;
		this.director = null;
	}

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

	public String getEsManipulabre() {
		return esManipulabre;
	}

	public void setEsManipulabre(String esManipulabre) {
		this.esManipulabre = esManipulabre;
	}

	public Obra getObra() {
		return obra;
	}

	public void setObra(Obra obra) {
		this.obra = obra;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public void supervisar() {
		if (obra != null) {
			System.out.println("El director supervisa la obra: " + obra.getTitulo());
		} else {
			System.out.println("El director no tiene obra asignada.");
		}
	}

	@Override
	public String toString() {
		return "DIRECTOR: |" + "(serial='" + serial + "')|" + " (esHistorico=" + esHistorico + ")|" + " (esOriginal="
				+ esOriginal + ")|" + " (valor='" + valor + "')|" + " (esManipulabre='" + esManipulabre + "')|"
				+ " (obra=" + (obra != null ? obra.getTitulo() : "Ninguna") + ")|";
	}
}
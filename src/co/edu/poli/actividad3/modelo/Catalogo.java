package co.edu.poli.actividad3.modelo;

import java.util.ArrayList;

public class Catalogo {
	private String idCatalogo;
	private ArrayList<Obra> obras;

	public Catalogo(String idCatalogo) {
		this.idCatalogo = idCatalogo;
		this.obras = new ArrayList<>();
	}

	public String getIdCatalogo() {
		return idCatalogo;
	}

	public void setIdCatalogo(String idCatalogo) {
		this.idCatalogo = idCatalogo;
	}

	public ArrayList<Obra> getObras() {
		return obras;
	}

	public void agregarObra(Obra obra) {
		obras.add(obra);
		System.out.println("Obra '" + obra.getTitulo() + "' añadida al catálogo " + idCatalogo);
	}

	public void mostrarCatalogo() {
		System.out.println("Catálogo " + idCatalogo + " contiene las siguientes obras:");
		for (Obra o : obras) {
			System.out.println(" - " + o.getTitulo());
		}
	}

	@Override
	public String toString() {
		return "CATALOGO: (id=" + idCatalogo + ")| cantidadObras=" + obras.size();
	}
}

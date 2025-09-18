package co.edu.poli.actividad3.vista;

import co.edu.poli.actividad3.modelo.*;

public class Cliente {
	public static void main(String[] args) {

		Accesorio a1 = new Accesorio("ACC001", "Marco", "Madera", "2022-01-01");
		Autor au1 = new Autor("AUT001", "Wilson Eduardo", "Colombiano");
		Obra o1 = new Obra("OBR001", "La Gioconda ");

		Evento e1 = new Evento("EV001", "Subasta de Arte", "2025-09-15", "2025-09-16", "Subasta");
		Exposicion ex1 = new Exposicion("EX001", "Arte Moderno", "2025-09-01", "2025-09-30", "Internacional", "Arte");

		Visita v1 = new Visita("V001", "Visita Escolar", "2025-09-11", "2025-09-11", "Mixto", "2025-09-11");
		Calificacion c1 = new Calificacion("C001", 'A', "Guernica", "Obra reconocida mundialmente");
		Donacion d1 = new Donacion("D001", "2025-09-10", "Fundacion paradigmas", "50 pesos colombianos", "Economica");
		Director dir1 = new Director("DIR001", true, true, "1M USD", "Sí", o1);

		Catalogo cat1 = new Catalogo("CAT001");
		cat1.agregarObra(o1);

// --- IMPRESIONES ---
		System.out.println(a1);
		System.out.println(au1);
		System.out.println(o1);
		System.out.println(e1);
		System.out.println(ex1);
		System.out.println(v1);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(dir1);
		System.out.println(cat1);

// --- MÉTODOS ADICIONALES ---
		au1.crearObra();
		o1.exponerObra();
		e1.organizarEvento();
		ex1.inaugurar();
		v1.registrarVisita();
		c1.evaluar();
		d1.registrarDonacion();
		dir1.supervisar();
		cat1.mostrarCatalogo();

		System.out.println("Determinando cadena: " + a1.determinarCadena(10.5));
	}
}
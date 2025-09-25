package co.edu.poli.actividad3.vista;

import co.edu.poli.actividad3.modelo.*;

/**
 * Clase principal que instancia y prueba objetos del sistema.
 * Muestra creación, polimorfismo y operaciones de cada objeto.
 * Autor: Brayan Niño
 * Version: 1.0
 */
public final class Cliente {
    public static void main(String[] args) {
        System.out.println("__________________________________________________________________________________________________");
        System.out.println("------ [ REGISTRO DE OBJETOS CREADOS ] ------");

        final Accesorio a1 = new Accesorio("ACC001", "Marco", "Madera", "2022-01-01");
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

        au1.crearObra();
        o1.exponerObra();
        e1.organizarEvento();
        ex1.inaugurar();
        v1.registrarVisita();
        c1.evaluar();
        d1.registrarDonacion();
        dir1.supervisar();
        cat1.mostrarCatalogo();

        System.out.println("__________________________________________________________________________________________________");
        System.out.println("------ [ DETERMINANDO CADENA ] ------");
        System.out.println(a1.determinarCadena(10.5));

        System.out.println("__________________________________________________________________________________________________");
        System.out.println("---- [] POLIMORFISMO CON ACTIVIDAD[] ----");
        Actividad poli = crearActividadEjemplo("exposicion");
        procesarActividad(poli);

        Actividad[] actividades = new Actividad[5];
        actividades[0] = e1;
        actividades[1] = ex1;
        actividades[2] = v1;
        for (Actividad actividad : actividades) {
            System.out.println(actividad);
        }
        System.out.println("__________________________________________________________________________________________________");
    }

    public static final void procesarActividad(Actividad actividad) {
        System.out.println("Procesando actividad...");
        System.out.println(actividad); 

        if (actividad instanceof Evento) {
            ((Evento) actividad).organizarEvento();
        } else if (actividad instanceof Exposicion) {
            ((Exposicion) actividad).inaugurar();
        } else if (actividad instanceof Visita) {
            ((Visita) actividad).registrarVisita();
        }
    }

    public static Actividad crearActividadEjemplo(String tipo) {
        switch (tipo.toLowerCase()) {
            case "evento":
                return new Evento("EV999", "Evento Polimórfico", "2025-10-01", "2025-10-02", "Tecnología");
            case "exposicion":
                return new Exposicion("EX999", "Expo Polimórfica", "2025-10-05", "2025-10-10", "Descripción", "Arte Digital");
            case "visita":
                return new Visita("V999", "Visita Polimórfica", "2025-10-11", "2025-10-11", "Femenino", "2025-10-11");
            default:
                return new Actividad("ACT999", "Actividad Base", "2025-01-01", "2025-01-02"); 
        }
    }
}

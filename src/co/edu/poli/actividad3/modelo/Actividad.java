package co.edu.poli.actividad3.modelo;

import java.io.Serializable;

/**
 * Clase abstracta que representa una actividad genérica dentro del museo.
 * Sirve como entidad base para tipos de actividades como {@link Evento},
 * {@link Exposicion} y {@link Visita}.
 * <p>
 * Cada actividad posee un identificador (serial), un nombre y un rango
 * de fechas correspondiente a su inicio y fin.
 * </p>
 *
 * Implementa {@link Serializable} para permitir la persistencia de objetos.
 * 
 * @author Brayan Niño
 * @version 1.1
 */
public abstract class Actividad implements Serializable {

    /** Identificador único de la actividad */
    private String serial;

    /** Nombre de la actividad */
    private String nombre;

    /** Fecha de inicio de la actividad */
    private String fechainicio;

    /** Fecha de finalización de la actividad */
    private String fechafin;

    /**
     * Constructor principal para la creación de una actividad con todos sus datos.
     *
     * @param serial identificador único de la actividad
     * @param nombre nombre de la actividad
     * @param fechainicio fecha de inicio
     * @param fechafin fecha de finalización
     */
    public Actividad(String serial, String nombre, String fechainicio, String fechafin) {
        this.serial = serial;
        this.nombre = nombre;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
    }

    /**
     * Constructor alterno que permite crear una actividad sin fechas definidas.
     *
     * @param serial identificador único de la actividad
     * @param nombre nombre de la actividad
     */
    public Actividad(String serial, String nombre) {
        this(serial, nombre, "Sin inicio", "Sin fin");
    }

    /** @return identificador de la actividad */
    public String getSerial() { return serial; }

    /** @param serial nuevo identificador de la actividad */
    public void setSerial(String serial) { this.serial = serial; }

    /** @return nombre de la actividad */
    public String getNombre() { return nombre; }

    /** @param nombre nuevo nombre de la actividad */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /** @return fecha de inicio de la actividad */
    public String getFechainicio() { return fechainicio; }

    /** @param fechainicio nueva fecha de inicio */
    public void setFechainicio(String fechainicio) { this.fechainicio = fechainicio; }

    /** @return fecha de finalización de la actividad */
    public String getFechafin() { return fechafin; }

    /** @param fechafin nueva fecha de finalización */
    public void setFechafin(String fechafin) { this.fechafin = fechafin; }

    /**
     * Retorna una representación en texto de la actividad.
     *
     * @return cadena con la información de la actividad
     */
    @Override
    public String toString() {
        return "Actividad{" +
                "serial='" + serial + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechainicio='" + fechainicio + '\'' +
                ", fechafin='" + fechafin + '\'' +
                '}';
    }
}

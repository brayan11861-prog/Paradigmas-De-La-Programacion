package co.edu.poli.actividad3.modelo;

import java.io.Serializable;

/**
 * Representa un accesorio disponible dentro del sistema del museo.
 * Cada accesorio tiene un identificador único, nombre, precio,
 * cantidad en inventario y un estado que indica si está disponible.
 * 
 * Implementa {@link Serializable} para permitir la persistencia de objetos.
 * 
 * @author (Tu nombre)
 * @version 1.0
 */
public class Accesorio implements Serializable {

    /** Identificador único del accesorio */
    private int id;

    /** Nombre del accesorio */
    private String nombre;

    /** Precio unitario del accesorio */
    private double precio;

    /** Cantidad disponible del accesorio */
    private int cantidad;

    /** Estado del accesorio, true si está activo o disponible */
    private boolean estado;

    /**
     * Constructor que permite crear un accesorio con todos sus datos.
     *
     * @param id identificador del accesorio
     * @param nombre nombre del accesorio
     * @param precio precio del accesorio
     * @param cantidad cantidad disponible
     * @param estado estado del accesorio (activo/inactivo)
     */
    public Accesorio(int id, String nombre, double precio, int cantidad, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    /** @return identificador del accesorio */
    public int getId() { return id; }

    /** @param id nuevo identificador del accesorio */
    public void setId(int id) { this.id = id; }

    /** @return nombre del accesorio */
    public String getNombre() { return nombre; }

    /** @param nombre nuevo nombre del accesorio */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /** @return precio del accesorio */
    public double getPrecio() { return precio; }

    /** @param precio nuevo precio del accesorio */
    public void setPrecio(double precio) { this.precio = precio; }

    /** @return cantidad disponible del accesorio */
    public int getCantidad() { return cantidad; }

    /** @param cantidad nueva cantidad disponible */
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    /** @return estado del accesorio */
    public boolean isEstado() { return estado; }

    /** @param estado nuevo estado del accesorio (activo/inactivo) */
    public void setEstado(boolean estado) { this.estado = estado; }

    /**
     * Devuelve una representación en texto del accesorio y sus datos relevantes.
     *
     * @return cadena con los datos del accesorio
     */
    @Override
    public String toString() {
        return "Accesorio{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", estado=" + estado +
                '}';
    }
}

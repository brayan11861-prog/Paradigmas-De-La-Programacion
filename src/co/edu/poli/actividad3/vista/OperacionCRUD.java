package co.edu.poli.actividad3.servicios;

import co.edu.poli.actividad3.modelo.Actividad;

/**
 * Interfaz que define las operaciones CRUD para la clase Actividad.
 */
public interface OperacionCRUD {
    
    boolean create(Actividad actividad);

    Actividad read(String serial);

    boolean update(String serial, Actividad nuevaActividad);

    boolean delete(String serial);

    void listar();
}

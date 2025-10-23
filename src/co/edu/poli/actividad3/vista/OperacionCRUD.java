package co.edu.poli.actividad3.servicios;

import co.edu.poli.actividad3.modelo.Actividad;

public interface OperacionCRUD {
    boolean create(Actividad a);
    Actividad read(int id);
    boolean update(int id, Actividad nueva);
    boolean delete(int id);
    void listar();
}

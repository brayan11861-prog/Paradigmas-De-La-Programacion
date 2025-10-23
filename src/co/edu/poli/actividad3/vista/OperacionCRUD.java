package co.edu.poli.actividad3.visita;

import co.edu.poli.actividad3.modelo.Actividad;

public interface OperacionCRUD {

    boolean create(Actividad a);

    Actividad read(String serial);

    boolean update(String serial, Actividad nueva);

    boolean delete(String serial);

    void listar();
}

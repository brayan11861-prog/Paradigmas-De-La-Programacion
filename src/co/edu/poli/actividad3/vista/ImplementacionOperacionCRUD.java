package co.edu.poli.actividad3.servicios;

import co.edu.poli.actividad3.modelo.Actividad;

/**
 * Implementación de la interfaz OperacionCRUD que usa un arreglo dinámico
 * para gestionar las actividades.
 */
public class ImplementacionOperacionCRUD implements OperacionCRUD {

    private Actividad[] actividades;
    private int size;

    public ImplementacionOperacionCRUD() {
        this.actividades = new Actividad[5]; // tamaño inicial
        this.size = 0;
    }

    @Override
    public boolean create(Actividad actividad) {
        if (size == actividades.length) {
            // ampliar el arreglo si está lleno
            Actividad[] nuevo = new Actividad[actividades.length * 2];
            System.arraycopy(actividades, 0, nuevo, 0, actividades.length);
            actividades = nuevo;
        }
        actividades[size++] = actividad;
        return true;
    }

    @Override
    public Actividad read(String serial) {
        for (int i = 0; i < size; i++) {
            if (actividades[i].getSerial().equals(serial)) {
                return actividades[i];
            }
        }
        return null;
    }

    @Override
    public boolean update(String serial, Actividad nuevaActividad) {
        for (int i = 0; i < size; i++) {
            if (actividades[i].getSerial().equals(serial)) {
                actividades[i] = nuevaActividad;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(String serial) {
        for (int i = 0; i < size; i++) {
            if (actividades[i].getSerial().equals(serial)) {
                actividades[i] = actividades[size - 1]; // mover última
                actividades[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void listar() {
        for (int i = 0; i < size; i++) {
            System.out.println(actividades[i]);
        }
    }
}

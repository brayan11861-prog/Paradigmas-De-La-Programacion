package co.edu.poli.actividad3.servicios;

import co.edu.poli.actividad3.modelo.Actividad; // o la superclase que tengas
import java.util.Arrays;

/**
 * Implementación genérica de operaciones CRUD usando un arreglo estático de tipo superclase
 * 
 * @param <T> Tipo de objeto que extiende de la superclase
 */
public class ImplementacionOperacionCRUD<T> implements OperacionCRUD<T> {

    private static final int INCREMENTO = 5;
    private T[] arreglo;
    private int size; // cantidad de elementos (no la capacidad)

    /**
     * Constructor que inicializa el arreglo con tamaño inicial
     */
    @SuppressWarnings("unchecked")
    public ImplementacionOperacionCRUD() {
        // Crear arreglo de tamaño inicial (INCREMENTO)
        arreglo = (T[]) new Object[INCREMENTO];
        size = 0;
    }

    /**
     * Inserta un objeto en el primer espacio null del arreglo. Si está lleno,
     * aumenta el tamaño del arreglo.
     */
    @Override
    public void create(T objeto) {
        // Buscar primer null
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                arreglo[i] = objeto;
                size++;
                return;
            }
        }
        // Si no hay espacio, expandir arreglo y agregar al final
        expandirArreglo();
        arreglo[size++] = objeto;
    }

    /**
     * Busca un objeto por ID usando reflexión
     */
    @Override
    public T read(String id) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null) {
                try {
                    String objId = arreglo[i].getClass().getMethod("getId").invoke(arreglo[i]).toString();
                    if (objId.equals(id)) {
                        return arreglo[i];
                    }
                } catch (Exception e) {
                    // Ignorar error de reflexión
                }
            }
        }
        return null;
    }

    /**
     * Actualiza un objeto por ID usando reflexión
     */
    @Override
    public boolean update(String id, T objeto) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null) {
                try {
                    String objId = arreglo[i].getClass().getMethod("getId").invoke(arreglo[i]).toString();
                    if (objId.equals(id)) {
                        arreglo[i] = objeto;
                        return true;
                    }
                } catch (Exception e) {
                    // Ignorar error
                }
            }
        }
        return false;
    }

    /**
     * Elimina un objeto por ID, dejando espacio null para futuras inserciones
     */
    @Override
    public boolean delete(String id) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null) {
                try {
                    String objId = arreglo[i].getClass().getMethod("getId").invoke(arreglo[i]).toString();
                    if (objId.equals(id)) {
                        arreglo[i] = null;
                        size--;
                        return true;
                    }
                } catch (Exception e) {
                    // Ignorar error
                }
            }
        }
        return false;
    }

    /**
     * Retorna un arreglo filtrado con los objetos actuales (sin los null)
     */
    @Override
    public T[] list() {
        @SuppressWarnings("unchecked")
        T[] resultado = (T[]) new Object[size];
        int idx = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null) {
                resultado[idx++] = arreglo[i];
            }
        }
        return resultado;
    }

    /**
     * Aumenta la capacidad del arreglo en INCREMENTO
     */
    @SuppressWarnings("unchecked")
    private void expandirArreglo() {
        arreglo = Arrays.copyOf(arreglo, arreglo.length + INCREMENTO);
    }
}

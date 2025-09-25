package co.edu.poli.actividad3.servicios;

import java.util.List;

/**
 * Interfaz que define operaciones CRUD genéricas.
 * 
 * @param <T> Tipo de objeto a gestionar
 * @author Brayan Niño
 * @version 1.0
 */
public interface OperacionCRUD<T> {

	/**
	 * Inserta un objeto en el primer espacio disponible del arreglo.
	 * 
	 * @param objeto Objeto a insertar
	 */
	void create(T objeto);

	/**
	 * Busca un objeto por su ID.
	 * 
	 * @param id Identificador del objeto
	 * @return Objeto encontrado, o null si no existe
	 */
	T read(String id);

	/**
	 * Actualiza un objeto existente por su ID.
	 * 
	 * @param id     Identificador del objeto
	 * @param objeto Nuevo objeto a reemplazar
	 * @return true si se actualizó correctamente, false si no se encontró
	 */
	boolean update(String id, T objeto);

	/**
	 * Elimina un objeto por su ID.
	 * 
	 * @param id Identificador del objeto
	 * @return true si se eliminó correctamente, false si no se encontró
	 */
	boolean delete(String id);

	/**
	 * Lista todos los objetos actuales.
	 * 
	 * @return Lista de objetos
	 */
	List<T> list();
}


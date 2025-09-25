package co.edu.poli.actividad3.servicios;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación genérica de operaciones CRUD usando arreglos dinámicos.
 * 
 * @param <T> Tipo de objeto a gestionar
 * @author Brayan Niño
 * @version 1.0
 */
public class ImplementacionOperacionCRUD<T> implements OperacionCRUD<T> {

	private List<T> lista;

	/**
	 * Constructor que inicializa la lista interna.
	 */
	public ImplementacionOperacionCRUD() {
		lista = new ArrayList<>();
	}

	/**
	 * Inserta un objeto en la lista.
	 */
	@Override
	public void create(T objeto) {
		lista.add(objeto);
	}

	/**
	 * Busca un objeto por ID usando reflexión.
	 */
	@Override
	public T read(String id) {
		try {
			for (T obj : lista) {
				String objId = obj.getClass().getMethod("getIdAccesorio").invoke(obj).toString();
				if (objId.equals(id))
					return obj;
			}
		} catch (Exception e) {
			/* Ignorar errores de reflexión */ }
		return null;
	}

	/**
	 * Actualiza un objeto por ID usando reflexión.
	 */
	@Override
	public boolean update(String id, T objeto) {
		try {
			for (int i = 0; i < lista.size(); i++) {
				T obj = lista.get(i);
				String objId = obj.getClass().getMethod("getIdAccesorio").invoke(obj).toString();
				if (objId.equals(id)) {
					lista.set(i, objeto);
					return true;
				}
			}
		} catch (Exception e) {
			/* Ignorar errores */ }
		return false;
	}

	/**
	 * Elimina un objeto por ID usando reflexión.
	 */
	@Override
	public boolean delete(String id) {
		try {
			for (int i = 0; i < lista.size(); i++) {
				T obj = lista.get(i);
				String objId = obj.getClass().getMethod("getIdAccesorio").invoke(obj).toString();
				if (objId.equals(id)) {
					lista.remove(i);
					return true;
				}
			}
		} catch (Exception e) {
			/* Ignorar errores */ }
		return false;
	}

	/**
	 * Retorna todos los objetos almacenados.
	 */
	@Override
	public List<T> list() {
		return lista;
	}
}


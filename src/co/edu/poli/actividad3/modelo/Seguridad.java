package co.edu.poli.actividad3.modelo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase encargada de gestionar la seguridad del sistema,
 * incluyendo usuarios, roles y permisos asociados.
 *
 * <p>Permite realizar acciones como el registro y autenticación
 * de usuarios, asignación de roles, administración de permisos
 * y control de la sesión activa.</p>
 *
 * @author Brayan Niño
 * @version 1.0
 */
public class Seguridad {

	private HashMap<String, String> usuarios;
	private HashMap<String, String> roles;
	private String usuarioActual;
	private HashMap<String, ArrayList<String>> permisosPorRol;

	/**
	 * Constructor que inicializa las estructuras de seguridad del sistema.
	 * Se inicia sin usuarios registrados ni sesión activa.
	 */
	public Seguridad() {
		usuarios = new HashMap<>();
		roles = new HashMap<>();
		permisosPorRol = new HashMap<>();
		usuarioActual = null;
	}

	/**
	 * Registra un nuevo usuario con una contraseña y rol asociado.
	 *
	 * @param username Nombre de usuario
	 * @param password Contraseña del usuario
	 * @param rol      Rol que determina los permisos del usuario
	 */
	public void registrarUsuario(String username, String password, String rol) {
		usuarios.put(username, password);
		roles.put(username, rol);
	}

	/**
	 * Verifica si un usuario existe y su contraseña es correcta,
	 * permitiendo iniciar sesión.
	 *
	 * @param username Nombre de usuario
	 * @param password Contraseña ingresada
	 * @return true si la autenticación es correcta, false si falla
	 */
	public boolean autenticar(String username, String password) {
		if (usuarios.containsKey(username) && usuarios.get(username).equals(password)) {
			usuarioActual = username;
			return true;
		}
		return false;
	}

	/**
	 * Cierra la sesión del usuario actualmente autenticado.
	 */
	public void cerrarSesion() {
		usuarioActual = null;
	}

	/**
	 * @return Nombre del usuario actualmente autenticado, o null si no hay sesión activa
	 */
	public String getUsuarioActual() {
		return usuarioActual;
	}

	/**
	 * Asigna un nuevo rol a un usuario existente.
	 *
	 * @param username Nombre del usuario
	 * @param rol      Nuevo rol asignado
	 */
	public void asignarRol(String username, String rol) {
		if (usuarios.containsKey(username)) {
			roles.put(username, rol);
		}
	}

	/**
	 * Verifica si un usuario tiene permiso para realizar una acción específica.
	 *
	 * @param username Nombre del usuario
	 * @param permiso  Permiso a validar
	 * @return true si el rol contiene dicho permiso, false de lo contrario
	 */
	public boolean tienePermiso(String username, String permiso) {
		String rol = roles.get(username);
		if (rol != null && permisosPorRol.containsKey(rol)) {
			return permisosPorRol.get(rol).contains(permiso);
		}
		return false;
	}

	/**
	 * Agrega un permiso a un rol determinado.
	 *
	 * @param rol     Rol al que se le asociará el permiso
	 * @param permiso Nombre del permiso que se asignará
	 */
	public void agregarPermisoARol(String rol, String permiso) {
		permisosPorRol.putIfAbsent(rol, new ArrayList<>());
		permisosPorRol.get(rol).add(permiso);
	}

	@Override
	public String toString() {
		return "SEGURIDAD: | Usuario actual = '" + usuarioActual + "' |";
	}
}

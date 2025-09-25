package co.edu.poli.actividad3.vista;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase para gestionar usuarios, roles y permisos.
 */
public class Seguridad {
	private HashMap<String, String> usuarios;
	private HashMap<String, String> roles;
	private String usuarioActual;
	private HashMap<String, ArrayList<String>> permisosPorRol;

	public Seguridad() {
		usuarios = new HashMap<>();
		roles = new HashMap<>();
		permisosPorRol = new HashMap<>();
		usuarioActual = null;
	}

	public void registrarUsuario(String username, String password, String rol) {
		usuarios.put(username, password);
		roles.put(username, rol);
	}

	public boolean autenticar(String username, String password) {
		if (usuarios.containsKey(username) && usuarios.get(username).equals(password)) {
			usuarioActual = username;
			return true;
		}
		return false;
	}

	public void cerrarSesion() {
		usuarioActual = null;
	}

	public String getUsuarioActual() {
		return usuarioActual;
	}

	public void asignarRol(String username, String rol) {
		if (usuarios.containsKey(username)) {
			roles.put(username, rol);
		}
	}

	public boolean tienePermiso(String username, String permiso) {
		String rol = roles.get(username);
		if (rol != null && permisosPorRol.containsKey(rol)) {
			return permisosPorRol.get(rol).contains(permiso);
		}
		return false;
	}

	public void agregarPermisoARol(String rol, String permiso) {
		permisosPorRol.putIfAbsent(rol, new ArrayList<>());
		permisosPorRol.get(rol).add(permiso);
	}

	@Override
	public String toString() {
		return "SEGURIDAD: (usuarioActual='" + usuarioActual + "')";
	}
}

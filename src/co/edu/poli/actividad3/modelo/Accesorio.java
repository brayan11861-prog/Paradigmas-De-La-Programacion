package co.edu.poli.actividad3.vista;

import co.edu.poli.actividad3.modelo.Accesorio;
import co.edu.poli.actividad3.servicios.ImplementacionOperacionCRUD;
import java.io.*;
import java.util.*;

public class MenuAccesorio {

    private static final ImplementacionOperacionCRUD<Accesorio> crud = new ImplementacionOperacionCRUD<>();
    private static final Scanner sc = new Scanner(System.in);
    private static final String ARCHIVO = "accesorios.dat";

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("_________________________________________________________");
            System.out.println("   MENÚ CRUD DE ACCESORIOS CON ARCHIVOS BINARIOS");
            System.out.println("_________________________________________________________");
            System.out.println("1. Crear accesorio");
            System.out.println("2. Listar accesorios");
            System.out.println("3. Leer accesorio por ID");
            System.out.println("4. Actualizar accesorio");
            System.out.println("5. Eliminar accesorio");
            System.out.println("6. Guardar (serializar) en archivo");
            System.out.println("7. Cargar (deserializar) desde archivo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> crearAccesorio();
                case 2 -> listarAccesorios();
                case 3 -> leerAccesorio();
                case 4 -> actualizarAccesorio();
                case 5 -> eliminarAccesorio();
                case 6 -> serializar();
                case 7 -> deserializar();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
    }

    private static void crearAccesorio() {
        System.out.println("Ingrese los siguientes datos:");
        System.out.print("ID Accesorio: ");
        String id = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Material: ");
        String material = sc.nextLine();
        System.out.print("Fecha Fabricación: ");
        String fecha = sc.nextLine();

        Accesorio a = new Accesorio(id, nombre, material, fecha);
        crud.create(a);
        System.out.println("Accesorio creado con éxito!");
    }

    private static void listarAccesorios() {
        System.out.println("Listado de accesorios:");
        crud.list().forEach(System.out::println);
    }

    private static void leerAccesorio() {
        System.out.print("Ingrese ID: ");
        String id = sc.nextLine();
        Accesorio a = crud.read(id);
        System.out.println(a != null ? a : "No encontrado.");
    }

    private static void actualizarAccesorio() {
        System.out.print("Ingrese ID del accesorio a actualizar: ");
        String id = sc.nextLine();
        System.out.print("Nuevo nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Nuevo material: ");
        String material = sc.nextLine();
        System.out.print("Nueva fecha: ");
        String fecha = sc.nextLine();

        Accesorio nuevo = new Accesorio(id, nombre, material, fecha);
        if (crud.update(id, nuevo))
            System.out.println("Actualizado con éxito!");
        else
            System.out.println("ID no encontrado.");
    }

    private static void eliminarAccesorio() {
        System.out.print("Ingrese ID a eliminar: ");
        String id = sc.nextLine();
        if (crud.delete(id))
            System.out.println("Eliminado correctamente.");
        else
            System.out.println("ID no encontrado.");
    }

    private static void serializar() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(new ArrayList<>(crud.list()));
            System.out.println("Datos serializados en archivo: " + ARCHIVO);
        } catch (IOException e) {
            System.out.println("Error al serializar: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private static void deserializar() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO))) {
            List<Accesorio> lista = (List<Accesorio>) ois.readObject();
            crud.list().clear();
            crud.list().addAll(lista);
            System.out.println("Datos cargados desde archivo: " + ARCHIVO);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al deserializar: " + e.getMessage());
        }
    }
}

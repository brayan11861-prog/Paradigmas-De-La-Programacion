package co.edu.poli.actividad3.vista;

import java.util.ArrayList;
import java.util.Scanner;
import co.edu.poli.actividad3.modelo.*;

public class Cliente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Accesorio> accesorios = new ArrayList<>();
        ArrayList<Autor> autores = new ArrayList<>();
        ArrayList<Obra> obras = new ArrayList<>();
        ArrayList<Evento> eventos = new ArrayList<>();
        ArrayList<Exposicion> exposiciones = new ArrayList<>();
        ArrayList<Visita> visitas = new ArrayList<>();
        ArrayList<Donacion> donaciones = new ArrayList<>();

        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\n=== MUSEO - MENÚ PRINCIPAL ===");
            System.out.println("1. CRUD Accesorio");
            System.out.println("2. CRUD Autor");
            System.out.println("3. CRUD Obra");
            System.out.println("4. CRUD Evento");
            System.out.println("5. CRUD Exposicion");
            System.out.println("6. CRUD Visita");
            System.out.println("7. CRUD Donacion");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> crudAccesorio(sc, accesorios);
                case 2 -> crudAutor(sc, autores);
                case 3 -> crudObra(sc, obras);
                case 4 -> crudEvento(sc, eventos);
                case 5 -> crudExposicion(sc, exposiciones);
                case 6 -> crudVisita(sc, visitas);
                case 7 -> crudDonacion(sc, donaciones);
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }

    // ---------------- ACCESORIO ----------------
    private static void crudAccesorio(Scanner sc, ArrayList<Accesorio> lista) {
        int op = -1;
        while (op != 0) {
            System.out.println("\n--- CRUD ACCESORIO ---");
            System.out.println("1. Crear");
            System.out.println("2. Listar");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("0. Volver");
            System.out.print("Opcion: ");
            op = sc.nextInt(); sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Material: ");
                    String material = sc.nextLine();
                    System.out.print("Fecha fabricación: ");
                    String fecha = sc.nextLine();
                    lista.add(new Accesorio(id, nombre, material, fecha));
                    System.out.println(" Accesorio creado.");
                }
                case 2 -> {
                    if (lista.isEmpty()) System.out.println("📭 No hay accesorios.");
                    else lista.forEach(System.out::println);
                }
                case 3 -> {
                    System.out.print("ID a actualizar: ");
                    String id = sc.nextLine();
                    for (Accesorio a : lista) {
                        if (a.getIdAccesorio().equals(id)) {
                            System.out.print("Nuevo nombre: ");
                            a.setNombre(sc.nextLine());
                            System.out.print("Nuevo material: ");
                            a.setMaterial(sc.nextLine());
                            System.out.print("Nueva fecha: ");
                            a.setFechaFabricacion(sc.nextLine());
                            System.out.println(" Actualizado.");
                            return;
                        }
                    }
                    System.out.println(" No encontrado.");
                }
                case 4 -> {
                    System.out.print("ID a eliminar: ");
                    String id = sc.nextLine();
                    lista.removeIf(a -> a.getIdAccesorio().equals(id));
                    System.out.println(" Eliminado si existía.");
                }
            }
        }
    }

    // ---------------- AUTOR ----------------
    private static void crudAutor(Scanner sc, ArrayList<Autor> lista) {
        int op = -1;
        while (op != 0) {
            System.out.println("\n--- CRUD AUTOR ---");
            System.out.println("1. Crear");
            System.out.println("2. Listar");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("0. Volver");
            System.out.print("Opcion: ");
            op = sc.nextInt(); sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("ID Autor: ");
                    String id = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Nacionalidad: ");
                    String nac = sc.nextLine();
                    lista.add(new Autor(id, nombre, nac));
                    System.out.println(" Autor creado.");
                }
                case 2 -> {
                    if (lista.isEmpty()) System.out.println("📭 No hay autores.");
                    else lista.forEach(System.out::println);
                }
                case 3 -> {
                    System.out.print("ID a actualizar: ");
                    String id = sc.nextLine();
                    for (Autor a : lista) {
                        if (a.getIdAutor().equals(id)) {
                            System.out.print("Nuevo nombre: ");
                            a.setNombre(sc.nextLine());
                            System.out.print("Nueva nacionalidad: ");
                            a.setNacionalidad(sc.nextLine());
                            System.out.println(" Actualizado.");
                            return;
                        }
                    }
                    System.out.println(" No encontrado.");
                }
                case 4 -> {
                    System.out.print("ID a eliminar: ");
                    String id = sc.nextLine();
                    lista.removeIf(a -> a.getIdAutor().equals(id));
                    System.out.println(" Eliminado si existía.");
                }
            }
        }
    }

    // ---------------- OBRA ----------------
    private static void crudObra(Scanner sc, ArrayList<Obra> lista) {
        int op = -1;
        while (op != 0) {
            System.out.println("\n--- CRUD OBRA ---");
            System.out.println("1. Crear");
            System.out.println("2. Listar");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("0. Volver");
            System.out.print("Opcion: ");
            op = sc.nextInt(); sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Técnica: ");
                    String tecnica = sc.nextLine();
                    System.out.print("Fecha de creación: ");
                    String fecha = sc.nextLine();
                    lista.add(new Obra(id, titulo, tecnica, fecha));
                    System.out.println(" Obra creada.");
                }
                case 2 -> {
                    if (lista.isEmpty()) System.out.println("📭 No hay obras.");
                    else lista.forEach(System.out::println);
                }
                case 3 -> {
                    System.out.print("ID a actualizar: ");
                    String id = sc.nextLine();
                    for (Obra o : lista) {
                        if (o.getIdObra().equals(id)) {
                            System.out.print("Nuevo título: ");
                            o.setTitulo(sc.nextLine());
                            System.out.print("Nueva técnica: ");
                            o.setTecnica(sc.nextLine());
                            System.out.print("Nueva fecha: ");
                            o.setFechaCreacion(sc.nextLine());
                            System.out.println(" Actualizado.");
                            return;
                        }
                    }
                    System.out.println(" No encontrado.");
                }
                case 4 -> {
                    System.out.print("ID a eliminar: ");
                    String id = sc.nextLine();
                    lista.removeIf(o -> o.getIdObra().equals(id));
                    System.out.println(" Eliminado si existía.");
                }
            }
        }
    }

    // ---------------- EVENTO ----------------
    private static void crudEvento(Scanner sc, ArrayList<Evento> lista) {
        int op = -1;
        while (op != 0) {
            System.out.println("--- CRUD EVENTO ---");
            System.out.println("1. Crear");
            System.out.println("2. Listar");
            System.out.println("3. Eliminar");
            System.out.println("0. Volver");
            System.out.print("Opcion: ");
            op = sc.nextInt(); sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Serial: ");
                    String serial = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Inicio: ");
                    String ini = sc.nextLine();
                    System.out.print("Fin: ");
                    String fin = sc.nextLine();
                    System.out.print("Tipo: ");
                    String tipo = sc.nextLine();
                    lista.add(new Evento(serial, nombre, ini, fin, tipo));
                    System.out.println(" Evento creado.");
                }
                case 2 -> {
                    if (lista.isEmpty()) System.out.println(" No hay eventos.");
                    else lista.forEach(System.out::println);
                }
                case 3 -> {
                    System.out.print("Serial a eliminar: ");
                    String id = sc.nextLine();
                    lista.removeIf(e -> e.getSerial().equals(id));
                    System.out.println(" Eliminado si existía.");
                }
            }
        }
    }

    // ---------------- EXPOSICION ----------------
    private static void crudExposicion(Scanner sc, ArrayList<Exposicion> lista) {
        int op = -1;
        while (op != 0) {
            System.out.println("\n--- CRUD EXPOSICIÓN ---");
            System.out.println("1. Crear");
            System.out.println("2. Listar");
            System.out.println("3. Eliminar");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            op = sc.nextInt(); sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Serial: ");
                    String serial = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Inicio: ");
                    String ini = sc.nextLine();
                    System.out.print("Fin: ");
                    String fin = sc.nextLine();
                    System.out.print("Descripción: ");
                    String des = sc.nextLine();
                    System.out.print("Tema: ");
                    String tema = sc.nextLine();
                    lista.add(new Exposicion(serial, nombre, ini, fin, des, tema));
                    System.out.println(" Exposición creada.");
                }
                case 2 -> {
                    if (lista.isEmpty()) System.out.println(" No hay exposiciones.");
                    else lista.forEach(System.out::println);
                }
                case 3 -> {
                    System.out.print("Serial a eliminar: ");
                    String id = sc.nextLine();
                    lista.removeIf(e -> e.getSerial().equals(id));
                    System.out.println(" Eliminado si existía.");
                }
            }
        }
    }

    // ---------------- VISITA ----------------
    private static void crudVisita(Scanner sc, ArrayList<Visita> lista) {
        int op = -1;
        while (op != 0) {
            System.out.println("\n--- CRUD VISITA ---");
            System.out.println("1. Crear");
            System.out.println("2. Listar");
            System.out.println("3. Eliminar");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            op = sc.nextInt(); sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Serial: ");
                    String serial = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Inicio: ");
                    String ini = sc.nextLine();
                    System.out.print("Fin: ");
                    String fin = sc.nextLine();
                    System.out.print("Género: ");
                    String gen = sc.nextLine();
                    System.out.print("Fecha visita: ");
                    String fecha = sc.nextLine();
                    lista.add(new Visita(serial, nombre, ini, fin, gen, fecha));
                    System.out.println(" Visita creada.");
                }
                case 2 -> {
                    if (lista.isEmpty()) System.out.println("📭 No hay visitas.");
                    else lista.forEach(System.out::println);
                }
                case 3 -> {
                    System.out.print("Serial a eliminar: ");
                    String id = sc.nextLine();
                    lista.removeIf(v -> v.getSerial().equals(id));
                    System.out.println(" Eliminado si existía.");
                }
            }
        }
    }

    // ---------------- DONACION ----------------
    private static void crudDonacion(Scanner sc, ArrayList<Donacion> lista) {
        int op = -1;
        while (op != 0) {
            System.out.println("\n--- CRUD DONACIÓN ---");
            System.out.println("1. Crear");
            System.out.println("2. Listar");
            System.out.println("3. Eliminar");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            op = sc.nextInt(); sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Serial: ");
                    String serial = sc.nextLine();
                    System.out.print("Fecha: ");
                    String fecha = sc.nextLine();
                    System.out.print("Donador: ");
                    String donador = sc.nextLine();
                    System.out.print("Cantidad: ");
                    String cantidad = sc.nextLine();
                    System.out.print("Tipo donación: ");
                    String tipo = sc.nextLine();
                    lista.add(new Donacion(serial, fecha, donador, cantidad, tipo));
                    System.out.println(" Donación creada.");
                }
                case 2 -> {
                    if (lista.isEmpty()) System.out.println("📭 No hay donaciones.");
                    else lista.forEach(System.out::println);
                }
                case 3 -> {
                    System.out.print("Serial a eliminar: ");
                    String id = sc.nextLine();
                    lista.removeIf(d -> d.getSerial().equals(id));
                    System.out.println(" Eliminado si existía.");
                }
            }
        }
    }
}


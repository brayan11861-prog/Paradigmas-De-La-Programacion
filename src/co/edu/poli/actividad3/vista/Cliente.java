package co.edu.poli.actividad3.vista;

import co.edu.poli.actividad3.modelo.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Cliente {

    public static void main(String[] args) {

        ArrayList<Actividad> actividades = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n========== MENÚ CRUD MUSEO ==========");
            System.out.println("1. Crear Actividad");
            System.out.println("2. Mostrar Actividades");
            System.out.println("3. Actualizar Actividad");
            System.out.println("4. Eliminar Actividad");
            System.out.println("5. Guardar Archivo");
            System.out.println("6. Cargar Archivo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1: // CREATE - máximo 5 datos
                    System.out.println("\n--- Crear Actividad ---");
                    System.out.print("Ingrese serial: ");
                    String serial = sc.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();

                    System.out.println("Seleccione tipo:");
                    System.out.println("1. Evento");
                    System.out.println("2. Exposición");
                    System.out.println("3. Visita");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    Actividad actividad = null;

                    if (tipo == 1) {
                        actividad = new Evento(serial, nombre);
                    } else if (tipo == 2) {
                        actividad = new Exposicion(serial, nombre);
                    } else if (tipo == 3) {
                        actividad = new Visita(serial, nombre);
                    }

                    actividades.add(actividad);
                    System.out.println("✅ Actividad creada.");
                    break;

                case 2: // READ
                    if (actividades.isEmpty()) {
                        System.out.println("⚠ No hay actividades.");
                    } else {
                        System.out.println("\n--- LISTA DE ACTIVIDADES ---");
                        for (Actividad a : actividades) {
                            System.out.println(a);
                        }
                    }
                    break;

                case 3: // UPDATE
                    System.out.print("Ingrese serial a actualizar: ");
                    String serialU = sc.nextLine();
                    boolean encontrado = false;
                    for (Actividad a : actividades) {
                        if (a.getSerial().equals(serialU)) {
                            System.out.print("Nuevo nombre: ");
                            String nuevo = sc.nextLine();
                            a.setNombre(nuevo);
                            System.out.println("✅ Actividad actualizada.");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) System.out.println("❌ No encontrada.");
                    break;

                case 4: // DELETE
                    System.out.print("Serial de la actividad a eliminar: ");
                    String serialD = sc.nextLine();
                    actividades.removeIf(a -> a.getSerial().equals(serialD));
                    System.out.println("🗑 Actividad eliminada (si existía).");
                    break;

                case 5: // SERIALIZAR
                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("actividades.dat"))) {
                        oos.writeObject(actividades);
                        System.out.println("💾 Archivo guardado correctamente.");
                    } catch (IOException e) {
                        System.out.println("⚠ Error al guardar: " + e.getMessage());
                    }
                    break;

                case 6: // DESERIALIZAR
                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("actividades.dat"))) {
                        actividades = (ArrayList<Actividad>) ois.readObject();
                        System.out.println("📂 Archivo cargado exitosamente.");
                    } catch (Exception e) {
                        System.out.println("⚠ Error al cargar: " + e.getMessage());
                    }
                    break;

                case 0:
                    System.out.println("👋 Saliendo...");
                    break;

                default:
                    System.out.println("❌ Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}

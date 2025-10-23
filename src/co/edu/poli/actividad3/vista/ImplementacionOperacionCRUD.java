package co.edu.poli.actividad3.vista;

import co.edu.poli.actividad3.modelo.Actividad;

public class ImplementacionOperacionCRUD implements OperacionCRUD {

    private Actividad[] lista = new Actividad[5];

    @Override
    public boolean create(Actividad a) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null) {
                lista[i] = a;
                return true;
            }
        }

        // Aumentar tamaño cuando esté lleno
        Actividad[] nuevaLista = new Actividad[lista.length * 2];
        System.arraycopy(lista, 0, nuevaLista, 0, lista.length);
        nuevaLista[lista.length] = a;
        lista = nuevaLista;
        return true;
    }

    @Override
    public Actividad read(String serial) {
        for (Actividad a : lista) {
            if (a != null && a.getSerial().equals(serial)) {
                return a;
            }
        }
        return null;
    }

    @Override
    public boolean update(String serial, Actividad nueva) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null && lista[i].getSerial().equals(serial)) {
                lista[i] = nueva;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(String serial) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null && lista[i].getSerial().equals(serial)) {
                lista[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public void listar() {
        boolean vacio = true;
        for (Actividad a : lista) {
            if (a != null) {
                System.out.println(a);
                vacio = false;
            }
        }
        if (vacio) {
            System.out.println("No hay actividades registradas.");
        }
    }
}

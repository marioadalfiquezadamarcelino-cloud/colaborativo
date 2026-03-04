
package javaapplication75;

import java.util.ArrayList;

/**
 * Clase que gestiona la lista de tareas.
 * @author Mario
 */
public class GestorTareas {

    private ArrayList<Tarea> lista = new ArrayList<>();

    /**
     * Añade una nueva tarea a la lista.
     * @param descripcion Texto de la tarea
     */
    public void añadirTarea(String descripcion) {
        lista.add(new Tarea(descripcion));
    }

    public ArrayList<Tarea> getLista() {
        return lista;
    }
}

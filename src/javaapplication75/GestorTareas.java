
package javaapplication75;

import java.util.ArrayList;

/**
 * Clase que gestiona la lista de tareas.
 * @author AlumnoA
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
    
    /**
 * Muestra todas las tareas por consola.
 */
public void mostrarTareas() {
    for (int i = 0; i < lista.size(); i++) {
        System.out.println((i+1) + ". " + lista.get(i).getDescripcion());
    }
}

}
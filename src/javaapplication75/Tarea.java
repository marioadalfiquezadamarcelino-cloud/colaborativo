package javaapplication75;

/**
 *Clase representa una tarea del sistema 
 * 
 * @author Mario
 * 
 */
public class Tarea {

  
    private String descripcion;
    private boolean completada;

   /**
    * El constructor de la tarea
    * 
    * @param descripción Descripcion de la tarea
    */
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }
    
        /**
         * 
         * 
         */
    public String getDescripcion() {
        return descripcion;
    }
    
    public boolean isCompletada() {
        return completada;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
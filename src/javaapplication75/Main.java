
package javaapplication75;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();

        System.out.println("1. Añadir tarea");
        int opcion = sc.nextInt();
        sc.nextLine();

        if (opcion == 1) {
            System.out.print("Introduce la descripción: ");
            String desc = sc.nextLine();
            gestor.añadirTarea(desc);
            System.out.println("Tarea añadida.");
        }
    }
}

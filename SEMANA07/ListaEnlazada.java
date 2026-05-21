
package Libreria;

public class ListaEnlazada {

    Nodo cabeza;

    // Crear lista vacía
    public ListaEnlazada() {
        cabeza = null;
    }

    // Insertar al inicio
    public void insertarInicio(int dato) {

        Nodo nuevo = new Nodo(dato);

        nuevo.siguiente = cabeza;
        cabeza = nuevo;

        System.out.println("Elemento insertado al inicio");
    }

    // Insertar al final
    public void insertarFinal(int dato) {

        Nodo nuevo = new Nodo(dato);

        // Si la lista está vacía
        if (cabeza == null) {
            cabeza = nuevo;
        } else {

            Nodo temp = cabeza;

            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }

            temp.siguiente = nuevo;
        }

        System.out.println("Elemento insertado al final");
    }

    // Eliminar nodo
    public void eliminar(int dato) {

        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }

        // Si el primero es el que se elimina
        if (cabeza.dato == dato) {
            cabeza = cabeza.siguiente;
            System.out.println("Nodo eliminado");
            return;
        }

        Nodo actual = cabeza;
        Nodo anterior = null;

        while (actual != null && actual.dato != dato) {
            anterior = actual;
            actual = actual.siguiente;
        }

        // No encontrado
        if (actual == null) {
            System.out.println("Elemento no encontrado");
            return;
        }

        anterior.siguiente = actual.siguiente;

        System.out.println("Nodo eliminado");
    }

    // Mostrar lista
    public void mostrar() {

        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }

        Nodo temp = cabeza;

        System.out.println("\nContenido de la lista:");

        while (temp != null) {

            System.out.print(temp.dato + " -> ");
            temp = temp.siguiente;
        }

        System.out.println("NULL");
    }
}
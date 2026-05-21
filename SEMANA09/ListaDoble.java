
package Libreria;

public class ListaDoble {

    NodoDoble cabeza;

    public void insertar(int dato) {

        NodoDoble nuevo = new NodoDoble(dato);

        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }

        NodoDoble aux = cabeza;

        while (aux.siguiente != null) {
            aux = aux.siguiente;
        }

        aux.siguiente = nuevo;
        nuevo.anterior = aux;
    }

    public void eliminar(int dato) {

        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        NodoDoble aux = cabeza;

        while (aux != null && aux.dato != dato) {
            aux = aux.siguiente;
        }

        if (aux == null) {
            System.out.println("Dato no encontrado.");
            return;
        }

        if (aux.anterior != null) {
            aux.anterior.siguiente = aux.siguiente;
        } else {
            cabeza = aux.siguiente;
        }

        if (aux.siguiente != null) {
            aux.siguiente.anterior = aux.anterior;
        }

        System.out.println("Nodo eliminado.");
    }

    public void mostrarAdelante() {

        if (cabeza == null) {
            System.out.println("Lista vacía.");
            return;
        }

        NodoDoble aux = cabeza;

        while (aux != null) {
            System.out.print(aux.dato + " <-> ");
            aux = aux.siguiente;
        }

        System.out.println("NULL");
    }

    public void mostrarAtras() {

        if (cabeza == null) {
            System.out.println("Lista vacía.");
            return;
        }

        NodoDoble aux = cabeza;

        while (aux.siguiente != null) {
            aux = aux.siguiente;
        }

        while (aux != null) {
            System.out.print(aux.dato + " <-> ");
            aux = aux.anterior;
        }

        System.out.println("NULL");
    }
}

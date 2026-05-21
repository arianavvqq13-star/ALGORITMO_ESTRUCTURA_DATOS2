
package Libreria;

public class ListaCircular {

    NodoCircular cabeza;

    public void insertar(int dato) {

        NodoCircular nuevo = new NodoCircular(dato);

        if (cabeza == null) {

            cabeza = nuevo;
            nuevo.siguiente = cabeza;

        } else {

            NodoCircular aux = cabeza;

            while (aux.siguiente != cabeza) {
                aux = aux.siguiente;
            }

            aux.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }

    public void mostrar() {

        if (cabeza == null) {
            System.out.println("Lista vacía.");
            return;
        }

        NodoCircular aux = cabeza;

        do {
            System.out.print(aux.dato + " -> ");
            aux = aux.siguiente;
        } while (aux != cabeza);

        System.out.println("(inicio)");
    }
}

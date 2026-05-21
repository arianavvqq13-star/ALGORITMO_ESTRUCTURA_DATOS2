
package Libreria;
public class ListaEnlazada {

    Nodo cabeza;

    // Insertar al final
    public void insertarFinal(int dato) {

        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {

            Nodo temp = cabeza;

            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }

            temp.siguiente = nuevo;
        }
    }

    // Mostrar lista
    public void mostrar() {

        Nodo temp = cabeza;

        while (temp != null) {
            System.out.print(temp.dato + " -> ");
            temp = temp.siguiente;
        }

        System.out.println("NULL");
    }

    // Invertir lista
    public void invertirLista() {

        Nodo anterior = null;
        Nodo actual = cabeza;
        Nodo siguiente = null;

        while (actual != null) {

            siguiente = actual.siguiente;

            actual.siguiente = anterior;

            anterior = actual;

            actual = siguiente;
        }

        cabeza = anterior;

        System.out.println("Lista invertida correctamente");
    }

    // Detectar ciclo usando Floyd
    public boolean tieneCiclo() {

        Nodo lento = cabeza;
        Nodo rapido = cabeza;

        while (rapido != null && rapido.siguiente != null) {

            lento = lento.siguiente;

            rapido = rapido.siguiente.siguiente;

            if (lento == rapido) {
                return true;
            }
        }

        return false;
    }

    // Fusionar dos listas ordenadas
    public static ListaEnlazada fusionar(ListaEnlazada l1, ListaEnlazada l2) {

        ListaEnlazada nueva = new ListaEnlazada();

        Nodo a = l1.cabeza;
        Nodo b = l2.cabeza;

        while (a != null && b != null) {

            if (a.dato < b.dato) {
                nueva.insertarFinal(a.dato);
                a = a.siguiente;
            } else {
                nueva.insertarFinal(b.dato);
                b = b.siguiente;
            }
        }

        while (a != null) {
            nueva.insertarFinal(a.dato);
            a = a.siguiente;
        }

        while (b != null) {
            nueva.insertarFinal(b.dato);
            b = b.siguiente;
        }

        return nueva;
    }
}

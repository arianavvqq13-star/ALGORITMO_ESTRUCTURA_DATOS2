
package semana08;
import Libreria.*;
import java.util.*;
public class SEMANA08 {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        ListaEnlazada lista = new ListaEnlazada();

        int opcion;
        int valor;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Insertar datos");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Invertir lista");
            System.out.println("4. Detectar ciclo");
            System.out.println("5. Fusionar listas");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese valor: ");
                    valor = sc.nextInt();

                    lista.insertarFinal(valor);

                    System.out.println("Dato insertado");

                    break;

                case 2:

                    System.out.println("\nLista actual:");

                    lista.mostrar();

                    break;

                case 3:

                    System.out.println("\nLista original:");
                    lista.mostrar();

                    lista.invertirLista();

                    System.out.println("Lista invertida:");
                    lista.mostrar();

                    break;

                case 4:

                    if (lista.tieneCiclo()) {
                        System.out.println("La lista SI tiene ciclo");
                    } else {
                        System.out.println("La lista NO tiene ciclo");
                    }

                    break;

                case 5:

                    ListaEnlazada lista1 = new ListaEnlazada();
                    ListaEnlazada lista2 = new ListaEnlazada();

                    // Lista 1
                    lista1.insertarFinal(1);
                    lista1.insertarFinal(3);
                    lista1.insertarFinal(5);

                    // Lista 2
                    lista2.insertarFinal(2);
                    lista2.insertarFinal(4);
                    lista2.insertarFinal(6);

                    System.out.println("\nLista 1:");
                    lista1.mostrar();

                    System.out.println("Lista 2:");
                    lista2.mostrar();

                    ListaEnlazada fusionada;

                    fusionada = ListaEnlazada.fusionar(lista1, lista2);

                    System.out.println("Lista fusionada:");

                    fusionada.mostrar();

                    break;

                case 6:

                    System.out.println("Programa finalizado");

                    break;

                default:

                    System.out.println("Opcion invalida");
            }

        } while (opcion != 6);
    }
}
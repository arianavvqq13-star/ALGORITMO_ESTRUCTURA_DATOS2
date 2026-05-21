
package semana09;
import Libreria.*;
import java.util.*;


public class SEMANA09 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ListaDoble listaDoble = new ListaDoble();
        ListaCircular listaCircular = new ListaCircular();

        // Datos iniciales para pruebas
        listaDoble.insertar(10);
        listaDoble.insertar(20);
        listaDoble.insertar(30);

        listaCircular.insertar(1);
        listaCircular.insertar(2);
        listaCircular.insertar(3);

        int opcion;
        int dato;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Mostrar lista doble");
            System.out.println("2. Insertar en lista doble");
            System.out.println("3. Eliminar de lista doble");
            System.out.println("4. Mostrar lista doble al revés");
            System.out.println("5. Mostrar lista circular");
            System.out.println("6. Insertar en lista circular");
            System.out.println("7. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("\nRecorrido hacia adelante:");
                    listaDoble.mostrarAdelante();
                    break;

                case 2:
                    System.out.print("Ingrese dato: ");
                    dato = sc.nextInt();
                    listaDoble.insertar(dato);
                    System.out.println("Dato insertado.");
                    break;

                case 3:
                    System.out.print("Ingrese dato a eliminar: ");
                    dato = sc.nextInt();
                    listaDoble.eliminar(dato);
                    break;

                case 4:
                    System.out.println("\nRecorrido hacia atrás:");
                    listaDoble.mostrarAtras();
                    break;

                case 5:
                    System.out.println("\nLista circular:");
                    listaCircular.mostrar();
                    break;

                case 6:
                    System.out.print("Ingrese dato: ");
                    dato = sc.nextInt();
                    listaCircular.insertar(dato);
                    System.out.println("Dato insertado.");
                    break;

                case 7:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 7);

        sc.close();
    }
}
package semana07;
import Libreria.*;
import java.util.*;

public class SEMANA07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ListaEnlazada lista = new ListaEnlazada();

        int opcion;
        int valor;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Eliminar nodo");
            System.out.println("4. Mostrar lista");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese valor: ");
                    valor = sc.nextInt();

                    lista.insertarInicio(valor);

                    break;

                case 2:

                    System.out.print("Ingrese valor: ");
                    valor = sc.nextInt();

                    lista.insertarFinal(valor);

                    break;

                case 3:

                    System.out.print("Ingrese valor a eliminar: ");
                    valor = sc.nextInt();

                    lista.eliminar(valor);

                    break;

                case 4:

                    lista.mostrar();

                    break;

                case 5:

                    System.out.println("Programa finalizado");

                    break;

                default:

                    System.out.println("Opción inválida");
            }

        } while (opcion != 5);
    }
}
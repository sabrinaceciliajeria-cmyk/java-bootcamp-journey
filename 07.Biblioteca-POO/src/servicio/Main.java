package src.servicio;

import java.util.Scanner;

import src.modelo.Libro;
import src.modelo.Revista;
import src.modelo.Periodico;

public class Main {

    public static void main(String[] args) {

        // Permite leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Guarda y administra las publicaciones
        GestorBiblioteca gestor = new GestorBiblioteca();

        // Guarda la opción del menú
        int opcion;

        // Menú principal
        do {

            System.out.println("\n==============================");
            System.out.println("        BIBLIOTECA");
            System.out.println("==============================");
            System.out.println("1. Registrar libro");
            System.out.println("2. Registrar revista");
            System.out.println("3. Registrar periódico");
            System.out.println("4. Mostrar publicaciones");
            System.out.println("5. Salir");
            System.out.println("==============================");
            System.out.print("Seleccione una opción: ");

            // Leemos la opción
            opcion = scanner.nextInt();

            switch (opcion) {

                // =====================================
                // OPCIÓN 1 - REGISTRAR LIBRO
                // =====================================

                case 1:

                    // Limpiamos el Enter pendiente
                    scanner.nextLine();

                    System.out.println("\n===== REGISTRO DE LIBRO =====");

                    // Pedimos los datos
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    System.out.print("Año: ");
                    int anio = scanner.nextInt();

                    System.out.print("Páginas: ");
                    int paginas = scanner.nextInt();

                    // Creamos el libro
                    Libro libro = new Libro(
                            titulo,
                            autor,
                            anio,
                            paginas);

                    // Guardamos el libro
                    gestor.agregarPublicacion(libro);

                    System.out.println("Libro registrado correctamente.");

                    break;

                // =====================================
                // OPCIÓN 2 - REGISTRAR REVISTA
                // =====================================

                case 2:

                    // Limpiamos el Enter pendiente
                    scanner.nextLine();

                    System.out.println("\n===== REGISTRO DE REVISTA =====");

                    // Pedimos los datos
                    System.out.print("Título: ");
                    String tituloRevista = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autorRevista = scanner.nextLine();

                    System.out.print("Año: ");
                    int anioRevista = scanner.nextInt();

                    System.out.print("Número de revista: ");
                    int numeroRevista = scanner.nextInt();

                    // Creamos la revista
                    Revista revista = new Revista(
                            tituloRevista,
                            autorRevista,
                            anioRevista,
                            numeroRevista);

                    // Guardamos la revista
                    gestor.agregarPublicacion(revista);

                    System.out.println("Revista registrada correctamente.");

                    break;

                // =====================================
                // OPCIÓN 3 - REGISTRAR PERIÓDICO
                // =====================================

                case 3:

                    // Limpiamos el Enter pendiente
                    scanner.nextLine();

                    System.out.println("\n===== REGISTRO DE PERIÓDICO =====");

                    // Pedimos los datos
                    System.out.print("Título: ");
                    String tituloPeriodico = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autorPeriodico = scanner.nextLine();

                    System.out.print("Año: ");
                    int anioPeriodico = scanner.nextInt();

                    // Limpiamos el Enter pendiente
                    scanner.nextLine();

                    System.out.print("Sección: ");
                    String seccionPeriodico = scanner.nextLine();

                    // Creamos el periódico
                    Periodico periodico = new Periodico(
                            tituloPeriodico,
                            autorPeriodico,
                            anioPeriodico,
                            seccionPeriodico);

                    // Guardamos el periódico
                    gestor.agregarPublicacion(periodico);

                    System.out.println("Periódico registrado correctamente.");

                    break;

                // =====================================
                // OPCIÓN 4 - MOSTRAR PUBLICACIONES
                // =====================================

                case 4:

                    System.out.println("\n===== PUBLICACIONES =====");

                    // Mostramos todas las publicaciones
                    gestor.mostrarTodo();

                    break;

                // =====================================
                // OPCIÓN 5 - SALIR
                // =====================================

                case 5:

                    System.out.println("\nSaliendo de la biblioteca...");

                    break;

                // =====================================
                // OPCIÓN INVÁLIDA
                // =====================================

                default:

                    System.out.println("\nOpción inválida.");
            }

        } while (opcion != 5);

        // Cerramos Scanner
        scanner.close();
    }
}
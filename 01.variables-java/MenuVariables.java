import java.util.Scanner;

public class MenuVariables {

    // Scanner disponible para todos los métodos
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        // El menú se repite hasta que el usuario elija salir
        do {
            System.out.println("\n========================");
            System.out.println("   MENÚ DE VARIABLES");
            System.out.println("========================");
            System.out.println("1. Tipos Primitivos");
            System.out.println("2. Wrapper Classes");
            System.out.println("3. Ingresar datos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            // Ejecutar la opción seleccionada
            switch (opcion) {
                case 1:
                    mostrarPrimitivos();
                    break;

                case 2:
                    mostrarWrappers();
                    break;

                case 3:
                    ingresarDatos();
                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        // Cerrar Scanner al finalizar
        scanner.close();
    }

    public static void mostrarPrimitivos() {

        System.out.println("\n--- TIPOS PRIMITIVOS ---");

        // Variables enteras
        byte b = 127;
        short s = 32000;
        int i = 100000;
        long l = 10000000000L;

        // Variables decimales
        float f = 3.14f;
        double d = 3.1415926535;

        // Carácter y booleano
        char c = 'A';
        boolean bool = true;

        // Mostrar valores en consola
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);

        System.out.println("float: " + f);
        System.out.println("double: " + d);

        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        // Explicación rápida
        System.out.println("\nExplicación:");
        System.out.println("byte, short, int y long almacenan números enteros.");
        System.out.println("float y double almacenan números decimales.");
        System.out.println("char almacena un único carácter.");
        System.out.println("boolean almacena true o false.");
    }

    public static void mostrarWrappers() {

        System.out.println("\n--- WRAPPER CLASSES ---");

        // Wrappers de números enteros
        Byte b = 127;
        Short s = 32000;
        Integer i = 100000;
        Long l = 10000000000L;

        // Wrappers de números decimales
        Float f = 3.14f;
        Double d = 3.1415926535;

        // Wrappers de carácter y booleano
        Character c = 'A';
        Boolean bool = true;

        // Mostrar valores en consola
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Integer: " + i);
        System.out.println("Long: " + l);

        System.out.println("Float: " + f);
        System.out.println("Double: " + d);

        System.out.println("Character: " + c);
        System.out.println("Boolean: " + bool);

        // Explicación rápida
        System.out.println("\nExplicación:");
        System.out.println("Los Wrapper son objetos equivalentes a los tipos primitivos.");
        System.out.println("Permiten usar métodos y trabajar con colecciones.");
        System.out.println("Ejemplo: Integer.parseInt(\"123\")");
    }

    public static void ingresarDatos() {

        // Limpiar el buffer del teclado
        scanner.nextLine();

        System.out.println("\n--- INGRESO DE DATOS ---");

        // Solicitar un número entero
        System.out.print("Ingrese un número entero: ");
        int numeroEntero = scanner.nextInt();

        // Solicitar un número decimal
        System.out.print("Ingrese un número decimal: ");
        double numeroDecimal = scanner.nextDouble();

        // Limpiar nuevamente el buffer
        scanner.nextLine();

        // Solicitar un texto
        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();

        // Mostrar los datos ingresados
        System.out.println("\n--- DATOS INGRESADOS ---");
        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Número decimal: " + numeroDecimal);
        System.out.println("Texto: " + texto);
    }
}
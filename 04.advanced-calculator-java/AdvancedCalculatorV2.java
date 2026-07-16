import java.util.Scanner;

public class AdvancedCalculatorV2 {

    // =====================================
    // ARREGLO PARA GUARDAR EL HISTORIAL
    // =====================================

    // Guarda hasta 100 operaciones realizadas
    static String[] historial = new String[100];

    // Lleva la posición actual del historial
    static int contadorHistorial = 0;

    // =====================================
    // FUNCIÓN PRINCIPAL DEL PROGRAMA
    // =====================================

    public static void main(String[] args) {

        // Permite leer datos desde teclado
        Scanner scanner = new Scanner(System.in);

        // Guarda la opción seleccionada por el usuario
        int opcion;

        // Mantiene el menú activo hasta elegir salir
        do {

            // Muestra el menú principal
            mostrarMenu();

            // Solicita la opción al usuario
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            // Variables reutilizables para operaciones
            double numero1;
            double numero2;
            double resultado;

            switch (opcion) {

                // =====================================
                // SUMA
                // =====================================
                case 1:

                    numero1 = pedirNumero(scanner, "Ingrese el primer número: ");
                    numero2 = pedirNumero(scanner, "Ingrese el segundo número: ");

                    resultado = sumar(numero1, numero2);

                    mostrarResultado(resultado);

                    guardarOperacion(
                            numero1 + " + " + numero2 + " = " + resultado
                    );

                    break;

                // =====================================
                // RESTA
                // =====================================
                case 2:

                    numero1 = pedirNumero(scanner, "Ingrese el primer número: ");
                    numero2 = pedirNumero(scanner, "Ingrese el segundo número: ");

                    resultado = restar(numero1, numero2);

                    mostrarResultado(resultado);

                    guardarOperacion(
                            numero1 + " - " + numero2 + " = " + resultado
                    );

                    break;

                // =====================================
                // MULTIPLICACIÓN
                // =====================================
                case 3:

                    numero1 = pedirNumero(scanner, "Ingrese el primer número: ");
                    numero2 = pedirNumero(scanner, "Ingrese el segundo número: ");

                    resultado = multiplicar(numero1, numero2);

                    mostrarResultado(resultado);

                    guardarOperacion(
                            numero1 + " * " + numero2 + " = " + resultado
                    );

                    break;

                // =====================================
                // DIVISIÓN
                // =====================================
                case 4:

                    numero1 = pedirNumero(scanner, "Ingrese el dividendo: ");
                    numero2 = pedirNumero(scanner, "Ingrese el divisor: ");

                    resultado = dividir(numero1, numero2);

                    mostrarResultado(resultado);

                    guardarOperacion(
                            numero1 + " / " + numero2 + " = " + resultado
                    );

                    break;

                // =====================================
                // POTENCIA
                // =====================================
                case 5:

                    numero1 = pedirNumero(scanner, "Ingrese la base: ");
                    numero2 = pedirNumero(scanner, "Ingrese el exponente: ");

                    resultado = potencia(numero1, numero2);

                    mostrarResultado(resultado);

                    guardarOperacion(
                            numero1 + " ^ " + numero2 + " = " + resultado
                    );

                    break;

                // =====================================
                // RAÍZ CUADRADA
                // =====================================
                case 6:

                    numero1 = pedirNumero(scanner, "Ingrese el número: ");

                    resultado = raizCuadrada(numero1);

                    mostrarResultado(resultado);

                    guardarOperacion(
                            "√" + numero1 + " = " + resultado
                    );

                    break;

                // =====================================
                // MÓDULO
                // =====================================
                case 7:

                    numero1 = pedirNumero(scanner, "Ingrese el primer número: ");
                    numero2 = pedirNumero(scanner, "Ingrese el segundo número: ");

                    resultado = modulo(numero1, numero2);

                    mostrarResultado(resultado);

                    guardarOperacion(
                            numero1 + " % " + numero2 + " = " + resultado
                    );

                    break;

                // =====================================
                // PORCENTAJE
                // =====================================
                case 8:

                    numero1 = pedirNumero(scanner, "Ingrese el porcentaje: ");
                    numero2 = pedirNumero(scanner, "Ingrese el valor total: ");

                    resultado = porcentaje(numero1, numero2);

                    mostrarResultado(resultado);

                    guardarOperacion(
                            numero1 + "% de " + numero2 + " = " + resultado
                    );

                    break;

                // =====================================
                // ÁREA DEL CÍRCULO
                // =====================================
                case 9:

                    numero1 = pedirNumero(scanner, "Ingrese el radio: ");

                    resultado = areaCirculo(numero1);

                    mostrarResultado(resultado);

                    guardarOperacion(
                            "Área círculo radio " + numero1 + " = " + resultado
                    );

                    break;

                // =====================================
                // MOSTRAR HISTORIAL
                // =====================================
                case 10:

                    mostrarHistorial();

                    break;

                // =====================================
                // SALIR DEL SISTEMA
                // =====================================
                case 11:

                    System.out.println("\nGracias por utilizar Advanced Calculator V2.");

                    break;

                // =====================================
                // OPCIÓN INVÁLIDA
                // =====================================
                default:

                    System.out.println("\nOpción inválida.");

            }

        } while (opcion != 11);

        // Cierra el Scanner
        scanner.close();
    }

    // Muestra el menú principal
    public static void mostrarMenu() {

        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║        ADVANCED CALCULATOR V2        ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║ 1. Sumar                             ║");
        System.out.println("║ 2. Restar                            ║");
        System.out.println("║ 3. Multiplicar                       ║");
        System.out.println("║ 4. Dividir                           ║");
        System.out.println("║ 5. Potencia                          ║");
        System.out.println("║ 6. Raíz cuadrada                     ║");
        System.out.println("║ 7. Módulo                            ║");
        System.out.println("║ 8. Porcentaje                        ║");
        System.out.println("║ 9. Área del círculo                  ║");
        System.out.println("║10. Ver historial                     ║");
        System.out.println("║11. Salir                             ║");
        System.out.println("╚══════════════════════════════════════╝");
    }

    // Solicita un número reutilizable
    public static double pedirNumero(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    // Muestra el resultado de una operación
    public static void mostrarResultado(double resultado) {
        System.out.println("\nResultado: " + resultado);
    }

    // Guarda una operación en el historial
    public static void guardarOperacion(String operacion) {
        historial[contadorHistorial] = operacion;
        contadorHistorial++;
    }

    // Muestra todas las operaciones realizadas
    public static void mostrarHistorial() {

        System.out.println("\n===== HISTORIAL =====");

        if (contadorHistorial == 0) {
            System.out.println("No existen operaciones registradas.");
            return;
        }

        for (int i = 0; i < contadorHistorial; i++) {
            System.out.println((i + 1) + ". " + historial[i]);
        }
    }

    // Suma dos números
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Resta dos números
    public static double restar(double a, double b) {
        return a - b;
    }

    // Multiplica dos números
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Divide dos números validando divisor cero
    public static double dividir(double a, double b) {

        if (b == 0) {
            System.out.println("No se puede dividir por cero.");
            return 0;
        }

        return a / b;
    }

    // Calcula una potencia
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    // Calcula raíz cuadrada validando negativos
    public static double raizCuadrada(double numero) {

        if (numero < 0) {
            System.out.println("No existe raíz cuadrada real para negativos.");
            return 0;
        }

        return Math.sqrt(numero);
    }

    // Calcula el módulo de una división
    public static double modulo(double a, double b) {

        if (b == 0) {
            System.out.println("No se puede calcular módulo con divisor cero.");
            return 0;
        }

        return a % b;
    }

    // Calcula un porcentaje
    public static double porcentaje(double porcentaje, double valor) {
        return (porcentaje / 100) * valor;
    }

    // Calcula el área de un círculo
    public static double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
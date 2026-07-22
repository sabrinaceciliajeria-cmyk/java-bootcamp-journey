import java.util.Scanner;

public class AdvancedCalculator {

    // =====================================
    // FUNCIÓN PRINCIPAL
    // Punto de entrada del programa
    // =====================================
    public static void main(String[] args) {

        // Permite leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Guarda la opción seleccionada del menú
        int opcion;

        // Menú principal del programa
        do {

            mostrarMenu();

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            double numero1;
            double numero2;
            double resultado;

            switch (opcion) {

                // =============================
                // SUMA
                // =============================
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    numero1 = scanner.nextDouble();

                    System.out.print("Ingrese el segundo número: ");
                    numero2 = scanner.nextDouble();

                    resultado = sumar(numero1, numero2);

                    System.out.println("Resultado: " + resultado);
                    break;

                // =============================
                // RESTA
                // =============================
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    numero1 = scanner.nextDouble();

                    System.out.print("Ingrese el segundo número: ");
                    numero2 = scanner.nextDouble();

                    resultado = restar(numero1, numero2);

                    System.out.println("Resultado: " + resultado);
                    break;

                // =============================
                // MULTIPLICACIÓN
                // =============================
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    numero1 = scanner.nextDouble();

                    System.out.print("Ingrese el segundo número: ");
                    numero2 = scanner.nextDouble();

                    resultado = multiplicar(numero1, numero2);

                    System.out.println("Resultado: " + resultado);
                    break;

                // =============================
                // DIVISIÓN
                // =============================
                case 4:
                    System.out.print("Ingrese el dividendo: ");
                    numero1 = scanner.nextDouble();

                    System.out.print("Ingrese el divisor: ");
                    numero2 = scanner.nextDouble();

                    resultado = dividir(numero1, numero2);

                    System.out.println("Resultado: " + resultado);
                    break;

                // =============================
                // POTENCIA
                // =============================
                case 5:
                    System.out.print("Ingrese la base: ");
                    numero1 = scanner.nextDouble();

                    System.out.print("Ingrese el exponente: ");
                    numero2 = scanner.nextDouble();

                    resultado = potencia(numero1, numero2);

                    System.out.println("Resultado: " + resultado);
                    break;

                // =============================
                // RAÍZ CUADRADA
                // =============================
                case 6:
                    System.out.print("Ingrese el número: ");
                    numero1 = scanner.nextDouble();

                    resultado = raizCuadrada(numero1);

                    System.out.println("Resultado: " + resultado);
                    break;

                // =============================
                // MÓDULO O RESIDUO
                // =============================
                case 7:
                    System.out.print("Ingrese el primer número: ");
                    numero1 = scanner.nextDouble();

                    System.out.print("Ingrese el segundo número: ");
                    numero2 = scanner.nextDouble();

                    resultado = modulo(numero1, numero2);

                    System.out.println("Resultado: " + resultado);
                    break;

                // =============================
                // SALIR DEL PROGRAMA
                // =============================
                case 8:
                    System.out.println("\nGracias por utilizar Advanced Calculator.");
                    break;

                // =============================
                // OPCIÓN INVÁLIDA
                // =============================
                default:
                    System.out.println("\nOpción inválida.");
            }

        } while (opcion != 8);

        scanner.close();
    }

    // =====================================
    // MUESTRA EL MENÚ PRINCIPAL
    // =====================================
    public static void mostrarMenu() {

        System.out.println("\n=================================");
        System.out.println("      ADVANCED CALCULATOR");
        System.out.println("=================================");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potencia");
        System.out.println("6. Raíz cuadrada");
        System.out.println("7. Módulo");
        System.out.println("8. Salir");
        System.out.println("=================================");
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

    // Divide dos números validando división por cero
    public static double dividir(double a, double b) {

        if (b == 0) {
            System.out.println("Error: no se puede dividir por cero.");
            return 0;
        }

        return a / b;
    }

    // Calcula una potencia
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    // Calcula la raíz cuadrada validando negativos
    public static double raizCuadrada(double numero) {

        if (numero < 0) {
            System.out.println("Error: no existe raíz cuadrada real para números negativos.");
            return 0;
        }

        return Math.sqrt(numero);
    }

    // Calcula el residuo de una división
    public static double modulo(double a, double b) {

        if (b == 0) {
            System.out.println("Error: no se puede calcular módulo con divisor cero.");
            return 0;
        }

        return a % b;
    }
}
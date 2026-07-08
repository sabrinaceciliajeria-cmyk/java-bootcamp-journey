import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== BOLETA INTELIGENTE ===");

        // ========================
        // PRODUCTO VENDIDO POR PESO
        // ========================
        System.out.print("\nIngrese nombre del producto por kilo: ");
        String productoPorPeso = scanner.nextLine();

        System.out.print("Precio por kilo ($): ");
        double precioPorKilo = scanner.nextDouble();

        System.out.print("Cantidad en kilos (ej: 1.3): ");
        double kilosComprados = scanner.nextDouble();

        double totalProductoPeso = precioPorKilo * kilosComprados;

        // ========================
        // PRODUCTO VENDIDO POR UNIDAD
        // ========================
        scanner.nextLine();

        System.out.print("\nIngrese nombre del producto unitario: ");
        String productoUnitario = scanner.nextLine();

        System.out.print("Precio unitario ($): ");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Cantidad: ");
        int cantidadProducto = scanner.nextInt();

        double totalProductoUnitario = precioUnitario * cantidadProducto;

        // ========================
        // CÁLCULO DE TOTALES
        // ========================
        double subtotal = totalProductoPeso + totalProductoUnitario;
        double iva = subtotal * 0.19;
        double totalFinal = subtotal + iva;

        // ========================
        // IMPRESIÓN DE BOLETA
        // ========================
        System.out.println("\n==============================");
        System.out.println("          BOLETA");
        System.out.println("==============================");

        System.out.printf("%s (%.2f kg): $%.0f%n",
                productoPorPeso,
                kilosComprados,
                totalProductoPeso);

        System.out.printf("%s x%d: $%.0f%n",
                productoUnitario,
                cantidadProducto,
                totalProductoUnitario);

        System.out.println("------------------------------");
        System.out.printf("Subtotal: $%.0f%n", subtotal);
        System.out.printf("IVA (19%%): $%.0f%n", iva);
        System.out.printf("TOTAL: $%.0f%n", totalFinal);

        System.out.println("\nGracias por su compra.");

        scanner.close();
    }
}
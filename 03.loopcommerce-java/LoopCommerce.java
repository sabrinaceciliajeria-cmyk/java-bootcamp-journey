
import java.util.Scanner;  // Importamos Scanner para leer datos desde teclado

public class LoopCommerce {

    
    public static void main(String[] args) {  // Aquí comienza la ejecución del programa

        // CONFIGURACIÓN INICIAL DEL SISTEMA

        Scanner scanner = new Scanner(System.in);

        // CATÁLOGO DE PRODUCTOS

        // Lista de productos disponibles
        String[] productos = {
                "Notebook",
                "Mouse Gamer",
                "Teclado Mecánico",
                "Monitor 27\"",
                "Audífonos"
        };

        // Precio correspondiente a cada producto
        double[] precios = {
                850000,
                25000,
                65000,
                220000,
                45000
        };


        // VARIABLES DEL SISTEMA

        
        int opcion;  // Guarda la opción seleccionada del menú
       
        double subtotal = 0;   // Acumula el valor total de la compra
       
        int productoSeleccionado;  // Guarda el producto seleccionado

       
        // MENÚ PRINCIPAL
     

        // El menú seguirá ejecutándose hasta que el usuario decida salir
        do {

            System.out.println("\n=================================");
            System.out.println("         LOOPCOMMERCE");
            System.out.println("=================================");

            System.out.println("1. Ver productos disponibles");
            System.out.println("2. Agregar productos al carrito");
            System.out.println("3. Ver subtotal actual");
            System.out.println("4. Realizar checkout");
            System.out.println("5. Salir");

            System.out.print("\nSeleccione una opción: ");
            opcion = scanner.nextInt();

          
            // CONTROL DEL MENÚ

            switch (opcion) {

                // MOSTRAR PRODUCTOS
                case 1:

                    System.out.println("\n===== PRODUCTOS DISPONIBLES =====");

                    int numeroProducto = 1;

                    // Recorremos el catálogo usando foreach
                    for (String producto : productos) {

                        System.out.printf(
                                "%d. %-20s $%.0f%n",
                                numeroProducto,
                                producto,
                                precios[numeroProducto - 1]
                        );

                        numeroProducto++;
                    }

                    break;


                // AGREGAR PRODUCTOS AL CARRITO
                case 2:

                    System.out.println("\n===== AGREGAR PRODUCTOS =====");

                    // Inicializamos la selección
                    productoSeleccionado = -1;

                    // Permitimos agregar productos hasta que el usuario ingrese 0
                    while (productoSeleccionado != 0) {

                        System.out.println("\nProductos disponibles:");

                        numeroProducto = 1;

                        // Mostramos nuevamente el catálogo
                        for (String producto : productos) {

                            System.out.printf(
                                    "%d. %-20s $%.0f%n",
                                    numeroProducto,
                                    producto,
                                    precios[numeroProducto - 1]
                            );

                            numeroProducto++;
                        }

                        System.out.println("0. Volver al menú");

                        System.out.print("\nSeleccione un producto: ");
                        productoSeleccionado = scanner.nextInt();

                        // Permite volver al menú principal
                        if (productoSeleccionado == 0) {
                            break;
                        }

                        // Validamos que el producto exista
                        if (productoSeleccionado >= 1
                                && productoSeleccionado <= productos.length) {

                            // Sumamos el precio del producto
                            subtotal += precios[productoSeleccionado - 1];

                            System.out.println(
                                    "\nProducto agregado correctamente."
                            );

                            System.out.println(
                                    "Subtotal actual: $" + subtotal
                            );

                        } else {

                            System.out.println(
                                    "\nProducto inválido."
                            );
                        }
                    }

                    break;

            
                // MOSTRAR SUBTOTAL
               
                case 3:

                    System.out.println("\n===== SUBTOTAL ACTUAL =====");
                    System.out.printf("Total acumulado: $%.0f%n", subtotal);

                    break;

                
                // PROCESO DE CHECKOUT
                
                case 4:

                    // Validamos que existan productos
                    if (subtotal == 0) {

                        System.out.println(
                                "\nNo existen productos en el carrito."
                        );

                    } else {

                        System.out.println(
                                "\n===== INICIANDO CHECKOUT ====="
                        );

                        // Pasos del proceso de compra
                        String[] pasosCheckout = {
                                "Validando stock...",
                                "Confirmando datos del cliente...",
                                "Procesando pago...",
                                "Generando envío..."
                        };

                        // Simulamos el proceso utilizando for
                        for (int i = 0; i < pasosCheckout.length; i++) {

                            System.out.println(
                                    (i + 1) + ". " + pasosCheckout[i]
                            );
                        }

                        // Calculamos IVA y total
                        double iva = subtotal * 0.19;
                        double total = subtotal + iva;

                        System.out.println(
                                "\n===== RESUMEN DE COMPRA ====="
                        );

                        System.out.printf(
                                "Subtotal : $%.0f%n",
                                subtotal
                        );

                        System.out.printf(
                                "IVA (19%%): $%.0f%n",
                                iva
                        );

                        System.out.printf(
                                "TOTAL    : $%.0f%n",
                                total
                        );

                        System.out.println(
                                "\nCompra realizada exitosamente."
                        );

                        // Reiniciamos el carrito
                        subtotal = 0;
                    }

                    break;

               
                // SALIR DEL SISTEMA
                
                case 5:

                    System.out.println(
                            "\nGracias por utilizar LoopCommerce."
                    );

                    break;

                
                // OPCIÓN INVÁLIDA
                
                default:

                    System.out.println(
                            "\nOpción inválida."
                    );

            }

        } while (opcion != 5);

        // Cerramos Scanner para liberar recursos
        scanner.close();
    }
}
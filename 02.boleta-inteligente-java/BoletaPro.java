

import java.util.ArrayList;
import java.util.Scanner;

public class BoletaPro {

    public static void main(String[] args) {

        // ===============================
        // CONFIGURACIÓN INICIAL
        // ===============================

        Scanner scanner = new Scanner(System.in);


        // ===============================
        // CATÁLOGO DE PRODUCTOS
        // ===============================

        // Guardamos los nombres de los productos disponibles
        String[] productosDisponibles = {
                "pan",
                "leche",
                "manzana",
                "arroz",
                "huevo"
        };


        // Guardamos la unidad de venta de cada producto
        String[] unidades = {
                "kg",
                "litro",
                "kg",
                "kg",
                "unidad"
        };


        // Guardamos el precio asociado a cada producto
        double[] precios = {
                3000,
                1200,
                2500,
                1800,
                250
        };


        // ===============================
        // DATOS DE LA COMPRA
        // ===============================

        ArrayList<String> productosComprados = new ArrayList<>();
        ArrayList<String> unidadesCompradas = new ArrayList<>();
        ArrayList<Double> cantidadesCompradas = new ArrayList<>();
        ArrayList<Double> preciosComprados = new ArrayList<>();
        ArrayList<Double> totalesProductos = new ArrayList<>();


        double subtotal = 0;
        int opcion;



        // ===============================
        // MENÚ PRINCIPAL
        // ===============================

        do {

            mostrarMenu();

            opcion = scanner.nextInt();


            switch (opcion) {


                // ===============================
                // MOSTRAR PRODUCTOS DISPONIBLES
                // ===============================

                case 1:

                    mostrarProductos(
                            productosDisponibles,
                            unidades,
                            precios
                    );

                    break;



                // ===============================
                // AGREGAR PRODUCTO
                // ===============================

                case 2:

                    scanner.nextLine();


                    System.out.print(
                            "\nIngrese producto: "
                    );

                    String producto = scanner.nextLine()
                            .toLowerCase();



                    // Buscamos el producto dentro del catálogo
                    int posicion = buscarProducto(
                            producto,
                            productosDisponibles
                    );


                    if (posicion == -1) {

                        System.out.println(
                                "\nProducto no encontrado."
                        );


                    } else {


                        System.out.print(
                                "Ingrese cantidad: "
                        );

                        double cantidad =
                                scanner.nextDouble();



                        // Obtenemos automáticamente
                        // el precio guardado
                        double precio =
                                precios[posicion];



                        double total =
                                precio * cantidad;



                        // Guardamos la información
                        // de la compra realizada
                        productosComprados.add(
                                productosDisponibles[posicion]
                        );

                        unidadesCompradas.add(
                                unidades[posicion]
                        );

                        cantidadesCompradas.add(
                                cantidad
                        );

                        preciosComprados.add(
                                precio
                        );

                        totalesProductos.add(
                                total
                        );


                        subtotal += total;



                        System.out.println(
                                "\nProducto agregado correctamente."
                        );

                    }


                    break;



                // ===============================
                // MOSTRAR BOLETA
                // ===============================

                case 3:

                    mostrarBoleta(
                            productosComprados,
                            unidadesCompradas,
                            cantidadesCompradas,
                            preciosComprados,
                            totalesProductos,
                            subtotal
                    );


                    break;



                // ===============================
                // SALIR
                // ===============================

                case 4:

                    System.out.println(
                            "\nCerrando Boleta Pro..."
                    );

                    break;



                default:

                    System.out.println(
                            "\nOpción inválida."
                    );

            }


        } while (opcion != 4);



        scanner.close();

    }



    // ===============================
    // MOSTRAR MENÚ
    // ===============================

    public static void mostrarMenu() {


        System.out.println("""

                =====================================
                     🛒 BOLETA PRO JAVA
                =====================================

                1. Ver productos
                2. Comprar producto
                3. Finalizar compra
                4. Salir

                Seleccione opción:
                """);

    }



    // ===============================
    // MOSTRAR CATÁLOGO
    // ===============================

    public static void mostrarProductos(
            String[] productos,
            String[] unidades,
            double[] precios) {


        System.out.println("""

                =====================================
                    PRODUCTOS DISPONIBLES
                =====================================
                """);


        for (int i = 0; i < productos.length; i++) {


            System.out.printf(
                    "%d. %-10s %s  $%.0f%n",
                    i + 1,
                    productos[i],
                    unidades[i],
                    precios[i]
            );

        }


        System.out.println(
                "====================================="
        );

    }



    // ===============================
    // BUSCAR PRODUCTO
    // ===============================

    public static int buscarProducto(
            String producto,
            String[] productos) {


        for (int i = 0; i < productos.length; i++) {


            if (productos[i].equals(producto)) {

                return i;

            }

        }


        return -1;

    }



    // ===============================
    // GENERAR BOLETA
    // ===============================

    public static void mostrarBoleta(
            ArrayList<String> productos,
            ArrayList<String> unidades,
            ArrayList<Double> cantidades,
            ArrayList<Double> precios,
            ArrayList<Double> totales,
            double subtotal) {



        double iva = subtotal * 0.19;

        double totalFinal =
                subtotal + iva;



        System.out.println("""

                =========================================
                    🧾 SUPERMERCADO JAVA
                =========================================

                Producto       Cantidad    Precio   Total
                -----------------------------------------
                """);



        for (int i = 0; i < productos.size(); i++) {


            System.out.printf(
                    "%-14s %.2f %-5s $%.0f   $%.0f%n",
                    productos.get(i),
                    cantidades.get(i),
                    unidades.get(i),
                    precios.get(i),
                    totales.get(i)
            );

        }



        System.out.println(
                "-----------------------------------------"
        );


        System.out.printf(
                "NETO:                         $%.0f%n",
                subtotal
        );


        System.out.printf(
                "IVA (19%%):                    $%.0f%n",
                iva
        );


        System.out.printf(
                "TOTAL:                         $%.0f%n",
                totalFinal
        );



        System.out.println("""

                =========================================
                     GRACIAS POR SU COMPRA
                =========================================
                """);

    }

}
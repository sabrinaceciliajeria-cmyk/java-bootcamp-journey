
// Permite utilizar la clase Scanner para leer datos desde el teclado
import java.util.Scanner;

// Define la clase principal del programa
public class RPGMenuSimulator {

    // Punto de entrada del programa
    public static void main(String[] args) {

        // =====================================
// PASO 1 - VARIABLES DEL SISTEMA
// =====================================

// Permite leer datos ingresados por el usuario
Scanner scanner = new Scanner(System.in);

// Guarda la opción seleccionada en el menú
int opcion;

// Variables del personaje
String nombre = "";
String clase = "";
int vida = 0;
int fuerza = 0;

// Indica si el personaje ya fue creado
boolean personajeCreado = false;

// Inventario inicial del jugador
String[] inventario = {
    "🧪 Poción",
    "🪓 Hacha",
    "📜 Pergamino",
    "🗝 Llave Antigua"
};

// =====================================
// PASO 2 - MENÚ PRINCIPAL
// =====================================

do {

    System.out.println("\n======================================");
    System.out.println("      ⚔️ RPG CONSOLE SIMULATOR");
    System.out.println("======================================");
    System.out.println("1. Crear personaje");
    System.out.println("2. Entrenar");
    System.out.println("3. Batalla");
    System.out.println("4. Inventario");
    System.out.println("5. Estado del personaje");
    System.out.println("6. Salir");
    System.out.println("======================================");
    System.out.print("Seleccione una opción: ");

    opcion = scanner.nextInt();

    switch (opcion) {

        // Aquí irán los casos

    case 1:

    scanner.nextLine();

    System.out.print("\nIngrese el nombre del personaje: ");
    nombre = scanner.nextLine();

    System.out.println("\nSeleccione una clase:");
    System.out.println("1. Guerrero");
    System.out.println("2. Mago");
    System.out.println("3. Arquero");

    int opcionClase = scanner.nextInt();

    if (opcionClase == 1) {
        clase = "Guerrero";
    } else if (opcionClase == 2) {
        clase = "Mago";
    } else if (opcionClase == 3) {
        clase = "Arquero";
    } else {
        System.out.println("Clase inválida.");
        break;
    }

    System.out.print("Vida inicial: ");
    vida = scanner.nextInt();

    if (vida <= 0) {
        System.out.println("Valor inválido. Se asignarán 100 puntos.");
        vida = 100;
    }

    System.out.print("Fuerza inicial: ");
    fuerza = scanner.nextInt();

    if (fuerza <= 0) {
        System.out.println("Valor inválido. Se asignarán 10 puntos.");
        fuerza = 10;
    }

    personajeCreado = true;

    System.out.println("\n✅ Personaje creado correctamente.");

    break;

    // =====================================
// PASO 4 - ENTRENAMIENTO
// =====================================

case 2:

    if (!personajeCreado) {
        System.out.println("\nPrimero debes crear un personaje.");
        break;
    }

    int entrenamiento = -1;

    while (entrenamiento != 0) {

        System.out.println("\n===== ENTRENAMIENTO =====");
        System.out.println("1. +5 Fuerza");
        System.out.println("2. +10 Vida");
        System.out.println("0. Volver");
        System.out.print("Seleccione una opción: ");

        entrenamiento = scanner.nextInt();

        if (entrenamiento == 1) {

            fuerza += 5;
            System.out.println("💪 Fuerza aumentada.");

        } else if (entrenamiento == 2) {

            vida += 10;
            System.out.println("❤️ Vida aumentada.");

        } else if (entrenamiento == 0) {

            System.out.println("Entrenamiento finalizado.");

        } else {

            System.out.println("Opción inválida.");

        }

    }

    break;

    // =====================================
// PASO 5 - PREPARAR BATALLA
// =====================================

case 3:

    if (!personajeCreado) {
        System.out.println("\nPrimero debes crear un personaje.");
        break;
    }

    // Vida inicial del enemigo
    int vidaEnemigo = 80;

    // Fuerza del enemigo
    int fuerzaEnemigo = 8;

    System.out.println("\n⚔️ ¡Comienza la batalla!");

    // =====================================
// PASO 6 - BATALLA
// =====================================

for (int turno = 1; turno <= 5; turno++) {

    if (vida <= 0 || vidaEnemigo <= 0) {
        break;
    }

    System.out.println("\n========== TURNO " + turno + " ==========");

    vidaEnemigo -= fuerza;

    System.out.println("⚔️ Atacas al enemigo.");
    System.out.println("Daño realizado: " + fuerza);

    if (vidaEnemigo <= 0) {

        System.out.println("\n🏆 ¡Has derrotado al enemigo!");
        break;

    }

    vida -= fuerzaEnemigo;

    System.out.println("👹 El enemigo contraataca.");
    System.out.println("Daño recibido: " + fuerzaEnemigo);

    System.out.println("❤️ Vida jugador: " + vida);
    System.out.println("👹 Vida enemigo: " + vidaEnemigo);

}

// =====================================
// PASO 7 - RESULTADO DE LA BATALLA
// =====================================

System.out.println("\n==============================");

if (vidaEnemigo <= 0) {

    System.out.println("🏆 ¡Victoria!");

} else if (vida <= 0) {

    System.out.println("☠️ Has sido derrotado.");

} else {

    System.out.println("⚠️ La batalla terminó sin ganador.");

}

System.out.println("==============================");

break;

// =====================================
// PASO 8 - INVENTARIO
// =====================================

case 4:

    if (!personajeCreado) {
        System.out.println("\nPrimero debes crear un personaje.");
        break;
    }

    System.out.println("\n===== INVENTARIO =====");

    int numeroObjeto = 1;

    for (String objeto : inventario) {

        System.out.println(numeroObjeto + ". " + objeto);

        numeroObjeto++;

    }

    break;

    // =====================================
// PASO 9 - ESTADO DEL PERSONAJE
// =====================================

case 5:

    if (!personajeCreado) {
        System.out.println("\nPrimero debes crear un personaje.");
        break;
    }

    System.out.println("\n=========== PERSONAJE ===========");

    System.out.println("Nombre : " + nombre);
    System.out.println("Clase  : " + clase);
    System.out.println("Vida   : ❤️ " + vida);
    System.out.println("Fuerza : ⚔️ " + fuerza);

    if (vida > 80) {

        System.out.println("\nEstado: 🟢 Excelente");

    } else if (vida > 40) {

        System.out.println("\nEstado: 🟡 Moderado");

    } else {

        System.out.println("\nEstado: 🔴 Herido");

    }

    break;

    // =====================================
// PASO 10 - SALIR DEL JUEGO
// =====================================

case 6:

    System.out.println("\n======================================");
    System.out.println(" Gracias por jugar RPG Simulator");
    System.out.println(" ¡Hasta la próxima aventura!");
    System.out.println("======================================");

    break;

default:

    System.out.println("\n❌ Opción inválida.");

    }

} while (opcion != 6);

// Cerrar el scanner
scanner.close();

    }

}
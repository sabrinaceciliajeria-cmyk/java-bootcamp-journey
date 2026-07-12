# 03 - LoopCommerce: E-Commerce Simulator en Consola

## Objetivo

Desarrollar una aplicación de consola que simule las operaciones básicas de un e-commerce utilizando las principales estructuras de repetición de Java.

Esta actividad tiene como objetivo reforzar el uso de:

* `while`
* `do-while`
* `for`
* `for-each`
* `Scanner`
* Variables y operadores
* Condicionales

Todo ello aplicado en un escenario realista y cercano a una aplicación comercial.

---

# Conceptos trabajados

* Variables
* Arrays
* Scanner
* Operadores aritméticos
* Operadores lógicos
* Acumuladores
* `if / else`
* `switch`
* `while`
* `do-while`
* `for`
* `for-each`
* `.gitignore`
* Git y GitHub

---

# Explicación del funcionamiento

El programa simula una pequeña tienda online desde la consola.

El usuario interactúa mediante un menú principal que permanece activo hasta seleccionar la opción de salida.

## 1. Ver productos disponibles

Los productos se almacenan en arreglos y se recorren utilizando un `for-each`.

Se muestra:

* Nombre del producto.
* Precio.
* Número identificador.

---

## 2. Agregar productos al carrito

El usuario puede agregar múltiples productos utilizando un ciclo `while`.

El proceso continúa hasta que el usuario ingresa:

```text
0
```

Cada producto agregado incrementa automáticamente el subtotal de la compra.

---

## 3. Ver subtotal actual

Muestra el monto acumulado de todos los productos agregados al carrito.

---

## 4. Realizar checkout

El proceso de compra se simula utilizando un ciclo `for`.

El sistema ejecuta cuatro etapas:

1. Validación de stock.
2. Confirmación de datos del cliente.
3. Procesamiento del pago.
4. Generación del envío.

Finalmente se calcula:

* Subtotal.
* IVA (19%).
* Total final.

---

## 5. Salir

Finaliza la ejecución del programa y cierra el sistema.

---

# Estructura del proyecto

```text
03.loopcommerce-java/
│
├── LoopCommerce.java
├── README.md
└── .gitignore
```

---

# ¿Qué es el archivo `.gitignore`?

El archivo `.gitignore` permite indicar a Git qué archivos o carpetas no deben ser incluidos dentro del repositorio.

Esto es especialmente útil para evitar subir:

* Archivos compilados.
* Configuraciones personales del entorno de desarrollo.
* Archivos temporales.
* Logs del sistema.

Mantener un `.gitignore` correctamente configurado ayuda a mantener el repositorio limpio, profesional y portable entre distintos equipos y sistemas operativos.

---

# Contenido del `.gitignore`

```gitignore
# Ignora los archivos compilados de Java (.class)
*.class

# Ignora archivos de registro generados por aplicaciones
*.log

# Ignora carpetas utilizadas para compilaciones o builds
bin/
out/

# Ignora archivos ocultos creados por macOS
.DS_Store

# Ignora configuraciones locales del IDE IntelliJ IDEA
.idea/
```

---

# Tecnologías utilizadas

* Java 21
* Scanner
* Git
* GitHub

---

# Cómo ejecutar el proyecto

Compilar:

```bash
javac LoopCommerce.java
```

Ejecutar:

```bash
java LoopCommerce
```

---

# Ejemplo de ejecución

```text
=================================
         LOOPCOMMERCE
=================================

1. Ver productos disponibles
2. Agregar productos al carrito
3. Ver subtotal actual
4. Realizar checkout
5. Salir

Seleccione una opción:
```

Ejemplo de compra:

```text
Seleccione una opción: 2

Seleccione un producto: 2
Producto agregado correctamente.

Subtotal actual: $25000
```

Checkout:

```text
===== INICIANDO CHECKOUT =====

1. Validando stock...
2. Confirmando datos del cliente...
3. Procesando pago...
4. Generando envío...

===== RESUMEN DE COMPRA =====

Subtotal : $70000
IVA (19%): $13300
TOTAL    : $83300
```

---

# Tabla de conceptos utilizados

| Elemento    | Tipo                  | Función                           |
| ----------- | --------------------- | --------------------------------- |
| `Scanner`   | Clase                 | Permite leer datos desde teclado  |
| `String[]`  | Array                 | Almacena nombres de productos     |
| `double[]`  | Array                 | Almacena precios de productos     |
| `double`    | Tipo primitivo        | Almacena números decimales        |
| `do-while`  | Loop                  | Mantiene activo el menú principal |
| `while`     | Loop                  | Permite agregar varios productos  |
| `for-each`  | Loop                  | Recorre el catálogo de productos  |
| `for`       | Loop                  | Simula el proceso de checkout     |
| `if / else` | Condicional           | Valida opciones y estados         |
| `switch`    | Estructura de control | Gestiona el menú principal        |
| `+=`        | Operador              | Acumula el subtotal de la compra  |

---

# Elementos utilizados en el `.gitignore`

| Elemento    | Función                                         |
| ----------- | ----------------------------------------------- |
| `*.class`   | Ignora archivos compilados de Java              |
| `*.log`     | Ignora archivos de registro o logs              |
| `bin/`      | Ignora carpetas de compilación                  |
| `out/`      | Ignora salidas de build del proyecto            |
| `.DS_Store` | Ignora archivos del sistema macOS               |
| `.idea/`    | Ignora configuraciones locales de IntelliJ IDEA |

---

# Aprendizajes obtenidos

Al completar esta actividad se fortalecen conocimientos relacionados con:

* Uso práctico de todos los tipos principales de loops.
* Gestión del flujo de un programa interactivo.
* Uso de arreglos para almacenar información relacionada.
* Acumulación y cálculo de valores.
* Organización básica de proyectos Java.
* Uso inicial de `.gitignore` para mantener repositorios limpios.

---

# Posibles mejoras

* Permitir seleccionar cantidades por producto.
* Implementar un carrito utilizando `ArrayList`.
* Permitir eliminar productos del carrito.
* Agregar descuentos y promociones.
* Mostrar el detalle completo de la compra.
* Migrar el proyecto a Programación Orientada a Objetos utilizando clases como:

  * `Producto`
  * `Carrito`
  * `Pedido`
  * `Cliente`

---

# Aprendizaje clave

Cada estructura de repetición tiene un propósito distinto:

| Loop       | Uso en el proyecto |
| ---------- | ------------------ |
| `do-while` | Menú principal     |
| `while`    | Agregar productos  |
| `for-each` | Mostrar catálogo   |
| `for`      | Simular checkout   |

Comprender cuándo utilizar cada uno es uno de los fundamentos más importantes en programación.

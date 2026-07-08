# 02 - Boleta Inteligente en Java

## Objetivo

Crear un programa que simule el funcionamiento básico de una boleta de supermercado utilizando Java.

La actividad permite comprender cómo utilizar variables, tipos de datos numéricos y operaciones matemáticas para resolver un problema del mundo real: calcular el valor de productos vendidos por peso y por unidad.

Además, incorpora un desafío adicional donde se evoluciona el programa hacia una pequeña aplicación de ventas con catálogo de productos, carrito de compra y generación de boleta.

---

# Conceptos trabajados

## Actividad principal

* Variables
* Tipos de datos
* `double`
* `int`
* Operaciones matemáticas
* Entrada de datos con `Scanner`
* Cálculo de precios
* Porcentajes
* IVA
* `System.out.printf()`

## Desafío: Boleta Pro

* Arreglos (`Arrays`)
* `ArrayList`
* Menús interactivos
* Búsqueda de información
* Catálogo de productos
* Almacenamiento temporal de datos
* Formato de salida en consola
* Métodos

---

# Explicación del funcionamiento

## Boleta Inteligente

El programa solicita información de productos y calcula automáticamente su valor.

Para productos vendidos por peso utiliza:

```text
Precio por kilo × cantidad comprada
```

Ejemplo:

```text
Pan
Precio: $3000 por kilo
Cantidad: 1.3 kg

3000 × 1.3 = 3900
```

También permite agregar un producto vendido por unidad:

```text
Precio unitario × cantidad
```

Finalmente calcula:

```text
Subtotal
IVA (19%)
Total final
```

---

# Desafío adicional: Boleta Pro

La versión Pro transforma el ejercicio en un pequeño sistema de ventas.

## Nuevas funcionalidades

### Catálogo de productos

Los productos ya tienen información almacenada dentro del programa:

| Producto | Unidad | Precio |
| -------- | ------ | ------ |
| Pan      | kg     | $3000  |
| Leche    | litro  | $1200  |
| Manzana  | kg     | $2500  |
| Arroz    | kg     | $1800  |
| Huevo    | unidad | $250   |

El usuario solamente selecciona el producto y la cantidad.

El sistema busca automáticamente el precio correspondiente.

---

### Carrito de compra

Los productos seleccionados se almacenan temporalmente utilizando listas:

```java
ArrayList
```

Se guarda:

* Nombre del producto.
* Unidad de venta.
* Cantidad.
* Precio.
* Total del producto.

---

### Generación de boleta

Al finalizar la compra se genera una salida similar a una boleta real:

```text
=========================================
        🧾 SUPERMERCADO JAVA
=========================================

Producto       Cantidad    Precio   Total
-----------------------------------------
leche          2 litro     $1200    $2400
pan            1.30 kg     $3000    $3900

-----------------------------------------
NETO:                         $6300
IVA (19%):                    $1197
TOTAL:                        $7497

=========================================
```

---

# Estructura del proyecto

```text
02.boleta-inteligente-java/
│
├── Main.java
├── README.md
│
└── desafios/
    │
    └── BoletaPro.java
```

---

# Cómo ejecutar el proyecto

## Ejecutar actividad principal

Compilar:

```bash
javac Main.java
```

Ejecutar:

```bash
java Main
```

---

## Ejecutar desafío Boleta Pro

Como el archivo pertenece al paquete `desafios`:

Compilar desde la carpeta principal:

```bash
javac desafios\BoletaPro.java
```

Ejecutar:

```bash
java desafios.BoletaPro
```

---

# Ejemplo de ejecución

## Boleta Pro

```text
=====================================
     🛒 BOLETA PRO JAVA
=====================================

1. Ver productos
2. Comprar producto
3. Finalizar compra
4. Salir

Seleccione opción:
```

Ejemplo de compra:

```text
Producto:
leche

Cantidad:
2
```

Resultado:

```text
Producto agregado correctamente.
```

Boleta final:

```text
Producto       Cantidad    Precio   Total
-----------------------------------------
leche          2 litro     $1200    $2400
pan             1.30 kg    $3000    $3900

-----------------------------------------
NETO:                         $6300
IVA (19%):                    $1197
TOTAL:                        $7497
```

---

# Tabla de conceptos utilizados

| Elemento    | Tipo                | Función                           |
| ----------- | ------------------- | --------------------------------- |
| `double`    | Tipo primitivo      | Guarda números decimales          |
| `int`       | Tipo primitivo      | Guarda números enteros            |
| `String`    | Clase               | Representa texto                  |
| `Scanner`   | Clase               | Permite leer datos del teclado    |
| `ArrayList` | Colección           | Guarda elementos dinámicamente    |
| `Array`     | Estructura de datos | Guarda valores relacionados       |
| `for`       | Bucle               | Recorre elementos                 |
| `switch`    | Control             | Ejecuta opciones del menú         |
| `if`        | Condicional         | Permite tomar decisiones          |
| `printf()`  | Método              | Permite mostrar datos con formato |
| `package`   | Organización        | Agrupa clases relacionadas        |
| `return`    | Instrucción         | Devuelve un valor desde un método |

---

# Aprendizajes obtenidos

Al completar esta actividad el estudiante logra:

* Aplicar variables en un problema real.
* Trabajar con números decimales.
* Comprender cálculos comerciales.
* Utilizar métodos para organizar código.
* Crear menús interactivos.
* Trabajar con arreglos y listas.
* Diseñar una pequeña lógica de ventas.
* Entender cómo un programa puede evolucionar desde algo simple hacia un sistema más completo.

---

# Posibles mejoras

* Crear una clase `Producto`.
* Crear una clase `Carrito`.
* Guardar las boletas en archivos.
* Agregar clientes.
* Generar número de boleta.
* Agregar descuentos.
* Crear historial de compras.
* Conectar con una base de datos.

---

# Próxima evolución

La siguiente versión del proyecto puede convertirse en:

## Boleta Pro orientada a objetos

Incorporando:

* Clases.
* Objetos.
* Encapsulamiento.
* Constructores.
* Métodos de instancia.

Ejemplo:

```text
Producto.java
Carrito.java
Boleta.java
```

Esta evolución permitirá acercarse a la construcción de aplicaciones reales utilizando Java.

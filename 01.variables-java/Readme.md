# 01 - Variables en Java

## Objetivo

Comprender cómo funcionan las variables en Java, conocer los tipos de datos primitivos y sus correspondientes Wrapper Classes, además de practicar la entrada y salida de datos mediante consola utilizando `Scanner`.

---

## Conceptos trabajados

* Variables
* Tipos primitivos
* Wrapper Classes
* Métodos
* `Scanner`
* Menús interactivos
* `switch`
* Bucles `do-while`
* Entrada y salida por consola
* `System.out.print()`
* `System.out.println()`
* `System.out.printf()`

---

## Explicación del funcionamiento

El programa muestra un menú interactivo con varias opciones.

### Opción 1: Tipos primitivos

Se crean variables utilizando todos los tipos primitivos principales de Java y se muestran sus valores en pantalla.

El objetivo es comprender qué tipo de información puede almacenar cada uno.

---

### Opción 2: Wrapper Classes

Se crean objetos equivalentes a los tipos primitivos utilizando las Wrapper Classes.

Esto permite entender la diferencia entre trabajar con valores simples y trabajar con objetos.

---

### Opción 3: Ingreso de datos por teclado

El usuario introduce:

* Un número entero.
* Un número decimal.
* Un texto.

Posteriormente el programa muestra la información ingresada.

---

### Opción 4: Salir

Finaliza la ejecución del programa.

---

## Estructura del proyecto

```text
01.variables-java/
│
├── Main.java
└── README.md
```

---

## Cómo ejecutar el proyecto

Compilar el programa:

```bash
javac Main.java
```

Ejecutar el programa:

```bash
java Main
```

---

## Ejemplo de ejecución

```text
=== MENÚ DE VARIABLES ===
1. Tipos Primitivos
2. Wrapper Classes
3. Ingresar datos por teclado
4. Salir
Seleccione una opción: 1

--- TIPOS PRIMITIVOS ---
byte: 127
short: 32000
int: 100000
long: 10000000000
float: 3.14
double: 3.1415926535
char: A
boolean: true
```

Ejemplo del ingreso de datos:

```text
Seleccione una opción: 3

--- INGRESO DE DATOS ---

Ingrese un número entero: 25
Ingrese un número decimal: 3.14
Ingrese un texto: Hola Bootcamp

Datos ingresados:
Entero: 25
Decimal: 3.14
Texto: Hola Bootcamp
```

---

## Tabla de conceptos utilizados

| Elemento               | Tipo                     | Función                                        |
| ---------------------- | ------------------------ | ---------------------------------------------- |
| `byte`                 | Tipo primitivo           | Almacena números enteros pequeños              |
| `short`                | Tipo primitivo           | Almacena números enteros de tamaño medio       |
| `int`                  | Tipo primitivo           | Almacena números enteros                       |
| `long`                 | Tipo primitivo           | Almacena números enteros grandes               |
| `float`                | Tipo primitivo           | Almacena números decimales                     |
| `double`               | Tipo primitivo           | Almacena números decimales con mayor precisión |
| `char`                 | Tipo primitivo           | Almacena un único carácter                     |
| `boolean`              | Tipo primitivo           | Almacena `true` o `false`                      |
| `Byte`                 | Wrapper Class            | Versión objeto de `byte`                       |
| `Integer`              | Wrapper Class            | Versión objeto de `int`                        |
| `Double`               | Wrapper Class            | Versión objeto de `double`                     |
| `Character`            | Wrapper Class            | Versión objeto de `char`                       |
| `Scanner`              | Clase                    | Permite leer datos desde teclado               |
| `nextInt()`            | Método                   | Lee números enteros                            |
| `nextDouble()`         | Método                   | Lee números decimales                          |
| `nextLine()`           | Método                   | Lee texto completo                             |
| `switch`               | Estructura de control    | Ejecuta acciones según la opción seleccionada  |
| `do-while`             | Estructura de repetición | Repite el menú hasta salir                     |
| `System.out.print()`   | Método                   | Imprime texto sin salto de línea               |
| `System.out.println()` | Método                   | Imprime texto con salto de línea               |
| `System.out.printf()`  | Método                   | Imprime texto utilizando formato               |

---

## Aprendizajes obtenidos

Al finalizar esta actividad el estudiante será capaz de:

* Declarar variables utilizando distintos tipos de datos.
* Comprender la diferencia entre tipos primitivos y objetos.
* Utilizar Wrapper Classes.
* Leer información desde teclado.
* Crear menús interactivos.
* Utilizar estructuras `switch`.
* Organizar código utilizando métodos.

---

## Posibles mejoras

* Mostrar el tamaño en bytes de cada tipo utilizando constantes como `Integer.BYTES`.
* Mostrar los valores máximos y mínimos de cada tipo usando `Integer.MAX_VALUE` y `Integer.MIN_VALUE`.
* Incorporar validación de entradas.
* Permitir repetir automáticamente las demostraciones.
* Agregar una opción para utilizar `printf()` y practicar formatos de impresión.

---

## Desafíos adicionales

1. Mostrar el rango mínimo y máximo de cada tipo numérico.
2. Permitir que el usuario ingrese valores para cada tipo primitivo.
3. Crear una opción que convierta un texto numérico a entero utilizando `Integer.parseInt()`.
4. Mostrar ejemplos de autoboxing y unboxing.

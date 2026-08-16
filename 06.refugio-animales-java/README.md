# 06 - Refugio de Animales en Java

## 🎯 Objetivo

Desarrollar un sistema sencillo en consola para gestionar los animales de un refugio utilizando diferentes **estructuras de datos de Java**.

El objetivo principal de esta actividad es aprender a organizar y relacionar información utilizando `List`, `Map`, `Set` y arreglos.

Esta actividad representa un paso importante antes de comenzar con la **Programación Orientada a Objetos (POO)**, ya que permite practicar cómo organizar los datos y la lógica de un programa antes de trabajar con clases y objetos.

---

## 📚 Conceptos trabajados

- `List`
- `ArrayList`
- `Map`
- `HashMap`
- `Set`
- `HashSet`
- Arreglos (`Array`)
- `Scanner`
- `do-while`
- `switch`
- `if / else`
- `for`
- Métodos `static`
- Validaciones
- Recorridos de colecciones
- Relación entre diferentes estructuras de datos
- Organización de información
- Reportes en consola

---

## 📂 Estructura del proyecto

```text
06.RefugioAnimales/
│
├── RefugioAnimales.java
├── README.md
└── .gitignore
```

---

## ⚙️ Funcionalidades

El programa permite administrar animales rescatados mediante un menú en consola.

### Menú principal

```text
=== REFUGIO DE ANIMALES ===
1. Registrar animal
2. Registrar especie
3. Marcar animal como adoptado
4. Mostrar animales disponibles
5. Mostrar animales adoptados
6. Mostrar reporte general
7. Salir
```

---

### Registrar animal

Permite ingresar:

- Nombre del animal.
- Especie.

Antes de registrarlo, el programa verifica que:

- La especie exista.
- El animal no esté registrado anteriormente.

Cuando se registra correctamente, el animal comienza con el estado:

```text
Disponible
```

---

### Registrar especie

Permite agregar nuevas especies al refugio.

Las especies se almacenan en un `Set`, por lo que no se permiten duplicados.

Por ejemplo:

```text
Perro
Gato
Conejo
```

Si se intenta registrar nuevamente:

```text
Perro
```

el `Set` evita que aparezca dos veces.

---

### Marcar animal como adoptado

Permite seleccionar uno de los animales disponibles y cambiar su estado:

```text
Disponible
```

a:

```text
Adoptado
```

El programa también valida que el animal exista y que esté disponible antes de realizar el cambio.

---

### Mostrar animales disponibles

Muestra únicamente los animales cuyo estado sea:

```text
Disponible
```

Por ejemplo:

```text
Animales disponibles:

Firulais
Mishi
Rocky
```

---

### Mostrar animales adoptados

Muestra únicamente los animales cuyo estado sea:

```text
Adoptado
```

Por ejemplo:

```text
Animales adoptados:

Luna
Toby
```

---

### Reporte general

Muestra un resumen de la información almacenada.

Incluye:

- Total de animales.
- Total de animales disponibles.
- Total de animales adoptados.
- Nombre del animal.
- Especie.
- Estado.

Ejemplo:

```text
===== REPORTE GENERAL =====

Total de animales: 3
Disponibles: 2
Adoptados: 1

Nombre     | Especie | Estado
--------------------------------
Firulais   | Perro   | Disponible
Mishi      | Gato    | Adoptado
Rocky      | Perro   | Disponible
```

---

## 🧩 Estructuras de datos utilizadas

Una de las partes más importantes de esta actividad es comprender que **cada estructura de datos tiene un propósito diferente**.

---

### `List<String> animales`

Se utiliza para guardar los nombres de los animales.

```java
List<String> animales;
```

Por ejemplo:

```text
Firulais
Mishi
Rocky
```

Podemos imaginar la lista como una fila donde vamos agregando animales.

```text
animales
   ↓
[ Firulais, Mishi, Rocky ]
```

La lista permite mantener varios elementos y acceder a ellos mediante su posición.

---

### `Map<String, String> estadoAnimal`

Relaciona cada animal con su estado.

```java
Map<String, String> estadoAnimal;
```

Por ejemplo:

```text
Firulais → Disponible
Mishi    → Adoptado
Rocky    → Disponible
```

Podemos imaginarlo como una especie de diccionario:

```text
Animal      Estado
-------------------------
Firulais → Disponible
Mishi    → Adoptado
Rocky    → Disponible
```

La ventaja es que podemos consultar rápidamente el estado de un animal utilizando su nombre.

---

### `Set<String> especies`

Guarda las especies registradas.

```java
Set<String> especies;
```

Por ejemplo:

```text
Perro
Gato
Conejo
```

Un `Set` no permite elementos duplicados.

Esto resulta útil porque no queremos tener:

```text
Perro
Perro
Gato
```

sino:

```text
Perro
Gato
```

---

### `Map<String, String> animalEspecie`

Relaciona cada animal con su especie.

```java
Map<String, String> animalEspecie;
```

Por ejemplo:

```text
Firulais → Perro
Mishi    → Gato
Rocky    → Perro
```

De esta manera podemos conocer qué especie corresponde a cada animal.

---

### `String[] estados`

También se utiliza un arreglo para almacenar los estados permitidos:

```java
String[] estados = {"Disponible", "Adoptado"};
```

En este caso el arreglo representa un conjunto fijo de opciones.

Los estados posibles son únicamente:

```text
Disponible
Adoptado
```

---

## 🧠 ¿Cómo se relacionan las estructuras?

Aunque utilizamos varias estructuras diferentes, todas trabajan juntas.

Podemos imaginar la información de un animal de esta forma:

```text
Firulais
   │
   ├── Especie → Perro
   │
   └── Estado → Disponible
```

La información se encuentra distribuida:

```text
animales
    ↓
Firulais

animalEspecie
    ↓
Firulais → Perro

estadoAnimal
    ↓
Firulais → Disponible
```

Esto permite entender cómo diferentes estructuras pueden utilizarse para representar información relacionada.

---

## 🔐 Validaciones

El programa realiza diferentes validaciones para evitar errores.

### Animales duplicados

No se permite registrar dos veces el mismo animal.

```text
❌ El animal ya está registrado.
```

---

### Especies inexistentes

No se puede registrar un animal utilizando una especie que todavía no existe.

```text
❌ La especie no está registrada.
```

Primero se debe registrar la especie.

---

### Animales inexistentes

No se puede adoptar un animal que no se encuentre registrado.

```text
❌ El animal no existe.
```

---

### Animales ya adoptados

No se puede volver a adoptar un animal que ya tenga el estado:

```text
Adoptado
```

---

## 🖥️ Organización del programa

El programa utiliza un menú controlado mediante:

```java
do-while
```

Esto permite que el menú continúe apareciendo hasta que el usuario seleccione:

```text
7. Salir
```

Las diferentes opciones se procesan mediante:

```java
switch
```

Además, las funcionalidades se separan en métodos `static`, permitiendo que cada método tenga una responsabilidad concreta.

Por ejemplo:

```text
registrarAnimal()
registrarEspecie()
adoptarAnimal()
mostrarDisponibles()
mostrarAdoptados()
mostrarReporte()
```

Esto ayuda a mantener el código más organizado y fácil de entender.

---

## ▶️ Cómo ejecutar el proyecto

Desde la carpeta principal del proyecto:

### Compilar

```bash
javac RefugioAnimales.java
```

### Ejecutar

```bash
java RefugioAnimales
```

---

## 💻 Ejemplo de ejecución

### Menú principal

```text
=== REFUGIO DE ANIMALES ===
1. Registrar animal
2. Registrar especie
3. Marcar animal como adoptado
4. Mostrar animales disponibles
5. Mostrar animales adoptados
6. Mostrar reporte general
7. Salir

Seleccione una opción:
```

### Registrar una especie

```text
Seleccione una opción: 2

Ingrese la especie: Perro

Especie registrada correctamente.
```

### Registrar un animal

```text
Seleccione una opción: 1

Ingrese el nombre del animal: Firulais
Ingrese la especie: Perro

Animal registrado correctamente.
Estado inicial: Disponible
```

### Adoptar un animal

```text
Seleccione una opción: 3

Animales disponibles:
1. Firulais

Seleccione el animal: 1

Firulais ha sido marcado como Adoptado.
```

### Reporte general

```text
Seleccione una opción: 6

===== REPORTE GENERAL =====

Total de animales: 1
Disponibles: 0
Adoptados: 1

Nombre     | Especie | Estado
--------------------------------
Firulais   | Perro   | Adoptado
```

---

## 📊 Conceptos utilizados

| Elemento    | Función                                               |
| ----------- | ----------------------------------------------------- |
| `List`      | Mantener una colección ordenada de animales           |
| `ArrayList` | Implementar la lista de animales                      |
| `Map`       | Relacionar una clave con un valor                     |
| `HashMap`   | Implementar los mapas utilizados                      |
| `Set`       | Almacenar elementos sin duplicados                    |
| `HashSet`   | Implementar el conjunto de especies                   |
| `String[]`  | Almacenar estados fijos                               |
| `Scanner`   | Leer información desde teclado                        |
| `switch`    | Procesar las opciones del menú                        |
| `do-while`  | Mantener el menú funcionando                          |
| `if / else` | Realizar validaciones                                 |
| `for`       | Recorrer las colecciones                              |
| `static`    | Crear métodos que pueden utilizarse sin crear objetos |

---

## 📄 Archivo `.gitignore`

El proyecto incluye un `.gitignore` para evitar subir archivos compilados y configuraciones locales del entorno de desarrollo.

```gitignore
*.class
*.log
bin/
out/
.idea/
.vscode/
.DS_Store
```

---

## 🧠 Aprendizajes obtenidos

Esta actividad permitió comprender que no existe una única estructura para almacenar información.

Dependiendo de lo que necesitemos hacer, podemos elegir una estructura diferente:

```text
List → guardar varios elementos

Set → evitar duplicados

Map → relacionar información
```

También se aprendió que varias estructuras pueden trabajar juntas para representar información más completa.

Por ejemplo:

```text
Firulais
   ↓
Perro
   ↓
Disponible
```

se representa utilizando diferentes colecciones.

Además, se reforzaron conceptos como:

- Menús interactivos.
- Métodos.
- Validaciones.
- Recorridos de colecciones.
- Organización de código.
- Entrada de datos mediante `Scanner`.

---

## 🚀 Posibles mejoras

El proyecto puede seguir creciendo incorporando nuevas funcionalidades, por ejemplo:

- Agregar más información de los animales.
- Registrar edad de los animales.
- Registrar tamaño o raza.
- Registrar datos de los adoptantes.
- Asociar un adoptante con cada animal.
- Agregar fechas de adopción.
- Permitir cancelar una adopción.
- Buscar animales por especie.
- Buscar animales por estado.
- Utilizar `Stream` para realizar filtros y reportes.
- Incorporar manejo de excepciones mediante `try-catch`.
- Migrar el proyecto a Programación Orientada a Objetos.

---

## 📌 Conclusión

Esta actividad permitió practicar el uso de diferentes **estructuras de datos en Java** mediante un problema cercano a una situación real.

El refugio utiliza:

```text
List → animales
Map → estados y especies
Set → especies sin duplicados
Array → estados disponibles
```

La combinación de estas estructuras permite organizar la información y realizar operaciones como registrar animales, cambiar estados y generar reportes.

Además, este ejercicio sirve como preparación para el siguiente paso del aprendizaje: **Programación Orientada a Objetos**, donde esta misma aplicación puede evolucionar para trabajar con clases como `Animal`, `Especie` y `Adoptante`.

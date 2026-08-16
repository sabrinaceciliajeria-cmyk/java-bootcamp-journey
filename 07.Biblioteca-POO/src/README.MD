# 07 - Biblioteca POO en Java

## 🎯 Objetivo

Introducir los fundamentos de la **Programación Orientada a Objetos (POO)** mediante la creación de un pequeño sistema de biblioteca en Java.

La idea principal de esta actividad es aprender a organizar un programa utilizando **clases, objetos y relaciones entre ellos**.

En este ejercicio se comienza a trabajar con una clase principal llamada `Publicacion`, que funciona como una base para crear diferentes tipos de publicaciones, como `Libro`, `Revista` y `Periodico`.

---

## 📚 Conceptos trabajados

- Clases y objetos
- Constructores
- Encapsulación
- Modificadores de acceso
- `public`
- `private`
- `protected`
- Visibilidad `default`
- Herencia
- `extends`
- `super`
- Sobrescritura de métodos
- `@Override`
- Polimorfismo
- `ArrayList`
- `Scanner`
- `switch`
- `do-while`
- Organización mediante paquetes

---

## 📂 Estructura del proyecto

```text
07.Biblioteca-POO/
│
├── src/
│   ├── modelo/
│   │   ├── Publicacion.java
│   │   ├── Libro.java
│   │   ├── Revista.java
│   │   └── Periodico.java
│   │
│   └── servicio/
│       ├── GestorBiblioteca.java
│       └── Main.java
│
├── .gitignore
└── README.md
```

---

## 🧩 ¿Cómo está organizado el proyecto?

La clase `Publicacion` funciona como la **clase padre**.

A partir de ella se crean diferentes clases hijas:

```text
                 Publicacion
                /     |      \
               /      |       \
              ↓       ↓        ↓
           Libro    Revista  Periodico
```

Esto significa que las tres clases comparten información que pertenece a una publicación, como:

- Título
- Autor
- Año

Pero cada una puede tener información propia.

Por ejemplo:

```text
Libro
└── Páginas

Revista
└── Número de revista

Periodico
└── Sección
```

La idea es evitar repetir código y permitir que cada tipo de publicación tenga sus propias características.

---

## ⚙️ Funcionalidades

### Publicacion.java

`Publicacion` es la clase principal del proyecto.

Contiene la información que tienen en común todas las publicaciones:

- Título
- Autor
- Año

También contiene el método:

```java
mostrarInformacion()
```

que permite mostrar los datos de una publicación.

Además, se utilizan diferentes modificadores de acceso para comprender cómo funciona la visibilidad de los atributos.

Por ejemplo:

```java
String titulo;
protected String autor;
private int anio;
```

Cada uno tiene un nivel de acceso diferente.

---

### 🔐 Encapsulación

La encapsulación consiste en **proteger los datos internos de una clase y controlar cómo se puede acceder a ellos**.

Por ejemplo, el año está declarado como:

```java
private int anio;
```

Al ser `private`, no podemos acceder directamente a él desde otras clases.

Para consultar su valor utilizamos un método:

```java
public int getAnio() {
    return anio;
}
```

De esta forma, la clase controla cómo se accede a sus datos.

---

### Libro.java

`Libro` es una clase hija de `Publicacion`.

Esto se indica utilizando:

```java
public class Libro extends Publicacion
```

Al heredar de `Publicacion`, `Libro` puede reutilizar la información común de una publicación.

Además, agrega información propia:

```java
private int paginas;
```

Por lo tanto:

```text
Libro
├── título
├── autor
├── año
└── páginas
```

---

### Revista.java

`Revista` también hereda de `Publicacion`.

Agrega un dato propio:

```java
private int numero;
```

Por lo tanto:

```text
Revista
├── título
├── autor
├── año
└── número de revista
```

---

### Periodico.java

`Periodico` fue agregado como **desafío adicional**.

Al igual que `Libro` y `Revista`, hereda de `Publicacion`.

Agrega información propia:

```java
private String seccion;
```

Por ejemplo:

```text
Periodico
├── título
├── autor
├── año
└── sección
```

---

## 🧬 Herencia

La herencia permite que una clase pueda **reutilizar características de otra clase**.

En este proyecto:

```text
             Publicacion
             /     |     \
            ↓      ↓      ↓
         Libro   Revista  Periodico
```

`Publicacion` es la clase padre.

`Libro`, `Revista` y `Periodico` son clases hijas.

Esto evita tener que escribir nuevamente los atributos y comportamientos que son comunes.

Por ejemplo, todas las publicaciones tienen:

```text
Título
Autor
Año
```

Por lo tanto, esos datos se encuentran en `Publicacion`.

---

## 🔄 Uso de `super`

Cuando creamos un `Libro`, por ejemplo, necesitamos enviar al padre los datos que pertenecen a `Publicacion`.

Para eso utilizamos:

```java
super(titulo, autor, anio);
```

Podemos entender `super` como:

> "Llama a la parte de la clase padre."

De esta manera, `Publicacion` se encarga de guardar los datos que le corresponden y `Libro` se encarga de sus propios datos.

---

## 🔁 Sobrescritura con `@Override`

La clase padre tiene un método:

```java
mostrarInformacion()
```

Las clases hijas pueden utilizar ese método, pero también pueden **adaptarlo para agregar información propia**.

Para eso utilizamos:

```java
@Override
```

Por ejemplo, `Libro` puede hacer:

```java
@Override
public void mostrarInformacion() {

    super.mostrarInformacion();

    System.out.println("Páginas: " + paginas);
}
```

Primero muestra la información común de `Publicacion` y después agrega las páginas del libro.

Podemos imaginarlo así:

```text
Publicacion
    ↓
Muestra:
Título
Autor
Año

Libro
    ↓
Agrega:
Páginas
```

---

## 🔀 Polimorfismo

El polimorfismo permite trabajar con diferentes tipos de objetos utilizando un tipo común.

En este proyecto utilizamos:

```java
ArrayList<Publicacion>
```

Aunque la lista es de tipo `Publicacion`, podemos guardar:

```java
Libro
Revista
Periodico
```

Esto es posible porque las tres clases heredan de `Publicacion`.

Por ejemplo:

```java
gestor.agregarPublicacion(libro);
gestor.agregarPublicacion(revista);
gestor.agregarPublicacion(periodico);
```

El gestor no necesita tener una lista diferente para cada tipo.

Puede trabajar con todos utilizando:

```java
Publicacion
```

Esta es una de las ideas principales del polimorfismo.

---

## 📋 GestorBiblioteca.java

`GestorBiblioteca` se encarga de **administrar las publicaciones**.

Para almacenarlas utiliza:

```java
ArrayList<Publicacion>
```

La lista puede contener diferentes tipos de publicaciones:

```text
ArrayList<Publicacion>
        │
        ├── Libro
        ├── Revista
        └── Periodico
```

También contiene métodos para:

- Agregar publicaciones.
- Mostrar todas las publicaciones.

De esta manera, `Main` no necesita encargarse directamente de administrar la lista.

---

## 🖥️ Main.java

`Main` contiene el programa principal.

Utiliza `Scanner` para recibir información desde el teclado y presenta un menú para interactuar con el usuario.

Las opciones disponibles son:

```text
==============================
        BIBLIOTECA
==============================
1. Registrar libro
2. Registrar revista
3. Registrar periódico
4. Mostrar publicaciones
5. Salir
==============================
Seleccione una opción:
```

El menú utiliza:

- `do-while` para mantener el programa funcionando.
- `switch` para procesar la opción elegida.
- `Scanner` para leer los datos.

---

## 🏆 Desafío adicional

Como extensión de la actividad principal se agregó la clase:

```text
Periodico.java
```

El objetivo del desafío fue aplicar nuevamente los conceptos aprendidos creando un nuevo tipo de publicación.

`Periodico`:

- Hereda de `Publicacion`.
- Tiene un atributo propio llamado `seccion`.
- Utiliza un constructor.
- Utiliza `super()`.
- Sobrescribe `mostrarInformacion()` mediante `@Override`.
- Puede almacenarse dentro de `ArrayList<Publicacion>`.

La estructura final quedó:

```text
                 Publicacion
                /     |      \
               ↓      ↓       ↓
            Libro   Revista  Periodico
```

---

## ▶️ Cómo ejecutar el proyecto

Desde la carpeta principal del proyecto:

### Compilar

En PowerShell:

```powershell
javac -d bin (Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName })
```

### Ejecutar

```powershell
java -cp bin src.servicio.Main
```

---

## 💻 Ejemplo de ejecución

### Menú principal

```text
==============================
        BIBLIOTECA
==============================
1. Registrar libro
2. Registrar revista
3. Registrar periódico
4. Mostrar publicaciones
5. Salir
==============================
Seleccione una opción:
```

### Registrar un libro

```text
===== REGISTRO DE LIBRO =====

Título: 1984
Autor: George Orwell
Año: 1949
Páginas: 328

Libro registrado correctamente.
```

### Registrar una revista

```text
===== REGISTRO DE REVISTA =====

Título: Muy Interesante
Autor: Editorial
Año: 2023
Número de revista: 210

Revista registrada correctamente.
```

### Registrar un periódico

```text
===== REGISTRO DE PERIÓDICO =====

Título: Diario Nacional
Autor: Redacción
Año: 2026
Sección: Deportes

Periódico registrado correctamente.
```

### Mostrar publicaciones

```text
===== PUBLICACIONES =====

--------------------
Título: 1984
Autor: George Orwell
Año: 1949
Páginas: 328

--------------------
Título: Muy Interesante
Autor: Editorial
Año: 2023
Número de revista: 210

--------------------
Título: Diario Nacional
Autor: Redacción
Año: 2026
Sección: Deportes
```

---

## 📊 Conceptos utilizados

| Elemento     | Función                                                |
| ------------ | ------------------------------------------------------ |
| `class`      | Crear el molde de una clase                            |
| Objeto       | Crear una instancia de una clase                       |
| Constructor  | Inicializar los datos de un objeto                     |
| `private`    | Proteger datos internos                                |
| `protected`  | Permitir acceso desde la clase y sus hijas             |
| `default`    | Permitir acceso dentro del mismo paquete               |
| `public`     | Permitir acceso desde cualquier parte                  |
| `extends`    | Crear una relación de herencia                         |
| `super()`    | Utilizar el constructor o métodos del padre            |
| `@Override`  | Sobrescribir un método heredado                        |
| `ArrayList`  | Guardar varias publicaciones                           |
| `Scanner`    | Leer información del usuario                           |
| `switch`     | Procesar las opciones del menú                         |
| `do-while`   | Mantener el menú funcionando                           |
| Polimorfismo | Trabajar con diferentes objetos mediante un tipo común |

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

Al finalizar esta actividad se reforzaron los primeros conceptos importantes de la **Programación Orientada a Objetos**.

Se aprendió que una clase puede funcionar como un molde para crear objetos y que diferentes clases pueden relacionarse mediante la herencia.

También se comprendió que:

- La encapsulación permite proteger los datos.
- Los constructores permiten inicializar objetos.
- `extends` permite crear clases hijas.
- `super()` permite utilizar elementos de la clase padre.
- `@Override` permite modificar un comportamiento heredado.
- El polimorfismo permite trabajar con diferentes tipos de objetos mediante una clase común.
- `ArrayList` permite almacenar varios objetos dentro de una colección.

---

## 🚀 Posibles mejoras

El proyecto puede seguir creciendo incorporando nuevas funcionalidades, por ejemplo:

- Agregar validaciones de entrada.
- Implementar `try-catch` para manejar errores.
- Permitir eliminar publicaciones.
- Permitir buscar publicaciones.
- Agregar más tipos de publicaciones.
- Agregar categorías.
- Incorporar autores como objetos.
- Implementar métodos de búsqueda y filtrado.
- Guardar información de forma permanente.

---

## 📌 Conclusión

Esta actividad representa uno de los primeros pasos en el aprendizaje de la **Programación Orientada a Objetos en Java**.

A través de una biblioteca sencilla se pudo comprender cómo organizar un programa utilizando clases, objetos y relaciones entre ellos.

La clase `Publicacion` permitió entender el concepto de una clase padre, mientras que `Libro`, `Revista` y `Periodico` permitieron practicar la herencia y agregar información específica.

Además, el uso de `@Override`, `super()` y `ArrayList<Publicacion>` permitió comenzar a comprender el polimorfismo y cómo POO ayuda a crear programas más organizados, reutilizables y fáciles de ampliar.

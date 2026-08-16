# 05 - Advanced Calculator en Java

## 🎯 Objetivo

Aprender a utilizar **métodos (funciones)** para modularizar el código, reutilizar lógica y separar responsabilidades dentro de una aplicación Java.

Esta actividad representa el primer paso hacia la construcción de programas más organizados y mantenibles.

---

## 📚 Conceptos trabajados

- Métodos (`static`)
- Parámetros y retorno (`return`)
- `Scanner`
- `switch`
- `do-while`
- `if / else`
- Validaciones
- Clase `Math`
- Modularización
- Refactorización básica

---

## 📂 Estructura del proyecto

```text
04.advanced-calculator-java/
│
├── .gitignore
├── AdvancedCalculator.java
├── AdvancedCalculatorV2.java
└── README.md
```

---

## ⚙️ Funcionalidades

### AdvancedCalculator.java

- Suma
- Resta
- Multiplicación
- División
- Potencia
- Raíz cuadrada
- Módulo
- Salir del sistema

### AdvancedCalculatorV2.java

Incluye todas las funcionalidades anteriores y además:

- Historial de operaciones
- Porcentaje
- Área del círculo
- Menú mejorado
- Métodos reutilizables
- Código más limpio y mantenible

---

## ▶️ Cómo ejecutar el proyecto

### Versión base

```bash
javac AdvancedCalculator.java
java AdvancedCalculator
```

### Versión avanzada

```bash
javac AdvancedCalculatorV2.java
java AdvancedCalculatorV2
```

---

## 💻 Ejemplo de ejecución

```text
╔══════════════════════════════════════╗
║        ADVANCED CALCULATOR V2        ║
╠══════════════════════════════════════╣
║ 1. Sumar                             ║
║ 2. Restar                            ║
║ 3. Multiplicar                       ║
║ 4. Dividir                           ║
║ 5. Potencia                          ║
║ 6. Raíz cuadrada                     ║
║ 7. Módulo                            ║
║ 8. Porcentaje                        ║
║ 9. Área del círculo                  ║
║10. Ver historial                     ║
║11. Salir                             ║
╚══════════════════════════════════════╝
```

---

## 📊 Conceptos utilizados

| Elemento      | Función                           |
| ------------- | --------------------------------- |
| `Scanner`     | Leer datos desde teclado          |
| `switch`      | Procesar opciones del menú        |
| `do-while`    | Mantener el programa en ejecución |
| `if`          | Validar condiciones               |
| `return`      | Retornar resultados desde métodos |
| `Math.pow()`  | Calcular potencias                |
| `Math.sqrt()` | Calcular raíces cuadradas         |
| `Math.PI`     | Utilizar el valor de π            |
| `String[]`    | Almacenar el historial            |

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

Al finalizar esta actividad se fortalecen conocimientos sobre:

- Creación de métodos.
- Reutilización de código.
- Modularización.
- Validación de datos.
- Organización de proyectos Java.
- Refactorización básica.

---

## 🚀 Posibles mejoras

- Historial persistente en archivos.
- Operaciones trigonométricas.
- Conversor de unidades.
- Uso de `ArrayList`.
- Manejo de excepciones (`try-catch`).
- Interfaz gráfica con JavaFX o Swing.

---

## 📌 Conclusión

Esta actividad marca la transición desde programas simples hacia aplicaciones más organizadas, reutilizables y cercanas a proyectos reales de desarrollo de software.

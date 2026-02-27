# Hoja de Trabajo 4  
## Pilas, Listas y Patrones de Diseño

---

## Descripción

Este proyecto implementa un programa en Java que evalúa expresiones en notación **infix**.

El programa realiza los siguientes pasos:

1. Lee una expresión infix desde el archivo `datos.txt`.
2. Convierte la expresión infix a notación postfix.
3. Evalúa la expresión postfix.
4. Muestra el resultado final en consola.

Ejemplo:

Entrada en `datos.txt`:

(10+20)*9

Conversión a postfix:

10 20 + 9 *

Resultado:

270

---

## Objetivos del Proyecto

- Uso de **genéricos**
- Diseño del **ADT Stack**
- Diseño del **ADT List**
- Implementación de patrones de diseño:
  - Factory Pattern
  - Singleton Pattern
- Uso de pruebas unitarias con **JUnit 5**
- Aplicación de principios de abstracción y modularidad

---

## 🏗 Arquitectura del Proyecto

###  ADT Stack

- `Stack<T>` (Interface)
- `AbstractStack<T>` (Clase abstracta)
- `VectorStack<T>`
- `ArrayListStack<T>`
- `ListStack<T>`

Cada implementación respeta el contrato definido por la interfaz `Stack<T>` y utiliza genéricos.

---

### ADT List

- `List<T>` (Interface)
- `AbstractList<T>` (Clase abstracta)
- `SinglyLinkedList<T>`
- `DoublyLinkedList<T>`

Se implementaron únicamente los métodos necesarios para soportar el funcionamiento de la pila:
- `add`
- `removeLast`
- `getLast`
- `isEmpty`
- `size`

---

###  Patrones de Diseño

#### Factory Pattern
La clase `StackFactory` permite crear dinámicamente la implementación del Stack según la elección del usuario.

#### Singleton Pattern
`StackFactory` utiliza una única instancia a través del método `getInstance()`.

---

###  Clases Principales

- `InfixToPostfix`
  - Convierte una expresión infix a postfix.
- `PostfixCalculator`
  - Evalúa la expresión postfix.
- `Principal`
  - Controla el flujo del programa y la interacción con el usuario.

---

## Cómo Ejecutar el Programa

1. Asegurarse de que el archivo `datos.txt` contenga una expresión infix válida.
2. Ejecutar la clase:

app.Principal

3. Seleccionar la implementación deseada:
   - `vector`
   - `arraylist`
   - `lista`
     - `simple`
     - `doble`

El programa mostrará:
- Expresión leída
- Conversión postfix
- Resultado final

---

##  Pruebas Unitarias

Se implementaron pruebas con **JUnit 5** para validar:

- `VectorStack`
- `ArrayListStack`
- `SinglyLinkedList`
- `DoublyLinkedList`

Las pruebas verifican:

- Funcionamiento correcto de `push`, `pop`, `peek`
- Correcta manipulación de nodos en las listas
- Comportamiento esperado del ADT

Todas las pruebas se ejecutan correctamente sin errores.

---

##  Estructura del Proyecto

HojaTrabajo4
 ├── src
 │    ├── app
 │    ├── stack
 │    ├── list
 │    ├── factory
 │    └── calculator
 │
 ├── test
 │    └── pruebas JUnit
 │
 ├── datos.txt
 └── README.md

---

##  Conclusión

Este proyecto demuestra el uso correcto de:

- Abstracción
- Encapsulación
- Polimorfismo
- Genéricos
- Patrones de diseño
- Pruebas unitarias

La arquitectura modular permite cambiar dinámicamente la implementación interna del Stack sin modificar el resto del programa, demostrando un diseño flexible y mantenible.

---

## 👩‍💻 Autor PAOLA ITZEP MERIDA

Paola Itzep  
Hoja de Trabajo 4  
Universidad del Valle de Guatemala

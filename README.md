# S01.02-Exceptions_Level02

---

# ENGLISH
___

# 📄 Description - Exercise Statement

Create a class named `Entrada`. This class should be used to handle the different exceptions that may occur in Java when entering data from the keyboard using the `Scanner` class.

The first step is to instantiate a `Scanner` object, and from there, create static methods to read different types of data from the keyboard.

### ⚠️ Important

It is important that if any exception occurs in a method, it is caught, and the program keeps asking the user for the data until it is correctly entered. For example: If the user enters a float with a dot instead of a comma, the message "Formatting error" should be displayed. The program should continue asking for the data until a correctly formatted float is entered.

All methods receive a `String` with the message to display to the user (for example: "Enter your age") and return the appropriate data entered by the user in each method, for example: a byte with the user's age.

## 💻 Methods to Implement

### Methods to handle `InputMismatchException`:

- `public static byte readByte(String message);`
- `public static int readInt(String message);`
- `public static float readFloat(String message);`
- `public static double readDouble(String message);`

### Methods to handle a custom exception derived from the `Exception` class:

- `public static char readChar(String message);`
- `public static String readString(String message);`
- `public static boolean readYesNo(String message);`

- If the user enters "s", return `true`.
- If the user enters "n", return `false`.


---

# 💻 Technologies Used

- Java
- Java Standard Library
- Maven
- Git & GitHub

---

# 📋 Requirements

To run this project, you need:

- Java Development Kit (JDK) 21 or higher
- An Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or VS Code with Java and Maven support
- Git

---

# 🛠️ Installation

1. Ensure you have **JDK 21** or higher installed.
2. Clone this repository:
   ```sh
   git clone <https://github.com/DiegoBalaguer/# S01.02-Exceptions_Level02.git>
   ```
3. Open the project in your preferred IDE.
4. Compile the Java files.

---

# ▶️ Execution

1. Navigate to the folder containing the compiled files.
2. Run the application using:
   ```sh
   java Main
   ```
3. The output should display the respective messages when calling each method.

OR

1. In your preferred IDE, navigate to class **Main** and execute in IDE.

---

# 🌐 Deployment

Currently, the project is designed to run locally without the need for server deployment.

---

# CASTELLANO
___

# 📄 Descripción - Enunciado del Ejercicio

Crea una clase llamada `Entrada`. Esta clase debe ser utilizada para manejar las diferentes excepciones que pueden ocurrir en Java al introducir datos desde el teclado utilizando la clase `Scanner`.

El primer paso es instanciar un objeto de la clase `Scanner`, y a partir de ahí, crear métodos estáticos para leer los diferentes tipos de datos desde el teclado.

### ⚠️ Importante

Es importante que si alguna excepción ocurre en un método, se capture y el programa siga pidiendo al usuario los datos hasta que sean introducidos correctamente. Por ejemplo: Si el usuario introduce un float con un punto en lugar de una coma, debe mostrarse el mensaje "Error de formato". El programa debe seguir pidiendo los datos hasta que el float esté correctamente introducido.

Todos los métodos reciben un `String` con el mensaje que se desea mostrar al usuario (por ejemplo: "Introduce tu edad") y retornan el dato apropiado introducido por el usuario en cada método, por ejemplo: un byte con la edad del usuario.

## 💻 Métodos a Implementar

### Métodos para manejar `InputMismatchException`:

- `public static byte leerByte(String mensaje);`
- `public static int leerInt(String mensaje);`
- `public static float leerFloat(String mensaje);`
- `public static double leerDouble(String mensaje);`

### Métodos para manejar una excepción personalizada derivada de la clase `Exception`:

- `public static char leerChar(String mensaje);`
- `public static String leerString(String mensaje);`
- `public static boolean leerSiNo(String mensaje);`

- Si el usuario introduce "s", retorna `true`.
- Si el usuario introduce "n", retorna `false`.

---

# 💻 Tecnologías Utilizadas

- Java
- Biblioteca Estándar de Java
- Maven
- Git & GitHub

---

# 📋 Requisitos

Para ejecutar este proyecto, necesitas:

- Java Development Kit (JDK) 21 o superior
- Un Entorno de Desarrollo Integrado (IDE) como IntelliJ IDEA, Eclipse o VS Code con soporte para Java y Maven
- Git

---

# 🛠️ Instalación

1. Asegúrate de tener instalado **JDK 21** o superior.
2. Clona este repositorio:
   ```sh
   git clone <https://github.com/DiegoBalaguer/S01.01-InheritancePolymorphism_Level02.git>
   ```
3. Open the project in your preferred IDE.
4. Compile the Java files.

---

# ▶️ Ejecución

1. Navega hasta la carpeta que contiene los archivos compilados.
2. Ejecuta la aplicación usando:
   ```sh
   java Main
   ```
3. La salida debería mostrar los mensajes correspondientes al llamar a cada método.

O BIEN

1. En tu IDE preferido, navega hasta la clase **Main** y elecútala desde el entorno.

# 🌐 Despliegue

Actualmente, el proyecto está diseñado para ejecutarse en local sin necesidad de despliegue en servidor.

---
# 🏔️ Llanquihue Tour examen- Sistema de Gestión (Prototipo)

## 📖 Descripción general del sistema
Este proyecto es un prototipo de software modular desarrollado en Java para "Llanquihue Tour", una agencia de turismo ubicada en la Región de Los Lagos. El sistema nace como respuesta a la necesidad de digitalizar y estructurar la información de la empresa, superando la gestión manual y desorganizada. 

El programa aplica los principios fundamentales de la Programación Orientada a Objetos (POO) tales como encapsulamiento, herencia, composición, polimorfismo e interfaces. Permite gestionar entidades del dominio turístico, cargar datos desde archivos externos (`.txt`), manejar excepciones personalizadas y filtrar registros mediante el uso de colecciones.

---

## 🏗️ Resumen de las clases principales y sus funciones

El proyecto está estructurado en paquetes (`app`, `data`, `model`, `utils`) para mantener la modularidad:

### Paquete `model` (Entidades del negocio)
*   **`Registrable` (Interfaz):** Define el contrato estándar para las entidades, obligando a implementar los métodos `registrar()` y `mostrarDatos()`.
*   **`Direccion`:** Clase que representa la ubicación física. Se utiliza para aplicar el principio de **Composición** dentro del sistema.
*   **`Persona` (Clase Abstracta):** Clase base que implementa `Registrable` y contiene atributos comunes (RUT, nombre y dirección).
*   **`Cliente`:** Clase hija que hereda de `Persona`. Añade atributos específicos como el correo electrónico e incluye validaciones en su constructor.

### Paquete `utils` (Herramientas y Validaciones)
*   **`RutInvalidoException`:** Excepción personalizada creada para validar la integridad de los datos ingresados (específicamente la longitud mínima del RUT).

### Paquete `data` (Persistencia)
*   **`GestorArchivos`:** Clase utilitaria encargada de leer el archivo externo `datos.txt`. Separa la información (parsing) y crea dinámicamente los objetos aplicando composición antes de enviarlos a la memoria del programa.

### Paquete `app` (Ejecución)
*   **`Main`:** Punto de entrada del programa. Coordina la carga de datos, almacena los objetos en colecciones polimórficas (List), captura excepciones, e implementa búsquedas y filtros utilizando el operador `instanceof`.

---

## 🚀 Instrucciones para clonar y ejecutar el proyecto

Para probar este prototipo en tu máquina local, sigue estos pasos:

### 1. Clonar el repositorio
Abre tu terminal (o Git Bash) y ejecuta el siguiente comando:
```bash
git clone [https://github.com/TU_USUARIO/TU_REPOSITORIO.git](https://github.com/TU_USUARIO/TU_REPOSITORIO.git)

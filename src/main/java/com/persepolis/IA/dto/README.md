# Proyecto de Integración IA (Ollama)

Este proyecto es una aplicación Java diseñada para interactuar con modelos de Inteligencia Artificial locales utilizando la API de **Ollama**.

## Estructura del Proyecto

El código fuente se encuentra organizado bajo el paquete `com.persepolis.IA`.

### DTOs (Data Transfer Objects)

El paquete `com.persepolis.IA.dto` contiene las clases que modelan los datos enviados y recibidos de la API.

#### `OllamaRequest`

Esta clase representa el cuerpo de una solicitud (payload) para generar texto.

**Campos:**

*   `model`: El nombre del modelo a utilizar (ej. `llama3`, `mistral`).
*   `prompt`: El texto de entrada o instrucción para la IA.
*   `max_tokens`: El límite máximo de tokens que el modelo debe generar.
*   `stream`: Un booleano que indica si la respuesta debe ser transmitida en tiempo real (streaming) o entregada completa al final.

## Ejemplo de Uso

```java
import com.persepolis.IA.dto.OllamaRequest;

// Crear una nueva solicitud para el modelo Llama 2
OllamaRequest request = new OllamaRequest(
    "llama2",
    "¿Por qué el cielo es azul?",
    100,
    false
);
```
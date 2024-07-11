# Reproductor del Himno Nacional Argentino

## Descripción del Proyecto

- Esta aplicación reproduce audios MP3 y posee una lista de opciones para escuchar el Himno Nacional Argentino en versiones cantadas por artistas argentinos.
- Actualmente el play detiene la reproducion del audio a los pocos segundos de su ejecucion.

## Características

- **Botón Stop:** Reinicia el audio.
- **Botón Pausa:** Detiene la reproducción.
- **Botón Play:** Reproduce y reanuda el audio.
- **Barra de progreso:** Permite adelantar y atrasar manualmente.
- **Botones Retroceder y Adelantar:** Actualmente presentan fallas en el código.
- **Lista de audios:** Gestionada desde una base de datos.

## Requisitos del Sistema

- **Java SE Development Kit (JDK) 8 o superior**
- **NetBeans IDE 12 o superior**
- **MySQL Database**
- **Librerías adicionales:**
  - JavaZoom JLayer
  - MySQL Connector/J

## Instrucciones 

1. **Descargar y descomprimir las dos carpetas con los archivos de audios.**

2. **Configurar la base de datos:**

    - Crear una base de datos en MySQL.
    - Importar el archivo mp3audios.sql proporcionado para crear las tablas necesarias.
    - Modificar la ruta de los archivos de audios en la base de datos.

3. **Configurar las librerías adicionales necesarias:**

    - Agregar JLayer y MySQL Connector/J al proyecto en NetBeans.

4. **Configurar conexión a la base de datos:**

    - Editar el archivo Conexion.java con las credenciales y la URL de la base de datos MySQL.
   
## Uso del Proyecto
1. **Reproducir Audio**

    - **Seleccionar un archivo de audio desde la tabla.**
    - **Utilizar los botones de control:**
      
    - Play: Reproduce el audio.
    - Pause: Pausa la reproducción.
    - Stop: Detiene y reinicia el audio.
    - Rewind: Retrocede en el audio.
    - Advance: Adelanta en el audio.

1. **Control de Progreso**

    - La barra de progreso muestra el estado actual de la reproducción.
    - Arrastrar la barra para saltar a una posición específica en el audio.  

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Ver el archivo LICENSE para más detalles.

## Contacto

Para consultas, contacta a: rustymaps.alonso@gmail.com.

## Capturas de Pantalla

Adjunto imágenes del proyecto en funcionamiento.

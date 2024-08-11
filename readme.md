# Gestión Club de Tenis - Spring Boot MVC

Este proyecto es un ejemplo de una aplicación web CRUD para la gestión de un club de tenis, implementada con **Spring Boot** y **MVC (Model-View-Controller)**. La aplicación permite administrar socios, reservas y eventos del club, proporcionando una interfaz amigable y funcional.

## Tecnologías Utilizadas

- **Spring Boot**: Framework que simplifica el desarrollo de aplicaciones Java basadas en Spring.
- **MVC (Model-View-Controller)**: Patrón de diseño utilizado para separar la lógica de negocio, la presentación y el control de la aplicación.
- **Thymeleaf**: Motor de plantillas utilizado para la generación de vistas HTML.
- **Java**: Lenguaje de programación para la lógica de negocio y la interacción con la base de datos.
- **MySQL**: Base de datos relacional utilizada para almacenar la información de la aplicación.
- **Hibernate**: Framework ORM (Mapeo Objeto-Relacional) que facilita la interacción con la base de datos.

## Estructura del Proyecto

- **`src/main/java`**: Código fuente en Java.
  - **`controllers`**: Manejan las solicitudes HTTP y las interacciones del usuario.
  - **`models`**: Definen las entidades que representan las tablas de la base de datos.
  - **`services`**: Contienen la lógica de negocio y la interacción con la capa de persistencia.
- **`src/main/resources`**: Recursos y configuraciones del proyecto.
  - **`templates`**: Contiene las vistas HTML construidas con Thymeleaf.
  - **`static`**: Archivos estáticos como CSS y JavaScript.
- **`pom.xml`**: Archivo de configuración de Maven para la gestión de dependencias y plugins.

## Funcionalidades Principales

- **Gestión de Socios**: Alta, baja, modificación y consulta de los socios del club.
- **Gestión de Reservas**: Permite a los usuarios reservar pistas y recursos del club.
- **Gestión de Eventos**: Administración de eventos organizados por el club.
- **Autenticación y Autorización**: Control de acceso basado en roles, protegiendo funcionalidades sensibles de la aplicación.
- **Interfaz de Usuario**: Diseño responsivo e intuitivo, facilitado por Thymeleaf y CSS.

## Instalación y Ejecución

1. Clona el repositorio: `git clone https://github.com/Vicen9/GestionClubTennisSpringBootMVC.git`
2. Accede al directorio del proyecto: `cd GestionClubTennisSpringBootMVC`
3. Configura la base de datos en `application.properties`.
4. Compila y ejecuta el proyecto con Maven: `mvn clean install` y `mvn spring-boot:run`.
5. Accede a la aplicación en `http://localhost:8080`.

## Autor
* Vicente Castellano Gomez, vicentecastellano65@gmail.com - vcg00025@red.ujaen.es

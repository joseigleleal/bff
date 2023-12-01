# bff
API BFF prueba Java Dev NTT DATA


Este proyecto es una aplicación de inventario que utiliza Java 17 y Spring Boot. La aplicación consta de un backend implementado con un patrón Backend for Frontend (BFF) que actúa como intermediario entre el frontend y una API externa de la plataforma. La base de datos puede ser relacional o no relacional, y se proporciona documentación Swagger para el CRUD de productos.

## Requisitos Previos

Asegúrate de tener instalado lo siguiente antes de ejecutar la aplicación:

- Java 17
- [Spring Boot](https://spring.io/projects/spring-boot)
- Una base de datos (por ejemplo, H2, MySQL, PostgreSQL)
- Maven o Gradle

## Configuración de la Base de Datos

Configura tu base de datos en el archivo `application.properties` (o `application.yml`). Aquí hay un ejemplo para H2:

properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

## Ejecución de la Aplicación

1.Clona el repositorio:

git clone https://github.com/tu-usuario/tu-proyecto.git

2.Navega al directorio del proyecto:

cd tu-proyecto

3.Ejecuta la aplicación:

Con Maven:

mvn spring-boot:run
Con Gradle:

./gradlew bootRun

La aplicación estará disponible en http://localhost:8080.

##Documentación Swagger
Accede a la documentación Swagger para el CRUD de productos en http://localhost:8080/swagger-ui.html.

## Pruebas Unitarias

Se han incluido pruebas unitarias para los métodos del controlador y del servicio utilizando JUnit y Mockito. Puedes ejecutar las pruebas con:

Con Maven:

mvn test
Con Gradle:

./gradlew test

## Contribuciones

Si encuentras problemas o tienes sugerencias para mejorar el proyecto, no dudes en crear un issue.




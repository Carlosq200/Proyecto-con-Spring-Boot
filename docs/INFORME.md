# Informe técnico (estudiante)

**Objetivo:** generar un proyecto Spring Boot 3.5.6 (Maven, Java 17) con endpoint /hello y validar ejecución local.

## POM (resumen)
- Parent: spring-boot-starter-parent:3.5.6
- Java: 17
- Dependencias: spring-boot-starter-web (+ test)

## Estructura
- src/main/java/com/example/proyecto/DemoApplication.java (@SpringBootApplication)
- src/main/java/com/example/proyecto/web/HelloController.java (GET /hello)
- src/main/resources/application.properties

## Ejecución
mvn spring-boot:run
Probar: http://localhost:8080/hello

## Evidencias
- docs/01-run-console.jpg
- docs/02-hello-response.jpg
- docs/hello-response.txt

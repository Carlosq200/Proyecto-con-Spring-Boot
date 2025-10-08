# Student technical note

Goal: run a Spring Boot project with /hello endpoint and validate local execution.

1) POM summary
- Parent: spring-boot-starter-parent:3.5.6
- Java: 17
- Dependencies: spring-boot-starter-web (+ test)

2) Key files
- src/main/java/com/example/proyecto/DemoApplication.java
- src/main/java/com/example/proyecto/web/HelloController.java
- src/main/resources/application.properties

3) Run
mvn spring-boot:run
Test: http://localhost:8080/hello

4) Evidence (saved in /docs)
- 01-run-console.png
- 02-hello-response.png
- hello-response.txt

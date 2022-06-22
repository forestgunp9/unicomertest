# Detalle de los sistemas

Java 8
Maven 3.5.0 en consola de comandos.


# Configurar el puerto

En el 8080 tengo otro server.
Entonces como esa API se instaló localmente, hubo que cambiar el puerto de este proyecto.
Esto se configura en application.properties, actualmente:
server.port=8081

# Compilar y ejecutar el proyecto

Para compilar el proyecto se requiere Java y Maven instalado.
Ingresar al directorio *clientes-uni-jamaica* y ejecutar el siguiente comando *maven*

```
mvn clean install
```

Luego de compilar el proyecto ingresar al directorio *target* ejecutar el siguiente comando *java*

```
java -jar .\clientes-0.0.1-SNAPSHOT.jar
```

*Nota*:
Debe estar disponible el puerto *8081* en el PC donde se ejecute esta API.
Esto se configura en application.properties, actualmente:
server.port=8081


# Consumir la API

Para consumir el servicio podría usar Postman, u otros.. Se usará Swagger



# SWAGGER

Verificación:
http://localhost:8081/v2/api-docs

UI:
http://localhost:8081/swagger-ui/









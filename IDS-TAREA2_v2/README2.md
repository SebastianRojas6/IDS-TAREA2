# IDSTAREA2

Código java que permite conexión a cluster de MongoDB Atlas mediante un connection string. Además, crea un documento de MongoDB en base de datos y colección determinada que demuestra conexión al cluster.

Prerrequisitos:
- IDE (ej. VS Code)<br>
  https://code.visualstudio.com/download
- Cluster creado en MongoDB Atlas
- JDK para correr Java en IDE<br>
  https://www.oracle.com/java/technologies/downloads/
- Apache Maven para permitir la conexión de proyectos en java a MongoDB<br>
  https://maven.apache.org/download.cgi

Proceso:
- Crear un proyecto de Java con Maven en VS Code.
- Agregar la dependencia del MongoDB Java driver más actualizado en el apartado de dependencias en pom.xml.
  ~~~
    <dependencies>
      <dependency>
          <groupId>org.mongodb</groupId>
          <artifactId>mongodb-driver-sync</artifactId>
          <version>4.10.0</version>
      </dependency>
    </dependencies>
  ~~~
 
- Ejecutar mongodbCon.java colocando connection string de cluster creado. De igual forma especificar nombre de base de datos y colección a guardarse documento, y colocar apartados de documento como _id y Nombre.

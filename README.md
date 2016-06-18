Example Spring Boot REST Service
================================

The article: [http://kielczewski.eu/2014/04/developing-restful-web-service-with-spring-boot/](http://kielczewski.eu/2014/04/developing-restful-web-service-with-spring-boot/)

Requirements
------------
* [Java Platform (JDK) 7](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Apache Maven 3.x](http://maven.apache.org/)

Quick start
-----------
1. `mvn package`
2. `java -jar target/fno-avangate-connector-1.0-SNAPSHOT.war`
3. Point your browser to [http://localhost:8080](http://localhost:8080)
4. `curl -X POST -d '{ "id": "test_id", "password": "test_password" }' http://localhost:8080/user`
5. Refresh the page

Troubleshooting:
to change or point to the specific port use the following
java -jar target/fno-avangate-connector-1.0-SNAPSHOT.war --server.port=8181

If receive the error
coyote.http11.Http11NioProtocol : Failed to start end point associated with ProtocolHandler

Do the following

lsof -i :8080 | grep LISTEN

Similar to the following will be displayed
java    78960 xyxss  119u  IPv6 0x6c20d372bc88c27d      0t0  TCP *:8092 (LISTEN)

The 78960 is the process id, use the following command to kill the process

kill -9 78960

Restart the application
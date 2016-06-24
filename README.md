
Requirements
------------
* [Java Platform (JDK) 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
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

Do the following, if running on the 8080 port

kill `lsof -i -n -P | grep TCP | grep 8080 | tr -s " " "\n" | sed -n 2p`

Restart the application

=================
RELEASE Process
=================
1. Check that application properties pointing to the correct secret key in relation to the deployment environment test/production
    a. avangate.instance=test
    b. ALM properties pointing to the correct end points UAT or prod as appropriate
    c. integrationFramework.devMode=true should be false
    d. Run the application with correct and non correct hash to confirm hash is still calculated properly

2. Notice the size of the war file currently around 31.2 mb, after uploading to the server, before deployment make sure it is still 31.2mb
3. When uploading to the Web Server do not upload to the tomcat/webapps directly, first copy it locally to the webserver and then to the webapps folder
4. Stop the application first on the web server
5. Now undeploy the application
6. Copy the new release to the tomcat/webapps folder
7. Make sure application is started successfully

Note: On the web server for tomcat to run smoothly set CATALINA_OPTS environment var to -XX:MaxPermSize=512m


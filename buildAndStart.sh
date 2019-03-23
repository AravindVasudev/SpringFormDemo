cd client
ng build --prod --output-path ../src/main/resources/static
cd ..
java -Dserver.port=$PORT $JAVA_OPTS -jar target/app.jar

FROM openjdk:17-jdk-alpine
COPY target/Diplom-1.0-SNAPSHOT-jar-with-dependencies.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
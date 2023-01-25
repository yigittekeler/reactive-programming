FROM openjdk:17-jdk-slim

EXPOSE 8080
WORKDIR /app
ARG JAR_FILE=target/reactive_programming-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app/app.jar

ENTRYPOINT ["java", "-jar","app/app.jar"]





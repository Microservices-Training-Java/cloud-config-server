# Stage 2
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY /target/config-server*.jar .

RUN mv ./config-server*.jar  ./config-server.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "config-server.jar"]
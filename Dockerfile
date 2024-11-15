FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY build/libs/test-task-0.0.1-SNAPSHOT.jar auth-app.jar

ENTRYPOINT ["java", "-jar", "auth-app.jar"]
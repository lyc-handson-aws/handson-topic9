#https://spring.io/guides/topicals/spring-boot-docker
FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY *.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
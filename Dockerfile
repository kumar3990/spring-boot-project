FROM openjdk:8


ADD target/spring-0.0.1-SNAPSHOT.jar  docker-spring.jar

EXPOSE 8585

